// Generated from C:/Users/manoe/IdeaProjects/compilador-master/src/main/antlr4/LangParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#secaoFuncoes}.
	 * @param ctx the parse tree
	 */
	void enterSecaoFuncoes(LangParser.SecaoFuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#secaoFuncoes}.
	 * @param ctx the parse tree
	 */
	void exitSecaoFuncoes(LangParser.SecaoFuncoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#listafuncoes}.
	 * @param ctx the parse tree
	 */
	void enterListafuncoes(LangParser.ListafuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#listafuncoes}.
	 * @param ctx the parse tree
	 */
	void exitListafuncoes(LangParser.ListafuncoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#decFuncao}.
	 * @param ctx the parse tree
	 */
	void enterDecFuncao(LangParser.DecFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#decFuncao}.
	 * @param ctx the parse tree
	 */
	void exitDecFuncao(LangParser.DecFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#tipoRetorno}.
	 * @param ctx the parse tree
	 */
	void enterTipoRetorno(LangParser.TipoRetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#tipoRetorno}.
	 * @param ctx the parse tree
	 */
	void exitTipoRetorno(LangParser.TipoRetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(LangParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(LangParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#tipoBase}.
	 * @param ctx the parse tree
	 */
	void enterTipoBase(LangParser.TipoBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#tipoBase}.
	 * @param ctx the parse tree
	 */
	void exitTipoBase(LangParser.TipoBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(LangParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(LangParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#listaParams}.
	 * @param ctx the parse tree
	 */
	void enterListaParams(LangParser.ListaParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#listaParams}.
	 * @param ctx the parse tree
	 */
	void exitListaParams(LangParser.ListaParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#principal}.
	 * @param ctx the parse tree
	 */
	void enterPrincipal(LangParser.PrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#principal}.
	 * @param ctx the parse tree
	 */
	void exitPrincipal(LangParser.PrincipalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(LangParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(LangParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracoes(LangParser.ListaDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracoes(LangParser.ListaDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(LangParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(LangParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#listaIds}.
	 * @param ctx the parse tree
	 */
	void enterListaIds(LangParser.ListaIdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#listaIds}.
	 * @param ctx the parse tree
	 */
	void exitListaIds(LangParser.ListaIdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#dimensoes}.
	 * @param ctx the parse tree
	 */
	void enterDimensoes(LangParser.DimensoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#dimensoes}.
	 * @param ctx the parse tree
	 */
	void exitDimensoes(LangParser.DimensoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#listaEstruturas}.
	 * @param ctx the parse tree
	 */
	void enterListaEstruturas(LangParser.ListaEstruturasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#listaEstruturas}.
	 * @param ctx the parse tree
	 */
	void exitListaEstruturas(LangParser.ListaEstruturasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#estrutura}.
	 * @param ctx the parse tree
	 */
	void enterEstrutura(LangParser.EstruturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#estrutura}.
	 * @param ctx the parse tree
	 */
	void exitEstrutura(LangParser.EstruturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(LangParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(LangParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(LangParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(LangParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#indice}.
	 * @param ctx the parse tree
	 */
	void enterIndice(LangParser.IndiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#indice}.
	 * @param ctx the parse tree
	 */
	void exitIndice(LangParser.IndiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#controle}.
	 * @param ctx the parse tree
	 */
	void enterControle(LangParser.ControleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#controle}.
	 * @param ctx the parse tree
	 */
	void exitControle(LangParser.ControleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(LangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(LangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(LangParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(LangParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#chamada}.
	 * @param ctx the parse tree
	 */
	void enterChamada(LangParser.ChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#chamada}.
	 * @param ctx the parse tree
	 */
	void exitChamada(LangParser.ChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(LangParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(LangParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#andExp}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(LangParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#andExp}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(LangParser.AndExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void enterEqExp(LangParser.EqExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void exitEqExp(LangParser.EqExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#relExp}.
	 * @param ctx the parse tree
	 */
	void enterRelExp(LangParser.RelExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#relExp}.
	 * @param ctx the parse tree
	 */
	void exitRelExp(LangParser.RelExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#addExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(LangParser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#addExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(LangParser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#mulExp}.
	 * @param ctx the parse tree
	 */
	void enterMulExp(LangParser.MulExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#mulExp}.
	 * @param ctx the parse tree
	 */
	void exitMulExp(LangParser.MulExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(LangParser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(LangParser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(LangParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(LangParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(LangParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(LangParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LangParser.LiteralContext ctx);
}