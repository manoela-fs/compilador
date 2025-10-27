/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Camile
 */
import java.util.*;

public class SymbolTableVisitor extends LangParserBaseVisitor<String> {

    private final List<Symbol> tabela = new ArrayList<>();
    private int contadorId = 1;

    private final Map<String, Integer> offsets = new HashMap<>();
    private String escopoAtual = "Global";

    private final List<String> semanticErrors = new ArrayList<>();

    public List<Symbol> getTabela() {
        return tabela;
    }

    public List<String> getSemanticErrors() {
        return semanticErrors;
    }

    private void addError(String msg) {
        semanticErrors.add(msg);
    }

    private Symbol lookupInAnyScope(String nome) {
        for (Symbol s : tabela) {
            if (s.nome.equals(nome)) {
                return s;
            }
        }
        return null;
    }

    private Symbol lookupInScope(String nome, String escopo) {
        for (Symbol s : tabela) {
            if (s.nome.equals(nome) && s.escopo.equals(escopo)) {
                return s;
            }
        }
        return null;
    }

    private void addTS(String nome, String categoria, String type, int width, String escopo) {
        if (lookupInScope(nome, escopo) != null) {
            addError(String.format("Erro semântico: redeclaração de '%s' no escopo '%s'", nome, escopo));
            return;
        }
        int offset = offsets.getOrDefault(escopo, 0);
        tabela.add(new Symbol(contadorId++, nome, categoria, type, width, offset, escopo));
        offsets.put(escopo, offset + width);
    }

    private int widthOfBase(String base) {
        switch (base) {
            case "char": return 1;
            case "int": return 4;
            case "float": return 8;
            case "boolean": return 1;
            default: return 4;
        }
    }

    private int computeWidthFromTypeString(String typeStr) {
        if (typeStr == null) return 0;
        if ("int".equals(typeStr)) return 4;
        if ("float".equals(typeStr)) return 8;
        if ("char".equals(typeStr)) return 1;
        if ("boolean".equals(typeStr)) return 1;
        if (typeStr.startsWith("array(")) {
            String inside = typeStr.substring(6, typeStr.length() - 1);
            String[] parts = inside.split(",");
            String base = parts[0].trim();
            String[] dims = parts[1].trim().split("\\*");
            long total = 1;
            for (String d : dims) {
                total *= Integer.parseInt(d.trim());
            }
            return (int) (total * widthOfBase(base));
        }
        return 4;
    }

    private boolean typesCompatible(String left, String right) {
        if (left == null || right == null) return false;
        if (left.equals(right)) return true;
        if ("float".equals(left) && "int".equals(right)) return true;
        return false;
    }

    private String promotedNumericType(String a, String b) {
        if ("float".equals(a) || "float".equals(b)) return "float";
        if ("int".equals(a) || "int".equals(b)) return "int";
        return null; // Incompatível para numérico
    }

    private boolean isNumeric(String t) {
        return "int".equals(t) || "float".equals(t);
    }

    // ============================
    @Override
    public String visitPrograma(LangParser.ProgramaContext ctx) {
        visit(ctx.listaFuncoes());
        visit(ctx.principal());
        return null;
    }

    @Override
    public String visitDecFuncao(LangParser.DecFuncaoContext ctx) {
        String tipoRetorno = visit(ctx.tipoRetorno());
        String nomeFuncao = ctx.ID().getText();

        offsets.put(nomeFuncao, 0);
        addTS(nomeFuncao, "Função", tipoRetorno, 0, "Global");

        String escopoAnterior = escopoAtual;
        escopoAtual = nomeFuncao;

        if (ctx.parametros() != null) {
            visit(ctx.parametros());
        }
        visit(ctx.bloco());

        escopoAtual = escopoAnterior;
        return null;
    }

    @Override
    public String visitParametros(LangParser.ParametrosContext ctx) {
        if (ctx.tipo() == null) return null;
        String tipo = visit(ctx.tipo());
        String idNome = ctx.ID().getText();
        addTS(idNome, "Parâmetro", tipo, computeWidthFromTypeString(tipo), escopoAtual);
        if (ctx.listaParametros() != null) {
            visit(ctx.listaParametros());
        }
        return null;
    }

    @Override
    public String visitListaParametros(LangParser.ListaParametrosContext ctx) {
        if (ctx.ID() == null) return null;
        String tipo = visit(ctx.tipo());
        String idNome = ctx.ID().getText();
        addTS(idNome, "Parâmetro", tipo, computeWidthFromTypeString(tipo), escopoAtual);
        if (ctx.listaParametros() != null) {
            visit(ctx.listaParametros());
        }
        return null;
    }

