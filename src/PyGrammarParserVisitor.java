// Generated from /home/marcin/Programming/Java/Projects/MIAK/PyToMatlab/src/PyGrammarParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PyGrammarParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#single_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_input(PyGrammarParser.Single_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(PyGrammarParser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PyGrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#simple_stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmts(PyGrammarParser.Simple_stmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(PyGrammarParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(PyGrammarParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(PyGrammarParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#assignment_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_op(PyGrammarParser.Assignment_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_stmt(PyGrammarParser.Flow_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(PyGrammarParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(PyGrammarParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(PyGrammarParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(PyGrammarParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(PyGrammarParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(PyGrammarParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(PyGrammarParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(PyGrammarParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(PyGrammarParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#or_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_test(PyGrammarParser.Or_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#and_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_test(PyGrammarParser.And_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_test(PyGrammarParser.Not_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(PyGrammarParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(PyGrammarParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PyGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#arithm_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithm_expr(PyGrammarParser.Arithm_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(PyGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#add_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_op(PyGrammarParser.Add_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#mul_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_op(PyGrammarParser.Mul_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(PyGrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(PyGrammarParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#atom_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_expr(PyGrammarParser.Atom_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(PyGrammarParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#fun_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_call(PyGrammarParser.Fun_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#par_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar_arguments(PyGrammarParser.Par_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#built_fun_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuilt_fun_call(PyGrammarParser.Built_fun_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#range_fun_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_fun_call(PyGrammarParser.Range_fun_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#list2d}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList2d(PyGrammarParser.List2dContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(PyGrammarParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(PyGrammarParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(PyGrammarParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailer(PyGrammarParser.TrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#subscriptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptlist(PyGrammarParser.SubscriptlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#subscript_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript_(PyGrammarParser.Subscript_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#slice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlice(PyGrammarParser.SliceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#slice_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlice_step(PyGrammarParser.Slice_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link PyGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PyGrammarParser.BlockContext ctx);
}