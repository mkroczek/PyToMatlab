// Generated from PyGrammarLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PyGrammarLexer extends PyGrammarLexerBase {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, STRING=3, NUMBER=4, INTEGER=5, FLOAT=6, DEF=7, RETURN=8, 
		RAISE=9, FROM=10, IMPORT=11, AS=12, GLOBAL=13, NONLOCAL=14, ASSERT=15, 
		IF=16, ELIF=17, ELSE=18, WHILE=19, FOR=20, IN=21, TRY=22, FINALLY=23, 
		WITH=24, EXCEPT=25, LAMBDA=26, OR=27, AND=28, NOT=29, IS=30, NONE=31, 
		TRUE=32, FALSE=33, CLASS=34, YIELD=35, DEL=36, PASS=37, CONTINUE=38, BREAK=39, 
		ASYNC=40, AWAIT=41, IDENTIFIER=42, NEWLINE=43, COMMENT=44, SKIP_=45, OPEN_PAREN=46, 
		CLOSE_PAREN=47, OPEN_BRACK=48, CLOSE_BRACK=49, OPEN_BRACE=50, CLOSE_BRACE=51, 
		DOT=52, ELLIPSIS=53, STAR=54, COMMA=55, COLON=56, SEMI_COLON=57, POWER=58, 
		ASSIGN=59, OR_OP=60, XOR=61, AND_OP=62, LEFT_SHIFT=63, RIGHT_SHIFT=64, 
		ADD=65, MINUS=66, DIV=67, MOD=68, IDIV=69, NOT_OP=70, LESS_THAN=71, GREATER_THAN=72, 
		EQUALS=73, GT_EQ=74, LT_EQ=75, NOT_EQ_1=76, NOT_EQ_2=77, AT=78, ARROW=79, 
		ADD_ASSIGN=80, SUB_ASSIGN=81, MULT_ASSIGN=82, AT_ASSIGN=83, DIV_ASSIGN=84, 
		MOD_ASSIGN=85, AND_ASSIGN=86, OR_ASSIGN=87, XOR_ASSIGN=88, LEFT_SHIFT_ASSIGN=89, 
		RIGHT_SHIFT_ASSIGN=90, POWER_ASSIGN=91, IDIV_ASSIGN=92;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STRING", "NUMBER", "INTEGER", "FLOAT", "DEF", "RETURN", "RAISE", "FROM", 
			"IMPORT", "AS", "GLOBAL", "NONLOCAL", "ASSERT", "IF", "ELIF", "ELSE", 
			"WHILE", "FOR", "IN", "TRY", "FINALLY", "WITH", "EXCEPT", "LAMBDA", "OR", 
			"AND", "NOT", "IS", "NONE", "TRUE", "FALSE", "CLASS", "YIELD", "DEL", 
			"PASS", "CONTINUE", "BREAK", "ASYNC", "AWAIT", "IDENTIFIER", "NEWLINE", 
			"COMMENT", "SKIP_", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACK", "CLOSE_BRACK", 
			"OPEN_BRACE", "CLOSE_BRACE", "DOT", "ELLIPSIS", "STAR", "COMMA", "COLON", 
			"SEMI_COLON", "POWER", "ASSIGN", "OR_OP", "XOR", "AND_OP", "LEFT_SHIFT", 
			"RIGHT_SHIFT", "ADD", "MINUS", "DIV", "MOD", "IDIV", "NOT_OP", "LESS_THAN", 
			"GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "AT", 
			"ARROW", "ADD_ASSIGN", "SUB_ASSIGN", "MULT_ASSIGN", "AT_ASSIGN", "DIV_ASSIGN", 
			"MOD_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", 
			"RIGHT_SHIFT_ASSIGN", "POWER_ASSIGN", "IDIV_ASSIGN", "NON_ZERO_DIGIT", 
			"DIGIT", "FRACTION", "ID_START", "ID_CONTINUE", "SPACES"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'def'", "'return'", "'raise'", 
			"'from'", "'import'", "'as'", "'global'", "'nonlocal'", "'assert'", "'if'", 
			"'elif'", "'else'", "'while'", "'for'", "'in'", "'try'", "'finally'", 
			"'with'", "'except'", "'lambda'", "'or'", "'and'", "'not'", "'is'", "'None'", 
			"'True'", "'False'", "'class'", "'yield'", "'del'", "'pass'", "'continue'", 
			"'break'", "'async'", "'await'", null, null, null, null, "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'.'", "'...'", "'*'", "','", "':'", "';'", 
			"'**'", "'='", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'+'", "'-'", "'/'", 
			"'%'", "'//'", "'~'", "'<'", "'>'", "'=='", "'>='", "'<='", "'<>'", "'!='", 
			"'@'", "'->'", "'+='", "'-='", "'*='", "'@='", "'/='", "'%='", "'&='", 
			"'|='", "'^='", "'<<='", "'>>='", "'**='", "'//='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "STRING", "NUMBER", "INTEGER", "FLOAT", "DEF", 
			"RETURN", "RAISE", "FROM", "IMPORT", "AS", "GLOBAL", "NONLOCAL", "ASSERT", 
			"IF", "ELIF", "ELSE", "WHILE", "FOR", "IN", "TRY", "FINALLY", "WITH", 
			"EXCEPT", "LAMBDA", "OR", "AND", "NOT", "IS", "NONE", "TRUE", "FALSE", 
			"CLASS", "YIELD", "DEL", "PASS", "CONTINUE", "BREAK", "ASYNC", "AWAIT", 
			"IDENTIFIER", "NEWLINE", "COMMENT", "SKIP_", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACK", "CLOSE_BRACK", "OPEN_BRACE", "CLOSE_BRACE", "DOT", "ELLIPSIS", 
			"STAR", "COMMA", "COLON", "SEMI_COLON", "POWER", "ASSIGN", "OR_OP", "XOR", 
			"AND_OP", "LEFT_SHIFT", "RIGHT_SHIFT", "ADD", "MINUS", "DIV", "MOD", 
			"IDIV", "NOT_OP", "LESS_THAN", "GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", 
			"NOT_EQ_1", "NOT_EQ_2", "AT", "ARROW", "ADD_ASSIGN", "SUB_ASSIGN", "MULT_ASSIGN", 
			"AT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "POWER_ASSIGN", "IDIV_ASSIGN"
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


	public PyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PyGrammarLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 39:
			IDENTIFIER_action((RuleContext)_localctx, actionIndex);
			break;
		case 40:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void IDENTIFIER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("Identifier");
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			this.onNewLine();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2^\u0253\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\3\2\3\2\7\2\u00c6\n\2\f\2\16\2\u00c9\13\2\3\2\3\2\3\3\3\3\5"+
		"\3\u00cf\n\3\3\4\3\4\7\4\u00d3\n\4\f\4\16\4\u00d6\13\4\3\4\6\4\u00d9\n"+
		"\4\r\4\16\4\u00da\5\4\u00dd\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\3)\3)\7)\u01a3\n)\f)\16)\u01a6\13)\3)\3)\3*\5*"+
		"\u01ab\n*\3*\3*\5*\u01af\n*\3*\5*\u01b2\n*\3*\3*\3+\3+\7+\u01b8\n+\f+"+
		"\16+\u01bb\13+\3,\3,\5,\u01bf\n,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\38\38\39\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3"+
		"A\3A\3B\3B\3C\3C\3D\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3"+
		"J\3K\3K\3K\3L\3L\3L\3M\3M\3N\3N\3N\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3R\3R\3"+
		"R\3S\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W\3W\3X\3X\3X\3X\3Y\3Y\3Y\3"+
		"Y\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3\\\3\\\3]\3]\3^\7^\u0243\n^\f^\16^\u0246\13"+
		"^\3_\5_\u0249\n_\3`\3`\5`\u024d\n`\3a\6a\u0250\na\ra\16a\u0251\3\u00c7"+
		"\2b\3\5\5\6\7\7\t\b\13\t\r\n\17\13\21\f\23\r\25\16\27\17\31\20\33\21\35"+
		"\22\37\23!\24#\25%\26\'\27)\30+\31-\32/\33\61\34\63\35\65\36\67\379 ;"+
		"!=\"?#A$C%E&G\'I(K)M*O+Q,S-U.W/Y\60[\61]\62_\63a\64c\65e\66g\67i8k9m:"+
		"o;q<s=u>w?y@{A}B\177C\u0081D\u0083E\u0085F\u0087G\u0089H\u008bI\u008d"+
		"J\u008fK\u0091L\u0093M\u0095N\u0097O\u0099P\u009bQ\u009dR\u009fS\u00a1"+
		"T\u00a3U\u00a5V\u00a7W\u00a9X\u00abY\u00adZ\u00af[\u00b1\\\u00b3]\u00b5"+
		"^\u00b7\2\u00b9\2\u00bb\2\u00bd\2\u00bf\2\u00c1\2\3\2\7\4\2\f\f\16\17"+
		"\3\2\63;\3\2\62;\5\2C\\aac|\4\2\13\13\"\"\2\u025a\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2"+
		"\2\2\u00b5\3\2\2\2\3\u00c3\3\2\2\2\5\u00ce\3\2\2\2\7\u00dc\3\2\2\2\t\u00de"+
		"\3\2\2\2\13\u00e2\3\2\2\2\r\u00e6\3\2\2\2\17\u00ed\3\2\2\2\21\u00f3\3"+
		"\2\2\2\23\u00f8\3\2\2\2\25\u00ff\3\2\2\2\27\u0102\3\2\2\2\31\u0109\3\2"+
		"\2\2\33\u0112\3\2\2\2\35\u0119\3\2\2\2\37\u011c\3\2\2\2!\u0121\3\2\2\2"+
		"#\u0126\3\2\2\2%\u012c\3\2\2\2\'\u0130\3\2\2\2)\u0133\3\2\2\2+\u0137\3"+
		"\2\2\2-\u013f\3\2\2\2/\u0144\3\2\2\2\61\u014b\3\2\2\2\63\u0152\3\2\2\2"+
		"\65\u0155\3\2\2\2\67\u0159\3\2\2\29\u015d\3\2\2\2;\u0160\3\2\2\2=\u0165"+
		"\3\2\2\2?\u016a\3\2\2\2A\u0170\3\2\2\2C\u0176\3\2\2\2E\u017c\3\2\2\2G"+
		"\u0180\3\2\2\2I\u0185\3\2\2\2K\u018e\3\2\2\2M\u0194\3\2\2\2O\u019a\3\2"+
		"\2\2Q\u01a0\3\2\2\2S\u01ae\3\2\2\2U\u01b5\3\2\2\2W\u01be\3\2\2\2Y\u01c2"+
		"\3\2\2\2[\u01c4\3\2\2\2]\u01c6\3\2\2\2_\u01c8\3\2\2\2a\u01ca\3\2\2\2c"+
		"\u01cc\3\2\2\2e\u01ce\3\2\2\2g\u01d0\3\2\2\2i\u01d4\3\2\2\2k\u01d6\3\2"+
		"\2\2m\u01d8\3\2\2\2o\u01da\3\2\2\2q\u01dc\3\2\2\2s\u01df\3\2\2\2u\u01e1"+
		"\3\2\2\2w\u01e3\3\2\2\2y\u01e5\3\2\2\2{\u01e7\3\2\2\2}\u01ea\3\2\2\2\177"+
		"\u01ed\3\2\2\2\u0081\u01ef\3\2\2\2\u0083\u01f1\3\2\2\2\u0085\u01f3\3\2"+
		"\2\2\u0087\u01f5\3\2\2\2\u0089\u01f8\3\2\2\2\u008b\u01fa\3\2\2\2\u008d"+
		"\u01fc\3\2\2\2\u008f\u01fe\3\2\2\2\u0091\u0201\3\2\2\2\u0093\u0204\3\2"+
		"\2\2\u0095\u0207\3\2\2\2\u0097\u020a\3\2\2\2\u0099\u020d\3\2\2\2\u009b"+
		"\u020f\3\2\2\2\u009d\u0212\3\2\2\2\u009f\u0215\3\2\2\2\u00a1\u0218\3\2"+
		"\2\2\u00a3\u021b\3\2\2\2\u00a5\u021e\3\2\2\2\u00a7\u0221\3\2\2\2\u00a9"+
		"\u0224\3\2\2\2\u00ab\u0227\3\2\2\2\u00ad\u022a\3\2\2\2\u00af\u022d\3\2"+
		"\2\2\u00b1\u0231\3\2\2\2\u00b3\u0235\3\2\2\2\u00b5\u0239\3\2\2\2\u00b7"+
		"\u023d\3\2\2\2\u00b9\u023f\3\2\2\2\u00bb\u0244\3\2\2\2\u00bd\u0248\3\2"+
		"\2\2\u00bf\u024c\3\2\2\2\u00c1\u024f\3\2\2\2\u00c3\u00c7\7$\2\2\u00c4"+
		"\u00c6\13\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c8\3"+
		"\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cb\7$\2\2\u00cb\4\3\2\2\2\u00cc\u00cf\5\7\4\2\u00cd\u00cf\5\t\5\2"+
		"\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\6\3\2\2\2\u00d0\u00d4\5"+
		"\u00b7\\\2\u00d1\u00d3\5\u00b9]\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00dd\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00d9\7\62\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3"+
		"\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00d0\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd\b\3\2\2\2\u00de\u00df\5\7\4\2"+
		"\u00df\u00e0\7\60\2\2\u00e0\u00e1\5\u00bb^\2\u00e1\n\3\2\2\2\u00e2\u00e3"+
		"\7f\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7h\2\2\u00e5\f\3\2\2\2\u00e6\u00e7"+
		"\7t\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7w\2\2\u00ea"+
		"\u00eb\7t\2\2\u00eb\u00ec\7p\2\2\u00ec\16\3\2\2\2\u00ed\u00ee\7t\2\2\u00ee"+
		"\u00ef\7c\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7g\2\2"+
		"\u00f2\20\3\2\2\2\u00f3\u00f4\7h\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7"+
		"q\2\2\u00f6\u00f7\7o\2\2\u00f7\22\3\2\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa"+
		"\7o\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7t\2\2\u00fd"+
		"\u00fe\7v\2\2\u00fe\24\3\2\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7u\2\2\u0101"+
		"\26\3\2\2\2\u0102\u0103\7i\2\2\u0103\u0104\7n\2\2\u0104\u0105\7q\2\2\u0105"+
		"\u0106\7d\2\2\u0106\u0107\7c\2\2\u0107\u0108\7n\2\2\u0108\30\3\2\2\2\u0109"+
		"\u010a\7p\2\2\u010a\u010b\7q\2\2\u010b\u010c\7p\2\2\u010c\u010d\7n\2\2"+
		"\u010d\u010e\7q\2\2\u010e\u010f\7e\2\2\u010f\u0110\7c\2\2\u0110\u0111"+
		"\7n\2\2\u0111\32\3\2\2\2\u0112\u0113\7c\2\2\u0113\u0114\7u\2\2\u0114\u0115"+
		"\7u\2\2\u0115\u0116\7g\2\2\u0116\u0117\7t\2\2\u0117\u0118\7v\2\2\u0118"+
		"\34\3\2\2\2\u0119\u011a\7k\2\2\u011a\u011b\7h\2\2\u011b\36\3\2\2\2\u011c"+
		"\u011d\7g\2\2\u011d\u011e\7n\2\2\u011e\u011f\7k\2\2\u011f\u0120\7h\2\2"+
		"\u0120 \3\2\2\2\u0121\u0122\7g\2\2\u0122\u0123\7n\2\2\u0123\u0124\7u\2"+
		"\2\u0124\u0125\7g\2\2\u0125\"\3\2\2\2\u0126\u0127\7y\2\2\u0127\u0128\7"+
		"j\2\2\u0128\u0129\7k\2\2\u0129\u012a\7n\2\2\u012a\u012b\7g\2\2\u012b$"+
		"\3\2\2\2\u012c\u012d\7h\2\2\u012d\u012e\7q\2\2\u012e\u012f\7t\2\2\u012f"+
		"&\3\2\2\2\u0130\u0131\7k\2\2\u0131\u0132\7p\2\2\u0132(\3\2\2\2\u0133\u0134"+
		"\7v\2\2\u0134\u0135\7t\2\2\u0135\u0136\7{\2\2\u0136*\3\2\2\2\u0137\u0138"+
		"\7h\2\2\u0138\u0139\7k\2\2\u0139\u013a\7p\2\2\u013a\u013b\7c\2\2\u013b"+
		"\u013c\7n\2\2\u013c\u013d\7n\2\2\u013d\u013e\7{\2\2\u013e,\3\2\2\2\u013f"+
		"\u0140\7y\2\2\u0140\u0141\7k\2\2\u0141\u0142\7v\2\2\u0142\u0143\7j\2\2"+
		"\u0143.\3\2\2\2\u0144\u0145\7g\2\2\u0145\u0146\7z\2\2\u0146\u0147\7e\2"+
		"\2\u0147\u0148\7g\2\2\u0148\u0149\7r\2\2\u0149\u014a\7v\2\2\u014a\60\3"+
		"\2\2\2\u014b\u014c\7n\2\2\u014c\u014d\7c\2\2\u014d\u014e\7o\2\2\u014e"+
		"\u014f\7d\2\2\u014f\u0150\7f\2\2\u0150\u0151\7c\2\2\u0151\62\3\2\2\2\u0152"+
		"\u0153\7q\2\2\u0153\u0154\7t\2\2\u0154\64\3\2\2\2\u0155\u0156\7c\2\2\u0156"+
		"\u0157\7p\2\2\u0157\u0158\7f\2\2\u0158\66\3\2\2\2\u0159\u015a\7p\2\2\u015a"+
		"\u015b\7q\2\2\u015b\u015c\7v\2\2\u015c8\3\2\2\2\u015d\u015e\7k\2\2\u015e"+
		"\u015f\7u\2\2\u015f:\3\2\2\2\u0160\u0161\7P\2\2\u0161\u0162\7q\2\2\u0162"+
		"\u0163\7p\2\2\u0163\u0164\7g\2\2\u0164<\3\2\2\2\u0165\u0166\7V\2\2\u0166"+
		"\u0167\7t\2\2\u0167\u0168\7w\2\2\u0168\u0169\7g\2\2\u0169>\3\2\2\2\u016a"+
		"\u016b\7H\2\2\u016b\u016c\7c\2\2\u016c\u016d\7n\2\2\u016d\u016e\7u\2\2"+
		"\u016e\u016f\7g\2\2\u016f@\3\2\2\2\u0170\u0171\7e\2\2\u0171\u0172\7n\2"+
		"\2\u0172\u0173\7c\2\2\u0173\u0174\7u\2\2\u0174\u0175\7u\2\2\u0175B\3\2"+
		"\2\2\u0176\u0177\7{\2\2\u0177\u0178\7k\2\2\u0178\u0179\7g\2\2\u0179\u017a"+
		"\7n\2\2\u017a\u017b\7f\2\2\u017bD\3\2\2\2\u017c\u017d\7f\2\2\u017d\u017e"+
		"\7g\2\2\u017e\u017f\7n\2\2\u017fF\3\2\2\2\u0180\u0181\7r\2\2\u0181\u0182"+
		"\7c\2\2\u0182\u0183\7u\2\2\u0183\u0184\7u\2\2\u0184H\3\2\2\2\u0185\u0186"+
		"\7e\2\2\u0186\u0187\7q\2\2\u0187\u0188\7p\2\2\u0188\u0189\7v\2\2\u0189"+
		"\u018a\7k\2\2\u018a\u018b\7p\2\2\u018b\u018c\7w\2\2\u018c\u018d\7g\2\2"+
		"\u018dJ\3\2\2\2\u018e\u018f\7d\2\2\u018f\u0190\7t\2\2\u0190\u0191\7g\2"+
		"\2\u0191\u0192\7c\2\2\u0192\u0193\7m\2\2\u0193L\3\2\2\2\u0194\u0195\7"+
		"c\2\2\u0195\u0196\7u\2\2\u0196\u0197\7{\2\2\u0197\u0198\7p\2\2\u0198\u0199"+
		"\7e\2\2\u0199N\3\2\2\2\u019a\u019b\7c\2\2\u019b\u019c\7y\2\2\u019c\u019d"+
		"\7c\2\2\u019d\u019e\7k\2\2\u019e\u019f\7v\2\2\u019fP\3\2\2\2\u01a0\u01a4"+
		"\5\u00bd_\2\u01a1\u01a3\5\u00bf`\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2"+
		"\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a7\u01a8\b)\2\2\u01a8R\3\2\2\2\u01a9\u01ab\7\17\2\2"+
		"\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01af"+
		"\7\f\2\2\u01ad\u01af\4\16\17\2\u01ae\u01aa\3\2\2\2\u01ae\u01ad\3\2\2\2"+
		"\u01af\u01b1\3\2\2\2\u01b0\u01b2\5\u00c1a\2\u01b1\u01b0\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\b*\3\2\u01b4T\3\2\2\2\u01b5"+
		"\u01b9\7%\2\2\u01b6\u01b8\n\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2"+
		"\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01baV\3\2\2\2\u01bb\u01b9"+
		"\3\2\2\2\u01bc\u01bf\5\u00c1a\2\u01bd\u01bf\5U+\2\u01be\u01bc\3\2\2\2"+
		"\u01be\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\b,\4\2\u01c1X\3\2"+
		"\2\2\u01c2\u01c3\7*\2\2\u01c3Z\3\2\2\2\u01c4\u01c5\7+\2\2\u01c5\\\3\2"+
		"\2\2\u01c6\u01c7\7]\2\2\u01c7^\3\2\2\2\u01c8\u01c9\7_\2\2\u01c9`\3\2\2"+
		"\2\u01ca\u01cb\7}\2\2\u01cbb\3\2\2\2\u01cc\u01cd\7\177\2\2\u01cdd\3\2"+
		"\2\2\u01ce\u01cf\7\60\2\2\u01cff\3\2\2\2\u01d0\u01d1\7\60\2\2\u01d1\u01d2"+
		"\7\60\2\2\u01d2\u01d3\7\60\2\2\u01d3h\3\2\2\2\u01d4\u01d5\7,\2\2\u01d5"+
		"j\3\2\2\2\u01d6\u01d7\7.\2\2\u01d7l\3\2\2\2\u01d8\u01d9\7<\2\2\u01d9n"+
		"\3\2\2\2\u01da\u01db\7=\2\2\u01dbp\3\2\2\2\u01dc\u01dd\7,\2\2\u01dd\u01de"+
		"\7,\2\2\u01der\3\2\2\2\u01df\u01e0\7?\2\2\u01e0t\3\2\2\2\u01e1\u01e2\7"+
		"~\2\2\u01e2v\3\2\2\2\u01e3\u01e4\7`\2\2\u01e4x\3\2\2\2\u01e5\u01e6\7("+
		"\2\2\u01e6z\3\2\2\2\u01e7\u01e8\7>\2\2\u01e8\u01e9\7>\2\2\u01e9|\3\2\2"+
		"\2\u01ea\u01eb\7@\2\2\u01eb\u01ec\7@\2\2\u01ec~\3\2\2\2\u01ed\u01ee\7"+
		"-\2\2\u01ee\u0080\3\2\2\2\u01ef\u01f0\7/\2\2\u01f0\u0082\3\2\2\2\u01f1"+
		"\u01f2\7\61\2\2\u01f2\u0084\3\2\2\2\u01f3\u01f4\7\'\2\2\u01f4\u0086\3"+
		"\2\2\2\u01f5\u01f6\7\61\2\2\u01f6\u01f7\7\61\2\2\u01f7\u0088\3\2\2\2\u01f8"+
		"\u01f9\7\u0080\2\2\u01f9\u008a\3\2\2\2\u01fa\u01fb\7>\2\2\u01fb\u008c"+
		"\3\2\2\2\u01fc\u01fd\7@\2\2\u01fd\u008e\3\2\2\2\u01fe\u01ff\7?\2\2\u01ff"+
		"\u0200\7?\2\2\u0200\u0090\3\2\2\2\u0201\u0202\7@\2\2\u0202\u0203\7?\2"+
		"\2\u0203\u0092\3\2\2\2\u0204\u0205\7>\2\2\u0205\u0206\7?\2\2\u0206\u0094"+
		"\3\2\2\2\u0207\u0208\7>\2\2\u0208\u0209\7@\2\2\u0209\u0096\3\2\2\2\u020a"+
		"\u020b\7#\2\2\u020b\u020c\7?\2\2\u020c\u0098\3\2\2\2\u020d\u020e\7B\2"+
		"\2\u020e\u009a\3\2\2\2\u020f\u0210\7/\2\2\u0210\u0211\7@\2\2\u0211\u009c"+
		"\3\2\2\2\u0212\u0213\7-\2\2\u0213\u0214\7?\2\2\u0214\u009e\3\2\2\2\u0215"+
		"\u0216\7/\2\2\u0216\u0217\7?\2\2\u0217\u00a0\3\2\2\2\u0218\u0219\7,\2"+
		"\2\u0219\u021a\7?\2\2\u021a\u00a2\3\2\2\2\u021b\u021c\7B\2\2\u021c\u021d"+
		"\7?\2\2\u021d\u00a4\3\2\2\2\u021e\u021f\7\61\2\2\u021f\u0220\7?\2\2\u0220"+
		"\u00a6\3\2\2\2\u0221\u0222\7\'\2\2\u0222\u0223\7?\2\2\u0223\u00a8\3\2"+
		"\2\2\u0224\u0225\7(\2\2\u0225\u0226\7?\2\2\u0226\u00aa\3\2\2\2\u0227\u0228"+
		"\7~\2\2\u0228\u0229\7?\2\2\u0229\u00ac\3\2\2\2\u022a\u022b\7`\2\2\u022b"+
		"\u022c\7?\2\2\u022c\u00ae\3\2\2\2\u022d\u022e\7>\2\2\u022e\u022f\7>\2"+
		"\2\u022f\u0230\7?\2\2\u0230\u00b0\3\2\2\2\u0231\u0232\7@\2\2\u0232\u0233"+
		"\7@\2\2\u0233\u0234\7?\2\2\u0234\u00b2\3\2\2\2\u0235\u0236\7,\2\2\u0236"+
		"\u0237\7,\2\2\u0237\u0238\7?\2\2\u0238\u00b4\3\2\2\2\u0239\u023a\7\61"+
		"\2\2\u023a\u023b\7\61\2\2\u023b\u023c\7?\2\2\u023c\u00b6\3\2\2\2\u023d"+
		"\u023e\t\3\2\2\u023e\u00b8\3\2\2\2\u023f\u0240\t\4\2\2\u0240\u00ba\3\2"+
		"\2\2\u0241\u0243\5\u00b9]\2\u0242\u0241\3\2\2\2\u0243\u0246\3\2\2\2\u0244"+
		"\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u00bc\3\2\2\2\u0246\u0244\3\2"+
		"\2\2\u0247\u0249\t\5\2\2\u0248\u0247\3\2\2\2\u0249\u00be\3\2\2\2\u024a"+
		"\u024d\5\u00bd_\2\u024b\u024d\5\u00b9]\2\u024c\u024a\3\2\2\2\u024c\u024b"+
		"\3\2\2\2\u024d\u00c0\3\2\2\2\u024e\u0250\t\6\2\2\u024f\u024e\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u00c2\3\2"+
		"\2\2\22\2\u00c7\u00ce\u00d4\u00da\u00dc\u01a4\u01aa\u01ae\u01b1\u01b9"+
		"\u01be\u0244\u0248\u024c\u0251\5\3)\2\3*\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}