    @Override
    public String visitPrincipal(LangParser.PrincipalContext ctx) {
        String nome = "main";
        offsets.put(nome, 0);
        addTS(nome, "Função", "void", 0, "Global");
        String escopoAnterior = escopoAtual;
        escopoAtual = nome;
        visit(ctx.bloco());
        escopoAtual = escopoAnterior;
        return null;
    }

    @Override
    public String visitListaVariaveis(LangParser.ListaVariaveisContext ctx) {
        if (ctx.tipo() == null || ctx.ID() == null) return null;
        String tipo = visit(ctx.tipo());
        addTS(ctx.ID().getText(), "Variável", tipo, computeWidthFromTypeString(tipo), escopoAtual);
        if (ctx.listaId() != null) {
            visitListaIdWithType(ctx.listaId(), tipo);
        }
        if (ctx.listaVariaveis() != null) {
            visit(ctx.listaVariaveis());
        }
        return null;
    }

    private void visitListaIdWithType(LangParser.ListaIdContext ctx, String tipo) {
        if (ctx.ID() == null) return;
        addTS(ctx.ID().getText(), "Variável", tipo, computeWidthFromTypeString(tipo), escopoAtual);
        if (ctx.listaId() != null) {
            visitListaIdWithType(ctx.listaId(), tipo);
        }
    }

    @Override
    public String visitTipo(LangParser.TipoContext ctx) {
        String base = visit(ctx.tipoBase());
        String dim = ctx.dimensao() != null ? visit(ctx.dimensao()) : "";
        if (dim.isEmpty()) return base;
        return "array(" + base + "," + dim + ")";
    }

    @Override
    public String visitTipoBase(LangParser.TipoBaseContext ctx) {
        if (ctx.CHAR() != null) return "char";
        if (ctx.FLOAT() != null) return "float";
        if (ctx.INT() != null) return "int";
        if (ctx.BOOLEAN() != null) return "boolean";
        return null;
    }

    @Override
    public String visitDimensao(LangParser.DimensaoContext ctx) {
        if (ctx.NUM_INT() == null) return "";
        String n = ctx.NUM_INT().getText();
        String next = ctx.dimensao() != null ? visit(ctx.dimensao()) : "";
        return next.isEmpty() ? n : n + "*" + next;
    }

    @Override
    public String visitTipoRetorno(LangParser.TipoRetornoContext ctx) {
        if (ctx.VOID() != null) return "void";
        return visit(ctx.tipo());
    }

    @Override
    public String visitFuncao(LangParser.FuncaoContext ctx) {
        String nome = ctx.ID().getText();
        Symbol func = lookupInAnyScope(nome);
        if (func == null) {
            addError("Função não declarada: " + nome);
            return null;
        }

        // Obter parâmetros
        List<Symbol> params = new ArrayList<>();
        for (Symbol s : tabela) {
            if ("Parâmetro".equals(s.categoria) && s.escopo.equals(nome)) {
                params.add(s);
            }
        }

        // Obter tipos dos argumentos
        List<String> argTypes = new ArrayList<>();
        if (ctx.argumentos() != null && ctx.argumentos().expressao() != null) {
            String argType = visit(ctx.argumentos().expressao());
            argTypes.add(argType);
            LangParser.NovoArgumentoContext novo = ctx.argumentos().novoArgumento();
            while (novo != null && novo.expressao() != null) {
                argType = visit(novo.expressao());
                argTypes.add(argType);
                novo = novo.novoArgumento();
            }
        }

        if (params.size() != argTypes.size()) {
            addError("Número de argumentos incorreto para função '" + nome + "': esperado " + params.size() + ", encontrado " + argTypes.size());
        } else {
            for (int i = 0; i < params.size(); i++) {
                if (!typesCompatible(params.get(i).type, argTypes.get(i))) {
                    addError("Tipo de argumento " + (i + 1) + " incompatível em chamada para '" + nome + "': esperado " + params.get(i).type + ", encontrado " + argTypes.get(i));
                }
            }
        }

        return func.type;
    }

