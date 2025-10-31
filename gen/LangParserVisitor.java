// Generated from C:/Users/manoe/IdeaProjects/compilador-master/src/main/antlr4/LangParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#secaoFuncoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecaoFuncoes(LangParser.SecaoFuncoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#listafuncoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListafuncoes(LangParser.ListafuncoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#decFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecFuncao(LangParser.DecFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#tipoRetorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoRetorno(LangParser.TipoRetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(LangParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#tipoBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoBase(LangParser.TipoBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(LangParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#listaParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParams(LangParser.ListaParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#principal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrincipal(LangParser.PrincipalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(LangParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDeclaracoes(LangParser.ListaDeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(LangParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#listaIds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaIds(LangParser.ListaIdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#dimensoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensoes(LangParser.DimensoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#listaEstruturas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaEstruturas(LangParser.ListaEstruturasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#estrutura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstrutura(LangParser.EstruturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(LangParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LangParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#indice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndice(LangParser.IndiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#controle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControle(LangParser.ControleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(LangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(LangParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#chamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada(LangParser.ChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(LangParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#andExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(LangParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#eqExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExp(LangParser.EqExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#relExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExp(LangParser.RelExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#addExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(LangParser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#mulExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExp(LangParser.MulExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(LangParser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(LangParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(LangParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(LangParser.LiteralContext ctx);
}