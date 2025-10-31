// Generated from C:/Users/manoe/IdeaProjects/compilador-master/src/main/antlr4/LangParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VOID=1, CHAR=2, FLOAT=3, INT=4, BOOLEAN=5, MAIN=6, IF=7, ELSE=8, WHILE=9, 
		RETURN=10, SCANF=11, PRINTLN=12, FUNC=13, COMP=14, PLUS=15, MINUS=16, 
		MULT=17, DIV=18, MOD=19, AND=20, OR=21, ASSIGN=22, NOT=23, COMMA=24, SEMI=25, 
		LPAREN=26, RPAREN=27, LBRACE=28, RBRACE=29, LBRACK=30, RBRACK=31, TEXTO=32, 
		CONSTANTE=33, ID=34, WS=35, COMMENT=36, NUM_INT=37;
	public static final int
		RULE_programa = 0, RULE_listaFuncoes = 1, RULE_decFuncao = 2, RULE_tipoRetorno = 3, 
		RULE_tipo = 4, RULE_tipoBase = 5, RULE_dimensao = 6, RULE_parametros = 7, 
		RULE_listaParametros = 8, RULE_principal = 9, RULE_bloco = 10, RULE_listaVariaveis = 11, 
		RULE_listaId = 12, RULE_comandos = 13, RULE_comando = 14, RULE_leitura = 15, 
		RULE_termoLeitura = 16, RULE_novoTermoLeitura = 17, RULE_dimensao2 = 18, 
		RULE_escrita = 19, RULE_termoEscrita = 20, RULE_novoTermoEscrita = 21, 
		RULE_selecao = 22, RULE_senao = 23, RULE_enquanto = 24, RULE_atribuicao = 25, 
		RULE_complemento = 26, RULE_funcao = 27, RULE_argumentos = 28, RULE_novoArgumento = 29, 
		RULE_retorno = 30, RULE_expressao = 31, RULE_exprOu = 32, RULE_exprOu2 = 33, 
		RULE_exprE = 34, RULE_exprE2 = 35, RULE_exprRelacional = 36, RULE_exprRelacional2 = 37, 
		RULE_exprAditiva = 38, RULE_exprAditiva2 = 39, RULE_opAditivo = 40, RULE_exprMultiplicativa = 41, 
		RULE_exprMultiplicativa2 = 42, RULE_opMultiplicativo = 43, RULE_fator = 44, 
		RULE_termo = 45, RULE_sinal = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "listaFuncoes", "decFuncao", "tipoRetorno", "tipo", "tipoBase", 
			"dimensao", "parametros", "listaParametros", "principal", "bloco", "listaVariaveis", 
			"listaId", "comandos", "comando", "leitura", "termoLeitura", "novoTermoLeitura", 
			"dimensao2", "escrita", "termoEscrita", "novoTermoEscrita", "selecao", 
			"senao", "enquanto", "atribuicao", "complemento", "funcao", "argumentos", 
			"novoArgumento", "retorno", "expressao", "exprOu", "exprOu2", "exprE", 
			"exprE2", "exprRelacional", "exprRelacional2", "exprAditiva", "exprAditiva2", 
			"opAditivo", "exprMultiplicativa", "exprMultiplicativa2", "opMultiplicativo", 
			"fator", "termo", "sinal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'char'", "'float'", "'int'", "'boolean'", "'main'", 
			"'if'", "'else'", "'while'", "'return'", "'scanf'", "'println'", "'func'", 
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'='", "'!'", 
			"','", "';'", "'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VOID", "CHAR", "FLOAT", "INT", "BOOLEAN", "MAIN", "IF", "ELSE", 
			"WHILE", "RETURN", "SCANF", "PRINTLN", "FUNC", "COMP", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "AND", "OR", "ASSIGN", "NOT", "COMMA", "SEMI", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "TEXTO", 
			"CONSTANTE", "ID", "WS", "COMMENT", "NUM_INT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LangParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public ListaFuncoesContext listaFuncoes() {
			return getRuleContext(ListaFuncoesContext.class,0);
		}
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LangParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			listaFuncoes();
			setState(95);
			principal();
			setState(96);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaFuncoesContext extends ParserRuleContext {
		public DecFuncaoContext decFuncao() {
			return getRuleContext(DecFuncaoContext.class,0);
		}
		public ListaFuncoesContext listaFuncoes() {
			return getRuleContext(ListaFuncoesContext.class,0);
		}
		public ListaFuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaFuncoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterListaFuncoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitListaFuncoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitListaFuncoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaFuncoesContext listaFuncoes() throws RecognitionException {
		ListaFuncoesContext _localctx = new ListaFuncoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listaFuncoes);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case CHAR:
			case FLOAT:
			case INT:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				decFuncao();
				setState(99);
				listaFuncoes();
				}
				break;
			case MAIN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecFuncaoContext extends ParserRuleContext {
		public TipoRetornoContext tipoRetorno() {
			return getRuleContext(TipoRetornoContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DecFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterDecFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitDecFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitDecFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecFuncaoContext decFuncao() throws RecognitionException {
		DecFuncaoContext _localctx = new DecFuncaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			tipoRetorno();
			setState(105);
			match(ID);
			setState(106);
			match(LPAREN);
			setState(107);
			parametros();
			setState(108);
			match(RPAREN);
			setState(109);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoRetornoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode VOID() { return getToken(LangParser.VOID, 0); }
		public TipoRetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoRetorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterTipoRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitTipoRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitTipoRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoRetornoContext tipoRetorno() throws RecognitionException {
		TipoRetornoContext _localctx = new TipoRetornoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipoRetorno);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case FLOAT:
			case INT:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				tipo();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoBaseContext tipoBase() {
			return getRuleContext(TipoBaseContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			tipoBase();
			setState(116);
			dimensao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoBaseContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(LangParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(LangParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(LangParser.BOOLEAN, 0); }
		public TipoBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterTipoBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitTipoBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitTipoBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoBaseContext tipoBase() throws RecognitionException {
		TipoBaseContext _localctx = new TipoBaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipoBase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DimensaoContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(LangParser.LBRACK, 0); }
		public TerminalNode NUM_INT() { return getToken(LangParser.NUM_INT, 0); }
		public TerminalNode RBRACK() { return getToken(LangParser.RBRACK, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitDimensao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitDimensao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dimensao);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(LBRACK);
				setState(121);
				match(NUM_INT);
				setState(122);
				match(RBRACK);
				setState(123);
				dimensao();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametros);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case FLOAT:
			case INT:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				tipo();
				setState(128);
				match(ID);
				setState(129);
				listaParametros();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaParametrosContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(LangParser.COMMA, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterListaParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitListaParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitListaParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listaParametros);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(COMMA);
				setState(135);
				tipo();
				setState(136);
				match(ID);
				setState(137);
				listaParametros();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrincipalContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(LangParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_principal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(MAIN);
			setState(143);
			match(LPAREN);
			setState(144);
			match(RPAREN);
			setState(145);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LangParser.LBRACE, 0); }
		public ListaVariaveisContext listaVariaveis() {
			return getRuleContext(ListaVariaveisContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(LangParser.RBRACE, 0); }
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(LBRACE);
			setState(148);
			listaVariaveis();
			setState(149);
			comandos();
			setState(150);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaVariaveisContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public ListaIdContext listaId() {
			return getRuleContext(ListaIdContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LangParser.SEMI, 0); }
		public ListaVariaveisContext listaVariaveis() {
			return getRuleContext(ListaVariaveisContext.class,0);
		}
		public ListaVariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaVariaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterListaVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitListaVariaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitListaVariaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaVariaveisContext listaVariaveis() throws RecognitionException {
		ListaVariaveisContext _localctx = new ListaVariaveisContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listaVariaveis);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case FLOAT:
			case INT:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				tipo();
				setState(153);
				match(ID);
				setState(154);
				listaId();
				setState(155);
				match(SEMI);
				setState(156);
				listaVariaveis();
				}
				break;
			case IF:
			case WHILE:
			case RETURN:
			case SCANF:
			case PRINTLN:
			case FUNC:
			case RBRACE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaIdContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(LangParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public ListaIdContext listaId() {
			return getRuleContext(ListaIdContext.class,0);
		}
		public ListaIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterListaId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitListaId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitListaId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaIdContext listaId() throws RecognitionException {
		ListaIdContext _localctx = new ListaIdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_listaId);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(COMMA);
				setState(162);
				match(ID);
				setState(163);
				listaId();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comandos);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case WHILE:
			case RETURN:
			case SCANF:
			case PRINTLN:
			case FUNC:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				comando();
				setState(168);
				comandos();
				}
				break;
			case RBRACE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public LeituraContext leitura() {
			return getRuleContext(LeituraContext.class,0);
		}
		public EscritaContext escrita() {
			return getRuleContext(EscritaContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comando);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCANF:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				leitura();
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				escrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				atribuicao();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				funcao();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				selecao();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				enquanto();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				retorno();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeituraContext extends ParserRuleContext {
		public TerminalNode SCANF() { return getToken(LangParser.SCANF, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public TermoLeituraContext termoLeitura() {
			return getRuleContext(TermoLeituraContext.class,0);
		}
		public NovoTermoLeituraContext novoTermoLeitura() {
			return getRuleContext(NovoTermoLeituraContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(LangParser.SEMI, 0); }
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitLeitura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitLeitura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_leitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(SCANF);
			setState(183);
			match(LPAREN);
			setState(184);
			termoLeitura();
			setState(185);
			novoTermoLeitura();
			setState(186);
			match(RPAREN);
			setState(187);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoLeituraContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public Dimensao2Context dimensao2() {
			return getRuleContext(Dimensao2Context.class,0);
		}
		public TermoLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoLeitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterTermoLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitTermoLeitura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitTermoLeitura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoLeituraContext termoLeitura() throws RecognitionException {
		TermoLeituraContext _localctx = new TermoLeituraContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_termoLeitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ID);
			setState(190);
			dimensao2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NovoTermoLeituraContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(LangParser.COMMA, 0); }
		public TermoLeituraContext termoLeitura() {
			return getRuleContext(TermoLeituraContext.class,0);
		}
		public NovoTermoLeituraContext novoTermoLeitura() {
			return getRuleContext(NovoTermoLeituraContext.class,0);
		}
		public NovoTermoLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_novoTermoLeitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterNovoTermoLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitNovoTermoLeitura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitNovoTermoLeitura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NovoTermoLeituraContext novoTermoLeitura() throws RecognitionException {
		NovoTermoLeituraContext _localctx = new NovoTermoLeituraContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_novoTermoLeitura);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(COMMA);
				setState(193);
				termoLeitura();
				setState(194);
				novoTermoLeitura();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dimensao2Context extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(LangParser.LBRACK, 0); }
		public ExprAditivaContext exprAditiva() {
			return getRuleContext(ExprAditivaContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(LangParser.RBRACK, 0); }
		public Dimensao2Context dimensao2() {
			return getRuleContext(Dimensao2Context.class,0);
		}
		public Dimensao2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterDimensao2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitDimensao2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitDimensao2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dimensao2Context dimensao2() throws RecognitionException {
		Dimensao2Context _localctx = new Dimensao2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_dimensao2);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(LBRACK);
				setState(200);
				exprAditiva();
				setState(201);
				match(RBRACK);
				setState(202);
				dimensao2();
				}
				break;
			case COMP:
			case PLUS:
			case MINUS:
			case MULT:
			case DIV:
			case MOD:
			case AND:
			case OR:
			case COMMA:
			case SEMI:
			case RPAREN:
			case RBRACK:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscritaContext extends ParserRuleContext {
		public TerminalNode PRINTLN() { return getToken(LangParser.PRINTLN, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public TermoEscritaContext termoEscrita() {
			return getRuleContext(TermoEscritaContext.class,0);
		}
		public NovoTermoEscritaContext novoTermoEscrita() {
			return getRuleContext(NovoTermoEscritaContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(LangParser.SEMI, 0); }
		public EscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitEscrita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitEscrita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscritaContext escrita() throws RecognitionException {
		EscritaContext _localctx = new EscritaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_escrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(PRINTLN);
			setState(208);
			match(LPAREN);
			setState(209);
			termoEscrita();
			setState(210);
			novoTermoEscrita();
			setState(211);
			match(RPAREN);
			setState(212);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoEscritaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public Dimensao2Context dimensao2() {
			return getRuleContext(Dimensao2Context.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(LangParser.CONSTANTE, 0); }
		public TerminalNode TEXTO() { return getToken(LangParser.TEXTO, 0); }
		public TermoEscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoEscrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterTermoEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitTermoEscrita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitTermoEscrita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoEscritaContext termoEscrita() throws RecognitionException {
		TermoEscritaContext _localctx = new TermoEscritaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_termoEscrita);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(ID);
				setState(215);
				dimensao2();
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(CONSTANTE);
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(TEXTO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NovoTermoEscritaContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(LangParser.COMMA, 0); }
		public TermoEscritaContext termoEscrita() {
			return getRuleContext(TermoEscritaContext.class,0);
		}
		public NovoTermoEscritaContext novoTermoEscrita() {
			return getRuleContext(NovoTermoEscritaContext.class,0);
		}
		public NovoTermoEscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_novoTermoEscrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterNovoTermoEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitNovoTermoEscrita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitNovoTermoEscrita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NovoTermoEscritaContext novoTermoEscrita() throws RecognitionException {
		NovoTermoEscritaContext _localctx = new NovoTermoEscritaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_novoTermoEscrita);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(COMMA);
				setState(221);
				termoEscrita();
				setState(222);
				novoTermoEscrita();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelecaoContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitSelecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(IF);
			setState(228);
			match(LPAREN);
			setState(229);
			expressao();
			setState(230);
			match(RPAREN);
			setState(231);
			bloco();
			setState(232);
			senao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SenaoContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(LangParser.ELSE, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitSenao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitSenao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_senao);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(ELSE);
				setState(235);
				bloco();
				}
				break;
			case IF:
			case WHILE:
			case RETURN:
			case SCANF:
			case PRINTLN:
			case FUNC:
			case RBRACE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnquantoContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LangParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitEnquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(WHILE);
			setState(240);
			match(LPAREN);
			setState(241);
			expressao();
			setState(242);
			match(RPAREN);
			setState(243);
			bloco();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LangParser.ASSIGN, 0); }
		public ComplementoContext complemento() {
			return getRuleContext(ComplementoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LangParser.SEMI, 0); }
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(ID);
			setState(246);
			match(ASSIGN);
			setState(247);
			complemento();
			setState(248);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplementoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ComplementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complemento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterComplemento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitComplemento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitComplemento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplementoContext complemento() throws RecognitionException {
		ComplementoContext _localctx = new ComplementoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_complemento);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				expressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				funcao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(LangParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitFuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitFuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(FUNC);
			setState(255);
			match(ID);
			setState(256);
			match(LPAREN);
			setState(257);
			argumentos();
			setState(258);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public NovoArgumentoContext novoArgumento() {
			return getRuleContext(NovoArgumentoContext.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_argumentos);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case PLUS:
			case MINUS:
			case NOT:
			case LPAREN:
			case TEXTO:
			case CONSTANTE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				expressao();
				setState(261);
				novoArgumento();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NovoArgumentoContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(LangParser.COMMA, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public NovoArgumentoContext novoArgumento() {
			return getRuleContext(NovoArgumentoContext.class,0);
		}
		public NovoArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_novoArgumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterNovoArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitNovoArgumento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitNovoArgumento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NovoArgumentoContext novoArgumento() throws RecognitionException {
		NovoArgumentoContext _localctx = new NovoArgumentoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_novoArgumento);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(COMMA);
				setState(267);
				expressao();
				setState(268);
				novoArgumento();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LangParser.SEMI, 0); }
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(RETURN);
			setState(274);
			expressao();
			setState(275);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public ExprOuContext exprOu() {
			return getRuleContext(ExprOuContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			exprOu();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprOuContext extends ParserRuleContext {
		public ExprEContext exprE() {
			return getRuleContext(ExprEContext.class,0);
		}
		public ExprOu2Context exprOu2() {
			return getRuleContext(ExprOu2Context.class,0);
		}
		public ExprOuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprOu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExprOu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExprOu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExprOu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprOuContext exprOu() throws RecognitionException {
		ExprOuContext _localctx = new ExprOuContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_exprOu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			exprE();
			setState(280);
			exprOu2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprOu2Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(LangParser.OR, 0); }
		public ExprEContext exprE() {
			return getRuleContext(ExprEContext.class,0);
		}
		public ExprOu2Context exprOu2() {
			return getRuleContext(ExprOu2Context.class,0);
		}
		public ExprOu2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprOu2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExprOu2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExprOu2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExprOu2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprOu2Context exprOu2() throws RecognitionException {
		ExprOu2Context _localctx = new ExprOu2Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_exprOu2);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(OR);
				setState(283);
				exprE();
				setState(284);
				exprOu2();
				}
				break;
			case COMMA:
			case SEMI:
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprEContext extends ParserRuleContext {
		public ExprRelacionalContext exprRelacional() {
			return getRuleContext(ExprRelacionalContext.class,0);
		}
		public ExprE2Context exprE2() {
			return getRuleContext(ExprE2Context.class,0);
		}
		public ExprEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExprE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExprE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExprE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprEContext exprE() throws RecognitionException {
		ExprEContext _localctx = new ExprEContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_exprE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			exprRelacional();
			setState(290);
			exprE2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprE2Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(LangParser.AND, 0); }
		public ExprRelacionalContext exprRelacional() {
			return getRuleContext(ExprRelacionalContext.class,0);
		}
		public ExprE2Context exprE2() {
			return getRuleContext(ExprE2Context.class,0);
		}
		public ExprE2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprE2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExprE2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExprE2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExprE2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprE2Context exprE2() throws RecognitionException {
		ExprE2Context _localctx = new ExprE2Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_exprE2);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(AND);
				setState(293);
				exprRelacional();
				setState(294);
				exprE2();
				}
				break;
			case OR:
			case COMMA:
			case SEMI:
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprRelacionalContext extends ParserRuleContext {
		public ExprAditivaContext exprAditiva() {
			return getRuleContext(ExprAditivaContext.class,0);
		}
		public ExprRelacional2Context exprRelacional2() {
			return getRuleContext(ExprRelacional2Context.class,0);
		}
		public ExprRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExprRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExprRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExprRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprRelacionalContext exprRelacional() throws RecognitionException {
		ExprRelacionalContext _localctx = new ExprRelacionalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_exprRelacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			exprAditiva();
			setState(300);
			exprRelacional2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprRelacional2Context extends ParserRuleContext {
		public TerminalNode COMP() { return getToken(LangParser.COMP, 0); }
		public ExprAditivaContext exprAditiva() {
			return getRuleContext(ExprAditivaContext.class,0);
		}
		public ExprRelacional2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRelacional2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExprRelacional2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExprRelacional2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExprRelacional2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprRelacional2Context exprRelacional2() throws RecognitionException {
		ExprRelacional2Context _localctx = new ExprRelacional2Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_exprRelacional2);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(COMP);
				setState(303);
				exprAditiva();
				}
				break;
			case AND:
			case OR:
			case COMMA:
			case SEMI:
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprAditivaContext extends ParserRuleContext {
		public ExprMultiplicativaContext exprMultiplicativa() {
			return getRuleContext(ExprMultiplicativaContext.class,0);
		}
		public ExprAditiva2Context exprAditiva2() {
			return getRuleContext(ExprAditiva2Context.class,0);
		}
		public ExprAditivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAditiva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExprAditiva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExprAditiva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExprAditiva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAditivaContext exprAditiva() throws RecognitionException {
		ExprAditivaContext _localctx = new ExprAditivaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exprAditiva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			exprMultiplicativa();
			setState(308);
			exprAditiva2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprAditiva2Context extends ParserRuleContext {
		public OpAditivoContext opAditivo() {
			return getRuleContext(OpAditivoContext.class,0);
		}
		public ExprMultiplicativaContext exprMultiplicativa() {
			return getRuleContext(ExprMultiplicativaContext.class,0);
		}
		public ExprAditiva2Context exprAditiva2() {
			return getRuleContext(ExprAditiva2Context.class,0);
		}
		public ExprAditiva2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAditiva2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExprAditiva2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExprAditiva2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExprAditiva2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAditiva2Context exprAditiva2() throws RecognitionException {
		ExprAditiva2Context _localctx = new ExprAditiva2Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_exprAditiva2);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				opAditivo();
				setState(311);
				exprMultiplicativa();
				setState(312);
				exprAditiva2();
				}
				break;
			case COMP:
			case AND:
			case OR:
			case COMMA:
			case SEMI:
			case RPAREN:
			case RBRACK:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpAditivoContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(LangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LangParser.MINUS, 0); }
		public OpAditivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opAditivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterOpAditivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitOpAditivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitOpAditivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpAditivoContext opAditivo() throws RecognitionException {
		OpAditivoContext _localctx = new OpAditivoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_opAditivo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprMultiplicativaContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public ExprMultiplicativa2Context exprMultiplicativa2() {
			return getRuleContext(ExprMultiplicativa2Context.class,0);
		}
		public ExprMultiplicativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprMultiplicativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExprMultiplicativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExprMultiplicativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExprMultiplicativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprMultiplicativaContext exprMultiplicativa() throws RecognitionException {
		ExprMultiplicativaContext _localctx = new ExprMultiplicativaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_exprMultiplicativa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			fator();
			setState(320);
			exprMultiplicativa2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprMultiplicativa2Context extends ParserRuleContext {
		public OpMultiplicativoContext opMultiplicativo() {
			return getRuleContext(OpMultiplicativoContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public ExprMultiplicativa2Context exprMultiplicativa2() {
			return getRuleContext(ExprMultiplicativa2Context.class,0);
		}
		public ExprMultiplicativa2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprMultiplicativa2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterExprMultiplicativa2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitExprMultiplicativa2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitExprMultiplicativa2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprMultiplicativa2Context exprMultiplicativa2() throws RecognitionException {
		ExprMultiplicativa2Context _localctx = new ExprMultiplicativa2Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_exprMultiplicativa2);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				opMultiplicativo();
				setState(323);
				fator();
				setState(324);
				exprMultiplicativa2();
				}
				break;
			case COMP:
			case PLUS:
			case MINUS:
			case AND:
			case OR:
			case COMMA:
			case SEMI:
			case RPAREN:
			case RBRACK:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpMultiplicativoContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(LangParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(LangParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LangParser.MOD, 0); }
		public OpMultiplicativoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opMultiplicativo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterOpMultiplicativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitOpMultiplicativo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitOpMultiplicativo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpMultiplicativoContext opMultiplicativo() throws RecognitionException {
		OpMultiplicativoContext _localctx = new OpMultiplicativoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_opMultiplicativo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public SinalContext sinal() {
			return getRuleContext(SinalContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode TEXTO() { return getToken(LangParser.TEXTO, 0); }
		public TerminalNode NOT() { return getToken(LangParser.NOT, 0); }
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_fator);
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case CONSTANTE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				sinal();
				setState(332);
				termo();
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				match(TEXTO);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(NOT);
				setState(336);
				fator();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				match(LPAREN);
				setState(338);
				expressao();
				setState(339);
				match(RPAREN);
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 5);
				{
				setState(341);
				funcao();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public Dimensao2Context dimensao2() {
			return getRuleContext(Dimensao2Context.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(LangParser.CONSTANTE, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_termo);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(ID);
				setState(345);
				dimensao2();
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(CONSTANTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SinalContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(LangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LangParser.MINUS, 0); }
		public SinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterSinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitSinal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitSinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinalContext sinal() throws RecognitionException {
		SinalContext _localctx = new SinalContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_sinal);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(MINUS);
				}
				break;
			case CONSTANTE:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u0163\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001g\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003r\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006~\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0085\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008d\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00a0\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u00a6\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ac\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00b5\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00c6\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00ce\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00db\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00e2\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00ee\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u00fd\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0109\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u0110\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u0120\b!\u0001\"\u0001\"\u0001\""+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u012a\b#\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0003%\u0132\b%\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u013c\b\'\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0148\b*\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u0157\b,\u0001-\u0001-\u0001-\u0003-\u015c\b-\u0001.\u0001"+
		".\u0001.\u0003.\u0161\b.\u0001.\u0000\u0000/\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\\u0000\u0003\u0001\u0000\u0002\u0005\u0001\u0000"+
		"\u000f\u0010\u0001\u0000\u0011\u0013\u0156\u0000^\u0001\u0000\u0000\u0000"+
		"\u0002f\u0001\u0000\u0000\u0000\u0004h\u0001\u0000\u0000\u0000\u0006q"+
		"\u0001\u0000\u0000\u0000\bs\u0001\u0000\u0000\u0000\nv\u0001\u0000\u0000"+
		"\u0000\f}\u0001\u0000\u0000\u0000\u000e\u0084\u0001\u0000\u0000\u0000"+
		"\u0010\u008c\u0001\u0000\u0000\u0000\u0012\u008e\u0001\u0000\u0000\u0000"+
		"\u0014\u0093\u0001\u0000\u0000\u0000\u0016\u009f\u0001\u0000\u0000\u0000"+
		"\u0018\u00a5\u0001\u0000\u0000\u0000\u001a\u00ab\u0001\u0000\u0000\u0000"+
		"\u001c\u00b4\u0001\u0000\u0000\u0000\u001e\u00b6\u0001\u0000\u0000\u0000"+
		" \u00bd\u0001\u0000\u0000\u0000\"\u00c5\u0001\u0000\u0000\u0000$\u00cd"+
		"\u0001\u0000\u0000\u0000&\u00cf\u0001\u0000\u0000\u0000(\u00da\u0001\u0000"+
		"\u0000\u0000*\u00e1\u0001\u0000\u0000\u0000,\u00e3\u0001\u0000\u0000\u0000"+
		".\u00ed\u0001\u0000\u0000\u00000\u00ef\u0001\u0000\u0000\u00002\u00f5"+
		"\u0001\u0000\u0000\u00004\u00fc\u0001\u0000\u0000\u00006\u00fe\u0001\u0000"+
		"\u0000\u00008\u0108\u0001\u0000\u0000\u0000:\u010f\u0001\u0000\u0000\u0000"+
		"<\u0111\u0001\u0000\u0000\u0000>\u0115\u0001\u0000\u0000\u0000@\u0117"+
		"\u0001\u0000\u0000\u0000B\u011f\u0001\u0000\u0000\u0000D\u0121\u0001\u0000"+
		"\u0000\u0000F\u0129\u0001\u0000\u0000\u0000H\u012b\u0001\u0000\u0000\u0000"+
		"J\u0131\u0001\u0000\u0000\u0000L\u0133\u0001\u0000\u0000\u0000N\u013b"+
		"\u0001\u0000\u0000\u0000P\u013d\u0001\u0000\u0000\u0000R\u013f\u0001\u0000"+
		"\u0000\u0000T\u0147\u0001\u0000\u0000\u0000V\u0149\u0001\u0000\u0000\u0000"+
		"X\u0156\u0001\u0000\u0000\u0000Z\u015b\u0001\u0000\u0000\u0000\\\u0160"+
		"\u0001\u0000\u0000\u0000^_\u0003\u0002\u0001\u0000_`\u0003\u0012\t\u0000"+
		"`a\u0005\u0000\u0000\u0001a\u0001\u0001\u0000\u0000\u0000bc\u0003\u0004"+
		"\u0002\u0000cd\u0003\u0002\u0001\u0000dg\u0001\u0000\u0000\u0000eg\u0001"+
		"\u0000\u0000\u0000fb\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000"+
		"g\u0003\u0001\u0000\u0000\u0000hi\u0003\u0006\u0003\u0000ij\u0005\"\u0000"+
		"\u0000jk\u0005\u001a\u0000\u0000kl\u0003\u000e\u0007\u0000lm\u0005\u001b"+
		"\u0000\u0000mn\u0003\u0014\n\u0000n\u0005\u0001\u0000\u0000\u0000or\u0003"+
		"\b\u0004\u0000pr\u0005\u0001\u0000\u0000qo\u0001\u0000\u0000\u0000qp\u0001"+
		"\u0000\u0000\u0000r\u0007\u0001\u0000\u0000\u0000st\u0003\n\u0005\u0000"+
		"tu\u0003\f\u0006\u0000u\t\u0001\u0000\u0000\u0000vw\u0007\u0000\u0000"+
		"\u0000w\u000b\u0001\u0000\u0000\u0000xy\u0005\u001e\u0000\u0000yz\u0005"+
		"%\u0000\u0000z{\u0005\u001f\u0000\u0000{~\u0003\f\u0006\u0000|~\u0001"+
		"\u0000\u0000\u0000}x\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000"+
		"~\r\u0001\u0000\u0000\u0000\u007f\u0080\u0003\b\u0004\u0000\u0080\u0081"+
		"\u0005\"\u0000\u0000\u0081\u0082\u0003\u0010\b\u0000\u0082\u0085\u0001"+
		"\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u007f\u0001"+
		"\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u000f\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005\u0018\u0000\u0000\u0087\u0088\u0003"+
		"\b\u0004\u0000\u0088\u0089\u0005\"\u0000\u0000\u0089\u008a\u0003\u0010"+
		"\b\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000"+
		"\u0000\u008c\u0086\u0001\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000"+
		"\u0000\u008d\u0011\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0006\u0000"+
		"\u0000\u008f\u0090\u0005\u001a\u0000\u0000\u0090\u0091\u0005\u001b\u0000"+
		"\u0000\u0091\u0092\u0003\u0014\n\u0000\u0092\u0013\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005\u001c\u0000\u0000\u0094\u0095\u0003\u0016\u000b\u0000"+
		"\u0095\u0096\u0003\u001a\r\u0000\u0096\u0097\u0005\u001d\u0000\u0000\u0097"+
		"\u0015\u0001\u0000\u0000\u0000\u0098\u0099\u0003\b\u0004\u0000\u0099\u009a"+
		"\u0005\"\u0000\u0000\u009a\u009b\u0003\u0018\f\u0000\u009b\u009c\u0005"+
		"\u0019\u0000\u0000\u009c\u009d\u0003\u0016\u000b\u0000\u009d\u00a0\u0001"+
		"\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u0098\u0001"+
		"\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\u0017\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0005\u0018\u0000\u0000\u00a2\u00a3\u0005"+
		"\"\u0000\u0000\u00a3\u00a6\u0003\u0018\f\u0000\u00a4\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a1\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a6\u0019\u0001\u0000\u0000\u0000\u00a7\u00a8\u0003\u001c"+
		"\u000e\u0000\u00a8\u00a9\u0003\u001a\r\u0000\u00a9\u00ac\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a7\u0001\u0000\u0000"+
		"\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u001b\u0001\u0000\u0000"+
		"\u0000\u00ad\u00b5\u0003\u001e\u000f\u0000\u00ae\u00b5\u0003&\u0013\u0000"+
		"\u00af\u00b5\u00032\u0019\u0000\u00b0\u00b5\u00036\u001b\u0000\u00b1\u00b5"+
		"\u0003,\u0016\u0000\u00b2\u00b5\u00030\u0018\u0000\u00b3\u00b5\u0003<"+
		"\u001e\u0000\u00b4\u00ad\u0001\u0000\u0000\u0000\u00b4\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b4\u00af\u0001\u0000\u0000\u0000\u00b4\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u001d\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0005\u000b\u0000\u0000\u00b7\u00b8\u0005\u001a"+
		"\u0000\u0000\u00b8\u00b9\u0003 \u0010\u0000\u00b9\u00ba\u0003\"\u0011"+
		"\u0000\u00ba\u00bb\u0005\u001b\u0000\u0000\u00bb\u00bc\u0005\u0019\u0000"+
		"\u0000\u00bc\u001f\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\"\u0000\u0000"+
		"\u00be\u00bf\u0003$\u0012\u0000\u00bf!\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0005\u0018\u0000\u0000\u00c1\u00c2\u0003 \u0010\u0000\u00c2\u00c3\u0003"+
		"\"\u0011\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c0\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6#\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u001e\u0000"+
		"\u0000\u00c8\u00c9\u0003L&\u0000\u00c9\u00ca\u0005\u001f\u0000\u0000\u00ca"+
		"\u00cb\u0003$\u0012\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ce"+
		"\u0001\u0000\u0000\u0000\u00cd\u00c7\u0001\u0000\u0000\u0000\u00cd\u00cc"+
		"\u0001\u0000\u0000\u0000\u00ce%\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005"+
		"\f\u0000\u0000\u00d0\u00d1\u0005\u001a\u0000\u0000\u00d1\u00d2\u0003("+
		"\u0014\u0000\u00d2\u00d3\u0003*\u0015\u0000\u00d3\u00d4\u0005\u001b\u0000"+
		"\u0000\u00d4\u00d5\u0005\u0019\u0000\u0000\u00d5\'\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0005\"\u0000\u0000\u00d7\u00db\u0003$\u0012\u0000\u00d8"+
		"\u00db\u0005!\u0000\u0000\u00d9\u00db\u0005 \u0000\u0000\u00da\u00d6\u0001"+
		"\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00d9\u0001"+
		"\u0000\u0000\u0000\u00db)\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0018"+
		"\u0000\u0000\u00dd\u00de\u0003(\u0014\u0000\u00de\u00df\u0003*\u0015\u0000"+
		"\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e1\u00dc\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e2+\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u0007\u0000\u0000\u00e4"+
		"\u00e5\u0005\u001a\u0000\u0000\u00e5\u00e6\u0003>\u001f\u0000\u00e6\u00e7"+
		"\u0005\u001b\u0000\u0000\u00e7\u00e8\u0003\u0014\n\u0000\u00e8\u00e9\u0003"+
		".\u0017\u0000\u00e9-\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\b\u0000"+
		"\u0000\u00eb\u00ee\u0003\u0014\n\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ee/\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\t\u0000\u0000\u00f0"+
		"\u00f1\u0005\u001a\u0000\u0000\u00f1\u00f2\u0003>\u001f\u0000\u00f2\u00f3"+
		"\u0005\u001b\u0000\u0000\u00f3\u00f4\u0003\u0014\n\u0000\u00f41\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0005\"\u0000\u0000\u00f6\u00f7\u0005\u0016"+
		"\u0000\u0000\u00f7\u00f8\u00034\u001a\u0000\u00f8\u00f9\u0005\u0019\u0000"+
		"\u0000\u00f93\u0001\u0000\u0000\u0000\u00fa\u00fd\u0003>\u001f\u0000\u00fb"+
		"\u00fd\u00036\u001b\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fd5\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005"+
		"\r\u0000\u0000\u00ff\u0100\u0005\"\u0000\u0000\u0100\u0101\u0005\u001a"+
		"\u0000\u0000\u0101\u0102\u00038\u001c\u0000\u0102\u0103\u0005\u001b\u0000"+
		"\u0000\u01037\u0001\u0000\u0000\u0000\u0104\u0105\u0003>\u001f\u0000\u0105"+
		"\u0106\u0003:\u001d\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0109"+
		"\u0001\u0000\u0000\u0000\u0108\u0104\u0001\u0000\u0000\u0000\u0108\u0107"+
		"\u0001\u0000\u0000\u0000\u01099\u0001\u0000\u0000\u0000\u010a\u010b\u0005"+
		"\u0018\u0000\u0000\u010b\u010c\u0003>\u001f\u0000\u010c\u010d\u0003:\u001d"+
		"\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000\u0000"+
		"\u0000\u010f\u010a\u0001\u0000\u0000\u0000\u010f\u010e\u0001\u0000\u0000"+
		"\u0000\u0110;\u0001\u0000\u0000\u0000\u0111\u0112\u0005\n\u0000\u0000"+
		"\u0112\u0113\u0003>\u001f\u0000\u0113\u0114\u0005\u0019\u0000\u0000\u0114"+
		"=\u0001\u0000\u0000\u0000\u0115\u0116\u0003@ \u0000\u0116?\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0003D\"\u0000\u0118\u0119\u0003B!\u0000\u0119"+
		"A\u0001\u0000\u0000\u0000\u011a\u011b\u0005\u0015\u0000\u0000\u011b\u011c"+
		"\u0003D\"\u0000\u011c\u011d\u0003B!\u0000\u011d\u0120\u0001\u0000\u0000"+
		"\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u011a\u0001\u0000\u0000"+
		"\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120C\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0003H$\u0000\u0122\u0123\u0003F#\u0000\u0123E\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0005\u0014\u0000\u0000\u0125\u0126\u0003H$\u0000"+
		"\u0126\u0127\u0003F#\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u012a"+
		"\u0001\u0000\u0000\u0000\u0129\u0124\u0001\u0000\u0000\u0000\u0129\u0128"+
		"\u0001\u0000\u0000\u0000\u012aG\u0001\u0000\u0000\u0000\u012b\u012c\u0003"+
		"L&\u0000\u012c\u012d\u0003J%\u0000\u012dI\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0005\u000e\u0000\u0000\u012f\u0132\u0003L&\u0000\u0130\u0132\u0001"+
		"\u0000\u0000\u0000\u0131\u012e\u0001\u0000\u0000\u0000\u0131\u0130\u0001"+
		"\u0000\u0000\u0000\u0132K\u0001\u0000\u0000\u0000\u0133\u0134\u0003R)"+
		"\u0000\u0134\u0135\u0003N\'\u0000\u0135M\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0003P(\u0000\u0137\u0138\u0003R)\u0000\u0138\u0139\u0003N\'\u0000"+
		"\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000"+
		"\u013b\u0136\u0001\u0000\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000"+
		"\u013cO\u0001\u0000\u0000\u0000\u013d\u013e\u0007\u0001\u0000\u0000\u013e"+
		"Q\u0001\u0000\u0000\u0000\u013f\u0140\u0003X,\u0000\u0140\u0141\u0003"+
		"T*\u0000\u0141S\u0001\u0000\u0000\u0000\u0142\u0143\u0003V+\u0000\u0143"+
		"\u0144\u0003X,\u0000\u0144\u0145\u0003T*\u0000\u0145\u0148\u0001\u0000"+
		"\u0000\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0142\u0001\u0000"+
		"\u0000\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148U\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0007\u0002\u0000\u0000\u014aW\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0003\\.\u0000\u014c\u014d\u0003Z-\u0000\u014d\u0157\u0001"+
		"\u0000\u0000\u0000\u014e\u0157\u0005 \u0000\u0000\u014f\u0150\u0005\u0017"+
		"\u0000\u0000\u0150\u0157\u0003X,\u0000\u0151\u0152\u0005\u001a\u0000\u0000"+
		"\u0152\u0153\u0003>\u001f\u0000\u0153\u0154\u0005\u001b\u0000\u0000\u0154"+
		"\u0157\u0001\u0000\u0000\u0000\u0155\u0157\u00036\u001b\u0000\u0156\u014b"+
		"\u0001\u0000\u0000\u0000\u0156\u014e\u0001\u0000\u0000\u0000\u0156\u014f"+
		"\u0001\u0000\u0000\u0000\u0156\u0151\u0001\u0000\u0000\u0000\u0156\u0155"+
		"\u0001\u0000\u0000\u0000\u0157Y\u0001\u0000\u0000\u0000\u0158\u0159\u0005"+
		"\"\u0000\u0000\u0159\u015c\u0003$\u0012\u0000\u015a\u015c\u0005!\u0000"+
		"\u0000\u015b\u0158\u0001\u0000\u0000\u0000\u015b\u015a\u0001\u0000\u0000"+
		"\u0000\u015c[\u0001\u0000\u0000\u0000\u015d\u0161\u0005\u000f\u0000\u0000"+
		"\u015e\u0161\u0005\u0010\u0000\u0000\u015f\u0161\u0001\u0000\u0000\u0000"+
		"\u0160\u015d\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000"+
		"\u0160\u015f\u0001\u0000\u0000\u0000\u0161]\u0001\u0000\u0000\u0000\u0019"+
		"fq}\u0084\u008c\u009f\u00a5\u00ab\u00b4\u00c5\u00cd\u00da\u00e1\u00ed"+
		"\u00fc\u0108\u010f\u011f\u0129\u0131\u013b\u0147\u0156\u015b\u0160";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}