    @Override
    public String visitAtribuicao(LangParser.AtribuicaoContext ctx) {
        String varName = ctx.ID().getText();
        Symbol var = lookupInAnyScope(varName);
        String rhsType = visit(ctx.complemento());
        if (var == null) {
            addError("Variável não declarada: " + varName);
        } else {
            if (var.type.startsWith("array") && rhsType != null && !rhsType.startsWith("array")) {
                addError("Atribuição a array não suportada diretamente");
            } else if (!typesCompatible(var.type, rhsType)) {
                addError("Incompatibilidade de tipos na atribuição a '" + varName + "': esperado " + var.type + ", encontrado " + rhsType);
            }
        }
        return null;
    }

    @Override
    public String visitComplemento(LangParser.ComplementoContext ctx) {
        if (ctx.expressao() != null) return visit(ctx.expressao());
        if (ctx.funcao() != null) return visit(ctx.funcao());
        return null;
    }

    @Override
    public String visitRetorno(LangParser.RetornoContext ctx) {
        Symbol currentFunc = lookupInAnyScope(escopoAtual);
        if (currentFunc == null) {
            addError("Retorno fora de função");
            return null;
        }
        String exprType = visit(ctx.expressao());
        if ("void".equals(currentFunc.type)) {
            addError("Função void não pode retornar um valor");
        } else if (!typesCompatible(currentFunc.type, exprType)) {
            addError("Tipo de retorno incompatível na função '" + escopoAtual + "': esperado " + currentFunc.type + ", encontrado " + exprType);
        }
        return null;
    }

    @Override
    public String visitSelecao(LangParser.SelecaoContext ctx) {
        String condType = visit(ctx.expressao());
        if (!"boolean".equals(condType)) {
            addError("Expressão em 'if' deve ser booleana, encontrado " + condType);
        }
        visit(ctx.bloco());
        if (ctx.senao() != null) visit(ctx.senao());
        return null;
    }

    @Override
    public String visitEnquanto(LangParser.EnquantoContext ctx) {
        String condType = visit(ctx.expressao());
        if (!"boolean".equals(condType)) {
            addError("Expressão em 'while' deve ser booleana, encontrado " + condType);
        }
        visit(ctx.bloco());
        return null;
    }

    @Override
    public String visitTermo(LangParser.TermoContext ctx) {
        if (ctx.CONSTANTE() != null) {
            String val = ctx.CONSTANTE().getText();
            return val.contains(".") ? "float" : "int";
        }
        if (ctx.ID() != null) {
            Symbol s = lookupInAnyScope(ctx.ID().getText());
            if (s == null) {
                addError("Identificador não declarado: " + ctx.ID().getText());
                return null;
            }
            // Para simplificação, ignorar checagem de dimensões de array por agora
            // Assumir que se dimensao2 não vazia, tipo é base; else tipo completo
            if (ctx.dimensao2().getText().isEmpty()) {
                return s.type;
            } else {
                if (!s.type.startsWith("array")) {
                    addError("Acesso a array em não-array: " + ctx.ID().getText());
                    return null;
                }
                // Extrair tipo base
                String inside = s.type.substring(6, s.type.length() - 1);
                String base = inside.split(",")[0].trim();
                return base;
            }
        }
        return null;
    }

    @Override
    public String visitFator(LangParser.FatorContext ctx) {
        if (ctx.TEXTO() != null) return "char*";
        if (ctx.NOT() != null) {
            String t = visit(ctx.fator());
            if (!"boolean".equals(t)) {
                addError("'!' aplicado a expressão não booleana");
            }
            return "boolean";
        }
        if (ctx.expressao() != null) {
            return visit(ctx.expressao());
        }
        if (ctx.funcao() != null) {
            return visit(ctx.funcao());
        }
        if (ctx.termo() != null) {
            String termType = visit(ctx.termo());
            String sinal = ctx.sinal() != null ? ctx.sinal().getText() : "";
            if (!sinal.isEmpty() && !isNumeric(termType)) {
                addError("Operador unário + ou - aplicado a tipo não numérico: " + termType);
            }
            return termType;
        }
        return null;
    }

    @Override
    public String visitExprMultiplicativa(LangParser.ExprMultiplicativaContext ctx) {
        String left = visit(ctx.fator());
        if (ctx.exprMultiplicativa2() != null) {
            String right = visit(ctx.exprMultiplicativa2());
            String promoted = promotedNumericType(left, right);
            if (promoted == null) {
                addError("Tipos incompatíveis em operação multiplicativa");
            }
            return promoted;
        }
        return left;
    }

