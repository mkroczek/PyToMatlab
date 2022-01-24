// Generated from /home/marcin/Programming/Java/Projects/MIAK/PyToMatlab/src/PyGrammarLexer.g4 by ANTLR 4.9.2
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
		ASYNC=40, AWAIT=41, PRINT=42, LEN=43, IDENTIFIER=44, NEWLINE=45, COMMENT=46, 
		SKIP_=47, OPEN_PAREN=48, CLOSE_PAREN=49, OPEN_BRACK=50, CLOSE_BRACK=51, 
		OPEN_BRACE=52, CLOSE_BRACE=53, DOT=54, ELLIPSIS=55, STAR=56, COMMA=57, 
		COLON=58, SEMI_COLON=59, POWER=60, ASSIGN=61, OR_OP=62, XOR=63, AND_OP=64, 
		LEFT_SHIFT=65, RIGHT_SHIFT=66, ADD=67, MINUS=68, DIV=69, MOD=70, IDIV=71, 
		NOT_OP=72, LESS_THAN=73, GREATER_THAN=74, EQUALS=75, GT_EQ=76, LT_EQ=77, 
		NOT_EQ_1=78, NOT_EQ_2=79, AT=80, ARROW=81, ADD_ASSIGN=82, SUB_ASSIGN=83, 
		MULT_ASSIGN=84, AT_ASSIGN=85, DIV_ASSIGN=86, MOD_ASSIGN=87, AND_ASSIGN=88, 
		OR_ASSIGN=89, XOR_ASSIGN=90, LEFT_SHIFT_ASSIGN=91, RIGHT_SHIFT_ASSIGN=92, 
		POWER_ASSIGN=93, IDIV_ASSIGN=94;
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
			"PASS", "CONTINUE", "BREAK", "ASYNC", "AWAIT", "PRINT", "LEN", "IDENTIFIER", 
			"NEWLINE", "COMMENT", "SKIP_", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACK", 
			"CLOSE_BRACK", "OPEN_BRACE", "CLOSE_BRACE", "DOT", "ELLIPSIS", "STAR", 
			"COMMA", "COLON", "SEMI_COLON", "POWER", "ASSIGN", "OR_OP", "XOR", "AND_OP", 
			"LEFT_SHIFT", "RIGHT_SHIFT", "ADD", "MINUS", "DIV", "MOD", "IDIV", "NOT_OP", 
			"LESS_THAN", "GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ_1", 
			"NOT_EQ_2", "AT", "ARROW", "ADD_ASSIGN", "SUB_ASSIGN", "MULT_ASSIGN", 
			"AT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", "POWER_ASSIGN", "IDIV_ASSIGN", 
			"NON_ZERO_DIGIT", "DIGIT", "FRACTION", "ID_START", "ID_CONTINUE", "SPACES"
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
			"'break'", "'async'", "'await'", "'print'", "'len'", null, null, null, 
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", "'...'", "'*'", 
			"','", "':'", "';'", "'**'", "'='", "'|'", "'^'", "'&'", "'<<'", "'>>'", 
			"'+'", "'-'", "'/'", "'%'", "'//'", "'~'", "'<'", "'>'", "'=='", "'>='", 
			"'<='", "'<>'", "'!='", "'@'", "'->'", "'+='", "'-='", "'*='", "'@='", 
			"'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'**='", "'//='"
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
			"PRINT", "LEN", "IDENTIFIER", "NEWLINE", "COMMENT", "SKIP_", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_BRACK", "CLOSE_BRACK", "OPEN_BRACE", "CLOSE_BRACE", 
			"DOT", "ELLIPSIS", "STAR", "COMMA", "COLON", "SEMI_COLON", "POWER", "ASSIGN", 
			"OR_OP", "XOR", "AND_OP", "LEFT_SHIFT", "RIGHT_SHIFT", "ADD", "MINUS", 
			"DIV", "MOD", "IDIV", "NOT_OP", "LESS_THAN", "GREATER_THAN", "EQUALS", 
			"GT_EQ", "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "AT", "ARROW", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MULT_ASSIGN", "AT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", 
			"POWER_ASSIGN", "IDIV_ASSIGN"
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
		case 42:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			this.onNewLine();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2`\u0268\b\1\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\3\2\7\2\u00ca\n\2\f\2\16\2\u00cd\13\2\3\2\3"+
		"\2\3\2\7\2\u00d2\n\2\f\2\16\2\u00d5\13\2\3\2\5\2\u00d8\n\2\3\3\3\3\5\3"+
		"\u00dc\n\3\3\4\3\4\7\4\u00e0\n\4\f\4\16\4\u00e3\13\4\3\4\6\4\u00e6\n\4"+
		"\r\4\16\4\u00e7\5\4\u00ea\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\7+\u01ba\n+\f+"+
		"\16+\u01bd\13+\3,\5,\u01c0\n,\3,\3,\5,\u01c4\n,\3,\5,\u01c7\n,\3,\3,\3"+
		"-\3-\7-\u01cd\n-\f-\16-\u01d0\13-\3.\3.\5.\u01d4\n.\3.\3.\3/\3/\3\60\3"+
		"\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3"+
		"@\3@\3A\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3F\3G\3G\3H\3H\3I\3I\3J\3"+
		"J\3J\3K\3K\3K\3L\3L\3L\3M\3M\3M\3N\3N\3N\3O\3O\3P\3P\3P\3Q\3Q\3Q\3R\3"+
		"R\3R\3S\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W\3W\3X\3X\3X\3Y\3Y\3Y\3"+
		"Z\3Z\3Z\3Z\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3^\3^\3_\3_\3`\7`\u0258"+
		"\n`\f`\16`\u025b\13`\3a\5a\u025e\na\3b\3b\5b\u0262\nb\3c\6c\u0265\nc\r"+
		"c\16c\u0266\4\u00cb\u00d3\2d\3\5\5\6\7\7\t\b\13\t\r\n\17\13\21\f\23\r"+
		"\25\16\27\17\31\20\33\21\35\22\37\23!\24#\25%\26\'\27)\30+\31-\32/\33"+
		"\61\34\63\35\65\36\67\379 ;!=\"?#A$C%E&G\'I(K)M*O+Q,S-U.W/Y\60[\61]\62"+
		"_\63a\64c\65e\66g\67i8k9m:o;q<s=u>w?y@{A}B\177C\u0081D\u0083E\u0085F\u0087"+
		"G\u0089H\u008bI\u008dJ\u008fK\u0091L\u0093M\u0095N\u0097O\u0099P\u009b"+
		"Q\u009dR\u009fS\u00a1T\u00a3U\u00a5V\u00a7W\u00a9X\u00abY\u00adZ\u00af"+
		"[\u00b1\\\u00b3]\u00b5^\u00b7_\u00b9`\u00bb\2\u00bd\2\u00bf\2\u00c1\2"+
		"\u00c3\2\u00c5\2\3\2\7\4\2\f\f\16\17\3\2\63;\3\2\62;\5\2C\\aac|\4\2\13"+
		"\13\"\"\2\u0271\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9"+
		"\3\2\2\2\3\u00d7\3\2\2\2\5\u00db\3\2\2\2\7\u00e9\3\2\2\2\t\u00eb\3\2\2"+
		"\2\13\u00ef\3\2\2\2\r\u00f3\3\2\2\2\17\u00fa\3\2\2\2\21\u0100\3\2\2\2"+
		"\23\u0105\3\2\2\2\25\u010c\3\2\2\2\27\u010f\3\2\2\2\31\u0116\3\2\2\2\33"+
		"\u011f\3\2\2\2\35\u0126\3\2\2\2\37\u0129\3\2\2\2!\u012e\3\2\2\2#\u0133"+
		"\3\2\2\2%\u0139\3\2\2\2\'\u013d\3\2\2\2)\u0140\3\2\2\2+\u0144\3\2\2\2"+
		"-\u014c\3\2\2\2/\u0151\3\2\2\2\61\u0158\3\2\2\2\63\u015f\3\2\2\2\65\u0162"+
		"\3\2\2\2\67\u0166\3\2\2\29\u016a\3\2\2\2;\u016d\3\2\2\2=\u0172\3\2\2\2"+
		"?\u0177\3\2\2\2A\u017d\3\2\2\2C\u0183\3\2\2\2E\u0189\3\2\2\2G\u018d\3"+
		"\2\2\2I\u0192\3\2\2\2K\u019b\3\2\2\2M\u01a1\3\2\2\2O\u01a7\3\2\2\2Q\u01ad"+
		"\3\2\2\2S\u01b3\3\2\2\2U\u01b7\3\2\2\2W\u01c3\3\2\2\2Y\u01ca\3\2\2\2["+
		"\u01d3\3\2\2\2]\u01d7\3\2\2\2_\u01d9\3\2\2\2a\u01db\3\2\2\2c\u01dd\3\2"+
		"\2\2e\u01df\3\2\2\2g\u01e1\3\2\2\2i\u01e3\3\2\2\2k\u01e5\3\2\2\2m\u01e9"+
		"\3\2\2\2o\u01eb\3\2\2\2q\u01ed\3\2\2\2s\u01ef\3\2\2\2u\u01f1\3\2\2\2w"+
		"\u01f4\3\2\2\2y\u01f6\3\2\2\2{\u01f8\3\2\2\2}\u01fa\3\2\2\2\177\u01fc"+
		"\3\2\2\2\u0081\u01ff\3\2\2\2\u0083\u0202\3\2\2\2\u0085\u0204\3\2\2\2\u0087"+
		"\u0206\3\2\2\2\u0089\u0208\3\2\2\2\u008b\u020a\3\2\2\2\u008d\u020d\3\2"+
		"\2\2\u008f\u020f\3\2\2\2\u0091\u0211\3\2\2\2\u0093\u0213\3\2\2\2\u0095"+
		"\u0216\3\2\2\2\u0097\u0219\3\2\2\2\u0099\u021c\3\2\2\2\u009b\u021f\3\2"+
		"\2\2\u009d\u0222\3\2\2\2\u009f\u0224\3\2\2\2\u00a1\u0227\3\2\2\2\u00a3"+
		"\u022a\3\2\2\2\u00a5\u022d\3\2\2\2\u00a7\u0230\3\2\2\2\u00a9\u0233\3\2"+
		"\2\2\u00ab\u0236\3\2\2\2\u00ad\u0239\3\2\2\2\u00af\u023c\3\2\2\2\u00b1"+
		"\u023f\3\2\2\2\u00b3\u0242\3\2\2\2\u00b5\u0246\3\2\2\2\u00b7\u024a\3\2"+
		"\2\2\u00b9\u024e\3\2\2\2\u00bb\u0252\3\2\2\2\u00bd\u0254\3\2\2\2\u00bf"+
		"\u0259\3\2\2\2\u00c1\u025d\3\2\2\2\u00c3\u0261\3\2\2\2\u00c5\u0264\3\2"+
		"\2\2\u00c7\u00cb\7$\2\2\u00c8\u00ca\13\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d8\7$\2\2\u00cf\u00d3\7)\2\2\u00d0\u00d2"+
		"\13\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d4\3\2\2\2"+
		"\u00d3\u00d1\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d8"+
		"\7)\2\2\u00d7\u00c7\3\2\2\2\u00d7\u00cf\3\2\2\2\u00d8\4\3\2\2\2\u00d9"+
		"\u00dc\5\7\4\2\u00da\u00dc\5\t\5\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2"+
		"\2\2\u00dc\6\3\2\2\2\u00dd\u00e1\5\u00bb^\2\u00de\u00e0\5\u00bd_\2\u00df"+
		"\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00ea\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\7\62\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00dd\3\2\2\2\u00e9\u00e5\3\2\2\2\u00ea"+
		"\b\3\2\2\2\u00eb\u00ec\5\7\4\2\u00ec\u00ed\7\60\2\2\u00ed\u00ee\5\u00bf"+
		"`\2\u00ee\n\3\2\2\2\u00ef\u00f0\7f\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2"+
		"\7h\2\2\u00f2\f\3\2\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6"+
		"\7v\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7p\2\2\u00f9"+
		"\16\3\2\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7k\2\2\u00fd"+
		"\u00fe\7u\2\2\u00fe\u00ff\7g\2\2\u00ff\20\3\2\2\2\u0100\u0101\7h\2\2\u0101"+
		"\u0102\7t\2\2\u0102\u0103\7q\2\2\u0103\u0104\7o\2\2\u0104\22\3\2\2\2\u0105"+
		"\u0106\7k\2\2\u0106\u0107\7o\2\2\u0107\u0108\7r\2\2\u0108\u0109\7q\2\2"+
		"\u0109\u010a\7t\2\2\u010a\u010b\7v\2\2\u010b\24\3\2\2\2\u010c\u010d\7"+
		"c\2\2\u010d\u010e\7u\2\2\u010e\26\3\2\2\2\u010f\u0110\7i\2\2\u0110\u0111"+
		"\7n\2\2\u0111\u0112\7q\2\2\u0112\u0113\7d\2\2\u0113\u0114\7c\2\2\u0114"+
		"\u0115\7n\2\2\u0115\30\3\2\2\2\u0116\u0117\7p\2\2\u0117\u0118\7q\2\2\u0118"+
		"\u0119\7p\2\2\u0119\u011a\7n\2\2\u011a\u011b\7q\2\2\u011b\u011c\7e\2\2"+
		"\u011c\u011d\7c\2\2\u011d\u011e\7n\2\2\u011e\32\3\2\2\2\u011f\u0120\7"+
		"c\2\2\u0120\u0121\7u\2\2\u0121\u0122\7u\2\2\u0122\u0123\7g\2\2\u0123\u0124"+
		"\7t\2\2\u0124\u0125\7v\2\2\u0125\34\3\2\2\2\u0126\u0127\7k\2\2\u0127\u0128"+
		"\7h\2\2\u0128\36\3\2\2\2\u0129\u012a\7g\2\2\u012a\u012b\7n\2\2\u012b\u012c"+
		"\7k\2\2\u012c\u012d\7h\2\2\u012d \3\2\2\2\u012e\u012f\7g\2\2\u012f\u0130"+
		"\7n\2\2\u0130\u0131\7u\2\2\u0131\u0132\7g\2\2\u0132\"\3\2\2\2\u0133\u0134"+
		"\7y\2\2\u0134\u0135\7j\2\2\u0135\u0136\7k\2\2\u0136\u0137\7n\2\2\u0137"+
		"\u0138\7g\2\2\u0138$\3\2\2\2\u0139\u013a\7h\2\2\u013a\u013b\7q\2\2\u013b"+
		"\u013c\7t\2\2\u013c&\3\2\2\2\u013d\u013e\7k\2\2\u013e\u013f\7p\2\2\u013f"+
		"(\3\2\2\2\u0140\u0141\7v\2\2\u0141\u0142\7t\2\2\u0142\u0143\7{\2\2\u0143"+
		"*\3\2\2\2\u0144\u0145\7h\2\2\u0145\u0146\7k\2\2\u0146\u0147\7p\2\2\u0147"+
		"\u0148\7c\2\2\u0148\u0149\7n\2\2\u0149\u014a\7n\2\2\u014a\u014b\7{\2\2"+
		"\u014b,\3\2\2\2\u014c\u014d\7y\2\2\u014d\u014e\7k\2\2\u014e\u014f\7v\2"+
		"\2\u014f\u0150\7j\2\2\u0150.\3\2\2\2\u0151\u0152\7g\2\2\u0152\u0153\7"+
		"z\2\2\u0153\u0154\7e\2\2\u0154\u0155\7g\2\2\u0155\u0156\7r\2\2\u0156\u0157"+
		"\7v\2\2\u0157\60\3\2\2\2\u0158\u0159\7n\2\2\u0159\u015a\7c\2\2\u015a\u015b"+
		"\7o\2\2\u015b\u015c\7d\2\2\u015c\u015d\7f\2\2\u015d\u015e\7c\2\2\u015e"+
		"\62\3\2\2\2\u015f\u0160\7q\2\2\u0160\u0161\7t\2\2\u0161\64\3\2\2\2\u0162"+
		"\u0163\7c\2\2\u0163\u0164\7p\2\2\u0164\u0165\7f\2\2\u0165\66\3\2\2\2\u0166"+
		"\u0167\7p\2\2\u0167\u0168\7q\2\2\u0168\u0169\7v\2\2\u01698\3\2\2\2\u016a"+
		"\u016b\7k\2\2\u016b\u016c\7u\2\2\u016c:\3\2\2\2\u016d\u016e\7P\2\2\u016e"+
		"\u016f\7q\2\2\u016f\u0170\7p\2\2\u0170\u0171\7g\2\2\u0171<\3\2\2\2\u0172"+
		"\u0173\7V\2\2\u0173\u0174\7t\2\2\u0174\u0175\7w\2\2\u0175\u0176\7g\2\2"+
		"\u0176>\3\2\2\2\u0177\u0178\7H\2\2\u0178\u0179\7c\2\2\u0179\u017a\7n\2"+
		"\2\u017a\u017b\7u\2\2\u017b\u017c\7g\2\2\u017c@\3\2\2\2\u017d\u017e\7"+
		"e\2\2\u017e\u017f\7n\2\2\u017f\u0180\7c\2\2\u0180\u0181\7u\2\2\u0181\u0182"+
		"\7u\2\2\u0182B\3\2\2\2\u0183\u0184\7{\2\2\u0184\u0185\7k\2\2\u0185\u0186"+
		"\7g\2\2\u0186\u0187\7n\2\2\u0187\u0188\7f\2\2\u0188D\3\2\2\2\u0189\u018a"+
		"\7f\2\2\u018a\u018b\7g\2\2\u018b\u018c\7n\2\2\u018cF\3\2\2\2\u018d\u018e"+
		"\7r\2\2\u018e\u018f\7c\2\2\u018f\u0190\7u\2\2\u0190\u0191\7u\2\2\u0191"+
		"H\3\2\2\2\u0192\u0193\7e\2\2\u0193\u0194\7q\2\2\u0194\u0195\7p\2\2\u0195"+
		"\u0196\7v\2\2\u0196\u0197\7k\2\2\u0197\u0198\7p\2\2\u0198\u0199\7w\2\2"+
		"\u0199\u019a\7g\2\2\u019aJ\3\2\2\2\u019b\u019c\7d\2\2\u019c\u019d\7t\2"+
		"\2\u019d\u019e\7g\2\2\u019e\u019f\7c\2\2\u019f\u01a0\7m\2\2\u01a0L\3\2"+
		"\2\2\u01a1\u01a2\7c\2\2\u01a2\u01a3\7u\2\2\u01a3\u01a4\7{\2\2\u01a4\u01a5"+
		"\7p\2\2\u01a5\u01a6\7e\2\2\u01a6N\3\2\2\2\u01a7\u01a8\7c\2\2\u01a8\u01a9"+
		"\7y\2\2\u01a9\u01aa\7c\2\2\u01aa\u01ab\7k\2\2\u01ab\u01ac\7v\2\2\u01ac"+
		"P\3\2\2\2\u01ad\u01ae\7r\2\2\u01ae\u01af\7t\2\2\u01af\u01b0\7k\2\2\u01b0"+
		"\u01b1\7p\2\2\u01b1\u01b2\7v\2\2\u01b2R\3\2\2\2\u01b3\u01b4\7n\2\2\u01b4"+
		"\u01b5\7g\2\2\u01b5\u01b6\7p\2\2\u01b6T\3\2\2\2\u01b7\u01bb\5\u00c1a\2"+
		"\u01b8\u01ba\5\u00c3b\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bcV\3\2\2\2\u01bd\u01bb\3\2\2\2"+
		"\u01be\u01c0\7\17\2\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1"+
		"\3\2\2\2\u01c1\u01c4\7\f\2\2\u01c2\u01c4\4\16\17\2\u01c3\u01bf\3\2\2\2"+
		"\u01c3\u01c2\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c7\5\u00c5c\2\u01c6"+
		"\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\b,"+
		"\2\2\u01c9X\3\2\2\2\u01ca\u01ce\7%\2\2\u01cb\u01cd\n\2\2\2\u01cc\u01cb"+
		"\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"Z\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d4\5\u00c5c\2\u01d2\u01d4\5Y-\2"+
		"\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6"+
		"\b.\3\2\u01d6\\\3\2\2\2\u01d7\u01d8\7*\2\2\u01d8^\3\2\2\2\u01d9\u01da"+
		"\7+\2\2\u01da`\3\2\2\2\u01db\u01dc\7]\2\2\u01dcb\3\2\2\2\u01dd\u01de\7"+
		"_\2\2\u01ded\3\2\2\2\u01df\u01e0\7}\2\2\u01e0f\3\2\2\2\u01e1\u01e2\7\177"+
		"\2\2\u01e2h\3\2\2\2\u01e3\u01e4\7\60\2\2\u01e4j\3\2\2\2\u01e5\u01e6\7"+
		"\60\2\2\u01e6\u01e7\7\60\2\2\u01e7\u01e8\7\60\2\2\u01e8l\3\2\2\2\u01e9"+
		"\u01ea\7,\2\2\u01ean\3\2\2\2\u01eb\u01ec\7.\2\2\u01ecp\3\2\2\2\u01ed\u01ee"+
		"\7<\2\2\u01eer\3\2\2\2\u01ef\u01f0\7=\2\2\u01f0t\3\2\2\2\u01f1\u01f2\7"+
		",\2\2\u01f2\u01f3\7,\2\2\u01f3v\3\2\2\2\u01f4\u01f5\7?\2\2\u01f5x\3\2"+
		"\2\2\u01f6\u01f7\7~\2\2\u01f7z\3\2\2\2\u01f8\u01f9\7`\2\2\u01f9|\3\2\2"+
		"\2\u01fa\u01fb\7(\2\2\u01fb~\3\2\2\2\u01fc\u01fd\7>\2\2\u01fd\u01fe\7"+
		">\2\2\u01fe\u0080\3\2\2\2\u01ff\u0200\7@\2\2\u0200\u0201\7@\2\2\u0201"+
		"\u0082\3\2\2\2\u0202\u0203\7-\2\2\u0203\u0084\3\2\2\2\u0204\u0205\7/\2"+
		"\2\u0205\u0086\3\2\2\2\u0206\u0207\7\61\2\2\u0207\u0088\3\2\2\2\u0208"+
		"\u0209\7\'\2\2\u0209\u008a\3\2\2\2\u020a\u020b\7\61\2\2\u020b\u020c\7"+
		"\61\2\2\u020c\u008c\3\2\2\2\u020d\u020e\7\u0080\2\2\u020e\u008e\3\2\2"+
		"\2\u020f\u0210\7>\2\2\u0210\u0090\3\2\2\2\u0211\u0212\7@\2\2\u0212\u0092"+
		"\3\2\2\2\u0213\u0214\7?\2\2\u0214\u0215\7?\2\2\u0215\u0094\3\2\2\2\u0216"+
		"\u0217\7@\2\2\u0217\u0218\7?\2\2\u0218\u0096\3\2\2\2\u0219\u021a\7>\2"+
		"\2\u021a\u021b\7?\2\2\u021b\u0098\3\2\2\2\u021c\u021d\7>\2\2\u021d\u021e"+
		"\7@\2\2\u021e\u009a\3\2\2\2\u021f\u0220\7#\2\2\u0220\u0221\7?\2\2\u0221"+
		"\u009c\3\2\2\2\u0222\u0223\7B\2\2\u0223\u009e\3\2\2\2\u0224\u0225\7/\2"+
		"\2\u0225\u0226\7@\2\2\u0226\u00a0\3\2\2\2\u0227\u0228\7-\2\2\u0228\u0229"+
		"\7?\2\2\u0229\u00a2\3\2\2\2\u022a\u022b\7/\2\2\u022b\u022c\7?\2\2\u022c"+
		"\u00a4\3\2\2\2\u022d\u022e\7,\2\2\u022e\u022f\7?\2\2\u022f\u00a6\3\2\2"+
		"\2\u0230\u0231\7B\2\2\u0231\u0232\7?\2\2\u0232\u00a8\3\2\2\2\u0233\u0234"+
		"\7\61\2\2\u0234\u0235\7?\2\2\u0235\u00aa\3\2\2\2\u0236\u0237\7\'\2\2\u0237"+
		"\u0238\7?\2\2\u0238\u00ac\3\2\2\2\u0239\u023a\7(\2\2\u023a\u023b\7?\2"+
		"\2\u023b\u00ae\3\2\2\2\u023c\u023d\7~\2\2\u023d\u023e\7?\2\2\u023e\u00b0"+
		"\3\2\2\2\u023f\u0240\7`\2\2\u0240\u0241\7?\2\2\u0241\u00b2\3\2\2\2\u0242"+
		"\u0243\7>\2\2\u0243\u0244\7>\2\2\u0244\u0245\7?\2\2\u0245\u00b4\3\2\2"+
		"\2\u0246\u0247\7@\2\2\u0247\u0248\7@\2\2\u0248\u0249\7?\2\2\u0249\u00b6"+
		"\3\2\2\2\u024a\u024b\7,\2\2\u024b\u024c\7,\2\2\u024c\u024d\7?\2\2\u024d"+
		"\u00b8\3\2\2\2\u024e\u024f\7\61\2\2\u024f\u0250\7\61\2\2\u0250\u0251\7"+
		"?\2\2\u0251\u00ba\3\2\2\2\u0252\u0253\t\3\2\2\u0253\u00bc\3\2\2\2\u0254"+
		"\u0255\t\4\2\2\u0255\u00be\3\2\2\2\u0256\u0258\5\u00bd_\2\u0257\u0256"+
		"\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u00c0\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025e\t\5\2\2\u025d\u025c\3\2"+
		"\2\2\u025e\u00c2\3\2\2\2\u025f\u0262\5\u00c1a\2\u0260\u0262\5\u00bd_\2"+
		"\u0261\u025f\3\2\2\2\u0261\u0260\3\2\2\2\u0262\u00c4\3\2\2\2\u0263\u0265"+
		"\t\6\2\2\u0264\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0264\3\2\2\2\u0266"+
		"\u0267\3\2\2\2\u0267\u00c6\3\2\2\2\24\2\u00cb\u00d3\u00d7\u00db\u00e1"+
		"\u00e7\u00e9\u01bb\u01bf\u01c3\u01c6\u01ce\u01d3\u0259\u025d\u0261\u0266"+
		"\4\3,\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}