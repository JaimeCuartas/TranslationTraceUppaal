// Generated from C:/Users/Jaime/OneDrive - correounivalle.edu.co/Documentos/Github/TranslationTraceUppaal/src/translation/Antlr\TraceUppaalLexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TraceUppaalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, STATE=2, DELAY=3, TRANSITION=4, IDENTIFIER=5, NAT=6, POINT=7, ARROW=8, 
		BRACKET_LEFT=9, BRACKET_RIGHT=10, PAR_LEFT=11, PAR_RIGHT=12, DOT=13, COLON=14, 
		SEMICOLON=15, COMMA=16, QUESTION=17, EXCLAMATION=18, FORALL=19, EXISTS=20, 
		SUM=21, TRUE=22, FALSE=23, INT=24, DOUBLE=25, CLOCK=26, CHAN=27, BOOL=28, 
		SQUARE_BRACKET_L=29, SQUARE_BRACKET_R=30, SCALAR=31, STRUCT=32, DERIVATE=33, 
		INCREMENT=34, DECREMENT=35, ASSIGN=36, ASSIGN_COLON=37, ASSIGN_ADD=38, 
		ASSIGN_SUB=39, ASSIGN_MUL=40, ASSIGN_DIV=41, ASSIGN_PERCENT=42, ASSIGN_OR=43, 
		ASSIGN_AND=44, ASSIGN_XOR=45, ASSIGN_LSHIFT=46, ASSIGN_RSHIFT=47, ADD=48, 
		SUB=49, NOT=50, NUMERAL=51, LESS=52, LESSEQ=53, COMPARE=54, DIFFERENT=55, 
		GREATEREQ=56, GREATER=57, MUL=58, DIV=59, PERCENT=60, BITAND=61, BITOR=62, 
		BITXOR=63, LSHIFT=64, RSHIFT=65, AND_SYMBOL=66, OR_SYMBOL=67, MINIMUM=68, 
		MAXIMUM=69, OR=70, AND=71, IMPLY=72;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "STATE", "DELAY", "TRANSITION", "IDENTIFIER", "NAT", "POINT", "ARROW", 
			"BRACKET_LEFT", "BRACKET_RIGHT", "PAR_LEFT", "PAR_RIGHT", "DOT", "COLON", 
			"SEMICOLON", "COMMA", "QUESTION", "EXCLAMATION", "FORALL", "EXISTS", 
			"SUM", "TRUE", "FALSE", "INT", "DOUBLE", "CLOCK", "CHAN", "BOOL", "SQUARE_BRACKET_L", 
			"SQUARE_BRACKET_R", "SCALAR", "STRUCT", "DERIVATE", "INCREMENT", "DECREMENT", 
			"ASSIGN", "ASSIGN_COLON", "ASSIGN_ADD", "ASSIGN_SUB", "ASSIGN_MUL", "ASSIGN_DIV", 
			"ASSIGN_PERCENT", "ASSIGN_OR", "ASSIGN_AND", "ASSIGN_XOR", "ASSIGN_LSHIFT", 
			"ASSIGN_RSHIFT", "ADD", "SUB", "NOT", "NUMERAL", "LESS", "LESSEQ", "COMPARE", 
			"DIFFERENT", "GREATEREQ", "GREATER", "MUL", "DIV", "PERCENT", "BITAND", 
			"BITOR", "BITXOR", "LSHIFT", "RSHIFT", "AND_SYMBOL", "OR_SYMBOL", "MINIMUM", 
			"MAXIMUM", "OR", "AND", "IMPLY"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'state'", "'delay'", "'transition'", null, null, null, "'->'", 
			"'{'", "'}'", "'('", "')'", "'.'", "':'", "';'", "','", "'?'", "'!'", 
			"'forall'", "'exists'", "'sum'", "'true'", "'false'", "'int'", "'double'", 
			"'clock'", "'chan'", "'bool'", "'['", "']'", "'scalar'", "'struct'", 
			"'''", "'++'", "'--'", "'='", "':='", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'|='", "'&='", "'^='", "'<<='", "'>>='", "'+'", "'-'", "'not'", 
			"'#'", "'<'", "'<='", "'=='", "'!='", "'>='", "'>'", "'*'", "'/'", "'%'", 
			"'&'", "'|'", "'^'", "'<<'", "'>>'", "'&&'", "'||'", "'<?'", "'>?'", 
			"'or'", "'and'", "'imply'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "STATE", "DELAY", "TRANSITION", "IDENTIFIER", "NAT", "POINT", 
			"ARROW", "BRACKET_LEFT", "BRACKET_RIGHT", "PAR_LEFT", "PAR_RIGHT", "DOT", 
			"COLON", "SEMICOLON", "COMMA", "QUESTION", "EXCLAMATION", "FORALL", "EXISTS", 
			"SUM", "TRUE", "FALSE", "INT", "DOUBLE", "CLOCK", "CHAN", "BOOL", "SQUARE_BRACKET_L", 
			"SQUARE_BRACKET_R", "SCALAR", "STRUCT", "DERIVATE", "INCREMENT", "DECREMENT", 
			"ASSIGN", "ASSIGN_COLON", "ASSIGN_ADD", "ASSIGN_SUB", "ASSIGN_MUL", "ASSIGN_DIV", 
			"ASSIGN_PERCENT", "ASSIGN_OR", "ASSIGN_AND", "ASSIGN_XOR", "ASSIGN_LSHIFT", 
			"ASSIGN_RSHIFT", "ADD", "SUB", "NOT", "NUMERAL", "LESS", "LESSEQ", "COMPARE", 
			"DIFFERENT", "GREATEREQ", "GREATER", "MUL", "DIV", "PERCENT", "BITAND", 
			"BITOR", "BITXOR", "LSHIFT", "RSHIFT", "AND_SYMBOL", "OR_SYMBOL", "MINIMUM", 
			"MAXIMUM", "OR", "AND", "IMPLY"
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


	public TraceUppaalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TraceUppaalLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2J\u0199\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6\u00b1\n\6\f\6\16"+
		"\6\u00b4\13\6\3\7\6\7\u00b7\n\7\r\7\16\7\u00b8\3\b\7\b\u00bc\n\b\f\b\16"+
		"\b\u00bf\13\b\3\b\3\b\6\b\u00c3\n\b\r\b\16\b\u00c4\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3("+
		"\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3;\3;\3<\3"+
		"<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3"+
		"E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\2\2J\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\3\2\6"+
		"\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\2\u019c\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2"+
		"\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3"+
		"\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2"+
		"\2\u008f\3\2\2\2\2\u0091\3\2\2\2\3\u0093\3\2\2\2\5\u0097\3\2\2\2\7\u009d"+
		"\3\2\2\2\t\u00a3\3\2\2\2\13\u00ae\3\2\2\2\r\u00b6\3\2\2\2\17\u00bd\3\2"+
		"\2\2\21\u00c6\3\2\2\2\23\u00c9\3\2\2\2\25\u00cb\3\2\2\2\27\u00cd\3\2\2"+
		"\2\31\u00cf\3\2\2\2\33\u00d1\3\2\2\2\35\u00d3\3\2\2\2\37\u00d5\3\2\2\2"+
		"!\u00d7\3\2\2\2#\u00d9\3\2\2\2%\u00db\3\2\2\2\'\u00dd\3\2\2\2)\u00e4\3"+
		"\2\2\2+\u00eb\3\2\2\2-\u00ef\3\2\2\2/\u00f4\3\2\2\2\61\u00fa\3\2\2\2\63"+
		"\u00fe\3\2\2\2\65\u0105\3\2\2\2\67\u010b\3\2\2\29\u0110\3\2\2\2;\u0115"+
		"\3\2\2\2=\u0117\3\2\2\2?\u0119\3\2\2\2A\u0120\3\2\2\2C\u0127\3\2\2\2E"+
		"\u0129\3\2\2\2G\u012c\3\2\2\2I\u012f\3\2\2\2K\u0131\3\2\2\2M\u0134\3\2"+
		"\2\2O\u0137\3\2\2\2Q\u013a\3\2\2\2S\u013d\3\2\2\2U\u0140\3\2\2\2W\u0143"+
		"\3\2\2\2Y\u0146\3\2\2\2[\u0149\3\2\2\2]\u014c\3\2\2\2_\u0150\3\2\2\2a"+
		"\u0154\3\2\2\2c\u0156\3\2\2\2e\u0158\3\2\2\2g\u015c\3\2\2\2i\u015e\3\2"+
		"\2\2k\u0160\3\2\2\2m\u0163\3\2\2\2o\u0166\3\2\2\2q\u0169\3\2\2\2s\u016c"+
		"\3\2\2\2u\u016e\3\2\2\2w\u0170\3\2\2\2y\u0172\3\2\2\2{\u0174\3\2\2\2}"+
		"\u0176\3\2\2\2\177\u0178\3\2\2\2\u0081\u017a\3\2\2\2\u0083\u017d\3\2\2"+
		"\2\u0085\u0180\3\2\2\2\u0087\u0183\3\2\2\2\u0089\u0186\3\2\2\2\u008b\u0189"+
		"\3\2\2\2\u008d\u018c\3\2\2\2\u008f\u018f\3\2\2\2\u0091\u0193\3\2\2\2\u0093"+
		"\u0094\t\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\b\2\2\2\u0096\4\3\2\2\2"+
		"\u0097\u0098\7u\2\2\u0098\u0099\7v\2\2\u0099\u009a\7c\2\2\u009a\u009b"+
		"\7v\2\2\u009b\u009c\7g\2\2\u009c\6\3\2\2\2\u009d\u009e\7f\2\2\u009e\u009f"+
		"\7g\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7{\2\2\u00a2"+
		"\b\3\2\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7c\2\2\u00a6"+
		"\u00a7\7p\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7v\2\2"+
		"\u00aa\u00ab\7k\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7p\2\2\u00ad\n\3\2"+
		"\2\2\u00ae\u00b2\t\3\2\2\u00af\u00b1\t\4\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\f\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b5\u00b7\t\5\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\16\3\2\2\2\u00ba"+
		"\u00bc\t\5\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c2\7\60\2\2\u00c1\u00c3\t\5\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3"+
		"\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\20\3\2\2\2\u00c6"+
		"\u00c7\7/\2\2\u00c7\u00c8\7@\2\2\u00c8\22\3\2\2\2\u00c9\u00ca\7}\2\2\u00ca"+
		"\24\3\2\2\2\u00cb\u00cc\7\177\2\2\u00cc\26\3\2\2\2\u00cd\u00ce\7*\2\2"+
		"\u00ce\30\3\2\2\2\u00cf\u00d0\7+\2\2\u00d0\32\3\2\2\2\u00d1\u00d2\7\60"+
		"\2\2\u00d2\34\3\2\2\2\u00d3\u00d4\7<\2\2\u00d4\36\3\2\2\2\u00d5\u00d6"+
		"\7=\2\2\u00d6 \3\2\2\2\u00d7\u00d8\7.\2\2\u00d8\"\3\2\2\2\u00d9\u00da"+
		"\7A\2\2\u00da$\3\2\2\2\u00db\u00dc\7#\2\2\u00dc&\3\2\2\2\u00dd\u00de\7"+
		"h\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2"+
		"\7n\2\2\u00e2\u00e3\7n\2\2\u00e3(\3\2\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6"+
		"\7z\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7v\2\2\u00e9"+
		"\u00ea\7u\2\2\u00ea*\3\2\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7w\2\2\u00ed"+
		"\u00ee\7o\2\2\u00ee,\3\2\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7t\2\2\u00f1"+
		"\u00f2\7w\2\2\u00f2\u00f3\7g\2\2\u00f3.\3\2\2\2\u00f4\u00f5\7h\2\2\u00f5"+
		"\u00f6\7c\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7g\2\2"+
		"\u00f9\60\3\2\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7"+
		"v\2\2\u00fd\62\3\2\2\2\u00fe\u00ff\7f\2\2\u00ff\u0100\7q\2\2\u0100\u0101"+
		"\7w\2\2\u0101\u0102\7d\2\2\u0102\u0103\7n\2\2\u0103\u0104\7g\2\2\u0104"+
		"\64\3\2\2\2\u0105\u0106\7e\2\2\u0106\u0107\7n\2\2\u0107\u0108\7q\2\2\u0108"+
		"\u0109\7e\2\2\u0109\u010a\7m\2\2\u010a\66\3\2\2\2\u010b\u010c\7e\2\2\u010c"+
		"\u010d\7j\2\2\u010d\u010e\7c\2\2\u010e\u010f\7p\2\2\u010f8\3\2\2\2\u0110"+
		"\u0111\7d\2\2\u0111\u0112\7q\2\2\u0112\u0113\7q\2\2\u0113\u0114\7n\2\2"+
		"\u0114:\3\2\2\2\u0115\u0116\7]\2\2\u0116<\3\2\2\2\u0117\u0118\7_\2\2\u0118"+
		">\3\2\2\2\u0119\u011a\7u\2\2\u011a\u011b\7e\2\2\u011b\u011c\7c\2\2\u011c"+
		"\u011d\7n\2\2\u011d\u011e\7c\2\2\u011e\u011f\7t\2\2\u011f@\3\2\2\2\u0120"+
		"\u0121\7u\2\2\u0121\u0122\7v\2\2\u0122\u0123\7t\2\2\u0123\u0124\7w\2\2"+
		"\u0124\u0125\7e\2\2\u0125\u0126\7v\2\2\u0126B\3\2\2\2\u0127\u0128\7)\2"+
		"\2\u0128D\3\2\2\2\u0129\u012a\7-\2\2\u012a\u012b\7-\2\2\u012bF\3\2\2\2"+
		"\u012c\u012d\7/\2\2\u012d\u012e\7/\2\2\u012eH\3\2\2\2\u012f\u0130\7?\2"+
		"\2\u0130J\3\2\2\2\u0131\u0132\7<\2\2\u0132\u0133\7?\2\2\u0133L\3\2\2\2"+
		"\u0134\u0135\7-\2\2\u0135\u0136\7?\2\2\u0136N\3\2\2\2\u0137\u0138\7/\2"+
		"\2\u0138\u0139\7?\2\2\u0139P\3\2\2\2\u013a\u013b\7,\2\2\u013b\u013c\7"+
		"?\2\2\u013cR\3\2\2\2\u013d\u013e\7\61\2\2\u013e\u013f\7?\2\2\u013fT\3"+
		"\2\2\2\u0140\u0141\7\'\2\2\u0141\u0142\7?\2\2\u0142V\3\2\2\2\u0143\u0144"+
		"\7~\2\2\u0144\u0145\7?\2\2\u0145X\3\2\2\2\u0146\u0147\7(\2\2\u0147\u0148"+
		"\7?\2\2\u0148Z\3\2\2\2\u0149\u014a\7`\2\2\u014a\u014b\7?\2\2\u014b\\\3"+
		"\2\2\2\u014c\u014d\7>\2\2\u014d\u014e\7>\2\2\u014e\u014f\7?\2\2\u014f"+
		"^\3\2\2\2\u0150\u0151\7@\2\2\u0151\u0152\7@\2\2\u0152\u0153\7?\2\2\u0153"+
		"`\3\2\2\2\u0154\u0155\7-\2\2\u0155b\3\2\2\2\u0156\u0157\7/\2\2\u0157d"+
		"\3\2\2\2\u0158\u0159\7p\2\2\u0159\u015a\7q\2\2\u015a\u015b\7v\2\2\u015b"+
		"f\3\2\2\2\u015c\u015d\7%\2\2\u015dh\3\2\2\2\u015e\u015f\7>\2\2\u015fj"+
		"\3\2\2\2\u0160\u0161\7>\2\2\u0161\u0162\7?\2\2\u0162l\3\2\2\2\u0163\u0164"+
		"\7?\2\2\u0164\u0165\7?\2\2\u0165n\3\2\2\2\u0166\u0167\7#\2\2\u0167\u0168"+
		"\7?\2\2\u0168p\3\2\2\2\u0169\u016a\7@\2\2\u016a\u016b\7?\2\2\u016br\3"+
		"\2\2\2\u016c\u016d\7@\2\2\u016dt\3\2\2\2\u016e\u016f\7,\2\2\u016fv\3\2"+
		"\2\2\u0170\u0171\7\61\2\2\u0171x\3\2\2\2\u0172\u0173\7\'\2\2\u0173z\3"+
		"\2\2\2\u0174\u0175\7(\2\2\u0175|\3\2\2\2\u0176\u0177\7~\2\2\u0177~\3\2"+
		"\2\2\u0178\u0179\7`\2\2\u0179\u0080\3\2\2\2\u017a\u017b\7>\2\2\u017b\u017c"+
		"\7>\2\2\u017c\u0082\3\2\2\2\u017d\u017e\7@\2\2\u017e\u017f\7@\2\2\u017f"+
		"\u0084\3\2\2\2\u0180\u0181\7(\2\2\u0181\u0182\7(\2\2\u0182\u0086\3\2\2"+
		"\2\u0183\u0184\7~\2\2\u0184\u0185\7~\2\2\u0185\u0088\3\2\2\2\u0186\u0187"+
		"\7>\2\2\u0187\u0188\7A\2\2\u0188\u008a\3\2\2\2\u0189\u018a\7@\2\2\u018a"+
		"\u018b\7A\2\2\u018b\u008c\3\2\2\2\u018c\u018d\7q\2\2\u018d\u018e\7t\2"+
		"\2\u018e\u008e\3\2\2\2\u018f\u0190\7c\2\2\u0190\u0191\7p\2\2\u0191\u0192"+
		"\7f\2\2\u0192\u0090\3\2\2\2\u0193\u0194\7k\2\2\u0194\u0195\7o\2\2\u0195"+
		"\u0196\7r\2\2\u0196\u0197\7n\2\2\u0197\u0198\7{\2\2\u0198\u0092\3\2\2"+
		"\2\7\2\u00b2\u00b8\u00bd\u00c4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}