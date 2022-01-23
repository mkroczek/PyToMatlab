// Generated from /home/marcin/Programming/Java/Projects/MIAK/PyToMatlab/src/PyGrammarParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PyGrammarParser extends Parser {
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
	public static final int
		RULE_single_input = 0, RULE_file_input = 1, RULE_stmt = 2, RULE_simple_stmts = 3, 
		RULE_simple_stmt = 4, RULE_compound_stmt = 5, RULE_assignment_stmt = 6, 
		RULE_if_stmt = 7, RULE_func_def = 8, RULE_while_stmt = 9, RULE_for_stmt = 10, 
		RULE_test = 11, RULE_or_test = 12, RULE_and_test = 13, RULE_not_test = 14, 
		RULE_comparison = 15, RULE_comp_op = 16, RULE_expr = 17, RULE_xor_expr = 18, 
		RULE_and_expr = 19, RULE_shift_expr = 20, RULE_arithm_expr = 21, RULE_term = 22, 
		RULE_add_op = 23, RULE_mul_op = 24, RULE_factor = 25, RULE_power = 26, 
		RULE_atom_expr = 27, RULE_atom = 28, RULE_trailer = 29, RULE_arglist = 30, 
		RULE_argument = 31, RULE_pairslist = 32, RULE_pair = 33, RULE_subscriptlist = 34, 
		RULE_subscript_ = 35, RULE_slice_step = 36, RULE_block = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"single_input", "file_input", "stmt", "simple_stmts", "simple_stmt", 
			"compound_stmt", "assignment_stmt", "if_stmt", "func_def", "while_stmt", 
			"for_stmt", "test", "or_test", "and_test", "not_test", "comparison", 
			"comp_op", "expr", "xor_expr", "and_expr", "shift_expr", "arithm_expr", 
			"term", "add_op", "mul_op", "factor", "power", "atom_expr", "atom", "trailer", 
			"arglist", "argument", "pairslist", "pair", "subscriptlist", "subscript_", 
			"slice_step", "block"
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

	@Override
	public String getGrammarFileName() { return "PyGrammarParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Single_inputContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(PyGrammarParser.NEWLINE, 0); }
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public Single_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterSingle_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitSingle_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitSingle_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_inputContext single_input() throws RecognitionException {
		Single_inputContext _localctx = new Single_inputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_single_input);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(NEWLINE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				simple_stmt();
				setState(78);
				match(NEWLINE);
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

	public static class File_inputContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PyGrammarParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(PyGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PyGrammarParser.NEWLINE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public File_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterFile_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitFile_input(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitFile_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_inputContext file_input() throws RecognitionException {
		File_inputContext _localctx = new File_inputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << IDENTIFIER) | (1L << NEWLINE))) != 0)) {
				{
				setState(84);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(82);
					match(NEWLINE);
					}
					break;
				case DEF:
				case IF:
				case WHILE:
				case FOR:
				case IDENTIFIER:
					{
					setState(83);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(EOF);
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

	public static class StmtContext extends ParserRuleContext {
		public Simple_stmtsContext simple_stmts() {
			return getRuleContext(Simple_stmtsContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				simple_stmts();
				}
				break;
			case DEF:
			case IF:
			case WHILE:
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				compound_stmt();
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

	public static class Simple_stmtsContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PyGrammarParser.NEWLINE, 0); }
		public Simple_stmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterSimple_stmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitSimple_stmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitSimple_stmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtsContext simple_stmts() throws RecognitionException {
		Simple_stmtsContext _localctx = new Simple_stmtsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simple_stmts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			simple_stmt();
			setState(96);
			match(NEWLINE);
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

	public static class Simple_stmtContext extends ParserRuleContext {
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitSimple_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_simple_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			assignment_stmt();
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

	public static class Compound_stmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Func_defContext func_def() {
			return getRuleContext(Func_defContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitCompound_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compound_stmt);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				if_stmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				func_def();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				while_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				for_stmt();
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

	public static class Assignment_stmtContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PyGrammarParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(PyGrammarParser.ASSIGN, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterAssignment_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitAssignment_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitAssignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(IDENTIFIER);
			setState(107);
			match(ASSIGN);
			setState(108);
			test();
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PyGrammarParser.IF, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(PyGrammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PyGrammarParser.COLON, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(PyGrammarParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(PyGrammarParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(PyGrammarParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(IF);
			setState(111);
			test();
			setState(112);
			match(COLON);
			setState(113);
			block();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(114);
				match(ELIF);
				setState(115);
				test();
				setState(116);
				match(COLON);
				setState(117);
				block();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(124);
				match(ELSE);
				setState(125);
				match(COLON);
				setState(126);
				block();
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

	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PyGrammarParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PyGrammarParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PyGrammarParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PyGrammarParser.CLOSE_PAREN, 0); }
		public TerminalNode COLON() { return getToken(PyGrammarParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(DEF);
			setState(130);
			match(IDENTIFIER);
			setState(131);
			match(OPEN_PAREN);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (STRING - 3)) | (1L << (NUMBER - 3)) | (1L << (NOT - 3)) | (1L << (NONE - 3)) | (1L << (TRUE - 3)) | (1L << (FALSE - 3)) | (1L << (IDENTIFIER - 3)) | (1L << (OPEN_PAREN - 3)) | (1L << (OPEN_BRACK - 3)) | (1L << (OPEN_BRACE - 3)) | (1L << (ADD - 3)) | (1L << (MINUS - 3)))) != 0)) {
				{
				setState(132);
				arglist();
				}
			}

			setState(135);
			match(CLOSE_PAREN);
			setState(136);
			match(COLON);
			setState(137);
			block();
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

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PyGrammarParser.WHILE, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PyGrammarParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(WHILE);
			setState(140);
			test();
			setState(141);
			match(COLON);
			setState(142);
			block();
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

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PyGrammarParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PyGrammarParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(PyGrammarParser.IN, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PyGrammarParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(FOR);
			setState(145);
			match(IDENTIFIER);
			setState(146);
			match(IN);
			setState(147);
			test();
			setState(148);
			match(COLON);
			setState(149);
			block();
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

	public static class TestContext extends ParserRuleContext {
		public Or_testContext or_test() {
			return getRuleContext(Or_testContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			or_test();
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

	public static class Or_testContext extends ParserRuleContext {
		public List<And_testContext> and_test() {
			return getRuleContexts(And_testContext.class);
		}
		public And_testContext and_test(int i) {
			return getRuleContext(And_testContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(PyGrammarParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(PyGrammarParser.OR, i);
		}
		public Or_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterOr_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitOr_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitOr_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_testContext or_test() throws RecognitionException {
		Or_testContext _localctx = new Or_testContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_or_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			and_test();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(154);
				match(OR);
				setState(155);
				and_test();
				}
				}
				setState(160);
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

	public static class And_testContext extends ParserRuleContext {
		public List<Not_testContext> not_test() {
			return getRuleContexts(Not_testContext.class);
		}
		public Not_testContext not_test(int i) {
			return getRuleContext(Not_testContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(PyGrammarParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(PyGrammarParser.AND, i);
		}
		public And_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterAnd_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitAnd_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitAnd_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_testContext and_test() throws RecognitionException {
		And_testContext _localctx = new And_testContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_and_test);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			not_test();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(162);
				match(AND);
				setState(163);
				not_test();
				}
				}
				setState(168);
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

	public static class Not_testContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(PyGrammarParser.NOT, 0); }
		public Not_testContext not_test() {
			return getRuleContext(Not_testContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public Not_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterNot_test(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitNot_test(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitNot_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_testContext not_test() throws RecognitionException {
		Not_testContext _localctx = new Not_testContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_not_test);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(NOT);
				setState(170);
				not_test();
				}
				break;
			case STRING:
			case NUMBER:
			case NONE:
			case TRUE:
			case FALSE:
			case IDENTIFIER:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
			case ADD:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				comparison();
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Comp_opContext> comp_op() {
			return getRuleContexts(Comp_opContext.class);
		}
		public Comp_opContext comp_op(int i) {
			return getRuleContext(Comp_opContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			expr();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & ((1L << (IN - 21)) | (1L << (NOT - 21)) | (1L << (IS - 21)) | (1L << (LESS_THAN - 21)) | (1L << (GREATER_THAN - 21)) | (1L << (EQUALS - 21)) | (1L << (GT_EQ - 21)) | (1L << (LT_EQ - 21)) | (1L << (NOT_EQ_2 - 21)))) != 0)) {
				{
				{
				setState(175);
				comp_op();
				setState(176);
				expr();
				}
				}
				setState(182);
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

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(PyGrammarParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(PyGrammarParser.GREATER_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(PyGrammarParser.EQUALS, 0); }
		public TerminalNode GT_EQ() { return getToken(PyGrammarParser.GT_EQ, 0); }
		public TerminalNode LT_EQ() { return getToken(PyGrammarParser.LT_EQ, 0); }
		public TerminalNode NOT_EQ_2() { return getToken(PyGrammarParser.NOT_EQ_2, 0); }
		public TerminalNode IN() { return getToken(PyGrammarParser.IN, 0); }
		public TerminalNode NOT() { return getToken(PyGrammarParser.NOT, 0); }
		public TerminalNode IS() { return getToken(PyGrammarParser.IS, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitComp_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitComp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comp_op);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(LESS_THAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(GREATER_THAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(EQUALS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				match(GT_EQ);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				match(LT_EQ);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				match(NOT_EQ_2);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				match(IN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(190);
				match(NOT);
				setState(191);
				match(IN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(192);
				match(IS);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(193);
				match(IS);
				setState(194);
				match(NOT);
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

	public static class ExprContext extends ParserRuleContext {
		public List<Xor_exprContext> xor_expr() {
			return getRuleContexts(Xor_exprContext.class);
		}
		public Xor_exprContext xor_expr(int i) {
			return getRuleContext(Xor_exprContext.class,i);
		}
		public List<TerminalNode> OR_OP() { return getTokens(PyGrammarParser.OR_OP); }
		public TerminalNode OR_OP(int i) {
			return getToken(PyGrammarParser.OR_OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			xor_expr();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_OP) {
				{
				{
				setState(198);
				match(OR_OP);
				setState(199);
				xor_expr();
				}
				}
				setState(204);
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

	public static class Xor_exprContext extends ParserRuleContext {
		public List<And_exprContext> and_expr() {
			return getRuleContexts(And_exprContext.class);
		}
		public And_exprContext and_expr(int i) {
			return getRuleContext(And_exprContext.class,i);
		}
		public List<TerminalNode> XOR() { return getTokens(PyGrammarParser.XOR); }
		public TerminalNode XOR(int i) {
			return getToken(PyGrammarParser.XOR, i);
		}
		public Xor_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterXor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitXor_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitXor_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_exprContext xor_expr() throws RecognitionException {
		Xor_exprContext _localctx = new Xor_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_xor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			and_expr();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR) {
				{
				{
				setState(206);
				match(XOR);
				setState(207);
				and_expr();
				}
				}
				setState(212);
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

	public static class And_exprContext extends ParserRuleContext {
		public List<Shift_exprContext> shift_expr() {
			return getRuleContexts(Shift_exprContext.class);
		}
		public Shift_exprContext shift_expr(int i) {
			return getRuleContext(Shift_exprContext.class,i);
		}
		public List<TerminalNode> AND_OP() { return getTokens(PyGrammarParser.AND_OP); }
		public TerminalNode AND_OP(int i) {
			return getToken(PyGrammarParser.AND_OP, i);
		}
		public And_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterAnd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitAnd_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitAnd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			shift_expr();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OP) {
				{
				{
				setState(214);
				match(AND_OP);
				setState(215);
				shift_expr();
				}
				}
				setState(220);
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

	public static class Shift_exprContext extends ParserRuleContext {
		public List<Arithm_exprContext> arithm_expr() {
			return getRuleContexts(Arithm_exprContext.class);
		}
		public Arithm_exprContext arithm_expr(int i) {
			return getRuleContext(Arithm_exprContext.class,i);
		}
		public List<TerminalNode> LEFT_SHIFT() { return getTokens(PyGrammarParser.LEFT_SHIFT); }
		public TerminalNode LEFT_SHIFT(int i) {
			return getToken(PyGrammarParser.LEFT_SHIFT, i);
		}
		public List<TerminalNode> RIGHT_SHIFT() { return getTokens(PyGrammarParser.RIGHT_SHIFT); }
		public TerminalNode RIGHT_SHIFT(int i) {
			return getToken(PyGrammarParser.RIGHT_SHIFT, i);
		}
		public Shift_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterShift_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitShift_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitShift_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_shift_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			arithm_expr();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_SHIFT || _la==RIGHT_SHIFT) {
				{
				{
				setState(222);
				_la = _input.LA(1);
				if ( !(_la==LEFT_SHIFT || _la==RIGHT_SHIFT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(223);
				arithm_expr();
				}
				}
				setState(228);
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

	public static class Arithm_exprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<Add_opContext> add_op() {
			return getRuleContexts(Add_opContext.class);
		}
		public Add_opContext add_op(int i) {
			return getRuleContext(Add_opContext.class,i);
		}
		public Arithm_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithm_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterArithm_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitArithm_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitArithm_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithm_exprContext arithm_expr() throws RecognitionException {
		Arithm_exprContext _localctx = new Arithm_exprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arithm_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			term();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==MINUS) {
				{
				{
				setState(230);
				add_op();
				setState(231);
				term();
				}
				}
				setState(237);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<Mul_opContext> mul_op() {
			return getRuleContexts(Mul_opContext.class);
		}
		public Mul_opContext mul_op(int i) {
			return getRuleContext(Mul_opContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			factor();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (STAR - 54)) | (1L << (DIV - 54)) | (1L << (MOD - 54)) | (1L << (IDIV - 54)))) != 0)) {
				{
				{
				setState(239);
				mul_op();
				setState(240);
				factor();
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

	public static class Add_opContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(PyGrammarParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(PyGrammarParser.MINUS, 0); }
		public Add_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterAdd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitAdd_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitAdd_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_opContext add_op() throws RecognitionException {
		Add_opContext _localctx = new Add_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_add_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==MINUS) ) {
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

	public static class Mul_opContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(PyGrammarParser.DIV, 0); }
		public TerminalNode STAR() { return getToken(PyGrammarParser.STAR, 0); }
		public TerminalNode MOD() { return getToken(PyGrammarParser.MOD, 0); }
		public TerminalNode IDIV() { return getToken(PyGrammarParser.IDIV, 0); }
		public Mul_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterMul_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitMul_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitMul_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_opContext mul_op() throws RecognitionException {
		Mul_opContext _localctx = new Mul_opContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mul_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !(((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (STAR - 54)) | (1L << (DIV - 54)) | (1L << (MOD - 54)) | (1L << (IDIV - 54)))) != 0)) ) {
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode ADD() { return getToken(PyGrammarParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(PyGrammarParser.MINUS, 0); }
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factor);
		int _la;
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(252);
				factor();
				}
				break;
			case STRING:
			case NUMBER:
			case NONE:
			case TRUE:
			case FALSE:
			case IDENTIFIER:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				power();
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

	public static class PowerContext extends ParserRuleContext {
		public Atom_exprContext atom_expr() {
			return getRuleContext(Atom_exprContext.class,0);
		}
		public TerminalNode POWER() { return getToken(PyGrammarParser.POWER, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			atom_expr();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(257);
				match(POWER);
				setState(258);
				factor();
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

	public static class Atom_exprContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<TrailerContext> trailer() {
			return getRuleContexts(TrailerContext.class);
		}
		public TrailerContext trailer(int i) {
			return getRuleContext(TrailerContext.class,i);
		}
		public Atom_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterAtom_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitAtom_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitAtom_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atom_exprContext atom_expr() throws RecognitionException {
		Atom_exprContext _localctx = new Atom_exprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_atom_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			atom();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << DOT))) != 0)) {
				{
				{
				setState(262);
				trailer();
				}
				}
				setState(267);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PyGrammarParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PyGrammarParser.CLOSE_PAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TerminalNode OPEN_BRACK() { return getToken(PyGrammarParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(PyGrammarParser.CLOSE_BRACK, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(PyGrammarParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(PyGrammarParser.CLOSE_BRACE, 0); }
		public PairslistContext pairslist() {
			return getRuleContext(PairslistContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PyGrammarParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(PyGrammarParser.NUMBER, 0); }
		public List<TerminalNode> STRING() { return getTokens(PyGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PyGrammarParser.STRING, i);
		}
		public TerminalNode NONE() { return getToken(PyGrammarParser.NONE, 0); }
		public TerminalNode TRUE() { return getToken(PyGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PyGrammarParser.FALSE, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atom);
		int _la;
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(OPEN_PAREN);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (STRING - 3)) | (1L << (NUMBER - 3)) | (1L << (NOT - 3)) | (1L << (NONE - 3)) | (1L << (TRUE - 3)) | (1L << (FALSE - 3)) | (1L << (IDENTIFIER - 3)) | (1L << (OPEN_PAREN - 3)) | (1L << (OPEN_BRACK - 3)) | (1L << (OPEN_BRACE - 3)) | (1L << (ADD - 3)) | (1L << (MINUS - 3)))) != 0)) {
					{
					setState(269);
					arglist();
					}
				}

				setState(272);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(OPEN_BRACK);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (STRING - 3)) | (1L << (NUMBER - 3)) | (1L << (NOT - 3)) | (1L << (NONE - 3)) | (1L << (TRUE - 3)) | (1L << (FALSE - 3)) | (1L << (IDENTIFIER - 3)) | (1L << (OPEN_PAREN - 3)) | (1L << (OPEN_BRACK - 3)) | (1L << (OPEN_BRACE - 3)) | (1L << (ADD - 3)) | (1L << (MINUS - 3)))) != 0)) {
					{
					setState(274);
					arglist();
					}
				}

				setState(277);
				match(CLOSE_BRACK);
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(OPEN_BRACE);
				setState(281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(279);
					arglist();
					}
					break;
				case 2:
					{
					setState(280);
					pairslist();
					}
					break;
				}
				setState(283);
				match(CLOSE_BRACE);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				match(IDENTIFIER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(287); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(286);
					match(STRING);
					}
					}
					setState(289); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING );
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 7);
				{
				setState(291);
				match(NONE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(292);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 9);
				{
				setState(293);
				match(FALSE);
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

	public static class TrailerContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PyGrammarParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PyGrammarParser.CLOSE_PAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TerminalNode OPEN_BRACK() { return getToken(PyGrammarParser.OPEN_BRACK, 0); }
		public SubscriptlistContext subscriptlist() {
			return getRuleContext(SubscriptlistContext.class,0);
		}
		public TerminalNode CLOSE_BRACK() { return getToken(PyGrammarParser.CLOSE_BRACK, 0); }
		public TerminalNode DOT() { return getToken(PyGrammarParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PyGrammarParser.IDENTIFIER, 0); }
		public TrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterTrailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitTrailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitTrailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_trailer);
		int _la;
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(OPEN_PAREN);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (STRING - 3)) | (1L << (NUMBER - 3)) | (1L << (NOT - 3)) | (1L << (NONE - 3)) | (1L << (TRUE - 3)) | (1L << (FALSE - 3)) | (1L << (IDENTIFIER - 3)) | (1L << (OPEN_PAREN - 3)) | (1L << (OPEN_BRACK - 3)) | (1L << (OPEN_BRACE - 3)) | (1L << (ADD - 3)) | (1L << (MINUS - 3)))) != 0)) {
					{
					setState(297);
					arglist();
					}
				}

				setState(300);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(OPEN_BRACK);
				setState(302);
				subscriptlist();
				setState(303);
				match(CLOSE_BRACK);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(DOT);
				setState(306);
				match(IDENTIFIER);
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

	public static class ArglistContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PyGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PyGrammarParser.COMMA, i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arglist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			argument();
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(310);
					match(COMMA);
					setState(311);
					argument();
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(317);
				match(COMMA);
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

	public static class ArgumentContext extends ParserRuleContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PyGrammarParser.IDENTIFIER, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_argument);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				test();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(IDENTIFIER);
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

	public static class PairslistContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PyGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PyGrammarParser.COMMA, i);
		}
		public PairslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairslist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterPairslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitPairslist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitPairslist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairslistContext pairslist() throws RecognitionException {
		PairslistContext _localctx = new PairslistContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_pairslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			pair();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(325);
				match(COMMA);
				setState(326);
				pair();
				}
				}
				setState(331);
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

	public static class PairContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PyGrammarParser.COLON, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			test();
			setState(333);
			match(COLON);
			setState(334);
			test();
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

	public static class SubscriptlistContext extends ParserRuleContext {
		public List<Subscript_Context> subscript_() {
			return getRuleContexts(Subscript_Context.class);
		}
		public Subscript_Context subscript_(int i) {
			return getRuleContext(Subscript_Context.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PyGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PyGrammarParser.COMMA, i);
		}
		public SubscriptlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterSubscriptlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitSubscriptlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitSubscriptlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptlistContext subscriptlist() throws RecognitionException {
		SubscriptlistContext _localctx = new SubscriptlistContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_subscriptlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			subscript_();
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(337);
					match(COMMA);
					setState(338);
					subscript_();
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(344);
				match(COMMA);
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

	public static class Subscript_Context extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PyGrammarParser.COLON, 0); }
		public Slice_stepContext slice_step() {
			return getRuleContext(Slice_stepContext.class,0);
		}
		public Subscript_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterSubscript_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitSubscript_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitSubscript_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subscript_Context subscript_() throws RecognitionException {
		Subscript_Context _localctx = new Subscript_Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_subscript_);
		int _la;
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				test();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (STRING - 3)) | (1L << (NUMBER - 3)) | (1L << (NOT - 3)) | (1L << (NONE - 3)) | (1L << (TRUE - 3)) | (1L << (FALSE - 3)) | (1L << (IDENTIFIER - 3)) | (1L << (OPEN_PAREN - 3)) | (1L << (OPEN_BRACK - 3)) | (1L << (OPEN_BRACE - 3)) | (1L << (ADD - 3)) | (1L << (MINUS - 3)))) != 0)) {
					{
					setState(348);
					test();
					}
				}

				setState(351);
				match(COLON);
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (STRING - 3)) | (1L << (NUMBER - 3)) | (1L << (NOT - 3)) | (1L << (NONE - 3)) | (1L << (TRUE - 3)) | (1L << (FALSE - 3)) | (1L << (IDENTIFIER - 3)) | (1L << (OPEN_PAREN - 3)) | (1L << (OPEN_BRACK - 3)) | (1L << (OPEN_BRACE - 3)) | (1L << (ADD - 3)) | (1L << (MINUS - 3)))) != 0)) {
					{
					setState(352);
					test();
					}
				}

				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(355);
					slice_step();
					}
				}

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

	public static class Slice_stepContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PyGrammarParser.COLON, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public Slice_stepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterSlice_step(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitSlice_step(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitSlice_step(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Slice_stepContext slice_step() throws RecognitionException {
		Slice_stepContext _localctx = new Slice_stepContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_slice_step);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(COLON);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (STRING - 3)) | (1L << (NUMBER - 3)) | (1L << (NOT - 3)) | (1L << (NONE - 3)) | (1L << (TRUE - 3)) | (1L << (FALSE - 3)) | (1L << (IDENTIFIER - 3)) | (1L << (OPEN_PAREN - 3)) | (1L << (OPEN_BRACK - 3)) | (1L << (OPEN_BRACE - 3)) | (1L << (ADD - 3)) | (1L << (MINUS - 3)))) != 0)) {
				{
				setState(361);
				test();
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

	public static class BlockContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PyGrammarParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PyGrammarParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PyGrammarParser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyGrammarParserListener ) ((PyGrammarParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyGrammarParserVisitor ) return ((PyGrammarParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_block);
		int _la;
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				simple_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(NEWLINE);
				setState(366);
				match(INDENT);
				setState(368); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(367);
					stmt();
					}
					}
					setState(370); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << IDENTIFIER))) != 0) );
				setState(372);
				match(DEDENT);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3^\u017b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\5\2S\n\2\3"+
		"\3\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\3\3\3\4\3\4\5\4`\n\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\5\7k\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\tz\n\t\f\t\16\t}\13\t\3\t\3\t\3\t\5\t\u0082\n\t\3\n\3"+
		"\n\3\n\3\n\5\n\u0088\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\7\16\u009f\n\16\f\16\16"+
		"\16\u00a2\13\16\3\17\3\17\3\17\7\17\u00a7\n\17\f\17\16\17\u00aa\13\17"+
		"\3\20\3\20\3\20\5\20\u00af\n\20\3\21\3\21\3\21\3\21\7\21\u00b5\n\21\f"+
		"\21\16\21\u00b8\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u00c6\n\22\3\23\3\23\3\23\7\23\u00cb\n\23\f\23\16\23\u00ce"+
		"\13\23\3\24\3\24\3\24\7\24\u00d3\n\24\f\24\16\24\u00d6\13\24\3\25\3\25"+
		"\3\25\7\25\u00db\n\25\f\25\16\25\u00de\13\25\3\26\3\26\3\26\7\26\u00e3"+
		"\n\26\f\26\16\26\u00e6\13\26\3\27\3\27\3\27\3\27\7\27\u00ec\n\27\f\27"+
		"\16\27\u00ef\13\27\3\30\3\30\3\30\3\30\7\30\u00f5\n\30\f\30\16\30\u00f8"+
		"\13\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\5\33\u0101\n\33\3\34\3\34\3"+
		"\34\5\34\u0106\n\34\3\35\3\35\7\35\u010a\n\35\f\35\16\35\u010d\13\35\3"+
		"\36\3\36\5\36\u0111\n\36\3\36\3\36\3\36\5\36\u0116\n\36\3\36\3\36\3\36"+
		"\3\36\5\36\u011c\n\36\3\36\3\36\3\36\3\36\6\36\u0122\n\36\r\36\16\36\u0123"+
		"\3\36\3\36\3\36\5\36\u0129\n\36\3\37\3\37\5\37\u012d\n\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\5\37\u0136\n\37\3 \3 \3 \7 \u013b\n \f \16 \u013e"+
		"\13 \3 \5 \u0141\n \3!\3!\5!\u0145\n!\3\"\3\"\3\"\7\"\u014a\n\"\f\"\16"+
		"\"\u014d\13\"\3#\3#\3#\3#\3$\3$\3$\7$\u0156\n$\f$\16$\u0159\13$\3$\5$"+
		"\u015c\n$\3%\3%\5%\u0160\n%\3%\3%\5%\u0164\n%\3%\5%\u0167\n%\5%\u0169"+
		"\n%\3&\3&\5&\u016d\n&\3\'\3\'\3\'\3\'\6\'\u0173\n\'\r\'\16\'\u0174\3\'"+
		"\3\'\5\'\u0179\n\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJL\2\5\3\2AB\3\2CD\4\288EG\2\u0191\2R\3\2\2"+
		"\2\4X\3\2\2\2\6_\3\2\2\2\ba\3\2\2\2\nd\3\2\2\2\fj\3\2\2\2\16l\3\2\2\2"+
		"\20p\3\2\2\2\22\u0083\3\2\2\2\24\u008d\3\2\2\2\26\u0092\3\2\2\2\30\u0099"+
		"\3\2\2\2\32\u009b\3\2\2\2\34\u00a3\3\2\2\2\36\u00ae\3\2\2\2 \u00b0\3\2"+
		"\2\2\"\u00c5\3\2\2\2$\u00c7\3\2\2\2&\u00cf\3\2\2\2(\u00d7\3\2\2\2*\u00df"+
		"\3\2\2\2,\u00e7\3\2\2\2.\u00f0\3\2\2\2\60\u00f9\3\2\2\2\62\u00fb\3\2\2"+
		"\2\64\u0100\3\2\2\2\66\u0102\3\2\2\28\u0107\3\2\2\2:\u0128\3\2\2\2<\u0135"+
		"\3\2\2\2>\u0137\3\2\2\2@\u0144\3\2\2\2B\u0146\3\2\2\2D\u014e\3\2\2\2F"+
		"\u0152\3\2\2\2H\u0168\3\2\2\2J\u016a\3\2\2\2L\u0178\3\2\2\2NS\7-\2\2O"+
		"P\5\n\6\2PQ\7-\2\2QS\3\2\2\2RN\3\2\2\2RO\3\2\2\2S\3\3\2\2\2TW\7-\2\2U"+
		"W\5\6\4\2VT\3\2\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2"+
		"ZX\3\2\2\2[\\\7\2\2\3\\\5\3\2\2\2]`\5\b\5\2^`\5\f\7\2_]\3\2\2\2_^\3\2"+
		"\2\2`\7\3\2\2\2ab\5\n\6\2bc\7-\2\2c\t\3\2\2\2de\5\16\b\2e\13\3\2\2\2f"+
		"k\5\20\t\2gk\5\22\n\2hk\5\24\13\2ik\5\26\f\2jf\3\2\2\2jg\3\2\2\2jh\3\2"+
		"\2\2ji\3\2\2\2k\r\3\2\2\2lm\7,\2\2mn\7=\2\2no\5\30\r\2o\17\3\2\2\2pq\7"+
		"\22\2\2qr\5\30\r\2rs\7:\2\2s{\5L\'\2tu\7\23\2\2uv\5\30\r\2vw\7:\2\2wx"+
		"\5L\'\2xz\3\2\2\2yt\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u0081\3\2\2"+
		"\2}{\3\2\2\2~\177\7\24\2\2\177\u0080\7:\2\2\u0080\u0082\5L\'\2\u0081~"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\21\3\2\2\2\u0083\u0084\7\t\2\2\u0084"+
		"\u0085\7,\2\2\u0085\u0087\7\60\2\2\u0086\u0088\5> \2\u0087\u0086\3\2\2"+
		"\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\61\2\2\u008a"+
		"\u008b\7:\2\2\u008b\u008c\5L\'\2\u008c\23\3\2\2\2\u008d\u008e\7\25\2\2"+
		"\u008e\u008f\5\30\r\2\u008f\u0090\7:\2\2\u0090\u0091\5L\'\2\u0091\25\3"+
		"\2\2\2\u0092\u0093\7\26\2\2\u0093\u0094\7,\2\2\u0094\u0095\7\27\2\2\u0095"+
		"\u0096\5\30\r\2\u0096\u0097\7:\2\2\u0097\u0098\5L\'\2\u0098\27\3\2\2\2"+
		"\u0099\u009a\5\32\16\2\u009a\31\3\2\2\2\u009b\u00a0\5\34\17\2\u009c\u009d"+
		"\7\35\2\2\u009d\u009f\5\34\17\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2"+
		"\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\33\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a3\u00a8\5\36\20\2\u00a4\u00a5\7\36\2\2\u00a5\u00a7\5\36\20"+
		"\2\u00a6\u00a4\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\35\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\37\2\2\u00ac"+
		"\u00af\5\36\20\2\u00ad\u00af\5 \21\2\u00ae\u00ab\3\2\2\2\u00ae\u00ad\3"+
		"\2\2\2\u00af\37\3\2\2\2\u00b0\u00b6\5$\23\2\u00b1\u00b2\5\"\22\2\u00b2"+
		"\u00b3\5$\23\2\u00b3\u00b5\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\u00b8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7!\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00c6\7I\2\2\u00ba\u00c6\7J\2\2\u00bb\u00c6\7K\2\2\u00bc"+
		"\u00c6\7L\2\2\u00bd\u00c6\7M\2\2\u00be\u00c6\7O\2\2\u00bf\u00c6\7\27\2"+
		"\2\u00c0\u00c1\7\37\2\2\u00c1\u00c6\7\27\2\2\u00c2\u00c6\7 \2\2\u00c3"+
		"\u00c4\7 \2\2\u00c4\u00c6\7\37\2\2\u00c5\u00b9\3\2\2\2\u00c5\u00ba\3\2"+
		"\2\2\u00c5\u00bb\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00bd\3\2\2\2\u00c5"+
		"\u00be\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c5\u00c2\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c6#\3\2\2\2\u00c7\u00cc\5&\24\2\u00c8\u00c9"+
		"\7>\2\2\u00c9\u00cb\5&\24\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd%\3\2\2\2\u00ce\u00cc\3\2\2\2"+
		"\u00cf\u00d4\5(\25\2\u00d0\u00d1\7?\2\2\u00d1\u00d3\5(\25\2\u00d2\u00d0"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\'\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00dc\5*\26\2\u00d8\u00d9\7@\2\2"+
		"\u00d9\u00db\5*\26\2\u00da\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd)\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e4\5,\27\2\u00e0\u00e1\t\2\2\2\u00e1\u00e3\5,\27\2\u00e2\u00e0\3\2"+
		"\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"+\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ed\5.\30\2\u00e8\u00e9\5\60\31"+
		"\2\u00e9\u00ea\5.\30\2\u00ea\u00ec\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec\u00ef"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee-\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00f6\5\64\33\2\u00f1\u00f2\5\62\32\2\u00f2\u00f3"+
		"\5\64\33\2\u00f3\u00f5\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f5\u00f8\3\2\2\2"+
		"\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7/\3\2\2\2\u00f8\u00f6\3"+
		"\2\2\2\u00f9\u00fa\t\3\2\2\u00fa\61\3\2\2\2\u00fb\u00fc\t\4\2\2\u00fc"+
		"\63\3\2\2\2\u00fd\u00fe\t\3\2\2\u00fe\u0101\5\64\33\2\u00ff\u0101\5\66"+
		"\34\2\u0100\u00fd\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\65\3\2\2\2\u0102\u0105"+
		"\58\35\2\u0103\u0104\7<\2\2\u0104\u0106\5\64\33\2\u0105\u0103\3\2\2\2"+
		"\u0105\u0106\3\2\2\2\u0106\67\3\2\2\2\u0107\u010b\5:\36\2\u0108\u010a"+
		"\5<\37\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c9\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0110\7\60\2\2"+
		"\u010f\u0111\5> \2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0129\7\61\2\2\u0113\u0115\7\62\2\2\u0114\u0116\5> \2\u0115"+
		"\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0129\7\63"+
		"\2\2\u0118\u011b\7\64\2\2\u0119\u011c\5> \2\u011a\u011c\5B\"\2\u011b\u0119"+
		"\3\2\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u0129\7\65\2\2\u011e\u0129\7,\2\2\u011f\u0129\7\6\2\2\u0120\u0122\7\5"+
		"\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0129\3\2\2\2\u0125\u0129\7!\2\2\u0126\u0129\7\""+
		"\2\2\u0127\u0129\7#\2\2\u0128\u010e\3\2\2\2\u0128\u0113\3\2\2\2\u0128"+
		"\u0118\3\2\2\2\u0128\u011e\3\2\2\2\u0128\u011f\3\2\2\2\u0128\u0121\3\2"+
		"\2\2\u0128\u0125\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129"+
		";\3\2\2\2\u012a\u012c\7\60\2\2\u012b\u012d\5> \2\u012c\u012b\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0136\7\61\2\2\u012f\u0130\7"+
		"\62\2\2\u0130\u0131\5F$\2\u0131\u0132\7\63\2\2\u0132\u0136\3\2\2\2\u0133"+
		"\u0134\7\66\2\2\u0134\u0136\7,\2\2\u0135\u012a\3\2\2\2\u0135\u012f\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0136=\3\2\2\2\u0137\u013c\5@!\2\u0138\u0139"+
		"\79\2\2\u0139\u013b\5@!\2\u013a\u0138\3\2\2\2\u013b\u013e\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2"+
		"\2\2\u013f\u0141\79\2\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"?\3\2\2\2\u0142\u0145\5\30\r\2\u0143\u0145\7,\2\2\u0144\u0142\3\2\2\2"+
		"\u0144\u0143\3\2\2\2\u0145A\3\2\2\2\u0146\u014b\5D#\2\u0147\u0148\79\2"+
		"\2\u0148\u014a\5D#\2\u0149\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014cC\3\2\2\2\u014d\u014b\3\2\2\2\u014e"+
		"\u014f\5\30\r\2\u014f\u0150\7:\2\2\u0150\u0151\5\30\r\2\u0151E\3\2\2\2"+
		"\u0152\u0157\5H%\2\u0153\u0154\79\2\2\u0154\u0156\5H%\2\u0155\u0153\3"+
		"\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015c\79\2\2\u015b\u015a\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015cG\3\2\2\2\u015d\u0169\5\30\r\2\u015e\u0160"+
		"\5\30\r\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2"+
		"\u0161\u0163\7:\2\2\u0162\u0164\5\30\r\2\u0163\u0162\3\2\2\2\u0163\u0164"+
		"\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0167\5J&\2\u0166\u0165\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u015d\3\2\2\2\u0168\u015f\3\2"+
		"\2\2\u0169I\3\2\2\2\u016a\u016c\7:\2\2\u016b\u016d\5\30\r\2\u016c\u016b"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016dK\3\2\2\2\u016e\u0179\5\n\6\2\u016f"+
		"\u0170\7-\2\2\u0170\u0172\7\3\2\2\u0171\u0173\5\6\4\2\u0172\u0171\3\2"+
		"\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0177\7\4\2\2\u0177\u0179\3\2\2\2\u0178\u016e\3\2"+
		"\2\2\u0178\u016f\3\2\2\2\u0179M\3\2\2\2,RVX_j{\u0081\u0087\u00a0\u00a8"+
		"\u00ae\u00b6\u00c5\u00cc\u00d4\u00dc\u00e4\u00ed\u00f6\u0100\u0105\u010b"+
		"\u0110\u0115\u011b\u0123\u0128\u012c\u0135\u013c\u0140\u0144\u014b\u0157"+
		"\u015b\u015f\u0163\u0166\u0168\u016c\u0174\u0178";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}