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
	 * Visit a parse tree produced by {@link LangParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LangParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#listaFuncoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaFuncoes(LangParser.ListaFuncoesContext ctx);
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
	 * Visit a parse tree produced by {@link LangParser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(LangParser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(LangParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#listaParametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametros(LangParser.ListaParametrosContext ctx);
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
	 * Visit a parse tree produced by {@link LangParser#listaVariaveis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaVariaveis(LangParser.ListaVariaveisContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#listaId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaId(LangParser.ListaIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(LangParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(LangParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#leitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeitura(LangParser.LeituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#termoLeitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoLeitura(LangParser.TermoLeituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#novoTermoLeitura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNovoTermoLeitura(LangParser.NovoTermoLeituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#dimensao2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao2(LangParser.Dimensao2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#escrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscrita(LangParser.EscritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#termoEscrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoEscrita(LangParser.TermoEscritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#novoTermoEscrita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNovoTermoEscrita(LangParser.NovoTermoEscritaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(LangParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#senao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenao(LangParser.SenaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#enquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnquanto(LangParser.EnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(LangParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#complemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplemento(LangParser.ComplementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#funcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncao(LangParser.FuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(LangParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#novoArgumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNovoArgumento(LangParser.NovoArgumentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(LangParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(LangParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#exprOu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOu(LangParser.ExprOuContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#exprOu2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOu2(LangParser.ExprOu2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#exprE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprE(LangParser.ExprEContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#exprE2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprE2(LangParser.ExprE2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#exprRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelacional(LangParser.ExprRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#exprRelacional2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelacional2(LangParser.ExprRelacional2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#exprAditiva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAditiva(LangParser.ExprAditivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#exprAditiva2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAditiva2(LangParser.ExprAditiva2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#opAditivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAditivo(LangParser.OpAditivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#exprMultiplicativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultiplicativa(LangParser.ExprMultiplicativaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#exprMultiplicativa2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultiplicativa2(LangParser.ExprMultiplicativa2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#opMultiplicativo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMultiplicativo(LangParser.OpMultiplicativoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(LangParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(LangParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#sinal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinal(LangParser.SinalContext ctx);
}