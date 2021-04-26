// Generated from cal.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Variable=1, Constant=2, Return=3, TypeInteger=4, TypeBoolean=5, TypeVoid=6, 
		Main=7, If=8, Else=9, True=10, False=11, While=12, Begin=13, End=14, Is=15, 
		Skipp=16, COMMA=17, SEMI=18, COLON=19, ASSIGN=20, LBR=21, RBR=22, PLUS=23, 
		MINUS=24, TILDE=25, NOTEQUAL=26, OR=27, AND=28, EQUAL=29, LESSEQUAL=30, 
		LESS=31, GREATER=32, GREATEREQUAL=33, Number=34, Identifier=35, COMMENT=36, 
		LINE_COMMENT=37, WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Variable", "Constant", "Return", "TypeInteger", "TypeBoolean", "TypeVoid", 
			"Main", "If", "Else", "True", "False", "While", "Begin", "End", "Is", 
			"Skipp", "COMMA", "SEMI", "COLON", "ASSIGN", "LBR", "RBR", "PLUS", "MINUS", 
			"TILDE", "NOTEQUAL", "OR", "AND", "EQUAL", "LESSEQUAL", "LESS", "GREATER", 
			"GREATEREQUAL", "A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", 
			"M", "N", "O", "P", "R", "S", "T", "U", "V", "W", "Y", "Number", "Identifier", 
			"COMMENT", "LINE_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "','", "';'", "':'", "':='", "'('", "')'", 
			"'+'", "'-'", "'~'", "'!='", "'|'", "'&'", "'='", "'<='", "'<'", "'>'", 
			"'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Variable", "Constant", "Return", "TypeInteger", "TypeBoolean", 
			"TypeVoid", "Main", "If", "Else", "True", "False", "While", "Begin", 
			"End", "Is", "Skipp", "COMMA", "SEMI", "COLON", "ASSIGN", "LBR", "RBR", 
			"PLUS", "MINUS", "TILDE", "NOTEQUAL", "OR", "AND", "EQUAL", "LESSEQUAL", 
			"LESS", "GREATER", "GREATEREQUAL", "Number", "Identifier", "COMMENT", 
			"LINE_COMMENT", "WS"
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


	public calLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cal.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0160\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*"+
		"\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\59\u012d\n9\39\39\7"+
		"9\u0131\n9\f9\169\u0134\139\39\59\u0137\n9\3:\3:\7:\u013b\n:\f:\16:\u013e"+
		"\13:\3;\3;\3;\3;\3;\7;\u0145\n;\f;\16;\u0148\13;\3;\3;\3;\3;\3;\3<\3<"+
		"\3<\3<\7<\u0153\n<\f<\16<\u0156\13<\3<\3<\3=\6=\u015b\n=\r=\16=\u015c"+
		"\3=\3=\3\u0146\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a"+
		"\2c\2e\2g\2i\2k\2m\2o\2q$s%u&w\'y(\3\2\36\4\2CCcc\4\2DDdd\4\2EEee\4\2"+
		"FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2MMmm\4\2NNnn\4\2OOoo\4"+
		"\2PPpp\4\2QQqq\4\2RRrr\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYy"+
		"y\4\2[[{{\3\2\63;\3\2\62;\4\2C\\c|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13"+
		"\f\17\17\"\"\2\u0151\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5\u0084"+
		"\3\2\2\2\7\u008d\3\2\2\2\t\u0094\3\2\2\2\13\u009c\3\2\2\2\r\u00a4\3\2"+
		"\2\2\17\u00a9\3\2\2\2\21\u00ae\3\2\2\2\23\u00b1\3\2\2\2\25\u00b6\3\2\2"+
		"\2\27\u00bb\3\2\2\2\31\u00c1\3\2\2\2\33\u00c7\3\2\2\2\35\u00cd\3\2\2\2"+
		"\37\u00d1\3\2\2\2!\u00d4\3\2\2\2#\u00d9\3\2\2\2%\u00db\3\2\2\2\'\u00dd"+
		"\3\2\2\2)\u00df\3\2\2\2+\u00e2\3\2\2\2-\u00e4\3\2\2\2/\u00e6\3\2\2\2\61"+
		"\u00e8\3\2\2\2\63\u00ea\3\2\2\2\65\u00ec\3\2\2\2\67\u00ef\3\2\2\29\u00f1"+
		"\3\2\2\2;\u00f3\3\2\2\2=\u00f5\3\2\2\2?\u00f8\3\2\2\2A\u00fa\3\2\2\2C"+
		"\u00fc\3\2\2\2E\u00ff\3\2\2\2G\u0101\3\2\2\2I\u0103\3\2\2\2K\u0105\3\2"+
		"\2\2M\u0107\3\2\2\2O\u0109\3\2\2\2Q\u010b\3\2\2\2S\u010d\3\2\2\2U\u010f"+
		"\3\2\2\2W\u0111\3\2\2\2Y\u0113\3\2\2\2[\u0115\3\2\2\2]\u0117\3\2\2\2_"+
		"\u0119\3\2\2\2a\u011b\3\2\2\2c\u011d\3\2\2\2e\u011f\3\2\2\2g\u0121\3\2"+
		"\2\2i\u0123\3\2\2\2k\u0125\3\2\2\2m\u0127\3\2\2\2o\u0129\3\2\2\2q\u0136"+
		"\3\2\2\2s\u0138\3\2\2\2u\u013f\3\2\2\2w\u014e\3\2\2\2y\u015a\3\2\2\2{"+
		"|\5k\66\2|}\5E#\2}~\5c\62\2~\177\5U+\2\177\u0080\5E#\2\u0080\u0081\5G"+
		"$\2\u0081\u0082\5Y-\2\u0082\u0083\5M\'\2\u0083\4\3\2\2\2\u0084\u0085\5"+
		"I%\2\u0085\u0086\5_\60\2\u0086\u0087\5]/\2\u0087\u0088\5e\63\2\u0088\u0089"+
		"\5g\64\2\u0089\u008a\5E#\2\u008a\u008b\5]/\2\u008b\u008c\5g\64\2\u008c"+
		"\6\3\2\2\2\u008d\u008e\5c\62\2\u008e\u008f\5M\'\2\u008f\u0090\5g\64\2"+
		"\u0090\u0091\5i\65\2\u0091\u0092\5c\62\2\u0092\u0093\5]/\2\u0093\b\3\2"+
		"\2\2\u0094\u0095\5U+\2\u0095\u0096\5]/\2\u0096\u0097\5g\64\2\u0097\u0098"+
		"\5M\'\2\u0098\u0099\5Q)\2\u0099\u009a\5M\'\2\u009a\u009b\5c\62\2\u009b"+
		"\n\3\2\2\2\u009c\u009d\5G$\2\u009d\u009e\5_\60\2\u009e\u009f\5_\60\2\u009f"+
		"\u00a0\5Y-\2\u00a0\u00a1\5M\'\2\u00a1\u00a2\5E#\2\u00a2\u00a3\5]/\2\u00a3"+
		"\f\3\2\2\2\u00a4\u00a5\5k\66\2\u00a5\u00a6\5_\60\2\u00a6\u00a7\5U+\2\u00a7"+
		"\u00a8\5K&\2\u00a8\16\3\2\2\2\u00a9\u00aa\5[.\2\u00aa\u00ab\5E#\2\u00ab"+
		"\u00ac\5U+\2\u00ac\u00ad\5]/\2\u00ad\20\3\2\2\2\u00ae\u00af\5U+\2\u00af"+
		"\u00b0\5O(\2\u00b0\22\3\2\2\2\u00b1\u00b2\5M\'\2\u00b2\u00b3\5Y-\2\u00b3"+
		"\u00b4\5e\63\2\u00b4\u00b5\5M\'\2\u00b5\24\3\2\2\2\u00b6\u00b7\5g\64\2"+
		"\u00b7\u00b8\5c\62\2\u00b8\u00b9\5i\65\2\u00b9\u00ba\5M\'\2\u00ba\26\3"+
		"\2\2\2\u00bb\u00bc\5O(\2\u00bc\u00bd\5E#\2\u00bd\u00be\5Y-\2\u00be\u00bf"+
		"\5e\63\2\u00bf\u00c0\5M\'\2\u00c0\30\3\2\2\2\u00c1\u00c2\5m\67\2\u00c2"+
		"\u00c3\5S*\2\u00c3\u00c4\5U+\2\u00c4\u00c5\5Y-\2\u00c5\u00c6\5M\'\2\u00c6"+
		"\32\3\2\2\2\u00c7\u00c8\5G$\2\u00c8\u00c9\5M\'\2\u00c9\u00ca\5Q)\2\u00ca"+
		"\u00cb\5U+\2\u00cb\u00cc\5]/\2\u00cc\34\3\2\2\2\u00cd\u00ce\5M\'\2\u00ce"+
		"\u00cf\5]/\2\u00cf\u00d0\5K&\2\u00d0\36\3\2\2\2\u00d1\u00d2\5U+\2\u00d2"+
		"\u00d3\5e\63\2\u00d3 \3\2\2\2\u00d4\u00d5\5e\63\2\u00d5\u00d6\5W,\2\u00d6"+
		"\u00d7\5U+\2\u00d7\u00d8\5a\61\2\u00d8\"\3\2\2\2\u00d9\u00da\7.\2\2\u00da"+
		"$\3\2\2\2\u00db\u00dc\7=\2\2\u00dc&\3\2\2\2\u00dd\u00de\7<\2\2\u00de("+
		"\3\2\2\2\u00df\u00e0\7<\2\2\u00e0\u00e1\7?\2\2\u00e1*\3\2\2\2\u00e2\u00e3"+
		"\7*\2\2\u00e3,\3\2\2\2\u00e4\u00e5\7+\2\2\u00e5.\3\2\2\2\u00e6\u00e7\7"+
		"-\2\2\u00e7\60\3\2\2\2\u00e8\u00e9\7/\2\2\u00e9\62\3\2\2\2\u00ea\u00eb"+
		"\7\u0080\2\2\u00eb\64\3\2\2\2\u00ec\u00ed\7#\2\2\u00ed\u00ee\7?\2\2\u00ee"+
		"\66\3\2\2\2\u00ef\u00f0\7~\2\2\u00f08\3\2\2\2\u00f1\u00f2\7(\2\2\u00f2"+
		":\3\2\2\2\u00f3\u00f4\7?\2\2\u00f4<\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6\u00f7"+
		"\7?\2\2\u00f7>\3\2\2\2\u00f8\u00f9\7>\2\2\u00f9@\3\2\2\2\u00fa\u00fb\7"+
		"@\2\2\u00fbB\3\2\2\2\u00fc\u00fd\7@\2\2\u00fd\u00fe\7?\2\2\u00feD\3\2"+
		"\2\2\u00ff\u0100\t\2\2\2\u0100F\3\2\2\2\u0101\u0102\t\3\2\2\u0102H\3\2"+
		"\2\2\u0103\u0104\t\4\2\2\u0104J\3\2\2\2\u0105\u0106\t\5\2\2\u0106L\3\2"+
		"\2\2\u0107\u0108\t\6\2\2\u0108N\3\2\2\2\u0109\u010a\t\7\2\2\u010aP\3\2"+
		"\2\2\u010b\u010c\t\b\2\2\u010cR\3\2\2\2\u010d\u010e\t\t\2\2\u010eT\3\2"+
		"\2\2\u010f\u0110\t\n\2\2\u0110V\3\2\2\2\u0111\u0112\t\13\2\2\u0112X\3"+
		"\2\2\2\u0113\u0114\t\f\2\2\u0114Z\3\2\2\2\u0115\u0116\t\r\2\2\u0116\\"+
		"\3\2\2\2\u0117\u0118\t\16\2\2\u0118^\3\2\2\2\u0119\u011a\t\17\2\2\u011a"+
		"`\3\2\2\2\u011b\u011c\t\20\2\2\u011cb\3\2\2\2\u011d\u011e\t\21\2\2\u011e"+
		"d\3\2\2\2\u011f\u0120\t\22\2\2\u0120f\3\2\2\2\u0121\u0122\t\23\2\2\u0122"+
		"h\3\2\2\2\u0123\u0124\t\24\2\2\u0124j\3\2\2\2\u0125\u0126\t\25\2\2\u0126"+
		"l\3\2\2\2\u0127\u0128\t\26\2\2\u0128n\3\2\2\2\u0129\u012a\t\27\2\2\u012a"+
		"p\3\2\2\2\u012b\u012d\7/\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0132\t\30\2\2\u012f\u0131\t\31\2\2\u0130\u012f\3"+
		"\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0137\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0137\7\62\2\2\u0136\u012c\3"+
		"\2\2\2\u0136\u0135\3\2\2\2\u0137r\3\2\2\2\u0138\u013c\t\32\2\2\u0139\u013b"+
		"\t\33\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2"+
		"\u013c\u013d\3\2\2\2\u013dt\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7"+
		"\61\2\2\u0140\u0141\7,\2\2\u0141\u0146\3\2\2\2\u0142\u0145\5u;\2\u0143"+
		"\u0145\13\2\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3"+
		"\2\2\2\u0146\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014a\7,\2\2\u014a\u014b\7\61\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014d\b;\2\2\u014dv\3\2\2\2\u014e\u014f\7\61\2\2\u014f\u0150"+
		"\7\61\2\2\u0150\u0154\3\2\2\2\u0151\u0153\n\34\2\2\u0152\u0151\3\2\2\2"+
		"\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157"+
		"\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\b<\2\2\u0158x\3\2\2\2\u0159\u015b"+
		"\t\35\2\2\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2"+
		"\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\b=\2\2\u015fz\3\2"+
		"\2\2\13\2\u012c\u0132\u0136\u013c\u0144\u0146\u0154\u015c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}