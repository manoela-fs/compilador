import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;

/**
 * SemanticAnalyzer usando SymbolTable hierárquica baseada em Scope e TypeChecker.
 */
public class SemanticAnalyzer extends LangParserBaseVisitor<Type> {

    private final SymbolTable symbolTable;
    private final ErrorReporter errorReporter;
    private final TypeChecker typeChecker;

    private Type currentFunctionReturnType = null; // Para checar retorno de função

    public SemanticAnalyzer(SymbolTable symbolTable, ErrorReporter errorReporter) {
        this.symbolTable = symbolTable;
        this.errorReporter = errorReporter;
        this.typeChecker = new TypeChecker(errorReporter);
    }

    // ================= PROGRAMA → SECAOFUNCOES PRINCIPAL =================
    @Override
    public Type visitProgram(LangParser.ProgramContext ctx) {
        if (ctx.secaoFuncoes() != null) visit(ctx.secaoFuncoes());
        visit(ctx.principal());
        return null;
    }

    // ================= SECAOFUNCOES → LISTAFUNCOES | ε =================
    @Override
    public Type visitSecaoFuncoes(LangParser.SecaoFuncoesContext ctx) {
        if (ctx.listafuncoes() != null) visit(ctx.listafuncoes());
        return null;
    }

    // ================= LISTAFUNCOES → DECFUNCAO+ =================
    @Override
    public Type visitListafuncoes(LangParser.ListafuncoesContext ctx) {
        for (LangParser.DecFuncaoContext f : ctx.decFuncao()) visit(f);
        return null;
    }

    // ================= DECFUNCAO → TIPORETORNO ID ( PARAMETROS ) BLOCO =================
    @Override
    public Type visitDecFuncao(LangParser.DecFuncaoContext ctx) {
        String funcName = ctx.ID().getText();
        Type returnType = visit(ctx.tipoRetorno());

        if (symbolTable.buscarNoEscopoAtual(funcName) != null) {
            errorReporter.report("Função '" + funcName + "' já declarada neste escopo.", ctx.start.getLine());
        } else {
            Symbol funcSymbol = new Symbol(funcName, Categoria.FUNCAO, returnType, 0);
            symbolTable.adicionarSimbolo(funcSymbol, ctx.start.getLine());
        }

        symbolTable.abrirEscopo(funcName);
        Type previousReturnType = currentFunctionReturnType;
        currentFunctionReturnType = returnType;

        if (ctx.parametros() != null) visit(ctx.parametros());
        visit(ctx.bloco());

        currentFunctionReturnType = previousReturnType;
        symbolTable.fecharEscopo();
        return null;
    }

    // ================= TIPORETORNO → TIPO | void =================
    @Override
    public Type visitTipoRetorno(LangParser.TipoRetornoContext ctx) {
        if (ctx.tipo() != null) return visit(ctx.tipo());
        return PrimitiveType.VOID;
    }

    // ================= TIPO → TIPOBASE DIMENSOES? =================
    @Override
    public Type visitTipo(LangParser.TipoContext ctx) {
        Type base = visit(ctx.tipoBase());
        if (ctx.dimensoes() != null) return buildArrayType(base, ctx.dimensoes());
        return base;
    }

    @Override
    public Type visitTipoBase(LangParser.TipoBaseContext ctx) {
        if (ctx.INT_TYPE() != null) return PrimitiveType.INT;
        if (ctx.FLOAT_TYPE() != null) return PrimitiveType.FLOAT;
        if (ctx.CHAR_TYPE() != null) return PrimitiveType.CHAR;
        if (ctx.BOOLEAN_TYPE() != null) return PrimitiveType.BOOLEAN;
        return null;
    }

    private Type buildArrayType(Type base, LangParser.DimensoesContext ctx) {
        if (ctx == null) return base;
        int size = Integer.parseInt(ctx.INT_LITERAL().getText());
        if (ctx.dimensoes() != null) {
            return new ArrayType(buildArrayType(base, ctx.dimensoes()), size);
        } else {
            return new ArrayType(base, size);
        }
    }

    // ================= PARÂMETROS → LISTAPARAMS | ε =================
    @Override
    public Type visitParametros(LangParser.ParametrosContext ctx) {
        if (ctx.listaParams() != null) visit(ctx.listaParams());
        return null;
    }

    // ================= LISTAPARAMS → TIPO ID ( , TIPO ID )* =================
    @Override
    public Type visitListaParams(LangParser.ListaParamsContext ctx) {
        for (int i = 0; i < ctx.ID().size(); i++) {
            String paramName = ctx.ID(i).getText();
            Type paramType = visit(ctx.tipo(i));

            if (symbolTable.buscarNoEscopoAtual(paramName) != null) {
                errorReporter.report("Parâmetro '" + paramName + "' já declarado neste escopo.", ctx.ID(i).getSymbol().getLine());
            } else {
                int width = typeChecker.widthOf(paramType);
                Symbol param = new Symbol(paramName, Categoria.PARAMETRO, paramType, width);
                symbolTable.adicionarSimbolo(param, ctx.ID(i).getSymbol().getLine());
            }
        }
        return null;
    }

