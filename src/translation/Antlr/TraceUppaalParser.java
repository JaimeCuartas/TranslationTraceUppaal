// Generated from /home/jaime/Documents/TranslationTraceUppaal/src/translation/Antlr/TraceUppaalParser.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		RULE_aDiscrete = 9, RULE_guard = 10, RULE_action = 11, RULE_sync = 12, 
		RULE_tau = 13, RULE_update = 14, RULE_assign = 15, RULE_expr = 16, RULE_arguments = 17, 
		RULE_type = 18, RULE_fieldDecl = 19, RULE_varFieldDecl = 20, RULE_arrayDecl = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"trace", "state", "transition", "location", "loc", "values", "clocks", 
			"delay", "discrete", "aDiscrete", "guard", "action", "sync", "tau", "update", 
			"assign", "expr", "arguments", "type", "fieldDecl", "varFieldDecl", "arrayDecl"
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
			setState(44);
			state();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DELAY || _la==TRANSITION) {
				{
				{
				setState(45);
				transition();
				setState(46);
				state();
				}
				}
				setState(52);
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
			setState(53);
			match(STATE);
			setState(54);
			location();
			setState(55);
			values();
			setState(56);
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
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				delay();
				}
				break;
			case TRANSITION:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
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
			setState(62);
			match(PAR_LEFT);
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				loc();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(68);
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
			setState(70);
			match(IDENTIFIER);
			setState(71);
			match(DOT);
			setState(72);
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
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(74);
				varFieldDecl();
				setState(75);
				match(ASSIGN);
				setState(76);
				expr(0);
				}
				}
				setState(82);
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
			setState(83);
			match(SQUARE_BRACKET_L);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMERAL) {
					{
					setState(84);
					match(NUMERAL);
					}
				}

				setState(87);
				match(IDENTIFIER);
				setState(88);
				match(ASSIGN);
				setState(89);
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
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER || _la==NUMERAL );
			setState(94);
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
			setState(96);
			match(DELAY);
			setState(97);
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
			setState(99);
			match(TRANSITION);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				aDiscrete();
				}
				}
				setState(103); 
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
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public TerminalNode BRACKET_RIGHT() { return getToken(TraceUppaalParser.BRACKET_RIGHT, 0); }
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
			setState(105);
			loc();
			setState(106);
			match(ARROW);
			setState(107);
			loc();
			setState(108);
			match(BRACKET_LEFT);
			setState(109);
			guard();
			setState(110);
			match(COMMA);
			setState(111);
			action();
			setState(112);
			match(COMMA);
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(113);
				update();
				}
				break;
			case NAT:
				{
				setState(114);
				match(NAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(117);
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
			setState(119);
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

	public static class ActionContext extends ParserRuleContext {
		public SyncContext sync() {
			return getRuleContext(SyncContext.class,0);
		}
		public TauContext tau() {
			return getRuleContext(TauContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_action);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				sync();
				}
				break;
			case TAU:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				tau();
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
		enterRule(_localctx, 24, RULE_sync);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(IDENTIFIER);
			setState(126);
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

	public static class TauContext extends ParserRuleContext {
		public TerminalNode TAU() { return getToken(TraceUppaalParser.TAU, 0); }
		public TauContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tau; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).enterTau(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraceUppaalParserListener ) ((TraceUppaalParserListener)listener).exitTau(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraceUppaalParserVisitor ) return ((TraceUppaalParserVisitor<? extends T>)visitor).visitTau(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TauContext tau() throws RecognitionException {
		TauContext _localctx = new TauContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tau);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(TAU);
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
		enterRule(_localctx, 28, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			assign();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(131);
				match(COMMA);
				setState(132);
				assign();
				}
				}
				setState(137);
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
		enterRule(_localctx, 30, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			varFieldDecl();
			setState(139);
			match(ASSIGN_COLON);
			setState(140);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new IdentifierExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(143);
				match(IDENTIFIER);
				}
				break;
			case NAT:
				{
				_localctx = new NatExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(NAT);
				}
				break;
			case POINT:
				{
				_localctx = new DoubleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(POINT);
				}
				break;
			case PAR_LEFT:
				{
				_localctx = new ParenthesisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(PAR_LEFT);
				setState(147);
				expr(0);
				setState(148);
				match(PAR_RIGHT);
				}
				break;
			case INCREMENT:
				{
				_localctx = new IncrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(INCREMENT);
				setState(151);
				expr(15);
				}
				break;
			case DECREMENT:
				{
				_localctx = new DecrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(DECREMENT);
				setState(153);
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
				setState(154);
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
				setState(155);
				expr(11);
				}
				break;
			case FORALL:
				{
				_localctx = new ForallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(FORALL);
				setState(157);
				match(PAR_LEFT);
				setState(158);
				match(IDENTIFIER);
				setState(159);
				match(COLON);
				setState(160);
				type();
				setState(161);
				match(PAR_RIGHT);
				setState(162);
				expr(5);
				}
				break;
			case EXISTS:
				{
				_localctx = new ExistsExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(EXISTS);
				setState(165);
				match(PAR_LEFT);
				setState(166);
				match(IDENTIFIER);
				setState(167);
				match(COLON);
				setState(168);
				type();
				setState(169);
				match(PAR_RIGHT);
				setState(170);
				expr(4);
				}
				break;
			case SUM:
				{
				_localctx = new SumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(SUM);
				setState(173);
				match(PAR_LEFT);
				setState(174);
				match(IDENTIFIER);
				setState(175);
				match(COLON);
				setState(176);
				type();
				setState(177);
				match(PAR_RIGHT);
				setState(178);
				expr(3);
				}
				break;
			case TRUE:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(218);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new AssignExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(185);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ASSIGN_COLON) | (1L << ASSIGN_ADD) | (1L << ASSIGN_SUB) | (1L << ASSIGN_MUL) | (1L << ASSIGN_DIV) | (1L << ASSIGN_PERCENT) | (1L << ASSIGN_OR) | (1L << ASSIGN_AND) | (1L << ASSIGN_XOR) | (1L << ASSIGN_LSHIFT) | (1L << ASSIGN_RSHIFT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(186);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ComparisonExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(188);
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
						setState(189);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(191);
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
						setState(192);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new IfExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(193);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(194);
						match(QUESTION);
						setState(195);
						expr(0);
						setState(196);
						match(COLON);
						setState(197);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new ArrayExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(199);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(200);
						match(SQUARE_BRACKET_L);
						setState(201);
						expr(0);
						setState(202);
						match(SQUARE_BRACKET_R);
						}
						break;
					case 6:
						{
						_localctx = new StopWatchExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(205);
						match(DERIVATE);
						}
						break;
					case 7:
						{
						_localctx = new ExprIncrementContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(207);
						match(INCREMENT);
						}
						break;
					case 8:
						{
						_localctx = new ExprDecrementContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(208);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(209);
						match(DECREMENT);
						}
						break;
					case 9:
						{
						_localctx = new DotExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(211);
						match(DOT);
						setState(212);
						match(IDENTIFIER);
						}
						break;
					case 10:
						{
						_localctx = new FuncExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(214);
						match(PAR_LEFT);
						setState(215);
						arguments();
						setState(216);
						match(PAR_RIGHT);
						}
						break;
					}
					} 
				}
				setState(222);
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
		enterRule(_localctx, 34, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NAT) | (1L << POINT) | (1L << PAR_LEFT) | (1L << EXCLAMATION) | (1L << FORALL) | (1L << EXISTS) | (1L << SUM) | (1L << TRUE) | (1L << FALSE) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << ADD) | (1L << SUB) | (1L << NOT))) != 0)) {
				{
				setState(223);
				expr(0);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(224);
					match(COMMA);
					setState(225);
					expr(0);
					}
					}
					setState(230);
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
		enterRule(_localctx, 36, RULE_type);
		int _la;
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new IdentifierTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(INT);
				}
				break;
			case 3:
				_localctx = new DoubleTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(DOUBLE);
				}
				break;
			case 4:
				_localctx = new ClockTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(CLOCK);
				}
				break;
			case 5:
				_localctx = new ChanTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				match(CHAN);
				}
				break;
			case 6:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				match(BOOL);
				}
				break;
			case 7:
				_localctx = new IntDomainTypeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(239);
				match(INT);
				setState(240);
				match(SQUARE_BRACKET_L);
				setState(241);
				expr(0);
				setState(242);
				match(COMMA);
				setState(243);
				expr(0);
				setState(244);
				match(SQUARE_BRACKET_R);
				}
				break;
			case 8:
				_localctx = new ScalarTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(246);
				match(SCALAR);
				setState(247);
				match(SQUARE_BRACKET_L);
				setState(248);
				expr(0);
				setState(249);
				match(SQUARE_BRACKET_R);
				}
				break;
			case 9:
				_localctx = new StructTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(251);
				match(STRUCT);
				setState(252);
				match(BRACKET_LEFT);
				setState(254); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(253);
					fieldDecl();
					}
					}
					setState(256); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INT) | (1L << DOUBLE) | (1L << CLOCK) | (1L << CHAN) | (1L << BOOL) | (1L << SCALAR) | (1L << STRUCT))) != 0) );
				setState(258);
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
		enterRule(_localctx, 38, RULE_fieldDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			type();
			setState(263);
			varFieldDecl();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(264);
				match(COMMA);
				setState(265);
				varFieldDecl();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
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
		enterRule(_localctx, 40, RULE_varFieldDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(IDENTIFIER);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SQUARE_BRACKET_L) {
				{
				{
				setState(274);
				arrayDecl();
				}
				}
				setState(279);
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
		enterRule(_localctx, 42, RULE_arrayDecl);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ArrayDeclExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(SQUARE_BRACKET_L);
				setState(281);
				expr(0);
				setState(282);
				match(SQUARE_BRACKET_R);
				}
				break;
			case 2:
				_localctx = new ArrayDeclTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(SQUARE_BRACKET_L);
				setState(285);
				type();
				setState(286);
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
		case 16:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3K\u0125\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\7\2"+
		"\63\n\2\f\2\16\2\66\13\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4?\n\4\3\5\3\5"+
		"\6\5C\n\5\r\5\16\5D\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7Q\n\7\f"+
		"\7\16\7T\13\7\3\b\3\b\5\bX\n\b\3\b\3\b\3\b\6\b]\n\b\r\b\16\b^\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\6\nh\n\n\r\n\16\ni\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13v\n\13\3\13\3\13\3\f\3\f\3\r\3\r\5\r~\n\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\7\20\u0088\n\20\f\20\16\20\u008b\13"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u00b9\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00dd"+
		"\n\22\f\22\16\22\u00e0\13\22\3\23\3\23\3\23\7\23\u00e5\n\23\f\23\16\23"+
		"\u00e8\13\23\5\23\u00ea\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\6\24\u0101"+
		"\n\24\r\24\16\24\u0102\3\24\3\24\5\24\u0107\n\24\3\25\3\25\3\25\3\25\7"+
		"\25\u010d\n\25\f\25\16\25\u0110\13\25\3\25\3\25\3\26\3\26\7\26\u0116\n"+
		"\26\f\26\16\26\u0119\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0123\n\27\3\27\2\3\"\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,\2\b\3\2\t\n\3\2\24\25\4\2\25\25\63\65\3\2\'\62\3\2\67<\5\2\23\23\63"+
		"\64=K\2\u013b\2.\3\2\2\2\4\67\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2\nH\3\2\2\2"+
		"\fR\3\2\2\2\16U\3\2\2\2\20b\3\2\2\2\22e\3\2\2\2\24k\3\2\2\2\26y\3\2\2"+
		"\2\30}\3\2\2\2\32\177\3\2\2\2\34\u0082\3\2\2\2\36\u0084\3\2\2\2 \u008c"+
		"\3\2\2\2\"\u00b8\3\2\2\2$\u00e9\3\2\2\2&\u0106\3\2\2\2(\u0108\3\2\2\2"+
		"*\u0113\3\2\2\2,\u0122\3\2\2\2.\64\5\4\3\2/\60\5\6\4\2\60\61\5\4\3\2\61"+
		"\63\3\2\2\2\62/\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\3"+
		"\3\2\2\2\66\64\3\2\2\2\678\7\4\2\289\5\b\5\29:\5\f\7\2:;\5\16\b\2;\5\3"+
		"\2\2\2<?\5\20\t\2=?\5\22\n\2><\3\2\2\2>=\3\2\2\2?\7\3\2\2\2@B\7\16\2\2"+
		"AC\5\n\6\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\17\2"+
		"\2G\t\3\2\2\2HI\7\b\2\2IJ\7\20\2\2JK\7\b\2\2K\13\3\2\2\2LM\5*\26\2MN\7"+
		"\'\2\2NO\5\"\22\2OQ\3\2\2\2PL\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\r"+
		"\3\2\2\2TR\3\2\2\2U\\\7 \2\2VX\7\66\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2"+
		"YZ\7\b\2\2Z[\7\'\2\2[]\t\2\2\2\\W\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2"+
		"\2_`\3\2\2\2`a\7!\2\2a\17\3\2\2\2bc\7\5\2\2cd\7\n\2\2d\21\3\2\2\2eg\7"+
		"\6\2\2fh\5\24\13\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\23\3\2\2\2"+
		"kl\5\n\6\2lm\7\13\2\2mn\5\n\6\2no\7\f\2\2op\5\26\f\2pq\7\23\2\2qr\5\30"+
		"\r\2ru\7\23\2\2sv\5\36\20\2tv\7\t\2\2us\3\2\2\2ut\3\2\2\2vw\3\2\2\2wx"+
		"\7\r\2\2x\25\3\2\2\2yz\5\"\22\2z\27\3\2\2\2{~\5\32\16\2|~\5\34\17\2}{"+
		"\3\2\2\2}|\3\2\2\2~\31\3\2\2\2\177\u0080\7\b\2\2\u0080\u0081\t\3\2\2\u0081"+
		"\33\3\2\2\2\u0082\u0083\7\7\2\2\u0083\35\3\2\2\2\u0084\u0089\5 \21\2\u0085"+
		"\u0086\7\23\2\2\u0086\u0088\5 \21\2\u0087\u0085\3\2\2\2\u0088\u008b\3"+
		"\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\37\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008d\5*\26\2\u008d\u008e\7(\2\2\u008e\u008f\5\""+
		"\22\2\u008f!\3\2\2\2\u0090\u0091\b\22\1\2\u0091\u00b9\7\b\2\2\u0092\u00b9"+
		"\7\t\2\2\u0093\u00b9\7\n\2\2\u0094\u0095\7\16\2\2\u0095\u0096\5\"\22\2"+
		"\u0096\u0097\7\17\2\2\u0097\u00b9\3\2\2\2\u0098\u0099\7%\2\2\u0099\u00b9"+
		"\5\"\22\21\u009a\u009b\7&\2\2\u009b\u00b9\5\"\22\17\u009c\u009d\t\4\2"+
		"\2\u009d\u00b9\5\"\22\r\u009e\u009f\7\26\2\2\u009f\u00a0\7\16\2\2\u00a0"+
		"\u00a1\7\b\2\2\u00a1\u00a2\7\21\2\2\u00a2\u00a3\5&\24\2\u00a3\u00a4\7"+
		"\17\2\2\u00a4\u00a5\5\"\22\7\u00a5\u00b9\3\2\2\2\u00a6\u00a7\7\27\2\2"+
		"\u00a7\u00a8\7\16\2\2\u00a8\u00a9\7\b\2\2\u00a9\u00aa\7\21\2\2\u00aa\u00ab"+
		"\5&\24\2\u00ab\u00ac\7\17\2\2\u00ac\u00ad\5\"\22\6\u00ad\u00b9\3\2\2\2"+
		"\u00ae\u00af\7\30\2\2\u00af\u00b0\7\16\2\2\u00b0\u00b1\7\b\2\2\u00b1\u00b2"+
		"\7\21\2\2\u00b2\u00b3\5&\24\2\u00b3\u00b4\7\17\2\2\u00b4\u00b5\5\"\22"+
		"\5\u00b5\u00b9\3\2\2\2\u00b6\u00b9\7\31\2\2\u00b7\u00b9\7\32\2\2\u00b8"+
		"\u0090\3\2\2\2\u00b8\u0092\3\2\2\2\u00b8\u0093\3\2\2\2\u00b8\u0094\3\2"+
		"\2\2\u00b8\u0098\3\2\2\2\u00b8\u009a\3\2\2\2\u00b8\u009c\3\2\2\2\u00b8"+
		"\u009e\3\2\2\2\u00b8\u00a6\3\2\2\2\u00b8\u00ae\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00de\3\2\2\2\u00ba\u00bb\f\16\2\2\u00bb"+
		"\u00bc\t\5\2\2\u00bc\u00dd\5\"\22\17\u00bd\u00be\f\f\2\2\u00be\u00bf\t"+
		"\6\2\2\u00bf\u00dd\5\"\22\r\u00c0\u00c1\f\13\2\2\u00c1\u00c2\t\7\2\2\u00c2"+
		"\u00dd\5\"\22\f\u00c3\u00c4\f\n\2\2\u00c4\u00c5\7\24\2\2\u00c5\u00c6\5"+
		"\"\22\2\u00c6\u00c7\7\21\2\2\u00c7\u00c8\5\"\22\13\u00c8\u00dd\3\2\2\2"+
		"\u00c9\u00ca\f\25\2\2\u00ca\u00cb\7 \2\2\u00cb\u00cc\5\"\22\2\u00cc\u00cd"+
		"\7!\2\2\u00cd\u00dd\3\2\2\2\u00ce\u00cf\f\24\2\2\u00cf\u00dd\7$\2\2\u00d0"+
		"\u00d1\f\22\2\2\u00d1\u00dd\7%\2\2\u00d2\u00d3\f\20\2\2\u00d3\u00dd\7"+
		"&\2\2\u00d4\u00d5\f\t\2\2\u00d5\u00d6\7\20\2\2\u00d6\u00dd\7\b\2\2\u00d7"+
		"\u00d8\f\b\2\2\u00d8\u00d9\7\16\2\2\u00d9\u00da\5$\23\2\u00da\u00db\7"+
		"\17\2\2\u00db\u00dd\3\2\2\2\u00dc\u00ba\3\2\2\2\u00dc\u00bd\3\2\2\2\u00dc"+
		"\u00c0\3\2\2\2\u00dc\u00c3\3\2\2\2\u00dc\u00c9\3\2\2\2\u00dc\u00ce\3\2"+
		"\2\2\u00dc\u00d0\3\2\2\2\u00dc\u00d2\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc"+
		"\u00d7\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df#\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e6\5\"\22\2\u00e2\u00e3"+
		"\7\23\2\2\u00e3\u00e5\5\"\22\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2"+
		"\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea%\3\2\2\2\u00eb"+
		"\u0107\7\b\2\2\u00ec\u0107\7\33\2\2\u00ed\u0107\7\34\2\2\u00ee\u0107\7"+
		"\35\2\2\u00ef\u0107\7\36\2\2\u00f0\u0107\7\37\2\2\u00f1\u00f2\7\33\2\2"+
		"\u00f2\u00f3\7 \2\2\u00f3\u00f4\5\"\22\2\u00f4\u00f5\7\23\2\2\u00f5\u00f6"+
		"\5\"\22\2\u00f6\u00f7\7!\2\2\u00f7\u0107\3\2\2\2\u00f8\u00f9\7\"\2\2\u00f9"+
		"\u00fa\7 \2\2\u00fa\u00fb\5\"\22\2\u00fb\u00fc\7!\2\2\u00fc\u0107\3\2"+
		"\2\2\u00fd\u00fe\7#\2\2\u00fe\u0100\7\f\2\2\u00ff\u0101\5(\25\2\u0100"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103\u0104\3\2\2\2\u0104\u0105\7\r\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u00eb\3\2\2\2\u0106\u00ec\3\2\2\2\u0106\u00ed\3\2\2\2\u0106\u00ee\3\2"+
		"\2\2\u0106\u00ef\3\2\2\2\u0106\u00f0\3\2\2\2\u0106\u00f1\3\2\2\2\u0106"+
		"\u00f8\3\2\2\2\u0106\u00fd\3\2\2\2\u0107\'\3\2\2\2\u0108\u0109\5&\24\2"+
		"\u0109\u010e\5*\26\2\u010a\u010b\7\23\2\2\u010b\u010d\5*\26\2\u010c\u010a"+
		"\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\22\2\2\u0112)\3\2\2\2"+
		"\u0113\u0117\7\b\2\2\u0114\u0116\5,\27\2\u0115\u0114\3\2\2\2\u0116\u0119"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118+\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011b\7 \2\2\u011b\u011c\5\"\22\2\u011c\u011d\7!"+
		"\2\2\u011d\u0123\3\2\2\2\u011e\u011f\7 \2\2\u011f\u0120\5&\24\2\u0120"+
		"\u0121\7!\2\2\u0121\u0123\3\2\2\2\u0122\u011a\3\2\2\2\u0122\u011e\3\2"+
		"\2\2\u0123-\3\2\2\2\26\64>DRW^iu}\u0089\u00b8\u00dc\u00de\u00e6\u00e9"+
		"\u0102\u0106\u010e\u0117\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}