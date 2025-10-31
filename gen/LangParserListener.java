// Generated from C:/Users/manoe/IdeaProjects/compilador-master/src/main/antlr4/LangParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LangParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LangParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#listaFuncoes}.
	 * @param ctx the parse tree
	 */
	void enterListaFuncoes(LangParser.ListaFuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#listaFuncoes}.
	 * @param ctx the parse tree
	 */
	void exitListaFuncoes(LangParser.ListaFuncoesContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(LangParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(LangParser.DimensaoContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void enterListaParametros(LangParser.ListaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void exitListaParametros(LangParser.ListaParametrosContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#listaVariaveis}.
	 * @param ctx the parse tree
	 */
	void enterListaVariaveis(LangParser.ListaVariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#listaVariaveis}.
	 * @param ctx the parse tree
	 */
	void exitListaVariaveis(LangParser.ListaVariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#listaId}.
	 * @param ctx the parse tree
	 */
	void enterListaId(LangParser.ListaIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#listaId}.
	 * @param ctx the parse tree
	 */
	void exitListaId(LangParser.ListaIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(LangParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(LangParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(LangParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(LangParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#leitura}.
	 * @param ctx the parse tree
	 */
	void enterLeitura(LangParser.LeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#leitura}.
	 * @param ctx the parse tree
	 */
	void exitLeitura(LangParser.LeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#termoLeitura}.
	 * @param ctx the parse tree
	 */
	void enterTermoLeitura(LangParser.TermoLeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#termoLeitura}.
	 * @param ctx the parse tree
	 */
	void exitTermoLeitura(LangParser.TermoLeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#novoTermoLeitura}.
	 * @param ctx the parse tree
	 */
	void enterNovoTermoLeitura(LangParser.NovoTermoLeituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#novoTermoLeitura}.
	 * @param ctx the parse tree
	 */
	void exitNovoTermoLeitura(LangParser.NovoTermoLeituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#dimensao2}.
	 * @param ctx the parse tree
	 */
	void enterDimensao2(LangParser.Dimensao2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#dimensao2}.
	 * @param ctx the parse tree
	 */
	void exitDimensao2(LangParser.Dimensao2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#escrita}.
	 * @param ctx the parse tree
	 */
	void enterEscrita(LangParser.EscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#escrita}.
	 * @param ctx the parse tree
	 */
	void exitEscrita(LangParser.EscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#termoEscrita}.
	 * @param ctx the parse tree
	 */
	void enterTermoEscrita(LangParser.TermoEscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#termoEscrita}.
	 * @param ctx the parse tree
	 */
	void exitTermoEscrita(LangParser.TermoEscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#novoTermoEscrita}.
	 * @param ctx the parse tree
	 */
	void enterNovoTermoEscrita(LangParser.NovoTermoEscritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#novoTermoEscrita}.
	 * @param ctx the parse tree
	 */
	void exitNovoTermoEscrita(LangParser.NovoTermoEscritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(LangParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(LangParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#senao}.
	 * @param ctx the parse tree
	 */
	void enterSenao(LangParser.SenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#senao}.
	 * @param ctx the parse tree
	 */
	void exitSenao(LangParser.SenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(LangParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(LangParser.EnquantoContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#complemento}.
	 * @param ctx the parse tree
	 */
	void enterComplemento(LangParser.ComplementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#complemento}.
	 * @param ctx the parse tree
	 */
	void exitComplemento(LangParser.ComplementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(LangParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(LangParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(LangParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(LangParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#novoArgumento}.
	 * @param ctx the parse tree
	 */
	void enterNovoArgumento(LangParser.NovoArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#novoArgumento}.
	 * @param ctx the parse tree
	 */
	void exitNovoArgumento(LangParser.NovoArgumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(LangParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(LangParser.RetornoContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#exprOu}.
	 * @param ctx the parse tree
	 */
	void enterExprOu(LangParser.ExprOuContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#exprOu}.
	 * @param ctx the parse tree
	 */
	void exitExprOu(LangParser.ExprOuContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#exprOu2}.
	 * @param ctx the parse tree
	 */
	void enterExprOu2(LangParser.ExprOu2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#exprOu2}.
	 * @param ctx the parse tree
	 */
	void exitExprOu2(LangParser.ExprOu2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#exprE}.
	 * @param ctx the parse tree
	 */
	void enterExprE(LangParser.ExprEContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#exprE}.
	 * @param ctx the parse tree
	 */
	void exitExprE(LangParser.ExprEContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#exprE2}.
	 * @param ctx the parse tree
	 */
	void enterExprE2(LangParser.ExprE2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#exprE2}.
	 * @param ctx the parse tree
	 */
	void exitExprE2(LangParser.ExprE2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#exprRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExprRelacional(LangParser.ExprRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#exprRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExprRelacional(LangParser.ExprRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#exprRelacional2}.
	 * @param ctx the parse tree
	 */
	void enterExprRelacional2(LangParser.ExprRelacional2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#exprRelacional2}.
	 * @param ctx the parse tree
	 */
	void exitExprRelacional2(LangParser.ExprRelacional2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#exprAditiva}.
	 * @param ctx the parse tree
	 */
	void enterExprAditiva(LangParser.ExprAditivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#exprAditiva}.
	 * @param ctx the parse tree
	 */
	void exitExprAditiva(LangParser.ExprAditivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#exprAditiva2}.
	 * @param ctx the parse tree
	 */
	void enterExprAditiva2(LangParser.ExprAditiva2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#exprAditiva2}.
	 * @param ctx the parse tree
	 */
	void exitExprAditiva2(LangParser.ExprAditiva2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#opAditivo}.
	 * @param ctx the parse tree
	 */
	void enterOpAditivo(LangParser.OpAditivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#opAditivo}.
	 * @param ctx the parse tree
	 */
	void exitOpAditivo(LangParser.OpAditivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#exprMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterExprMultiplicativa(LangParser.ExprMultiplicativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#exprMultiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitExprMultiplicativa(LangParser.ExprMultiplicativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#exprMultiplicativa2}.
	 * @param ctx the parse tree
	 */
	void enterExprMultiplicativa2(LangParser.ExprMultiplicativa2Context ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#exprMultiplicativa2}.
	 * @param ctx the parse tree
	 */
	void exitExprMultiplicativa2(LangParser.ExprMultiplicativa2Context ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#opMultiplicativo}.
	 * @param ctx the parse tree
	 */
	void enterOpMultiplicativo(LangParser.OpMultiplicativoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#opMultiplicativo}.
	 * @param ctx the parse tree
	 */
	void exitOpMultiplicativo(LangParser.OpMultiplicativoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(LangParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(LangParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(LangParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(LangParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#sinal}.
	 * @param ctx the parse tree
	 */
	void enterSinal(LangParser.SinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#sinal}.
	 * @param ctx the parse tree
	 */
	void exitSinal(LangParser.SinalContext ctx);
}