    // ================= PRINCIPAL → MAIN() BLOCO =================
    @Override
    public Type visitPrincipal(LangParser.PrincipalContext ctx) {
        if (symbolTable.buscarNoEscopoAtual("main") == null) {
            Symbol mainSymbol = new Symbol("main", Categoria.FUNCAO, PrimitiveType.VOID, 0);
            symbolTable.adicionarSimbolo(mainSymbol, ctx.start.getLine());
        }

        symbolTable.abrirEscopo("main");
        Type previousReturn = currentFunctionReturnType;
        currentFunctionReturnType = PrimitiveType.VOID;

        visit(ctx.bloco());

        currentFunctionReturnType = previousReturn;
        symbolTable.fecharEscopo();
        return PrimitiveType.VOID;
    }

    // ================= BLOCO → { LISTADECLARACOES LISTAESTRUTURAS } =================
    @Override
    public Type visitBloco(LangParser.BlocoContext ctx) {
        if (ctx.listaDeclaracoes() != null) visit(ctx.listaDeclaracoes());
        if (ctx.listaEstruturas() != null) visit(ctx.listaEstruturas());
        return null;
    }

    @Override
    public Type visitListaDeclaracoes(LangParser.ListaDeclaracoesContext ctx) {
        for (LangParser.DeclaracaoContext d : ctx.declaracao()) visit(d);
        return null;
    }

    @Override
    public Type visitDeclaracao(LangParser.DeclaracaoContext ctx) {
        Type varType = visit(ctx.tipo());
        for (TerminalNode idNode : ctx.listaIds().ID()) {
            String name = idNode.getText();
            if (symbolTable.buscarNoEscopoAtual(name) != null) {
                errorReporter.report("Variável '" + name + "' já declarada neste escopo.", idNode.getSymbol().getLine());
            } else {
                int width = typeChecker.widthOf(varType);
                Symbol v = new Symbol(name, Categoria.VARIAVEL, varType, width);
                symbolTable.adicionarSimbolo(v, idNode.getSymbol().getLine());
            }
        }
        return null;
    }

    @Override
    public Type visitVar(LangParser.VarContext ctx) {
        String name = ctx.ID().getText();
        Symbol sym = symbolTable.buscarSimbolo(name);
        if (sym == null) {
            errorReporter.report("Símbolo '" + name + "' não declarado.", ctx.start.getLine());
            return null;
        }

        Type type = sym.type;

        if (ctx.indice() != null) {
            List<LangParser.IndiceContext> indicesCtx = collectIndices(ctx.indice());
            List<Integer> literalIndices = new ArrayList<>();

            for (LangParser.IndiceContext ic : indicesCtx) {
                Type idxType = visit(ic.expressao());

                if (!(idxType instanceof PrimitiveType pt && pt == PrimitiveType.INT)) {
                    errorReporter.report("Índice de array deve ser int, mas é " + idxType, ic.start.getLine());
                }

                Integer literal = null;
                if (ic.expressao().getText().matches("\\d+")) {
                    literal = Integer.parseInt(ic.expressao().getText());
                }
                literalIndices.add(literal);
            }

            type = typeChecker.getElementTypeAfterIndex(type, literalIndices, ctx.start.getLine());
        }

        return type;
    }

    private List<LangParser.IndiceContext> collectIndices(LangParser.IndiceContext start) {
        List<LangParser.IndiceContext> list = new ArrayList<>();
        LangParser.IndiceContext cur = start;
        while (cur != null) {
            list.add(cur);
            cur = cur.indice();
        }
        return list;
    }

    @Override
    public Type visitAtribuicao(LangParser.AtribuicaoContext ctx) {
        Type left = visit(ctx.var());
        Type right = visit(ctx.expressao());
        if (left != null && right != null) {
            typeChecker.checkAssignment(left, right, ctx.start.getLine());
        }
        return left;
    }

    // ================= EXPRESSOES =================
    @Override
    public Type visitExpressao(LangParser.ExpressaoContext ctx) {
        Type t = visit(ctx.andExp(0));
        for (int i = 1; i < ctx.andExp().size(); i++) {
            Type next = visit(ctx.andExp(i));
            typeChecker.checkLogicalBinary(t, next, ctx.start.getLine());
            t = PrimitiveType.BOOLEAN;
        }
        return t;
    }

    @Override
    public Type visitAndExp(LangParser.AndExpContext ctx) {
        Type t = visit(ctx.eqExp(0));
        for (int i = 1; i < ctx.eqExp().size(); i++) {
            Type next = visit(ctx.eqExp(i));
            typeChecker.checkLogicalBinary(t, next, ctx.start.getLine());
            t = PrimitiveType.BOOLEAN;
        }
        return t;
    }

    @Override
    public Type visitEqExp(LangParser.EqExpContext ctx) {
        Type t = visit(ctx.relExp(0));
        for (int i = 1; i < ctx.relExp().size(); i++) {
            Type next = visit(ctx.relExp(i));
            typeChecker.checkEquality(t, next, ctx.start.getLine());
            t = PrimitiveType.BOOLEAN;
        }
        return t;
    }

