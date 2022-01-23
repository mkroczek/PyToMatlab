// Generated from /home/marcin/Programming/Java/Projects/MIAK/PyToMatlab/src/PyGrammarParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PyGrammarParser}.
 */
public interface PyGrammarParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(PyGrammarParser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(PyGrammarParser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(PyGrammarParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(PyGrammarParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PyGrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PyGrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#simple_stmts}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmts(PyGrammarParser.Simple_stmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#simple_stmts}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmts(PyGrammarParser.Simple_stmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(PyGrammarParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(PyGrammarParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(PyGrammarParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(PyGrammarParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(PyGrammarParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(PyGrammarParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#assignment_op}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_op(PyGrammarParser.Assignment_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#assignment_op}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_op(PyGrammarParser.Assignment_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(PyGrammarParser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(PyGrammarParser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(PyGrammarParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(PyGrammarParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(PyGrammarParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(PyGrammarParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(PyGrammarParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(PyGrammarParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(PyGrammarParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(PyGrammarParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(PyGrammarParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(PyGrammarParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(PyGrammarParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(PyGrammarParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(PyGrammarParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(PyGrammarParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(PyGrammarParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(PyGrammarParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(PyGrammarParser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(PyGrammarParser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(PyGrammarParser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(PyGrammarParser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNot_test(PyGrammarParser.Not_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNot_test(PyGrammarParser.Not_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(PyGrammarParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(PyGrammarParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(PyGrammarParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(PyGrammarParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PyGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PyGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithm_expr(PyGrammarParser.Arithm_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#arithm_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithm_expr(PyGrammarParser.Arithm_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PyGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PyGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#add_op}.
	 * @param ctx the parse tree
	 */
	void enterAdd_op(PyGrammarParser.Add_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#add_op}.
	 * @param ctx the parse tree
	 */
	void exitAdd_op(PyGrammarParser.Add_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#mul_op}.
	 * @param ctx the parse tree
	 */
	void enterMul_op(PyGrammarParser.Mul_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#mul_op}.
	 * @param ctx the parse tree
	 */
	void exitMul_op(PyGrammarParser.Mul_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PyGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PyGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(PyGrammarParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(PyGrammarParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_expr(PyGrammarParser.Atom_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_expr(PyGrammarParser.Atom_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(PyGrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(PyGrammarParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(PyGrammarParser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(PyGrammarParser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(PyGrammarParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(PyGrammarParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(PyGrammarParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(PyGrammarParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#pairslist}.
	 * @param ctx the parse tree
	 */
	void enterPairslist(PyGrammarParser.PairslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#pairslist}.
	 * @param ctx the parse tree
	 */
	void exitPairslist(PyGrammarParser.PairslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(PyGrammarParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(PyGrammarParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(PyGrammarParser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(PyGrammarParser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#subscript_}.
	 * @param ctx the parse tree
	 */
	void enterSubscript_(PyGrammarParser.Subscript_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#subscript_}.
	 * @param ctx the parse tree
	 */
	void exitSubscript_(PyGrammarParser.Subscript_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#slice_step}.
	 * @param ctx the parse tree
	 */
	void enterSlice_step(PyGrammarParser.Slice_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#slice_step}.
	 * @param ctx the parse tree
	 */
	void exitSlice_step(PyGrammarParser.Slice_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link PyGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PyGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PyGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PyGrammarParser.BlockContext ctx);
}