    @Override
    public String visitExprMultiplicativa2(LangParser.ExprMultiplicativa2Context ctx) {
        String left = visit(ctx.fator());
        if (ctx.exprMultiplicativa2() != null) {
            String right = visit(ctx.exprMultiplicativa2());
            String promoted = promotedNumericType(left, right);
            if (promoted == null) {
                addError("Tipos incompatíveis em operação multiplicativa");
            }
            return promoted;
        }
        return left;
    }

    @Override
    public String visitExprAditiva(LangParser.ExprAditivaContext ctx) {
        String left = visit(ctx.exprMultiplicativa());
        if (ctx.exprAditiva2() != null) {
            String right = visit(ctx.exprAditiva2());
            String promoted = promotedNumericType(left, right);
            if (promoted == null) {
                addError("Tipos incompatíveis em operação aditiva");
            }
            return promoted;
        }
        return left;
    }

    @Override
    public String visitExprAditiva2(LangParser.ExprAditiva2Context ctx) {
        String left = visit(ctx.exprMultiplicativa());
        if (ctx.exprAditiva2() != null) {
            String right = visit(ctx.exprAditiva2());
            String promoted = promotedNumericType(left, right);
            if (promoted == null) {
                addError("Tipos incompatíveis em operação aditiva");
            }
            return promoted;
        }
        return left;
    }

    @Override
    public String visitExprRelacional(LangParser.ExprRelacionalContext ctx) {
        String leftType = visit(ctx.exprAditiva());
        if (ctx.exprRelacional2().COMP() != null) {
            String rightType = visit(ctx.exprRelacional2().exprAditiva());
            if (!isNumeric(leftType) || !isNumeric(rightType)) {
                addError("Operador relacional requer tipos numéricos");
            } else if (!typesCompatible(leftType, rightType) && !typesCompatible(rightType, leftType)) {
                addError("Tipos incompatíveis em comparação: " + leftType + " e " + rightType);
            }
            return "boolean";
        }
        return leftType;
    }

    @Override
    public String visitExprE(LangParser.ExprEContext ctx) {
        String left = visit(ctx.exprRelacional());
        if (ctx.exprE2() != null && !ctx.exprE2().getText().isEmpty()) {
            String right = visit(ctx.exprE2());
            if (!"boolean".equals(left) || !"boolean".equals(right)) {
                addError("Operador && requer operandos booleanos");
            }
            return "boolean";
        }
        return left;
    }

    @Override
    public String visitExprE2(LangParser.ExprE2Context ctx) {
        String typeHere = visit(ctx.exprRelacional());
        if (ctx.exprE2() != null) {
            String tail = visit(ctx.exprE2());
            if (!"boolean".equals(typeHere) || !"boolean".equals(tail)) {
                addError("Operador && requer operandos booleanos");
            }
            return "boolean";
        }
        return typeHere;
    }

    @Override
    public String visitExprOu(LangParser.ExprOuContext ctx) {
        String left = visit(ctx.exprE());
        if (ctx.exprOu2() != null && !ctx.exprOu2().getText().isEmpty()) {
            String right = visit(ctx.exprOu2());
            if (!"boolean".equals(left) || !"boolean".equals(right)) {
                addError("Operador || requer operandos booleanos");
            }
            return "boolean";
        }
        return left;
    }

    @Override
    public String visitExprOu2(LangParser.ExprOu2Context ctx) {
        String typeHere = visit(ctx.exprE());
        if (ctx.exprOu2() != null) {
            String tail = visit(ctx.exprOu2());
            if (!"boolean".equals(typeHere) || !"boolean".equals(tail)) {
                addError("Operador || requer operandos booleanos");
            }
            return "boolean";
        }
        return typeHere;
    }

    public static class Symbol {
        public final int id;
        public final String nome;
        public final String categoria; // "Variável", "Função", "Parâmetro"
        public final String type;      // ex: "int", "float", "char", "boolean", "array(int,10)"
        public final int width;        // largura em bytes
        public final int offset;       // offset dentro do escopo
        public final String escopo;    // nome do escopo

        public Symbol(int id, String nome, String categoria, String type, int width, int offset, String escopo) {
            this.id = id;
            this.nome = nome;
            this.categoria = categoria;
            this.type = type;
            this.width = width;
            this.offset = offset;
            this.escopo = escopo;
        }

        @Override
        public String toString() {
            return String.format("| %-3d | %-10s | %-10s | %-18s | %-5d | %-6d | %-10s |",
                    id, nome, categoria, type == null ? "-" : type, width, offset, escopo);
        }
    }
}