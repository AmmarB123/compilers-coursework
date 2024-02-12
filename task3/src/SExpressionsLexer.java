// Generated from C:/Users/Asus/Desktop/TASK 3/src\SExpressions.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SExpressionsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IntType=7, BoolType=8, 
		UnitType=9, FunDecl=10, IfStmt=11, BinOpExpr=12, WhileLoop=13, RepeatLoop=14, 
		Asgmt=15, FunInvoc=16, Skip=17, Comma=18, Eq=19, Less=20, Gtr=21, LessEq=22, 
		GtrEq=23, Plus=24, Times=25, Minus=26, Div=27, And=28, Or=29, Xor=30, 
		Idfr=31, IntLit=32, WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "IntType", "BoolType", 
			"UnitType", "FunDecl", "IfStmt", "BinOpExpr", "WhileLoop", "RepeatLoop", 
			"Asgmt", "FunInvoc", "Skip", "Comma", "Eq", "Less", "Gtr", "LessEq", 
			"GtrEq", "Plus", "Times", "Minus", "Div", "And", "Or", "Xor", "Idfr", 
			"IntLit", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'Idfr(\"'", "'\")'", "'IntLit('", "')'", "'IntType'", 
			"'BoolType'", "'UnitType'", "'FunDecl'", "'IfStmt'", "'BinOpExpr'", "'WhileLoop'", 
			"'RepeatLoop'", "'Asgmt'", "'FunInvoc'", "'Skip'", "','", "'Eq'", "'Less'", 
			"'Gtr'", "'LessEq'", "'GtrEq'", "'Plus'", "'Times'", "'Minus'", "'Div'", 
			"'And'", "'Or'", "'Xor'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "IntType", "BoolType", "UnitType", 
			"FunDecl", "IfStmt", "BinOpExpr", "WhileLoop", "RepeatLoop", "Asgmt", 
			"FunInvoc", "Skip", "Comma", "Eq", "Less", "Gtr", "LessEq", "GtrEq", 
			"Plus", "Times", "Minus", "Div", "And", "Or", "Xor", "Idfr", "IntLit", 
			"WS"
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


	public SExpressionsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SExpressions.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u010c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \7 \u00f7\n \f"+
		" \16 \u00fa\13 \3!\3!\3!\7!\u00ff\n!\f!\16!\u0102\13!\5!\u0104\n!\3\""+
		"\6\"\u0107\n\"\r\"\16\"\u0108\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\7\3\2c|\6\2\62"+
		";C\\aac|\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\2\u010f\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2\tP\3"+
		"\2\2\2\13S\3\2\2\2\r[\3\2\2\2\17]\3\2\2\2\21e\3\2\2\2\23n\3\2\2\2\25w"+
		"\3\2\2\2\27\177\3\2\2\2\31\u0086\3\2\2\2\33\u0090\3\2\2\2\35\u009a\3\2"+
		"\2\2\37\u00a5\3\2\2\2!\u00ab\3\2\2\2#\u00b4\3\2\2\2%\u00b9\3\2\2\2\'\u00bb"+
		"\3\2\2\2)\u00be\3\2\2\2+\u00c3\3\2\2\2-\u00c7\3\2\2\2/\u00ce\3\2\2\2\61"+
		"\u00d4\3\2\2\2\63\u00d9\3\2\2\2\65\u00df\3\2\2\2\67\u00e5\3\2\2\29\u00e9"+
		"\3\2\2\2;\u00ed\3\2\2\2=\u00f0\3\2\2\2?\u00f4\3\2\2\2A\u0103\3\2\2\2C"+
		"\u0106\3\2\2\2EF\7]\2\2F\4\3\2\2\2GH\7_\2\2H\6\3\2\2\2IJ\7K\2\2JK\7f\2"+
		"\2KL\7h\2\2LM\7t\2\2MN\7*\2\2NO\7$\2\2O\b\3\2\2\2PQ\7$\2\2QR\7+\2\2R\n"+
		"\3\2\2\2ST\7K\2\2TU\7p\2\2UV\7v\2\2VW\7N\2\2WX\7k\2\2XY\7v\2\2YZ\7*\2"+
		"\2Z\f\3\2\2\2[\\\7+\2\2\\\16\3\2\2\2]^\7K\2\2^_\7p\2\2_`\7v\2\2`a\7V\2"+
		"\2ab\7{\2\2bc\7r\2\2cd\7g\2\2d\20\3\2\2\2ef\7D\2\2fg\7q\2\2gh\7q\2\2h"+
		"i\7n\2\2ij\7V\2\2jk\7{\2\2kl\7r\2\2lm\7g\2\2m\22\3\2\2\2no\7W\2\2op\7"+
		"p\2\2pq\7k\2\2qr\7v\2\2rs\7V\2\2st\7{\2\2tu\7r\2\2uv\7g\2\2v\24\3\2\2"+
		"\2wx\7H\2\2xy\7w\2\2yz\7p\2\2z{\7F\2\2{|\7g\2\2|}\7e\2\2}~\7n\2\2~\26"+
		"\3\2\2\2\177\u0080\7K\2\2\u0080\u0081\7h\2\2\u0081\u0082\7U\2\2\u0082"+
		"\u0083\7v\2\2\u0083\u0084\7o\2\2\u0084\u0085\7v\2\2\u0085\30\3\2\2\2\u0086"+
		"\u0087\7D\2\2\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089\u008a\7Q\2\2"+
		"\u008a\u008b\7r\2\2\u008b\u008c\7G\2\2\u008c\u008d\7z\2\2\u008d\u008e"+
		"\7r\2\2\u008e\u008f\7t\2\2\u008f\32\3\2\2\2\u0090\u0091\7Y\2\2\u0091\u0092"+
		"\7j\2\2\u0092\u0093\7k\2\2\u0093\u0094\7n\2\2\u0094\u0095\7g\2\2\u0095"+
		"\u0096\7N\2\2\u0096\u0097\7q\2\2\u0097\u0098\7q\2\2\u0098\u0099\7r\2\2"+
		"\u0099\34\3\2\2\2\u009a\u009b\7T\2\2\u009b\u009c\7g\2\2\u009c\u009d\7"+
		"r\2\2\u009d\u009e\7g\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1"+
		"\7N\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7r\2\2\u00a4"+
		"\36\3\2\2\2\u00a5\u00a6\7C\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7i\2\2\u00a8"+
		"\u00a9\7o\2\2\u00a9\u00aa\7v\2\2\u00aa \3\2\2\2\u00ab\u00ac\7H\2\2\u00ac"+
		"\u00ad\7w\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7K\2\2\u00af\u00b0\7p\2\2"+
		"\u00b0\u00b1\7x\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7e\2\2\u00b3\"\3\2"+
		"\2\2\u00b4\u00b5\7U\2\2\u00b5\u00b6\7m\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8"+
		"\7r\2\2\u00b8$\3\2\2\2\u00b9\u00ba\7.\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7"+
		"G\2\2\u00bc\u00bd\7s\2\2\u00bd(\3\2\2\2\u00be\u00bf\7N\2\2\u00bf\u00c0"+
		"\7g\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7u\2\2\u00c2*\3\2\2\2\u00c3\u00c4"+
		"\7I\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7t\2\2\u00c6,\3\2\2\2\u00c7\u00c8"+
		"\7N\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7u\2\2\u00cb"+
		"\u00cc\7G\2\2\u00cc\u00cd\7s\2\2\u00cd.\3\2\2\2\u00ce\u00cf\7I\2\2\u00cf"+
		"\u00d0\7v\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7G\2\2\u00d2\u00d3\7s\2\2"+
		"\u00d3\60\3\2\2\2\u00d4\u00d5\7R\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7"+
		"w\2\2\u00d7\u00d8\7u\2\2\u00d8\62\3\2\2\2\u00d9\u00da\7V\2\2\u00da\u00db"+
		"\7k\2\2\u00db\u00dc\7o\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7u\2\2\u00de"+
		"\64\3\2\2\2\u00df\u00e0\7O\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7p\2\2\u00e2"+
		"\u00e3\7w\2\2\u00e3\u00e4\7u\2\2\u00e4\66\3\2\2\2\u00e5\u00e6\7F\2\2\u00e6"+
		"\u00e7\7k\2\2\u00e7\u00e8\7x\2\2\u00e88\3\2\2\2\u00e9\u00ea\7C\2\2\u00ea"+
		"\u00eb\7p\2\2\u00eb\u00ec\7f\2\2\u00ec:\3\2\2\2\u00ed\u00ee\7Q\2\2\u00ee"+
		"\u00ef\7t\2\2\u00ef<\3\2\2\2\u00f0\u00f1\7Z\2\2\u00f1\u00f2\7q\2\2\u00f2"+
		"\u00f3\7t\2\2\u00f3>\3\2\2\2\u00f4\u00f8\t\2\2\2\u00f5\u00f7\t\3\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9@\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u0104\7\62\2\2\u00fc\u0100"+
		"\t\4\2\2\u00fd\u00ff\t\5\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0103\u00fb\3\2\2\2\u0103\u00fc\3\2\2\2\u0104B\3\2\2\2\u0105\u0107"+
		"\t\6\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\b\"\2\2\u010bD\3\2\2\2"+
		"\7\2\u00f8\u0100\u0103\u0108\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}