    @Override
    public Type visitRelExp(LangParser.RelExpContext ctx) {
        Type t = visit(ctx.addExp(0));
        for (int i = 1; i < ctx.addExp().size(); i++) {
            Type next = visit(ctx.addExp(i));
            typeChecker.checkRelational(t, next, ctx.start.getLine());
            t = PrimitiveType.BOOLEAN;
        }
        return t;
    }

    @Override
    public Type visitAddExp(LangParser.AddExpContext ctx) {
        Type t = visit(ctx.mulExp(0));
        for (int i = 1; i < ctx.mulExp().size(); i++) {
            Type next = visit(ctx.mulExp(i));
            typeChecker.checkArithmetic(t, next, ctx.start.getLine());
        }
        return t;
    }

    @Override
    public Type visitMulExp(LangParser.MulExpContext ctx) {
        Type t = visit(ctx.unaryExp(0));
        for (int i = 1; i < ctx.unaryExp().size(); i++) {
            Type next = visit(ctx.unaryExp(i));
            typeChecker.checkArithmetic(t, next, ctx.start.getLine());
        }
        return t;
    }

    @Override
    public Type visitUnaryExp(LangParser.UnaryExpContext ctx) {
        Type t;
        if (ctx.primary() != null) {
            t = visit(ctx.primary());
        } else {
            t = visit(ctx.unaryExp());
            if (ctx.NOT() != null) typeChecker.checkNot(t, ctx.start.getLine());
            if (ctx.SUB() != null) typeChecker.checkNegation(t, ctx.start.getLine());
        }
        return t;
    }

    @Override
    public Type visitPrimary(LangParser.PrimaryContext ctx) {
        if (ctx.var() != null) return visit(ctx.var());
        if (ctx.literal() != null) return visit(ctx.literal());
        if (ctx.expressao() != null) return visit(ctx.expressao());
        if (ctx.funcCall() != null) return visit(ctx.funcCall());
        return null;
    }

    @Override
    public Type visitFuncCall(LangParser.FuncCallContext ctx) {
        String funcName = ctx.ID().getText();
        Symbol func = symbolTable.buscarSimbolo(funcName);
        if (func == null || func.categoria != Categoria.FUNCAO) {
            errorReporter.report("Função '" + funcName + "' não declarada.", ctx.start.getLine());
            return null;
        }
        // TODO: validar argumentos
        return func.type;
    }

    @Override
    public Type visitLiteral(LangParser.LiteralContext ctx) {
        if (ctx.INT_LITERAL() != null) return PrimitiveType.INT;
        if (ctx.FLOAT_LITERAL() != null) return PrimitiveType.FLOAT;
        if (ctx.CHAR_LITERAL() != null) return PrimitiveType.CHAR;
        if (ctx.TRUE() != null || ctx.FALSE() != null) return PrimitiveType.BOOLEAN;
        if (ctx.STRING() != null) return PrimitiveType.CHAR; // ou StringType
        return null;
    }

    @Override
    public Type visitControle(LangParser.ControleContext ctx) {
        if (ctx.ifStatement() != null) return visit(ctx.ifStatement());
        if (ctx.whileStatement() != null) return visit(ctx.whileStatement());
        return null;
    }

    @Override
    public Type visitIfStatement(LangParser.IfStatementContext ctx) {
        Type cond = visit(ctx.expressao());
        typeChecker.checkLogicalUnary(cond, ctx.start.getLine());
        visit(ctx.bloco(0));
        if (ctx.ELSE() != null) visit(ctx.bloco(1));
        return null;
    }

    @Override
    public Type visitWhileStatement(LangParser.WhileStatementContext ctx) {
        Type cond = visit(ctx.expressao());
        typeChecker.checkLogicalUnary(cond, ctx.start.getLine());
        visit(ctx.bloco());
        return null;
    }

    @Override
    public Type visitChamada(LangParser.ChamadaContext ctx) {
        if (ctx.SCANF() != null) {
            visit(ctx.var());
        } else if (ctx.PRINTLN() != null) {
            visit(ctx.expressao());
        }
        return null;
    }

    @Override
    public Type visitEstrutura(LangParser.EstruturaContext ctx) {
        if (ctx.atribuicao() != null) return visit(ctx.atribuicao());
        if (ctx.controle() != null) return visit(ctx.controle());
        if (ctx.chamada() != null) return visit(ctx.chamada());

        if (ctx.RETURN() != null) {
            Type ret = ctx.expressao() != null ? visit(ctx.expressao()) : null;
            if (currentFunctionReturnType != null) {
                if (ret == null && currentFunctionReturnType != PrimitiveType.VOID) {
                    errorReporter.report("Return sem expressão em função não-void.", ctx.start.getLine());
                } else if (ret != null) {
                    typeChecker.checkAssignment(currentFunctionReturnType, ret, ctx.start.getLine());
                }
            } else {
                errorReporter.report("Return fora de função.", ctx.start.getLine());
            }
            return ret;
        }

        return null;
    }
}
