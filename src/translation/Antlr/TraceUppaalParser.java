// Generated from C:/Users/Jaime/OneDrive - correounivalle.edu.co/Documentos/Github/TranslationTraceUppaal/src/translation/Antlr\TraceUppaalParser.g4 by ANTLR 4.9.1
package translation.Antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TraceUppaalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, STATE=2, DELAY=3, TRANSITION=4, TAU=5, IDENTIFIER=6, NAT=7, POINT=8, 
		ARROW=9, BRACKET_LEFT=10, BRACKET_RIGHT=11, PAR_LEFT=12, PAR_RIGHT=13, 
		DOT=14, COLON=15, SEMICOLON=16, COMMA=17, QUESTION=18, EXCLAMATION=19, 
		FORALL=20, EXISTS=21, SUM=22, TRUE=23, FALSE=24, INT=25, DOUBLE=26, CLOCK=27, 
		CHAN=28, BOOL=29, SQUARE_BRACKET_L=30, SQUARE_BRACKET_R=31, SCALAR=32, 
		STRUCT=33, DERIVATE=34, INCREMENT=35, DECREMENT=36, ASSIGN=37, ASSIGN_COLON=38, 
		ASSIGN_ADD=39, ASSIGN_SUB=40, ASSIGN_MUL=41, ASSIGN_DIV=42, ASSIGN_PERCENT=43, 
		ASSIGN_OR=44, ASSIGN_AND=45, ASSIGN_XOR=46, ASSIGN_LSHIFT=47, ASSIGN_RSHIFT=48, 
		ADD=49, SUB=50, NOT=51, NUMERAL=52, LESS=53, LESSEQ=54, COMPARE=55, DIFFERENT=56, 
		GREATEREQ=57, GREATER=58, MUL=59, DIV=60, PERCENT=61, BITAND=62, BITOR=63, 
		BITXOR=64, LSHIFT=65, RSHIFT=66, AND_SYMBOL=67, OR_SYMBOL=68, MINIMUM=69, 
		MAXIMUM=70, OR=71, AND=72, IMPLY=73;
	public static final int
		RULE_trace = 0, RULE_state = 1, RULE_transition = 2, RULE_location = 3, 
		RULE_loc = 4, RULE_values = 5, RULE_clocks = 6, RULE_delay = 7, RULE_discrete = 8, 
		RULE_aDiscrete = 9, RULE_guard = 10, RULE_sync = 11, RULE_update = 12, 
		RULE_assign = 13, RULE_expr = 14, RULE_arguments = 15, RULE_type = 16, 
		RULE_fieldDecl = 17, RULE_varFieldDecl = 18, RULE_arrayDecl = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"trace", "state", "transition", "location", "loc", "values", "clocks", 
			"delay", "discrete", "aDiscrete", "guard", "sync", "update", "assign", 
			"expr", "arguments", "type", "fieldDecl", "varFieldDecl", "arrayDecl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'state'", "'delay'", "'transition'", "'tau'", null, null, 
			null, "'->'", "'{'", "'}'", "'('", "')'", "'.'", "':'", "';'", "','", 
			"'?'", "'!'", "'forall'", "'exists'", "'sum'", "'true'", "'false'", "'int'", 
			"'double'", "'clock'", "'chan'", "'bool'", "'['", "']'", "'scalar'", 
			"'struct'", "'''", "'++'", "'--'", "'='", "':='", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'|='", "'&='", "'^='", "'<<='", "'>>='", "'+'", "'-'", 
			"'not'", "'#'", "'<'", "'<='", "'=='", "'!='", "'>='", "'>'", "'*'", 
			"'/'", "'%'", "'&'", "'|'", "'^'", "'<<'", "'>>'", "'&&'", "'||'", "'<?'", 
			"'>?'", "'or'", "'and'", "'imply'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "STATE", "DELAY", "TRANSITION", "TAU", "IDENTIFIER", "NAT", 
			"POINT", "ARROW", "BRACKET_LEFT", "BRACKET_RIGHT", "PAR_LEFT", "PAR_RIGHT", 
			"DOT", "COLON", "SEMICOLON", "COMMA", "QUESTION", "EXCLAMATION", "FORALL", 
			"EXISTS", "SUM", "TRUE", "FALSE", "INT", "DOUBLE", "CLOCK", "CHAN", "BOOL", 
			"SQUARE_BRACKET_L", "SQUARE_BRACKET_R", "SCALAR", "STRUCT", "DERIVATE", 
			"INCREMENT", "DECREMENT", "ASSIGN", "ASSIGN_COLON", "ASSIGN_ADD", "ASSIGN_SUB", 
			"ASSIGN_MUL", "ASSIGN_DIV", "ASSIGN_PERCENT", "ASSIGN_OR", "ASSIGN_AND", 
			"ASSIGN_XOR", "ASSIGN_LSHIFT", "ASSIGN_RSHIFT", "ADD", "SUB", "NOT", 
			"NUMERAL", "LESS", "LESSEQ", "COMPARE", "DIFFERENT", "GREATEREQ", "GREATER", 
			"MUL", "DIV", "PERCENT", "BITAND", "BITOR", "BITXOR", "LSHIFT", "RSHIFT", 
			"AND_SYMBOL", "OR_SYMBOL", "MINIMUM", "MAXIMUM", "OR", "AND", "IMPLY"
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
	public String getGrammarFileName() { return "TraceUppaalParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TraceUppaalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TraceContext extends ParserRuleContext {
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public TraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterTrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitTrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitTrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TraceContext trace() throws RecognitionException {
		TraceContext _localctx = new TraceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_trace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			state();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELAY || _la==TRANSITION) {
				{
				{
				setState(41);
				transition();
				setState(42);
				state();
				}
				}
				setState(48);
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

	public static class StateContext extends ParserRuleContext {
		public TerminalNode STATE() { return getToken(TraceUppaalParser.STATE, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ClocksContext clocks() {
			return getRuleContext(ClocksContext.class,0);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(STATE);
			setState(50);
			location();
			setState(51);
			values();
			setState(52);
			clocks();
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

	public static class TransitionContext extends ParserRuleContext {
		public DelayContext delay() {
			return getRuleContext(DelayContext.class,0);
		}
		public DiscreteContext discrete() {
			return getRuleContext(DiscreteContext.class,0);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitTransition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitTransition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_transition);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				delay();
				}
				break;
			case TRANSITION:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				discrete();
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

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode PAR_LEFT() { return getToken(TraceUppaalParser.PAR_LEFT, 0); }
		public TerminalNode PAR_RIGHT() { return getToken(TraceUppaalParser.PAR_RIGHT, 0); }
		public List<LocContext> loc() {
			return getRuleContexts(LocContext.class);
		}
		public LocContext loc(int i) {
			return getRuleContext(LocContext.class,i);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_location);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(PAR_LEFT);
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				loc();
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(64);
			match(PAR_RIGHT);
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

	public static class LocContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TraceUppaalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TraceUppaalParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(TraceUppaalParser.DOT, 0); }
		public LocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitLoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitLoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocContext loc() throws RecognitionException {
		LocContext _localctx = new LocContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(IDENTIFIER);
			setState(67);
			match(DOT);
			setState(68);
			match(IDENTIFIER);
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

	public static class ValuesContext extends ParserRuleContext {
		public List<VarFieldDeclContext> varFieldDecl() {
			return getRuleContexts(VarFieldDeclContext.class);
		}
		public VarFieldDeclContext varFieldDecl(int i) {
			return getRuleContext(VarFieldDeclContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(TraceUppaalParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(TraceUppaalParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(70);
				varFieldDecl();
				setState(71);
				match(ASSIGN);
				setState(72);
				expr(0);
				}
				}
				setState(78);
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

	public static class ClocksContext extends ParserRuleContext {
		public TerminalNode SQUARE_BRACKET_L() { return getToken(TraceUppaalParser.SQUARE_BRACKET_L, 0); }
		public TerminalNode SQUARE_BRACKET_R() { return getToken(TraceUppaalParser.SQUARE_BRACKET_R, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TraceUppaalParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TraceUppaalParser.IDENTIFIER, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(TraceUppaalParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(TraceUppaalParser.ASSIGN, i);
		}
		public List<TerminalNode> POINT() { return getTokens(TraceUppaalParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(TraceUppaalParser.POINT, i);
		}
		public List<TerminalNode> NAT() { return getTokens(TraceUppaalParser.NAT); }
		public TerminalNode NAT(int i) {
			return getToken(TraceUppaalParser.NAT, i);
		}
		public List<TerminalNode> NUMERAL() { return getTokens(TraceUppaalParser.NUMERAL); }
		public TerminalNode NUMERAL(int i) {
			return getToken(TraceUppaalParser.NUMERAL, i);
		}
		public ClocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clocks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterClocks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitClocks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitClocks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClocksContext clocks() throws RecognitionException {
		ClocksContext _localctx = new ClocksContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_clocks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(SQUARE_BRACKET_L);
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMERAL) {
					{
					setState(80);
					match(NUMERAL);
					}
				}

				setState(83);
				match(IDENTIFIER);
				setState(84);
				match(ASSIGN);
				setState(85);
				_la = _input.LA(1);
				if ( !(_la==NAT || _la==POINT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER || _la==NUMERAL );
			setState(90);
			match(SQUARE_BRACKET_R);
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

	public static class DelayContext extends ParserRuleContext {
		public TerminalNode DELAY() { return getToken(TraceUppaalParser.DELAY, 0); }
		public TerminalNode POINT() { return getToken(TraceUppaalParser.POINT, 0); }
		public DelayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterDelay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitDelay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitDelay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelayContext delay() throws RecognitionException {
		DelayContext _localctx = new DelayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_delay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(DELAY);
			setState(93);
			match(POINT);
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

	public static class DiscreteContext extends ParserRuleContext {
		public TerminalNode TRANSITION() { return getToken(TraceUppaalParser.TRANSITION, 0); }
		public List<ADiscreteContext> aDiscrete() {
			return getRuleContexts(ADiscreteContext.class);
		}
		public ADiscreteContext aDiscrete(int i) {
			return getRuleContext(ADiscreteContext.class,i);
		}
		public DiscreteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discrete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterDiscrete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitDiscrete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitDiscrete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiscreteContext discrete() throws RecognitionException {
		DiscreteContext _localctx = new DiscreteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_discrete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(TRANSITION);
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				aDiscrete();
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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

	public static class ADiscreteContext extends ParserRuleContext {
		public List<LocContext> loc() {
			return getRuleContexts(LocContext.class);
		}
		public LocContext loc(int i) {
			return getRuleContext(LocContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(TraceUppaalParser.ARROW, 0); }
		public TerminalNode BRACKET_LEFT() { return getToken(TraceUppaalParser.BRACKET_LEFT, 0); }
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(TraceUppaalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TraceUppaalParser.COMMA, i);
		}
		public TerminalNode BRACKET_RIGHT() { return getToken(TraceUppaalParser.BRACKET_RIGHT, 0); }
		public SyncContext sync() {
			return getRuleContext(SyncContext.class,0);
		}
		public TerminalNode TAU() { return getToken(TraceUppaalParser.TAU, 0); }
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public TerminalNode NAT() { return getToken(TraceUppaalParser.NAT, 0); }
		public ADiscreteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aDiscrete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterADiscrete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitADiscrete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitADiscrete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ADiscreteContext aDiscrete() throws RecognitionException {
		ADiscreteContext _localctx = new ADiscreteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_aDiscrete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			loc();
			setState(102);
			match(ARROW);
			setState(103);
			loc();
			setState(104);
			match(BRACKET_LEFT);
			setState(105);
			guard();
			setState(106);
			match(COMMA);
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(107);
				sync();
				}
				break;
			case TAU:
				{
				setState(108);
				match(TAU);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(111);
			match(COMMA);
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(112);
				update();
				}
				break;
			case NAT:
				{
				setState(113);
				match(NAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(116);
			match(BRACKET_RIGHT);
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

	public static class GuardContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			expr(0);
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

	public static class SyncContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TraceUppaalParser.IDENTIFIER, 0); }
		public TerminalNode QUESTION() { return getToken(TraceUppaalParser.QUESTION, 0); }
		public TerminalNode EXCLAMATION() { return getToken(TraceUppaalParser.EXCLAMATION, 0); }
		public SyncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sync; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterSync(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitSync(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitSync(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyncContext sync() throws RecognitionException {
		SyncContext _localctx = new SyncContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sync);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(IDENTIFIER);
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==QUESTION || _la==EXCLAMATION) ) {
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

	public static class UpdateContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TraceUppaalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TraceUppaalParser.COMMA, i);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			assign();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(124);
				match(COMMA);
				setState(125);
				assign();
				}
				}
				setState(130);
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

	public static class AssignContext extends ParserRuleContext {
		public VarFieldDeclContext varFieldDecl() {
			return getRuleContext(VarFieldDeclContext.class,0);
		}
		public TerminalNode ASSIGN_COLON() { return getToken(TraceUppaalParser.ASSIGN_COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			varFieldDecl();
			setState(132);
			match(ASSIGN_COLON);
			setState(133);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IncrementExprContext extends ExprContext {
		public TerminalNode INCREMENT() { return getToken(TraceUppaalParser.INCREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncrementExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterIncrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitIncrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitIncrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(TraceUppaalParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(TraceUppaalParser.COLON, 0); }
		public IfExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExprContext extends ExprContext {
		public TerminalNode PAR_LEFT() { return getToken(TraceUppaalParser.PAR_LEFT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_RIGHT() { return getToken(TraceUppaalParser.PAR_RIGHT, 0); }
		public ParenthesisExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterParenthesisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitParenthesisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitParenthesisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueExprContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(TraceUppaalParser.TRUE, 0); }
		public TrueExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitTrueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitTrueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExprContext extends ExprContext {
		public Token binary;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS() { return getToken(TraceUppaalParser.LESS, 0); }
		public TerminalNode LESSEQ() { return getToken(TraceUppaalParser.LESSEQ, 0); }
		public TerminalNode COMPARE() { return getToken(TraceUppaalParser.COMPARE, 0); }
		public TerminalNode DIFFERENT() { return getToken(TraceUppaalParser.DIFFERENT, 0); }
		public TerminalNode GREATEREQ() { return getToken(TraceUppaalParser.GREATEREQ, 0); }
		public TerminalNode GREATER() { return getToken(TraceUppaalParser.GREATER, 0); }
		public ComparisonExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitComparisonExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitComparisonExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExprContext extends ExprContext {
		public Token binary;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(TraceUppaalParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(TraceUppaalParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(TraceUppaalParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TraceUppaalParser.DIV, 0); }
		public TerminalNode PERCENT() { return getToken(TraceUppaalParser.PERCENT, 0); }
		public TerminalNode BITAND() { return getToken(TraceUppaalParser.BITAND, 0); }
		public TerminalNode BITOR() { return getToken(TraceUppaalParser.BITOR, 0); }
		public TerminalNode BITXOR() { return getToken(TraceUppaalParser.BITXOR, 0); }
		public TerminalNode LSHIFT() { return getToken(TraceUppaalParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(TraceUppaalParser.RSHIFT, 0); }
		public TerminalNode AND_SYMBOL() { return getToken(TraceUppaalParser.AND_SYMBOL, 0); }
		public TerminalNode OR_SYMBOL() { return getToken(TraceUppaalParser.OR_SYMBOL, 0); }
		public TerminalNode MINIMUM() { return getToken(TraceUppaalParser.MINIMUM, 0); }
		public TerminalNode MAXIMUM() { return getToken(TraceUppaalParser.MAXIMUM, 0); }
		public TerminalNode OR() { return getToken(TraceUppaalParser.OR, 0); }
		public TerminalNode AND() { return getToken(TraceUppaalParser.AND, 0); }
		public TerminalNode COMMA() { return getToken(TraceUppaalParser.COMMA, 0); }
		public TerminalNode IMPLY() { return getToken(TraceUppaalParser.IMPLY, 0); }
		public BinaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIncrementContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(TraceUppaalParser.INCREMENT, 0); }
		public ExprIncrementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterExprIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitExprIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitExprIncrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TraceUppaalParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TraceUppaalParser.IDENTIFIER, 0); }
		public DotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterDotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitDotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitDotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForallExprContext extends ExprContext {
		public TerminalNode FORALL() { return getToken(TraceUppaalParser.FORALL, 0); }
		public TerminalNode PAR_LEFT() { return getToken(TraceUppaalParser.PAR_LEFT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TraceUppaalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(TraceUppaalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode PAR_RIGHT() { return getToken(TraceUppaalParser.PAR_RIGHT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ForallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterForallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitForallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitForallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprContext extends ExprContext {
		public Token unary;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(TraceUppaalParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(TraceUppaalParser.ADD, 0); }
		public TerminalNode EXCLAMATION() { return getToken(TraceUppaalParser.EXCLAMATION, 0); }
		public TerminalNode NOT() { return getToken(TraceUppaalParser.NOT, 0); }
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumExprContext extends ExprContext {
		public TerminalNode SUM() { return getToken(TraceUppaalParser.SUM, 0); }
		public TerminalNode PAR_LEFT() { return getToken(TraceUppaalParser.PAR_LEFT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TraceUppaalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(TraceUppaalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode PAR_RIGHT() { return getToken(TraceUppaalParser.PAR_RIGHT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SumExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterSumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitSumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitSumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PAR_LEFT() { return getToken(TraceUppaalParser.PAR_LEFT, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode PAR_RIGHT() { return getToken(TraceUppaalParser.PAR_RIGHT, 0); }
		public FuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprDecrementContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(TraceUppaalParser.DECREMENT, 0); }
		public ExprDecrementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterExprDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitExprDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitExprDecrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseExprContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(TraceUppaalParser.FALSE, 0); }
		public FalseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterFalseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitFalseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitFalseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(TraceUppaalParser.ASSIGN, 0); }
		public TerminalNode ASSIGN_COLON() { return getToken(TraceUppaalParser.ASSIGN_COLON, 0); }
		public TerminalNode ASSIGN_ADD() { return getToken(TraceUppaalParser.ASSIGN_ADD, 0); }
		public TerminalNode ASSIGN_SUB() { return getToken(TraceUppaalParser.ASSIGN_SUB, 0); }
		public TerminalNode ASSIGN_MUL() { return getToken(TraceUppaalParser.ASSIGN_MUL, 0); }
		public TerminalNode ASSIGN_DIV() { return getToken(TraceUppaalParser.ASSIGN_DIV, 0); }
		public TerminalNode ASSIGN_PERCENT() { return getToken(TraceUppaalParser.ASSIGN_PERCENT, 0); }
		public TerminalNode ASSIGN_OR() { return getToken(TraceUppaalParser.ASSIGN_OR, 0); }
		public TerminalNode ASSIGN_AND() { return getToken(TraceUppaalParser.ASSIGN_AND, 0); }
		public TerminalNode ASSIGN_XOR() { return getToken(TraceUppaalParser.ASSIGN_XOR, 0); }
		public TerminalNode ASSIGN_LSHIFT() { return getToken(TraceUppaalParser.ASSIGN_LSHIFT, 0); }
		public TerminalNode ASSIGN_RSHIFT() { return getToken(TraceUppaalParser.ASSIGN_RSHIFT, 0); }
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleExprContext extends ExprContext {
		public TerminalNode POINT() { return getToken(TraceUppaalParser.POINT, 0); }
		public DoubleExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterDoubleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitDoubleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitDoubleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SQUARE_BRACKET_L() { return getToken(TraceUppaalParser.SQUARE_BRACKET_L, 0); }
		public TerminalNode SQUARE_BRACKET_R() { return getToken(TraceUppaalParser.SQUARE_BRACKET_R, 0); }
		public ArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StopWatchExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DERIVATE() { return getToken(TraceUppaalParser.DERIVATE, 0); }
		public StopWatchExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterStopWatchExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitStopWatchExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitStopWatchExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExprContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(TraceUppaalParser.IDENTIFIER, 0); }
		public IdentifierExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterIdentifierExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitIdentifierExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitIdentifierExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NatExprContext extends ExprContext {
		public TerminalNode NAT() { return getToken(TraceUppaalParser.NAT, 0); }
		public NatExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterNatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitNatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitNatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsExprContext extends ExprContext {
		public TerminalNode EXISTS() { return getToken(TraceUppaalParser.EXISTS, 0); }
		public TerminalNode PAR_LEFT() { return getToken(TraceUppaalParser.PAR_LEFT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TraceUppaalParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(TraceUppaalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode PAR_RIGHT() { return getToken(TraceUppaalParser.PAR_RIGHT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExistsExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterExistsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitExistsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitExistsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrementExprContext extends ExprContext {
		public TerminalNode DECREMENT() { return getToken(TraceUppaalParser.DECREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DecrementExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterDecrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitDecrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitDecrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(136);
				match(IDENTIFIER);
				}
				break;
			case NAT:
				{
				_localctx = new NatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(NAT);
				}
				break;
			case POINT:
				{
				_localctx = new DoubleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(POINT);
				}
				break;
			case PAR_LEFT:
				{
				_localctx = new ParenthesisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(PAR_LEFT);
				setState(140);
				expr(0);
				setState(141);
				match(PAR_RIGHT);
				}
				break;
			case INCREMENT:
				{
				_localctx = new IncrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(INCREMENT);
				setState(144);
				expr(15);
				}
				break;
			case DECREMENT:
				{
				_localctx = new DecrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(DECREMENT);
				setState(146);
				expr(13);
				}
				break;
			case EXCLAMATION:
			case ADD:
			case SUB:
			case NOT:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				((UnaryExprContext)_localctx).unary = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXCLAMATION) | (1L << ADD) | (1L << SUB) | (1L << NOT))) != 0)) ) {
					((UnaryExprContext)_localctx).unary = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(148);
				expr(11);
				}
				break;
			case FORALL:
				{
				_localctx = new ForallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(FORALL);
				setState(150);
				match(PAR_LEFT);
				setState(151);
				match(IDENTIFIER);
				setState(152);
				match(COLON);
				setState(153);
				type();
				setState(154);
				match(PAR_RIGHT);
				setState(155);
				expr(5);
				}
				break;
			case EXISTS:
				{
				_localctx = new ExistsExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(EXISTS);
				setState(158);
				match(PAR_LEFT);
				setState(159);
				match(IDENTIFIER);
				setState(160);
				match(COLON);
				setState(161);
				type();
				setState(162);
				match(PAR_RIGHT);
				setState(163);
				expr(4);
				}
				break;
			case SUM:
				{
				_localctx = new SumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(SUM);
				setState(166);
				match(PAR_LEFT);
				setState(167);
				match(IDENTIFIER);
				setState(168);
				match(COLON);
				setState(169);
				type();
				setState(170);
				match(PAR_RIGHT);
				setState(171);
				expr(3);
				}
				break;
			case TRUE:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new AssignExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(178);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ASSIGN_COLON) | (1L << ASSIGN_ADD) | (1L << ASSIGN_SUB) | (1L << ASSIGN_MUL) | (1L << ASSIGN_DIV) | (1L << ASSIGN_PERCENT) | (1L << ASSIGN_OR) | (1L << ASSIGN_AND) | (1L << ASSIGN_XOR) | (1L << ASSIGN_LSHIFT) | (1L << ASSIGN_RSHIFT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(179);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ComparisonExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(181);
						((ComparisonExprContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESSEQ) | (1L << COMPARE) | (1L << DIFFERENT) | (1L << GREATEREQ) | (1L << GREATER))) != 0)) ) {
							((ComparisonExprContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(182);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(184);
						((BinaryExprContext)_localctx).binary = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (COMMA - 17)) | (1L << (ADD - 17)) | (1L << (SUB - 17)) | (1L << (MUL - 17)) | (1L << (DIV - 17)) | (1L << (PERCENT - 17)) | (1L << (BITAND - 17)) | (1L << (BITOR - 17)) | (1L << (BITXOR - 17)) | (1L << (LSHIFT - 17)) | (1L << (RSHIFT - 17)) | (1L << (AND_SYMBOL - 17)) | (1L << (OR_SYMBOL - 17)) | (1L << (MINIMUM - 17)) | (1L << (MAXIMUM - 17)) | (1L << (OR - 17)) | (1L << (AND - 17)) | (1L << (IMPLY - 17)))) != 0)) ) {
							((BinaryExprContext)_localctx).binary = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(185);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new IfExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(187);
						match(QUESTION);
						setState(188);
						expr(0);
						setState(189);
						match(COLON);
						setState(190);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ArrayExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(193);
						match(SQUARE_BRACKET_L);
						setState(194);
						expr(0);
						setState(195);
						match(SQUARE_BRACKET_R);
						}
						break;
					case 6:
						{
						_localctx = new StopWatchExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(198);
						match(DERIVATE);
						}
						break;
					case 7:
						{
						_localctx = new ExprIncrementContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(199);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(200);
						match(INCREMENT);
						}
						break;
					case 8:
						{
						_localctx = new ExprDecrementContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(202);
						match(DECREMENT);
						}
						break;
					case 9:
						{
						_localctx = new DotExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(203);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(204);
						match(DOT);
						setState(205);
						match(IDENTIFIER);
						}
						break;
					case 10:
						{
						_localctx = new FuncExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(207);
						match(PAR_LEFT);
						setState(208);
						arguments();
						setState(209);
						match(PAR_RIGHT);
						}
						break;
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TraceUppaalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TraceUppaalParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NAT) | (1L << POINT) | (1L << PAR_LEFT) | (1L << EXCLAMATION) | (1L << FORALL) | (1L << EXISTS) | (1L << SUM) | (1L << TRUE) | (1L << FALSE) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << ADD) | (1L << SUB) | (1L << NOT))) != 0)) {
				{
				setState(216);
				expr(0);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(217);
					match(COMMA);
					setState(218);
					expr(0);
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolTypeContext extends TypeContext {
		public TerminalNode BOOL() { return getToken(TraceUppaalParser.BOOL, 0); }
		public BoolTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitBoolType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructTypeContext extends TypeContext {
		public TerminalNode STRUCT() { return getToken(TraceUppaalParser.STRUCT, 0); }
		public TerminalNode BRACKET_LEFT() { return getToken(TraceUppaalParser.BRACKET_LEFT, 0); }
		public TerminalNode BRACKET_RIGHT() { return getToken(TraceUppaalParser.BRACKET_RIGHT, 0); }
		public List<FieldDeclContext> fieldDecl() {
			return getRuleContexts(FieldDeclContext.class);
		}
		public FieldDeclContext fieldDecl(int i) {
			return getRuleContext(FieldDeclContext.class,i);
		}
		public StructTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitStructType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitStructType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleTypeContext extends TypeContext {
		public TerminalNode DOUBLE() { return getToken(TraceUppaalParser.DOUBLE, 0); }
		public DoubleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitDoubleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitDoubleType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScalarTypeContext extends TypeContext {
		public TerminalNode SCALAR() { return getToken(TraceUppaalParser.SCALAR, 0); }
		public TerminalNode SQUARE_BRACKET_L() { return getToken(TraceUppaalParser.SQUARE_BRACKET_L, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SQUARE_BRACKET_R() { return getToken(TraceUppaalParser.SQUARE_BRACKET_R, 0); }
		public ScalarTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterScalarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitScalarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitScalarType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierTypeContext extends TypeContext {
		public TerminalNode IDENTIFIER() { return getToken(TraceUppaalParser.IDENTIFIER, 0); }
		public IdentifierTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterIdentifierType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitIdentifierType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitIdentifierType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntDomainTypeContext extends TypeContext {
		public TerminalNode INT() { return getToken(TraceUppaalParser.INT, 0); }
		public TerminalNode SQUARE_BRACKET_L() { return getToken(TraceUppaalParser.SQUARE_BRACKET_L, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(TraceUppaalParser.COMMA, 0); }
		public TerminalNode SQUARE_BRACKET_R() { return getToken(TraceUppaalParser.SQUARE_BRACKET_R, 0); }
		public IntDomainTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterIntDomainType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitIntDomainType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitIntDomainType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public TerminalNode INT() { return getToken(TraceUppaalParser.INT, 0); }
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitIntType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClockTypeContext extends TypeContext {
		public TerminalNode CLOCK() { return getToken(TraceUppaalParser.CLOCK, 0); }
		public ClockTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterClockType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitClockType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitClockType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChanTypeContext extends TypeContext {
		public TerminalNode CHAN() { return getToken(TraceUppaalParser.CHAN, 0); }
		public ChanTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterChanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitChanType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitChanType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		int _la;
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new IdentifierTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(INT);
				}
				break;
			case 3:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(DOUBLE);
				}
				break;
			case 4:
				_localctx = new ClockTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(CLOCK);
				}
				break;
			case 5:
				_localctx = new ChanTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(230);
				match(CHAN);
				}
				break;
			case 6:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
				match(BOOL);
				}
				break;
			case 7:
				_localctx = new IntDomainTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(232);
				match(INT);
				setState(233);
				match(SQUARE_BRACKET_L);
				setState(234);
				expr(0);
				setState(235);
				match(COMMA);
				setState(236);
				expr(0);
				setState(237);
				match(SQUARE_BRACKET_R);
				}
				break;
			case 8:
				_localctx = new ScalarTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(239);
				match(SCALAR);
				setState(240);
				match(SQUARE_BRACKET_L);
				setState(241);
				expr(0);
				setState(242);
				match(SQUARE_BRACKET_R);
				}
				break;
			case 9:
				_localctx = new StructTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(244);
				match(STRUCT);
				setState(245);
				match(BRACKET_LEFT);
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(246);
					fieldDecl();
					}
					}
					setState(249); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT) | (1L << DOUBLE) | (1L << CLOCK) | (1L << CHAN) | (1L << BOOL) | (1L << SCALAR) | (1L << STRUCT))) != 0) );
				setState(251);
				match(BRACKET_RIGHT);
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

	public static class FieldDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarFieldDeclContext> varFieldDecl() {
			return getRuleContexts(VarFieldDeclContext.class);
		}
		public VarFieldDeclContext varFieldDecl(int i) {
			return getRuleContext(VarFieldDeclContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(TraceUppaalParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TraceUppaalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TraceUppaalParser.COMMA, i);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fieldDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			type();
			setState(256);
			varFieldDecl();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(257);
				match(COMMA);
				setState(258);
				varFieldDecl();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			match(SEMICOLON);
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

	public static class VarFieldDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TraceUppaalParser.IDENTIFIER, 0); }
		public List<ArrayDeclContext> arrayDecl() {
			return getRuleContexts(ArrayDeclContext.class);
		}
		public ArrayDeclContext arrayDecl(int i) {
			return getRuleContext(ArrayDeclContext.class,i);
		}
		public VarFieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varFieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterVarFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitVarFieldDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitVarFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarFieldDeclContext varFieldDecl() throws RecognitionException {
		VarFieldDeclContext _localctx = new VarFieldDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_varFieldDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(IDENTIFIER);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SQUARE_BRACKET_L) {
				{
				{
				setState(267);
				arrayDecl();
				}
				}
				setState(272);
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

	public static class ArrayDeclContext extends ParserRuleContext {
		public ArrayDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDecl; }
	 
		public ArrayDeclContext() { }
		public void copyFrom(ArrayDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayDeclExprContext extends ArrayDeclContext {
		public TerminalNode SQUARE_BRACKET_L() { return getToken(TraceUppaalParser.SQUARE_BRACKET_L, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SQUARE_BRACKET_R() { return getToken(TraceUppaalParser.SQUARE_BRACKET_R, 0); }
		public ArrayDeclExprContext(ArrayDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterArrayDeclExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitArrayDeclExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitArrayDeclExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDeclTypeContext extends ArrayDeclContext {
		public TerminalNode SQUARE_BRACKET_L() { return getToken(TraceUppaalParser.SQUARE_BRACKET_L, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SQUARE_BRACKET_R() { return getToken(TraceUppaalParser.SQUARE_BRACKET_R, 0); }
		public ArrayDeclTypeContext(ArrayDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterArrayDeclType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitArrayDeclType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitArrayDeclType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclContext arrayDecl() throws RecognitionException {
		ArrayDeclContext _localctx = new ArrayDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayDecl);
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ArrayDeclExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(SQUARE_BRACKET_L);
				setState(274);
				expr(0);
				setState(275);
				match(SQUARE_BRACKET_R);
				}
				break;
			case 2:
				_localctx = new ArrayDeclTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(SQUARE_BRACKET_L);
				setState(278);
				type();
				setState(279);
				match(SQUARE_BRACKET_R);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 19);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u011e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4;\n\4\3\5\3\5\6\5?\n\5\r\5\16\5@\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7M\n\7\f\7\16\7P\13\7\3\b\3\b\5"+
		"\bT\n\b\3\b\3\b\3\b\6\bY\n\b\r\b\16\bZ\3\b\3\b\3\t\3\t\3\t\3\n\3\n\6\n"+
		"d\n\n\r\n\16\ne\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13p\n\13\3\13"+
		"\3\13\3\13\5\13u\n\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\7\16"+
		"\u0081\n\16\f\16\16\16\u0084\13\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b2\n\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u00d6\n\20\f\20\16\20\u00d9\13\20\3\21\3\21"+
		"\3\21\7\21\u00de\n\21\f\21\16\21\u00e1\13\21\5\21\u00e3\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\6\22\u00fa\n\22\r\22\16\22\u00fb\3\22\3\22\5"+
		"\22\u0100\n\22\3\23\3\23\3\23\3\23\7\23\u0106\n\23\f\23\16\23\u0109\13"+
		"\23\3\23\3\23\3\24\3\24\7\24\u010f\n\24\f\24\16\24\u0112\13\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u011c\n\25\3\25\2\3\36\26\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\b\3\2\t\n\3\2\24\25\4\2\25\25"+
		"\63\65\3\2\'\62\3\2\67<\5\2\23\23\63\64=K\2\u0136\2*\3\2\2\2\4\63\3\2"+
		"\2\2\6:\3\2\2\2\b<\3\2\2\2\nD\3\2\2\2\fN\3\2\2\2\16Q\3\2\2\2\20^\3\2\2"+
		"\2\22a\3\2\2\2\24g\3\2\2\2\26x\3\2\2\2\30z\3\2\2\2\32}\3\2\2\2\34\u0085"+
		"\3\2\2\2\36\u00b1\3\2\2\2 \u00e2\3\2\2\2\"\u00ff\3\2\2\2$\u0101\3\2\2"+
		"\2&\u010c\3\2\2\2(\u011b\3\2\2\2*\60\5\4\3\2+,\5\6\4\2,-\5\4\3\2-/\3\2"+
		"\2\2.+\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\3\3\2\2\2\62\60"+
		"\3\2\2\2\63\64\7\4\2\2\64\65\5\b\5\2\65\66\5\f\7\2\66\67\5\16\b\2\67\5"+
		"\3\2\2\28;\5\20\t\29;\5\22\n\2:8\3\2\2\2:9\3\2\2\2;\7\3\2\2\2<>\7\16\2"+
		"\2=?\5\n\6\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\17"+
		"\2\2C\t\3\2\2\2DE\7\b\2\2EF\7\20\2\2FG\7\b\2\2G\13\3\2\2\2HI\5&\24\2I"+
		"J\7\'\2\2JK\5\36\20\2KM\3\2\2\2LH\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2"+
		"\2O\r\3\2\2\2PN\3\2\2\2QX\7 \2\2RT\7\66\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2"+
		"\2\2UV\7\b\2\2VW\7\'\2\2WY\t\2\2\2XS\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2"+
		"\2\2[\\\3\2\2\2\\]\7!\2\2]\17\3\2\2\2^_\7\5\2\2_`\7\n\2\2`\21\3\2\2\2"+
		"ac\7\6\2\2bd\5\24\13\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\23\3\2"+
		"\2\2gh\5\n\6\2hi\7\13\2\2ij\5\n\6\2jk\7\f\2\2kl\5\26\f\2lo\7\23\2\2mp"+
		"\5\30\r\2np\7\7\2\2om\3\2\2\2on\3\2\2\2pq\3\2\2\2qt\7\23\2\2ru\5\32\16"+
		"\2su\7\t\2\2tr\3\2\2\2ts\3\2\2\2uv\3\2\2\2vw\7\r\2\2w\25\3\2\2\2xy\5\36"+
		"\20\2y\27\3\2\2\2z{\7\b\2\2{|\t\3\2\2|\31\3\2\2\2}\u0082\5\34\17\2~\177"+
		"\7\23\2\2\177\u0081\5\34\17\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\33\3\2\2\2\u0084\u0082\3\2\2"+
		"\2\u0085\u0086\5&\24\2\u0086\u0087\7(\2\2\u0087\u0088\5\36\20\2\u0088"+
		"\35\3\2\2\2\u0089\u008a\b\20\1\2\u008a\u00b2\7\b\2\2\u008b\u00b2\7\t\2"+
		"\2\u008c\u00b2\7\n\2\2\u008d\u008e\7\16\2\2\u008e\u008f\5\36\20\2\u008f"+
		"\u0090\7\17\2\2\u0090\u00b2\3\2\2\2\u0091\u0092\7%\2\2\u0092\u00b2\5\36"+
		"\20\21\u0093\u0094\7&\2\2\u0094\u00b2\5\36\20\17\u0095\u0096\t\4\2\2\u0096"+
		"\u00b2\5\36\20\r\u0097\u0098\7\26\2\2\u0098\u0099\7\16\2\2\u0099\u009a"+
		"\7\b\2\2\u009a\u009b\7\21\2\2\u009b\u009c\5\"\22\2\u009c\u009d\7\17\2"+
		"\2\u009d\u009e\5\36\20\7\u009e\u00b2\3\2\2\2\u009f\u00a0\7\27\2\2\u00a0"+
		"\u00a1\7\16\2\2\u00a1\u00a2\7\b\2\2\u00a2\u00a3\7\21\2\2\u00a3\u00a4\5"+
		"\"\22\2\u00a4\u00a5\7\17\2\2\u00a5\u00a6\5\36\20\6\u00a6\u00b2\3\2\2\2"+
		"\u00a7\u00a8\7\30\2\2\u00a8\u00a9\7\16\2\2\u00a9\u00aa\7\b\2\2\u00aa\u00ab"+
		"\7\21\2\2\u00ab\u00ac\5\"\22\2\u00ac\u00ad\7\17\2\2\u00ad\u00ae\5\36\20"+
		"\5\u00ae\u00b2\3\2\2\2\u00af\u00b2\7\31\2\2\u00b0\u00b2\7\32\2\2\u00b1"+
		"\u0089\3\2\2\2\u00b1\u008b\3\2\2\2\u00b1\u008c\3\2\2\2\u00b1\u008d\3\2"+
		"\2\2\u00b1\u0091\3\2\2\2\u00b1\u0093\3\2\2\2\u00b1\u0095\3\2\2\2\u00b1"+
		"\u0097\3\2\2\2\u00b1\u009f\3\2\2\2\u00b1\u00a7\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00d7\3\2\2\2\u00b3\u00b4\f\16\2\2\u00b4"+
		"\u00b5\t\5\2\2\u00b5\u00d6\5\36\20\17\u00b6\u00b7\f\f\2\2\u00b7\u00b8"+
		"\t\6\2\2\u00b8\u00d6\5\36\20\r\u00b9\u00ba\f\13\2\2\u00ba\u00bb\t\7\2"+
		"\2\u00bb\u00d6\5\36\20\f\u00bc\u00bd\f\n\2\2\u00bd\u00be\7\24\2\2\u00be"+
		"\u00bf\5\36\20\2\u00bf\u00c0\7\21\2\2\u00c0\u00c1\5\36\20\13\u00c1\u00d6"+
		"\3\2\2\2\u00c2\u00c3\f\25\2\2\u00c3\u00c4\7 \2\2\u00c4\u00c5\5\36\20\2"+
		"\u00c5\u00c6\7!\2\2\u00c6\u00d6\3\2\2\2\u00c7\u00c8\f\24\2\2\u00c8\u00d6"+
		"\7$\2\2\u00c9\u00ca\f\22\2\2\u00ca\u00d6\7%\2\2\u00cb\u00cc\f\20\2\2\u00cc"+
		"\u00d6\7&\2\2\u00cd\u00ce\f\t\2\2\u00ce\u00cf\7\20\2\2\u00cf\u00d6\7\b"+
		"\2\2\u00d0\u00d1\f\b\2\2\u00d1\u00d2\7\16\2\2\u00d2\u00d3\5 \21\2\u00d3"+
		"\u00d4\7\17\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00b3\3\2\2\2\u00d5\u00b6\3"+
		"\2\2\2\u00d5\u00b9\3\2\2\2\u00d5\u00bc\3\2\2\2\u00d5\u00c2\3\2\2\2\u00d5"+
		"\u00c7\3\2\2\2\u00d5\u00c9\3\2\2\2\u00d5\u00cb\3\2\2\2\u00d5\u00cd\3\2"+
		"\2\2\u00d5\u00d0\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\37\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00df\5\36\20"+
		"\2\u00db\u00dc\7\23\2\2\u00dc\u00de\5\36\20\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e2\u00da\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"!\3\2\2\2\u00e4\u0100\7\b\2\2\u00e5\u0100\7\33\2\2\u00e6\u0100\7\34\2"+
		"\2\u00e7\u0100\7\35\2\2\u00e8\u0100\7\36\2\2\u00e9\u0100\7\37\2\2\u00ea"+
		"\u00eb\7\33\2\2\u00eb\u00ec\7 \2\2\u00ec\u00ed\5\36\20\2\u00ed\u00ee\7"+
		"\23\2\2\u00ee\u00ef\5\36\20\2\u00ef\u00f0\7!\2\2\u00f0\u0100\3\2\2\2\u00f1"+
		"\u00f2\7\"\2\2\u00f2\u00f3\7 \2\2\u00f3\u00f4\5\36\20\2\u00f4\u00f5\7"+
		"!\2\2\u00f5\u0100\3\2\2\2\u00f6\u00f7\7#\2\2\u00f7\u00f9\7\f\2\2\u00f8"+
		"\u00fa\5$\23\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\r\2\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00e4\3\2\2\2\u00ff\u00e5\3\2\2\2\u00ff\u00e6\3\2"+
		"\2\2\u00ff\u00e7\3\2\2\2\u00ff\u00e8\3\2\2\2\u00ff\u00e9\3\2\2\2\u00ff"+
		"\u00ea\3\2\2\2\u00ff\u00f1\3\2\2\2\u00ff\u00f6\3\2\2\2\u0100#\3\2\2\2"+
		"\u0101\u0102\5\"\22\2\u0102\u0107\5&\24\2\u0103\u0104\7\23\2\2\u0104\u0106"+
		"\5&\24\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7\22"+
		"\2\2\u010b%\3\2\2\2\u010c\u0110\7\b\2\2\u010d\u010f\5(\25\2\u010e\u010d"+
		"\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\'\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7 \2\2\u0114\u0115\5\36\20"+
		"\2\u0115\u0116\7!\2\2\u0116\u011c\3\2\2\2\u0117\u0118\7 \2\2\u0118\u0119"+
		"\5\"\22\2\u0119\u011a\7!\2\2\u011a\u011c\3\2\2\2\u011b\u0113\3\2\2\2\u011b"+
		"\u0117\3\2\2\2\u011c)\3\2\2\2\26\60:@NSZeot\u0082\u00b1\u00d5\u00d7\u00df"+
		"\u00e2\u00fb\u00ff\u0107\u0110\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}