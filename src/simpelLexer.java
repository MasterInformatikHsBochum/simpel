// Generated from simpel.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simpelLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		VARIABLE=10, OPTION=11, BREAK=12, COLON=13, IF=14, NUM=15, OPERATOR=16, 
		WS=17, STRING=18, COMMENT=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"VARIABLE", "OPTION", "BREAK", "COLON", "IF", "NUM", "OPERATOR", "WS", 
		"STRING", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'func '", "'('", "')'", "'$'", "'\"'", "'in->'", "'out<-'", "'while('", 
		"'):'", null, "'|'", "';'", "':'", "'if '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "VARIABLE", 
		"OPTION", "BREAK", "COLON", "IF", "NUM", "OPERATOR", "WS", "STRING", "COMMENT"
	};
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


	public simpelLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simpel.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u0098\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\7\13O\n\13\f\13\16\13R\13\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\7\20`\n\20\f\20\16"+
		"\20c\13\20\3\20\3\20\7\20g\n\20\f\20\16\20j\13\20\3\20\3\20\3\20\7\20"+
		"o\n\20\f\20\16\20r\13\20\5\20t\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0082\n\21\3\22\3\22\3\22\3\22\3\23\7\23"+
		"\u0089\n\23\f\23\16\23\u008c\13\23\3\24\3\24\7\24\u0090\n\24\f\24\16\24"+
		"\u0093\13\24\3\24\3\24\3\24\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\t\3"+
		"\2c|\5\2\62;C\\c|\3\2\62;\5\2,-//\61\61\4\2>>@@\5\2\13\f\17\17\"\"\6\2"+
		"\"\"\62;C\\c|\u00a4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5/\3\2\2\2"+
		"\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2\2\r\67\3\2\2\2\17<\3\2\2\2\21B"+
		"\3\2\2\2\23I\3\2\2\2\25L\3\2\2\2\27S\3\2\2\2\31U\3\2\2\2\33W\3\2\2\2\35"+
		"Y\3\2\2\2\37s\3\2\2\2!\u0081\3\2\2\2#\u0083\3\2\2\2%\u008a\3\2\2\2\'\u008d"+
		"\3\2\2\2)*\7h\2\2*+\7w\2\2+,\7p\2\2,-\7e\2\2-.\7\"\2\2.\4\3\2\2\2/\60"+
		"\7*\2\2\60\6\3\2\2\2\61\62\7+\2\2\62\b\3\2\2\2\63\64\7&\2\2\64\n\3\2\2"+
		"\2\65\66\7$\2\2\66\f\3\2\2\2\678\7k\2\289\7p\2\29:\7/\2\2:;\7@\2\2;\16"+
		"\3\2\2\2<=\7q\2\2=>\7w\2\2>?\7v\2\2?@\7>\2\2@A\7/\2\2A\20\3\2\2\2BC\7"+
		"y\2\2CD\7j\2\2DE\7k\2\2EF\7n\2\2FG\7g\2\2GH\7*\2\2H\22\3\2\2\2IJ\7+\2"+
		"\2JK\7<\2\2K\24\3\2\2\2LP\t\2\2\2MO\t\3\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2"+
		"\2\2PQ\3\2\2\2Q\26\3\2\2\2RP\3\2\2\2ST\7~\2\2T\30\3\2\2\2UV\7=\2\2V\32"+
		"\3\2\2\2WX\7<\2\2X\34\3\2\2\2YZ\7k\2\2Z[\7h\2\2[\\\7\"\2\2\\\36\3\2\2"+
		"\2]a\t\4\2\2^`\t\4\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bt\3\2\2"+
		"\2ca\3\2\2\2dh\t\4\2\2eg\t\4\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2"+
		"\2ik\3\2\2\2jh\3\2\2\2kl\7\60\2\2lp\t\4\2\2mo\t\4\2\2nm\3\2\2\2or\3\2"+
		"\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2\2s]\3\2\2\2sd\3\2\2\2t \3\2"+
		"\2\2u\u0082\t\5\2\2vw\7~\2\2w\u0082\7~\2\2xy\7(\2\2y\u0082\7(\2\2z{\7"+
		"?\2\2{\u0082\7?\2\2|}\7>\2\2}\u0082\7?\2\2~\177\7?\2\2\177\u0082\7@\2"+
		"\2\u0080\u0082\t\6\2\2\u0081u\3\2\2\2\u0081v\3\2\2\2\u0081x\3\2\2\2\u0081"+
		"z\3\2\2\2\u0081|\3\2\2\2\u0081~\3\2\2\2\u0081\u0080\3\2\2\2\u0082\"\3"+
		"\2\2\2\u0083\u0084\t\7\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\22\2\2\u0086"+
		"$\3\2\2\2\u0087\u0089\t\3\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2"+
		"\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b&\3\2\2\2\u008c\u008a\3"+
		"\2\2\2\u008d\u0091\7\'\2\2\u008e\u0090\t\b\2\2\u008f\u008e\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2"+
		"\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\'\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\b\24\2\2\u0097(\3\2\2\2\13\2Pahps\u0081\u008a\u0091\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}