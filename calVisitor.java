// Generated from cal.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(calParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_list(calParser.Decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(calParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link calParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(calParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantDecl}
	 * labeled alternative in {@link calParser#const_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDecl(calParser.ConstantDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncLst}
	 * labeled alternative in {@link calParser#function_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncLst(calParser.FuncLstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyFunc}
	 * labeled alternative in {@link calParser#function_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyFunc(calParser.EmptyFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDecl}
	 * labeled alternative in {@link calParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(calParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link calParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(calParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeBool}
	 * labeled alternative in {@link calParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBool(calParser.TypeBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeVoid}
	 * labeled alternative in {@link calParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVoid(calParser.TypeVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(calParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParType}
	 * labeled alternative in {@link calParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParType(calParser.ParTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParTypeHead}
	 * labeled alternative in {@link calParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParTypeHead(calParser.ParTypeHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(calParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_block(calParser.Statement_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link calParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAssign(calParser.StmtAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtFunCall}
	 * labeled alternative in {@link calParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtFunCall(calParser.StmtFunCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtBeg}
	 * labeled alternative in {@link calParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtBeg(calParser.StmtBegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtIf}
	 * labeled alternative in {@link calParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIf(calParser.StmtIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtWhle}
	 * labeled alternative in {@link calParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtWhle(calParser.StmtWhleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtSkip}
	 * labeled alternative in {@link calParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtSkip(calParser.StmtSkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpBinOp}
	 * labeled alternative in {@link calParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpBinOp(calParser.ExpBinOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpParens}
	 * labeled alternative in {@link calParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParens(calParser.ExpParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpFunCall}
	 * labeled alternative in {@link calParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpFunCall(calParser.ExpFunCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpBit}
	 * labeled alternative in {@link calParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpBit(calParser.ExpBitContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#binary_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_arith_op(calParser.Binary_arith_opContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitID}
	 * labeled alternative in {@link calParser#bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitID(calParser.BitIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitNeg}
	 * labeled alternative in {@link calParser#bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitNeg(calParser.BitNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitNum}
	 * labeled alternative in {@link calParser#bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitNum(calParser.BitNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitTru}
	 * labeled alternative in {@link calParser#bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitTru(calParser.BitTruContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitFals}
	 * labeled alternative in {@link calParser#bit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitFals(calParser.BitFalsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConParens}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConParens(calParser.ConParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConComp}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConComp(calParser.ConCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConNeg}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConNeg(calParser.ConNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConBinOp}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConBinOp(calParser.ConBinOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(calParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list(calParser.Arg_listContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NempID}
	 * labeled alternative in {@link calParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNempID(calParser.NempIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NempArgLst}
	 * labeled alternative in {@link calParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNempArgLst(calParser.NempArgLstContext ctx);
}