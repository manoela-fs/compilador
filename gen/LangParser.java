// Generated from C:/Users/10986789909/Documents/compilador-part2/src/main/antlr4/LangParser.g4 by ANTLR 4.13.2
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
		INT_TYPE=1, FLOAT_TYPE=2, CHAR_TYPE=3, BOOLEAN_TYPE=4, VOID=5, IF=6, ELSE=7, 
		FOR=8, WHILE=9, SCANF=10, PRINTLN=11, MAIN=12, RETURN=13, TRUE=14, FALSE=15, 
		COMMENT=16, STRING=17, CHAR_LITERAL=18, INT_LITERAL=19, FLOAT_LITERAL=20, 
		ID=21, ASSIGN=22, ADD=23, SUB=24, MUL=25, DIV=26, MOD=27, AND=28, OR=29, 
		NOT=30, LT=31, LE=32, GT=33, GE=34, NEQ=35, EQ=36, LPAREN=37, RPAREN=38, 
		LBRACE=39, RBRACE=40, LBRACK=41, RBRACK=42, SEMI=43, COMMA=44, WS=45;
	public static final int
		RULE_program = 0, RULE_secaoFuncoes = 1, RULE_listafuncoes = 2, RULE_decFuncao = 3, 
		RULE_tipoRetorno = 4, RULE_tipo = 5, RULE_tipoBase = 6, RULE_parametros = 7, 
		RULE_listaParams = 8, RULE_principal = 9, RULE_bloco = 10, RULE_listaDeclaracoes = 11, 
		RULE_declaracao = 12, RULE_dimensoes = 13, RULE_listaEstruturas = 14, 
		RULE_estrutura = 15, RULE_atribuicao = 16, RULE_var = 17, RULE_indice = 18, 
		RULE_controle = 19, RULE_ifStatement = 20, RULE_whileStatement = 21, RULE_forStatement = 22, 
		RULE_chamada = 23, RULE_expressao = 24, RULE_andExp = 25, RULE_eqExp = 26, 
		RULE_relExp = 27, RULE_addExp = 28, RULE_mulExp = 29, RULE_unaryExp = 30, 
		RULE_primary = 31, RULE_funcCall = 32, RULE_literal = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "secaoFuncoes", "listafuncoes", "decFuncao", "tipoRetorno", 
			"tipo", "tipoBase", "parametros", "listaParams", "principal", "bloco", 
			"listaDeclaracoes", "declaracao", "dimensoes", "listaEstruturas", "estrutura", 
			"atribuicao", "var", "indice", "controle", "ifStatement", "whileStatement", 
			"forStatement", "chamada", "expressao", "andExp", "eqExp", "relExp", 
			"addExp", "mulExp", "unaryExp", "primary", "funcCall", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'char'", "'boolean'", "'void'", "'if'", "'else'", 
			"'for'", "'while'", "'scanf'", "'println'", "'main'", "'return'", "'true'", 
			"'false'", null, null, null, null, null, null, "'='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'&&'", "'||'", "'!'", "'<'", "'<='", "'>'", "'>='", "'!='", 
			"'=='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_TYPE", "FLOAT_TYPE", "CHAR_TYPE", "BOOLEAN_TYPE", "VOID", 
			"IF", "ELSE", "FOR", "WHILE", "SCANF", "PRINTLN", "MAIN", "RETURN", "TRUE", 
			"FALSE", "COMMENT", "STRING", "CHAR_LITERAL", "INT_LITERAL", "FLOAT_LITERAL", 
			"ID", "ASSIGN", "ADD", "SUB", "MUL", "DIV", "MOD", "AND", "OR", "NOT", 
			"LT", "LE", "GT", "GE", "NEQ", "EQ", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "SEMI", "COMMA", "WS"
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
	public static class ProgramContext extends ParserRuleContext {
		public SecaoFuncoesContext secaoFuncoes() {
			return getRuleContext(SecaoFuncoesContext.class,0);
		}
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			secaoFuncoes();
			setState(69);
			principal();
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
	public static class SecaoFuncoesContext extends ParserRuleContext {
		public ListafuncoesContext listafuncoes() {
			return getRuleContext(ListafuncoesContext.class,0);
		}
		public SecaoFuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secaoFuncoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterSecaoFuncoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitSecaoFuncoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitSecaoFuncoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecaoFuncoesContext secaoFuncoes() throws RecognitionException {
		SecaoFuncoesContext _localctx = new SecaoFuncoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_secaoFuncoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) {
				{
				setState(71);
				listafuncoes();
				}
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
	public static class ListafuncoesContext extends ParserRuleContext {
		public List<DecFuncaoContext> decFuncao() {
			return getRuleContexts(DecFuncaoContext.class);
		}
		public DecFuncaoContext decFuncao(int i) {
			return getRuleContext(DecFuncaoContext.class,i);
		}
		public ListafuncoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listafuncoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterListafuncoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitListafuncoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitListafuncoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListafuncoesContext listafuncoes() throws RecognitionException {
		ListafuncoesContext _localctx = new ListafuncoesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listafuncoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				decFuncao();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0) );
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
		enterRule(_localctx, 6, RULE_decFuncao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			tipoRetorno();
			setState(80);
			match(ID);
			setState(81);
			match(LPAREN);
			setState(82);
			parametros();
			setState(83);
			match(RPAREN);
			setState(84);
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
		enterRule(_localctx, 8, RULE_tipoRetorno);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case CHAR_TYPE:
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				tipo();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
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
		enterRule(_localctx, 10, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			tipoBase();
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
		public TerminalNode CHAR_TYPE() { return getToken(LangParser.CHAR_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(LangParser.FLOAT_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(LangParser.INT_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(LangParser.BOOLEAN_TYPE, 0); }
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
		enterRule(_localctx, 12, RULE_tipoBase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
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
	public static class ParametrosContext extends ParserRuleContext {
		public ListaParamsContext listaParams() {
			return getRuleContext(ListaParamsContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) {
				{
				setState(94);
				listaParams();
				}
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
	public static class ListaParamsContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(LangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LangParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public ListaParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterListaParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitListaParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitListaParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParamsContext listaParams() throws RecognitionException {
		ListaParamsContext _localctx = new ListaParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listaParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			tipo();
			setState(98);
			match(ID);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(99);
				match(COMMA);
				setState(100);
				tipo();
				setState(101);
				match(ID);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
			setState(108);
			match(MAIN);
			setState(109);
			match(LPAREN);
			setState(110);
			match(RPAREN);
			setState(111);
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
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public ListaEstruturasContext listaEstruturas() {
			return getRuleContext(ListaEstruturasContext.class,0);
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
			setState(113);
			match(LBRACE);
			setState(114);
			listaDeclaracoes();
			setState(115);
			listaEstruturas();
			setState(116);
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
	public static class ListaDeclaracoesContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public ListaDeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterListaDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitListaDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitListaDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaDeclaracoesContext listaDeclaracoes() throws RecognitionException {
		ListaDeclaracoesContext _localctx = new ListaDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listaDeclaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) {
				{
				{
				setState(118);
				declaracao();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class DeclaracaoContext extends ParserRuleContext {
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	 
		public DeclaracaoContext() { }
		public void copyFrom(DeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclArrayContext extends DeclaracaoContext {
		public TipoBaseContext tipoBase() {
			return getRuleContext(TipoBaseContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public DimensoesContext dimensoes() {
			return getRuleContext(DimensoesContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LangParser.SEMI, 0); }
		public DeclArrayContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterDeclArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitDeclArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitDeclArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclSimplesContext extends DeclaracaoContext {
		public TipoBaseContext tipoBase() {
			return getRuleContext(TipoBaseContext.class,0);
		}
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(LangParser.SEMI, 0); }
		public DeclSimplesContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterDeclSimples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitDeclSimples(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitDeclSimples(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaracao);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new DeclArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				tipoBase();
				setState(125);
				match(ID);
				setState(126);
				dimensoes();
				setState(127);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new DeclSimplesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				tipoBase();
				setState(130);
				match(ID);
				setState(131);
				match(SEMI);
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
	public static class DimensoesContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(LangParser.LBRACK, 0); }
		public TerminalNode INT_LITERAL() { return getToken(LangParser.INT_LITERAL, 0); }
		public TerminalNode RBRACK() { return getToken(LangParser.RBRACK, 0); }
		public DimensoesContext dimensoes() {
			return getRuleContext(DimensoesContext.class,0);
		}
		public DimensoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterDimensoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitDimensoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitDimensoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensoesContext dimensoes() throws RecognitionException {
		DimensoesContext _localctx = new DimensoesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dimensoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(LBRACK);
			setState(136);
			match(INT_LITERAL);
			setState(137);
			match(RBRACK);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(138);
				dimensoes();
				}
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
	public static class ListaEstruturasContext extends ParserRuleContext {
		public List<EstruturaContext> estrutura() {
			return getRuleContexts(EstruturaContext.class);
		}
		public EstruturaContext estrutura(int i) {
			return getRuleContext(EstruturaContext.class,i);
		}
		public ListaEstruturasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaEstruturas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterListaEstruturas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitListaEstruturas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitListaEstruturas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaEstruturasContext listaEstruturas() throws RecognitionException {
		ListaEstruturasContext _localctx = new ListaEstruturasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listaEstruturas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2109248L) != 0)) {
				{
				{
				setState(141);
				estrutura();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class EstruturaContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ControleContext controle() {
			return getRuleContext(ControleContext.class,0);
		}
		public ChamadaContext chamada() {
			return getRuleContext(ChamadaContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(LangParser.SEMI, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public EstruturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estrutura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterEstrutura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitEstrutura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitEstrutura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstruturaContext estrutura() throws RecognitionException {
		EstruturaContext _localctx = new EstruturaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_estrutura);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				atribuicao();
				}
				break;
			case IF:
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				controle();
				}
				break;
			case SCANF:
			case PRINTLN:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				chamada();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(RETURN);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 138533584896L) != 0)) {
					{
					setState(151);
					expressao();
					}
				}

				setState(154);
				match(SEMI);
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
	public static class AtribuicaoContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(LangParser.ASSIGN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
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
		enterRule(_localctx, 32, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			var();
			setState(158);
			match(ASSIGN);
			setState(159);
			expressao();
			setState(160);
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public IndiceContext indice() {
			return getRuleContext(IndiceContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ID);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(163);
				indice();
				}
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
	public static class IndiceContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(LangParser.LBRACK, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(LangParser.RBRACK, 0); }
		public IndiceContext indice() {
			return getRuleContext(IndiceContext.class,0);
		}
		public IndiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterIndice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitIndice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitIndice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndiceContext indice() throws RecognitionException {
		IndiceContext _localctx = new IndiceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_indice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(LBRACK);
			setState(167);
			expressao();
			setState(168);
			match(RBRACK);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(169);
				indice();
				}
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
	public static class ControleContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ControleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterControle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitControle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitControle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControleContext controle() throws RecognitionException {
		ControleContext _localctx = new ControleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_controle);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				forStatement();
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LangParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(IF);
			setState(178);
			match(LPAREN);
			setState(179);
			expressao();
			setState(180);
			match(RPAREN);
			setState(181);
			bloco();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(182);
				match(ELSE);
				setState(183);
				bloco();
				}
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LangParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(WHILE);
			setState(187);
			match(LPAREN);
			setState(188);
			expressao();
			setState(189);
			match(RPAREN);
			setState(190);
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
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LangParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public List<AtribuicaoContext> atribuicao() {
			return getRuleContexts(AtribuicaoContext.class);
		}
		public AtribuicaoContext atribuicao(int i) {
			return getRuleContext(AtribuicaoContext.class,i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LangParser.SEMI, 0); }
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(FOR);
			setState(193);
			match(LPAREN);
			setState(194);
			atribuicao();
			setState(195);
			expressao();
			setState(196);
			match(SEMI);
			setState(197);
			atribuicao();
			setState(198);
			match(RPAREN);
			setState(199);
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
	public static class ChamadaContext extends ParserRuleContext {
		public TerminalNode SCANF() { return getToken(LangParser.SCANF, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(LangParser.SEMI, 0); }
		public TerminalNode PRINTLN() { return getToken(LangParser.PRINTLN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitChamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitChamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadaContext chamada() throws RecognitionException {
		ChamadaContext _localctx = new ChamadaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_chamada);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCANF:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(SCANF);
				setState(202);
				match(LPAREN);
				setState(203);
				var();
				setState(204);
				match(RPAREN);
				setState(205);
				match(SEMI);
				}
				break;
			case PRINTLN:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(PRINTLN);
				setState(208);
				match(LPAREN);
				setState(209);
				expressao();
				setState(210);
				match(RPAREN);
				setState(211);
				match(SEMI);
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
	public static class ExpressaoContext extends ParserRuleContext {
		public List<AndExpContext> andExp() {
			return getRuleContexts(AndExpContext.class);
		}
		public AndExpContext andExp(int i) {
			return getRuleContext(AndExpContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(LangParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(LangParser.OR, i);
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
		enterRule(_localctx, 48, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			andExp();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(216);
				match(OR);
				setState(217);
				andExp();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class AndExpContext extends ParserRuleContext {
		public List<EqExpContext> eqExp() {
			return getRuleContexts(EqExpContext.class);
		}
		public EqExpContext eqExp(int i) {
			return getRuleContext(EqExpContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(LangParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(LangParser.AND, i);
		}
		public AndExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitAndExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpContext andExp() throws RecognitionException {
		AndExpContext _localctx = new AndExpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_andExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			eqExp();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(224);
				match(AND);
				setState(225);
				eqExp();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class EqExpContext extends ParserRuleContext {
		public List<RelExpContext> relExp() {
			return getRuleContexts(RelExpContext.class);
		}
		public RelExpContext relExp(int i) {
			return getRuleContext(RelExpContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(LangParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(LangParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(LangParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(LangParser.NEQ, i);
		}
		public EqExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterEqExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitEqExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitEqExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqExpContext eqExp() throws RecognitionException {
		EqExpContext _localctx = new EqExpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_eqExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			relExp();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEQ || _la==EQ) {
				{
				{
				setState(232);
				_la = _input.LA(1);
				if ( !(_la==NEQ || _la==EQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(233);
				relExp();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class RelExpContext extends ParserRuleContext {
		public List<AddExpContext> addExp() {
			return getRuleContexts(AddExpContext.class);
		}
		public AddExpContext addExp(int i) {
			return getRuleContext(AddExpContext.class,i);
		}
		public List<TerminalNode> LT() { return getTokens(LangParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(LangParser.LT, i);
		}
		public List<TerminalNode> LE() { return getTokens(LangParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(LangParser.LE, i);
		}
		public List<TerminalNode> GT() { return getTokens(LangParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(LangParser.GT, i);
		}
		public List<TerminalNode> GE() { return getTokens(LangParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(LangParser.GE, i);
		}
		public RelExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterRelExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitRelExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitRelExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelExpContext relExp() throws RecognitionException {
		RelExpContext _localctx = new RelExpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_relExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			addExp();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) {
				{
				{
				setState(240);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(241);
				addExp();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class AddExpContext extends ParserRuleContext {
		public List<MulExpContext> mulExp() {
			return getRuleContexts(MulExpContext.class);
		}
		public MulExpContext mulExp(int i) {
			return getRuleContext(MulExpContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(LangParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(LangParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(LangParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(LangParser.SUB, i);
		}
		public AddExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterAddExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitAddExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitAddExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpContext addExp() throws RecognitionException {
		AddExpContext _localctx = new AddExpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_addExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			mulExp();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(248);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(249);
				mulExp();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class MulExpContext extends ParserRuleContext {
		public List<UnaryExpContext> unaryExp() {
			return getRuleContexts(UnaryExpContext.class);
		}
		public UnaryExpContext unaryExp(int i) {
			return getRuleContext(UnaryExpContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(LangParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(LangParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(LangParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(LangParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(LangParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(LangParser.MOD, i);
		}
		public MulExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterMulExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitMulExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitMulExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExpContext mulExp() throws RecognitionException {
		MulExpContext _localctx = new MulExpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mulExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			unaryExp();
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) {
				{
				{
				setState(256);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(257);
				unaryExp();
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class UnaryExpContext extends ParserRuleContext {
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public TerminalNode NOT() { return getToken(LangParser.NOT, 0); }
		public TerminalNode SUB() { return getToken(LangParser.SUB, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public UnaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterUnaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitUnaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpContext unaryExp() throws RecognitionException {
		UnaryExpContext _localctx = new UnaryExpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_unaryExp);
		int _la;
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				_la = _input.LA(1);
				if ( !(_la==SUB || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(264);
				unaryExp();
				}
				break;
			case TRUE:
			case FALSE:
			case STRING:
			case CHAR_LITERAL:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case ID:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				primary();
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
	public static class PrimaryContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_primary);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				match(LPAREN);
				setState(271);
				expressao();
				setState(272);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				funcCall();
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
	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(ID);
			setState(278);
			match(LPAREN);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 138533584896L) != 0)) {
				{
				setState(279);
				expressao();
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(280);
					match(COMMA);
					setState(281);
					expressao();
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(289);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(LangParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(LangParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(LangParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(LangParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LangParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangParserListener ) ((LangParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangParserVisitor ) return ((LangParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2015232L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001-\u0126\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0003\u0001I\b\u0001\u0001\u0002\u0004"+
		"\u0002L\b\u0002\u000b\u0002\f\u0002M\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004Y\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0003\u0007`\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\bh\b\b\n\b\f\bk\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0005\u000bx\b"+
		"\u000b\n\u000b\f\u000b{\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0086\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u008c\b\r\u0001\u000e\u0005\u000e\u008f\b\u000e\n\u000e"+
		"\f\u000e\u0092\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0099\b\u000f\u0001\u000f\u0003\u000f\u009c\b"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00a5\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00ab\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00b0\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00b9\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00d6\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u00db\b\u0018\n\u0018\f\u0018\u00de\t\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u00e3\b\u0019\n\u0019"+
		"\f\u0019\u00e6\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u00eb\b\u001a\n\u001a\f\u001a\u00ee\t\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u00f3\b\u001b\n\u001b\f\u001b\u00f6\t\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u00fb\b\u001c\n\u001c\f\u001c\u00fe"+
		"\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0103\b\u001d"+
		"\n\u001d\f\u001d\u0106\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u010b\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0114\b\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0005 \u011b\b \n \f \u011e\t \u0003 \u0120\b "+
		"\u0001 \u0001 \u0001!\u0001!\u0001!\u0000\u0000\"\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@B\u0000\u0007\u0001\u0000\u0001\u0004\u0001\u0000#$\u0001\u0000"+
		"\u001f\"\u0001\u0000\u0017\u0018\u0001\u0000\u0019\u001b\u0002\u0000\u0018"+
		"\u0018\u001e\u001e\u0002\u0000\u000e\u000f\u0011\u0014\u0122\u0000D\u0001"+
		"\u0000\u0000\u0000\u0002H\u0001\u0000\u0000\u0000\u0004K\u0001\u0000\u0000"+
		"\u0000\u0006O\u0001\u0000\u0000\u0000\bX\u0001\u0000\u0000\u0000\nZ\u0001"+
		"\u0000\u0000\u0000\f\\\u0001\u0000\u0000\u0000\u000e_\u0001\u0000\u0000"+
		"\u0000\u0010a\u0001\u0000\u0000\u0000\u0012l\u0001\u0000\u0000\u0000\u0014"+
		"q\u0001\u0000\u0000\u0000\u0016y\u0001\u0000\u0000\u0000\u0018\u0085\u0001"+
		"\u0000\u0000\u0000\u001a\u0087\u0001\u0000\u0000\u0000\u001c\u0090\u0001"+
		"\u0000\u0000\u0000\u001e\u009b\u0001\u0000\u0000\u0000 \u009d\u0001\u0000"+
		"\u0000\u0000\"\u00a2\u0001\u0000\u0000\u0000$\u00a6\u0001\u0000\u0000"+
		"\u0000&\u00af\u0001\u0000\u0000\u0000(\u00b1\u0001\u0000\u0000\u0000*"+
		"\u00ba\u0001\u0000\u0000\u0000,\u00c0\u0001\u0000\u0000\u0000.\u00d5\u0001"+
		"\u0000\u0000\u00000\u00d7\u0001\u0000\u0000\u00002\u00df\u0001\u0000\u0000"+
		"\u00004\u00e7\u0001\u0000\u0000\u00006\u00ef\u0001\u0000\u0000\u00008"+
		"\u00f7\u0001\u0000\u0000\u0000:\u00ff\u0001\u0000\u0000\u0000<\u010a\u0001"+
		"\u0000\u0000\u0000>\u0113\u0001\u0000\u0000\u0000@\u0115\u0001\u0000\u0000"+
		"\u0000B\u0123\u0001\u0000\u0000\u0000DE\u0003\u0002\u0001\u0000EF\u0003"+
		"\u0012\t\u0000F\u0001\u0001\u0000\u0000\u0000GI\u0003\u0004\u0002\u0000"+
		"HG\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\u0003\u0001\u0000"+
		"\u0000\u0000JL\u0003\u0006\u0003\u0000KJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"N\u0005\u0001\u0000\u0000\u0000OP\u0003\b\u0004\u0000PQ\u0005\u0015\u0000"+
		"\u0000QR\u0005%\u0000\u0000RS\u0003\u000e\u0007\u0000ST\u0005&\u0000\u0000"+
		"TU\u0003\u0014\n\u0000U\u0007\u0001\u0000\u0000\u0000VY\u0003\n\u0005"+
		"\u0000WY\u0005\u0005\u0000\u0000XV\u0001\u0000\u0000\u0000XW\u0001\u0000"+
		"\u0000\u0000Y\t\u0001\u0000\u0000\u0000Z[\u0003\f\u0006\u0000[\u000b\u0001"+
		"\u0000\u0000\u0000\\]\u0007\u0000\u0000\u0000]\r\u0001\u0000\u0000\u0000"+
		"^`\u0003\u0010\b\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`\u000f\u0001\u0000\u0000\u0000ab\u0003\n\u0005\u0000bi\u0005\u0015\u0000"+
		"\u0000cd\u0005,\u0000\u0000de\u0003\n\u0005\u0000ef\u0005\u0015\u0000"+
		"\u0000fh\u0001\u0000\u0000\u0000gc\u0001\u0000\u0000\u0000hk\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0011"+
		"\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\f\u0000\u0000"+
		"mn\u0005%\u0000\u0000no\u0005&\u0000\u0000op\u0003\u0014\n\u0000p\u0013"+
		"\u0001\u0000\u0000\u0000qr\u0005\'\u0000\u0000rs\u0003\u0016\u000b\u0000"+
		"st\u0003\u001c\u000e\u0000tu\u0005(\u0000\u0000u\u0015\u0001\u0000\u0000"+
		"\u0000vx\u0003\u0018\f\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0017\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0003\f\u0006\u0000}~\u0005"+
		"\u0015\u0000\u0000~\u007f\u0003\u001a\r\u0000\u007f\u0080\u0005+\u0000"+
		"\u0000\u0080\u0086\u0001\u0000\u0000\u0000\u0081\u0082\u0003\f\u0006\u0000"+
		"\u0082\u0083\u0005\u0015\u0000\u0000\u0083\u0084\u0005+\u0000\u0000\u0084"+
		"\u0086\u0001\u0000\u0000\u0000\u0085|\u0001\u0000\u0000\u0000\u0085\u0081"+
		"\u0001\u0000\u0000\u0000\u0086\u0019\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005)\u0000\u0000\u0088\u0089\u0005\u0013\u0000\u0000\u0089\u008b\u0005"+
		"*\u0000\u0000\u008a\u008c\u0003\u001a\r\u0000\u008b\u008a\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u001b\u0001\u0000"+
		"\u0000\u0000\u008d\u008f\u0003\u001e\u000f\u0000\u008e\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u001d\u0001\u0000"+
		"\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u009c\u0003 \u0010"+
		"\u0000\u0094\u009c\u0003&\u0013\u0000\u0095\u009c\u0003.\u0017\u0000\u0096"+
		"\u0098\u0005\r\u0000\u0000\u0097\u0099\u00030\u0018\u0000\u0098\u0097"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0001\u0000\u0000\u0000\u009a\u009c\u0005+\u0000\u0000\u009b\u0093\u0001"+
		"\u0000\u0000\u0000\u009b\u0094\u0001\u0000\u0000\u0000\u009b\u0095\u0001"+
		"\u0000\u0000\u0000\u009b\u0096\u0001\u0000\u0000\u0000\u009c\u001f\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0003\"\u0011\u0000\u009e\u009f\u0005\u0016"+
		"\u0000\u0000\u009f\u00a0\u00030\u0018\u0000\u00a0\u00a1\u0005+\u0000\u0000"+
		"\u00a1!\u0001\u0000\u0000\u0000\u00a2\u00a4\u0005\u0015\u0000\u0000\u00a3"+
		"\u00a5\u0003$\u0012\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5#\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005"+
		")\u0000\u0000\u00a7\u00a8\u00030\u0018\u0000\u00a8\u00aa\u0005*\u0000"+
		"\u0000\u00a9\u00ab\u0003$\u0012\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab%\u0001\u0000\u0000\u0000\u00ac"+
		"\u00b0\u0003(\u0014\u0000\u00ad\u00b0\u0003*\u0015\u0000\u00ae\u00b0\u0003"+
		",\u0016\u0000\u00af\u00ac\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\'\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0005\u0006\u0000\u0000\u00b2\u00b3\u0005%\u0000\u0000"+
		"\u00b3\u00b4\u00030\u0018\u0000\u00b4\u00b5\u0005&\u0000\u0000\u00b5\u00b8"+
		"\u0003\u0014\n\u0000\u00b6\u00b7\u0005\u0007\u0000\u0000\u00b7\u00b9\u0003"+
		"\u0014\n\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9)\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\t\u0000"+
		"\u0000\u00bb\u00bc\u0005%\u0000\u0000\u00bc\u00bd\u00030\u0018\u0000\u00bd"+
		"\u00be\u0005&\u0000\u0000\u00be\u00bf\u0003\u0014\n\u0000\u00bf+\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0005\b\u0000\u0000\u00c1\u00c2\u0005%"+
		"\u0000\u0000\u00c2\u00c3\u0003 \u0010\u0000\u00c3\u00c4\u00030\u0018\u0000"+
		"\u00c4\u00c5\u0005+\u0000\u0000\u00c5\u00c6\u0003 \u0010\u0000\u00c6\u00c7"+
		"\u0005&\u0000\u0000\u00c7\u00c8\u0003\u0014\n\u0000\u00c8-\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0005\n\u0000\u0000\u00ca\u00cb\u0005%\u0000"+
		"\u0000\u00cb\u00cc\u0003\"\u0011\u0000\u00cc\u00cd\u0005&\u0000\u0000"+
		"\u00cd\u00ce\u0005+\u0000\u0000\u00ce\u00d6\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005\u000b\u0000\u0000\u00d0\u00d1\u0005%\u0000\u0000\u00d1\u00d2"+
		"\u00030\u0018\u0000\u00d2\u00d3\u0005&\u0000\u0000\u00d3\u00d4\u0005+"+
		"\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00c9\u0001\u0000"+
		"\u0000\u0000\u00d5\u00cf\u0001\u0000\u0000\u0000\u00d6/\u0001\u0000\u0000"+
		"\u0000\u00d7\u00dc\u00032\u0019\u0000\u00d8\u00d9\u0005\u001d\u0000\u0000"+
		"\u00d9\u00db\u00032\u0019\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db"+
		"\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dd1\u0001\u0000\u0000\u0000\u00de\u00dc"+
		"\u0001\u0000\u0000\u0000\u00df\u00e4\u00034\u001a\u0000\u00e0\u00e1\u0005"+
		"\u001c\u0000\u0000\u00e1\u00e3\u00034\u001a\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e53\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00ec\u00036\u001b\u0000"+
		"\u00e8\u00e9\u0007\u0001\u0000\u0000\u00e9\u00eb\u00036\u001b\u0000\u00ea"+
		"\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed"+
		"5\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f4"+
		"\u00038\u001c\u0000\u00f0\u00f1\u0007\u0002\u0000\u0000\u00f1\u00f3\u0003"+
		"8\u001c\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f57\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f7\u00fc\u0003:\u001d\u0000\u00f8\u00f9\u0007\u0003\u0000\u0000"+
		"\u00f9\u00fb\u0003:\u001d\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd9\u0001\u0000\u0000\u0000\u00fe\u00fc"+
		"\u0001\u0000\u0000\u0000\u00ff\u0104\u0003<\u001e\u0000\u0100\u0101\u0007"+
		"\u0004\u0000\u0000\u0101\u0103\u0003<\u001e\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105;\u0001\u0000\u0000"+
		"\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u0108\u0007\u0005\u0000"+
		"\u0000\u0108\u010b\u0003<\u001e\u0000\u0109\u010b\u0003>\u001f\u0000\u010a"+
		"\u0107\u0001\u0000\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b"+
		"=\u0001\u0000\u0000\u0000\u010c\u0114\u0003\"\u0011\u0000\u010d\u0114"+
		"\u0003B!\u0000\u010e\u010f\u0005%\u0000\u0000\u010f\u0110\u00030\u0018"+
		"\u0000\u0110\u0111\u0005&\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000"+
		"\u0112\u0114\u0003@ \u0000\u0113\u010c\u0001\u0000\u0000\u0000\u0113\u010d"+
		"\u0001\u0000\u0000\u0000\u0113\u010e\u0001\u0000\u0000\u0000\u0113\u0112"+
		"\u0001\u0000\u0000\u0000\u0114?\u0001\u0000\u0000\u0000\u0115\u0116\u0005"+
		"\u0015\u0000\u0000\u0116\u011f\u0005%\u0000\u0000\u0117\u011c\u00030\u0018"+
		"\u0000\u0118\u0119\u0005,\u0000\u0000\u0119\u011b\u00030\u0018\u0000\u011a"+
		"\u0118\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000\u0000\u0000\u011c"+
		"\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d"+
		"\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f"+
		"\u0117\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\u0001\u0000\u0000\u0000\u0121\u0122\u0005&\u0000\u0000\u0122A\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0007\u0006\u0000\u0000\u0124C\u0001\u0000"+
		"\u0000\u0000\u001aHMX_iy\u0085\u008b\u0090\u0098\u009b\u00a4\u00aa\u00af"+
		"\u00b8\u00d5\u00dc\u00e4\u00ec\u00f4\u00fc\u0104\u010a\u0113\u011c\u011f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}