// Generated from /home/jaime/Documents/TranslationTraceUppaal/src/translation/Antlr/TraceUppaalLexer.g4 by ANTLR 4.9.2
package translation.Antlr;
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "STATE", "DELAY", "TRANSITION", "TAU", "IDENTIFIER", "NAT", "POINT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2K\u01a5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\7\7\u00b7\n\7\f\7\16\7\u00ba\13\7\3\b\6\b\u00bd\n\b\r\b\16\b\u00be"+
		"\3\t\7\t\u00c2\n\t\f\t\16\t\u00c5\13\t\3\t\3\t\6\t\u00c9\n\t\r\t\16\t"+
		"\u00ca\3\t\3\t\3\t\3\t\5\t\u00d1\n\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*"+
		"\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3"+
		">\3?\3?\3@\3@\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3F\3F\3F\3G\3"+
		"G\3G\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\2\2K\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\3\2\6"+
		"\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\2\u01a9\2\3\3\2"+
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
		"\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\3\u0095\3\2\2\2\5\u0099"+
		"\3\2\2\2\7\u009f\3\2\2\2\t\u00a5\3\2\2\2\13\u00b0\3\2\2\2\r\u00b4\3\2"+
		"\2\2\17\u00bc\3\2\2\2\21\u00c3\3\2\2\2\23\u00d2\3\2\2\2\25\u00d5\3\2\2"+
		"\2\27\u00d7\3\2\2\2\31\u00d9\3\2\2\2\33\u00db\3\2\2\2\35\u00dd\3\2\2\2"+
		"\37\u00df\3\2\2\2!\u00e1\3\2\2\2#\u00e3\3\2\2\2%\u00e5\3\2\2\2\'\u00e7"+
		"\3\2\2\2)\u00e9\3\2\2\2+\u00f0\3\2\2\2-\u00f7\3\2\2\2/\u00fb\3\2\2\2\61"+
		"\u0100\3\2\2\2\63\u0106\3\2\2\2\65\u010a\3\2\2\2\67\u0111\3\2\2\29\u0117"+
		"\3\2\2\2;\u011c\3\2\2\2=\u0121\3\2\2\2?\u0123\3\2\2\2A\u0125\3\2\2\2C"+
		"\u012c\3\2\2\2E\u0133\3\2\2\2G\u0135\3\2\2\2I\u0138\3\2\2\2K\u013b\3\2"+
		"\2\2M\u013d\3\2\2\2O\u0140\3\2\2\2Q\u0143\3\2\2\2S\u0146\3\2\2\2U\u0149"+
		"\3\2\2\2W\u014c\3\2\2\2Y\u014f\3\2\2\2[\u0152\3\2\2\2]\u0155\3\2\2\2_"+
		"\u0158\3\2\2\2a\u015c\3\2\2\2c\u0160\3\2\2\2e\u0162\3\2\2\2g\u0164\3\2"+
		"\2\2i\u0168\3\2\2\2k\u016a\3\2\2\2m\u016c\3\2\2\2o\u016f\3\2\2\2q\u0172"+
		"\3\2\2\2s\u0175\3\2\2\2u\u0178\3\2\2\2w\u017a\3\2\2\2y\u017c\3\2\2\2{"+
		"\u017e\3\2\2\2}\u0180\3\2\2\2\177\u0182\3\2\2\2\u0081\u0184\3\2\2\2\u0083"+
		"\u0186\3\2\2\2\u0085\u0189\3\2\2\2\u0087\u018c\3\2\2\2\u0089\u018f\3\2"+
		"\2\2\u008b\u0192\3\2\2\2\u008d\u0195\3\2\2\2\u008f\u0198\3\2\2\2\u0091"+
		"\u019b\3\2\2\2\u0093\u019f\3\2\2\2\u0095\u0096\t\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\b\2\2\2\u0098\4\3\2\2\2\u0099\u009a\7u\2\2\u009a\u009b"+
		"\7v\2\2\u009b\u009c\7c\2\2\u009c\u009d\7v\2\2\u009d\u009e\7g\2\2\u009e"+
		"\6\3\2\2\2\u009f\u00a0\7f\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7n\2\2\u00a2"+
		"\u00a3\7c\2\2\u00a3\u00a4\7{\2\2\u00a4\b\3\2\2\2\u00a5\u00a6\7v\2\2\u00a6"+
		"\u00a7\7t\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7u\2\2"+
		"\u00aa\u00ab\7k\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae"+
		"\7q\2\2\u00ae\u00af\7p\2\2\u00af\n\3\2\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2"+
		"\7c\2\2\u00b2\u00b3\7w\2\2\u00b3\f\3\2\2\2\u00b4\u00b8\t\3\2\2\u00b5\u00b7"+
		"\t\4\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\16\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\t\5\2"+
		"\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\20\3\2\2\2\u00c0\u00c2\t\5\2\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\7\60\2\2\u00c7\u00c9\t\5\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00d0\3\2\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7/\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d1\5\17\b\2\u00d0\u00cc\3\2\2\2\u00d0\u00d1\3\2\2\2"+
		"\u00d1\22\3\2\2\2\u00d2\u00d3\7/\2\2\u00d3\u00d4\7@\2\2\u00d4\24\3\2\2"+
		"\2\u00d5\u00d6\7}\2\2\u00d6\26\3\2\2\2\u00d7\u00d8\7\177\2\2\u00d8\30"+
		"\3\2\2\2\u00d9\u00da\7*\2\2\u00da\32\3\2\2\2\u00db\u00dc\7+\2\2\u00dc"+
		"\34\3\2\2\2\u00dd\u00de\7\60\2\2\u00de\36\3\2\2\2\u00df\u00e0\7<\2\2\u00e0"+
		" \3\2\2\2\u00e1\u00e2\7=\2\2\u00e2\"\3\2\2\2\u00e3\u00e4\7.\2\2\u00e4"+
		"$\3\2\2\2\u00e5\u00e6\7A\2\2\u00e6&\3\2\2\2\u00e7\u00e8\7#\2\2\u00e8("+
		"\3\2\2\2\u00e9\u00ea\7h\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7t\2\2\u00ec"+
		"\u00ed\7c\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7n\2\2\u00ef*\3\2\2\2\u00f0"+
		"\u00f1\7g\2\2\u00f1\u00f2\7z\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7u\2\2"+
		"\u00f4\u00f5\7v\2\2\u00f5\u00f6\7u\2\2\u00f6,\3\2\2\2\u00f7\u00f8\7u\2"+
		"\2\u00f8\u00f9\7w\2\2\u00f9\u00fa\7o\2\2\u00fa.\3\2\2\2\u00fb\u00fc\7"+
		"v\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7g\2\2\u00ff\60"+
		"\3\2\2\2\u0100\u0101\7h\2\2\u0101\u0102\7c\2\2\u0102\u0103\7n\2\2\u0103"+
		"\u0104\7u\2\2\u0104\u0105\7g\2\2\u0105\62\3\2\2\2\u0106\u0107\7k\2\2\u0107"+
		"\u0108\7p\2\2\u0108\u0109\7v\2\2\u0109\64\3\2\2\2\u010a\u010b\7f\2\2\u010b"+
		"\u010c\7q\2\2\u010c\u010d\7w\2\2\u010d\u010e\7d\2\2\u010e\u010f\7n\2\2"+
		"\u010f\u0110\7g\2\2\u0110\66\3\2\2\2\u0111\u0112\7e\2\2\u0112\u0113\7"+
		"n\2\2\u0113\u0114\7q\2\2\u0114\u0115\7e\2\2\u0115\u0116\7m\2\2\u01168"+
		"\3\2\2\2\u0117\u0118\7e\2\2\u0118\u0119\7j\2\2\u0119\u011a\7c\2\2\u011a"+
		"\u011b\7p\2\2\u011b:\3\2\2\2\u011c\u011d\7d\2\2\u011d\u011e\7q\2\2\u011e"+
		"\u011f\7q\2\2\u011f\u0120\7n\2\2\u0120<\3\2\2\2\u0121\u0122\7]\2\2\u0122"+
		">\3\2\2\2\u0123\u0124\7_\2\2\u0124@\3\2\2\2\u0125\u0126\7u\2\2\u0126\u0127"+
		"\7e\2\2\u0127\u0128\7c\2\2\u0128\u0129\7n\2\2\u0129\u012a\7c\2\2\u012a"+
		"\u012b\7t\2\2\u012bB\3\2\2\2\u012c\u012d\7u\2\2\u012d\u012e\7v\2\2\u012e"+
		"\u012f\7t\2\2\u012f\u0130\7w\2\2\u0130\u0131\7e\2\2\u0131\u0132\7v\2\2"+
		"\u0132D\3\2\2\2\u0133\u0134\7)\2\2\u0134F\3\2\2\2\u0135\u0136\7-\2\2\u0136"+
		"\u0137\7-\2\2\u0137H\3\2\2\2\u0138\u0139\7/\2\2\u0139\u013a\7/\2\2\u013a"+
		"J\3\2\2\2\u013b\u013c\7?\2\2\u013cL\3\2\2\2\u013d\u013e\7<\2\2\u013e\u013f"+
		"\7?\2\2\u013fN\3\2\2\2\u0140\u0141\7-\2\2\u0141\u0142\7?\2\2\u0142P\3"+
		"\2\2\2\u0143\u0144\7/\2\2\u0144\u0145\7?\2\2\u0145R\3\2\2\2\u0146\u0147"+
		"\7,\2\2\u0147\u0148\7?\2\2\u0148T\3\2\2\2\u0149\u014a\7\61\2\2\u014a\u014b"+
		"\7?\2\2\u014bV\3\2\2\2\u014c\u014d\7\'\2\2\u014d\u014e\7?\2\2\u014eX\3"+
		"\2\2\2\u014f\u0150\7~\2\2\u0150\u0151\7?\2\2\u0151Z\3\2\2\2\u0152\u0153"+
		"\7(\2\2\u0153\u0154\7?\2\2\u0154\\\3\2\2\2\u0155\u0156\7`\2\2\u0156\u0157"+
		"\7?\2\2\u0157^\3\2\2\2\u0158\u0159\7>\2\2\u0159\u015a\7>\2\2\u015a\u015b"+
		"\7?\2\2\u015b`\3\2\2\2\u015c\u015d\7@\2\2\u015d\u015e\7@\2\2\u015e\u015f"+
		"\7?\2\2\u015fb\3\2\2\2\u0160\u0161\7-\2\2\u0161d\3\2\2\2\u0162\u0163\7"+
		"/\2\2\u0163f\3\2\2\2\u0164\u0165\7p\2\2\u0165\u0166\7q\2\2\u0166\u0167"+
		"\7v\2\2\u0167h\3\2\2\2\u0168\u0169\7%\2\2\u0169j\3\2\2\2\u016a\u016b\7"+
		">\2\2\u016bl\3\2\2\2\u016c\u016d\7>\2\2\u016d\u016e\7?\2\2\u016en\3\2"+
		"\2\2\u016f\u0170\7?\2\2\u0170\u0171\7?\2\2\u0171p\3\2\2\2\u0172\u0173"+
		"\7#\2\2\u0173\u0174\7?\2\2\u0174r\3\2\2\2\u0175\u0176\7@\2\2\u0176\u0177"+
		"\7?\2\2\u0177t\3\2\2\2\u0178\u0179\7@\2\2\u0179v\3\2\2\2\u017a\u017b\7"+
		",\2\2\u017bx\3\2\2\2\u017c\u017d\7\61\2\2\u017dz\3\2\2\2\u017e\u017f\7"+
		"\'\2\2\u017f|\3\2\2\2\u0180\u0181\7(\2\2\u0181~\3\2\2\2\u0182\u0183\7"+
		"~\2\2\u0183\u0080\3\2\2\2\u0184\u0185\7`\2\2\u0185\u0082\3\2\2\2\u0186"+
		"\u0187\7>\2\2\u0187\u0188\7>\2\2\u0188\u0084\3\2\2\2\u0189\u018a\7@\2"+
		"\2\u018a\u018b\7@\2\2\u018b\u0086\3\2\2\2\u018c\u018d\7(\2\2\u018d\u018e"+
		"\7(\2\2\u018e\u0088\3\2\2\2\u018f\u0190\7~\2\2\u0190\u0191\7~\2\2\u0191"+
		"\u008a\3\2\2\2\u0192\u0193\7>\2\2\u0193\u0194\7A\2\2\u0194\u008c\3\2\2"+
		"\2\u0195\u0196\7@\2\2\u0196\u0197\7A\2\2\u0197\u008e\3\2\2\2\u0198\u0199"+
		"\7q\2\2\u0199\u019a\7t\2\2\u019a\u0090\3\2\2\2\u019b\u019c\7c\2\2\u019c"+
		"\u019d\7p\2\2\u019d\u019e\7f\2\2\u019e\u0092\3\2\2\2\u019f\u01a0\7k\2"+
		"\2\u01a0\u01a1\7o\2\2\u01a1\u01a2\7r\2\2\u01a2\u01a3\7n\2\2\u01a3\u01a4"+
		"\7{\2\2\u01a4\u0094\3\2\2\2\b\2\u00b8\u00be\u00c3\u00ca\u00d0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}