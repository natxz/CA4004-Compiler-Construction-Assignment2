// Generated from cal.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calParser}.
 */
public interface calListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(calParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(calParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void enterDecl_list(calParser.Decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void exitDecl_list(calParser.Decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(calParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(calParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link calParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(calParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link calParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(calParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantDecl}
	 * labeled alternative in {@link calParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void enterConstantDecl(calParser.ConstantDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantDecl}
	 * labeled alternative in {@link calParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void exitConstantDecl(calParser.ConstantDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncLst}
	 * labeled alternative in {@link calParser#function_list}.
	 * @param ctx the parse tree
	 */
	void enterFuncLst(calParser.FuncLstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncLst}
	 * labeled alternative in {@link calParser#function_list}.
	 * @param ctx the parse tree
	 */
	void exitFuncLst(calParser.FuncLstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyFunc}
	 * labeled alternative in {@link calParser#function_list}.
	 * @param ctx the parse tree
	 */
	void enterEmptyFunc(calParser.EmptyFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyFunc}
	 * labeled alternative in {@link calParser#function_list}.
	 * @param ctx the parse tree
	 */
	void exitEmptyFunc(calParser.EmptyFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDecl}
	 * labeled alternative in {@link calParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(calParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDecl}
	 * labeled alternative in {@link calParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(calParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link calParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(calParser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link calParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(calParser.TypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeBool}
	 * labeled alternative in {@link calParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeBool(calParser.TypeBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeBool}
	 * labeled alternative in {@link calParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeBool(calParser.TypeBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeVoid}
	 * labeled alternative in {@link calParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeVoid(calParser.TypeVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeVoid}
	 * labeled alternative in {@link calParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeVoid(calParser.TypeVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(calParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(calParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParType}
	 * labeled alternative in {@link calParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParType(calParser.ParTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParType}
	 * labeled alternative in {@link calParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParType(calParser.ParTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParTypeHead}
	 * labeled alternative in {@link calParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParTypeHead(calParser.ParTypeHeadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParTypeHead}
	 * labeled alternative in {@link calParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParTypeHead(calParser.ParTypeHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(calParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(calParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(calParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(calParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link calParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtAssign(calParser.StmtAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link calParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtAssign(calParser.StmtAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtFunCall}
	 * labeled alternative in {@link calParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtFunCall(calParser.StmtFunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtFunCall}
	 * labeled alternative in {@link calParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtFunCall(calParser.StmtFunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtBeg}
	 * labeled alternative in {@link calParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtBeg(calParser.StmtBegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtBeg}
	 * labeled alternative in {@link calParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtBeg(calParser.StmtBegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtIf}
	 * labeled alternative in {@link calParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtIf(calParser.StmtIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtIf}
	 * labeled alternative in {@link calParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtIf(calParser.StmtIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtWhle}
	 * labeled alternative in {@link calParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtWhle(calParser.StmtWhleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtWhle}
	 * labeled alternative in {@link calParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtWhle(calParser.StmtWhleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtSkip}
	 * labeled alternative in {@link calParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtSkip(calParser.StmtSkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtSkip}
	 * labeled alternative in {@link calParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtSkip(calParser.StmtSkipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpBinOp}
	 * labeled alternative in {@link calParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpBinOp(calParser.ExpBinOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpBinOp}
	 * labeled alternative in {@link calParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpBinOp(calParser.ExpBinOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpParens}
	 * labeled alternative in {@link calParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpParens(calParser.ExpParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpParens}
	 * labeled alternative in {@link calParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpParens(calParser.ExpParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpFunCall}
	 * labeled alternative in {@link calParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpFunCall(calParser.ExpFunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpFunCall}
	 * labeled alternative in {@link calParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpFunCall(calParser.ExpFunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpBit}
	 * labeled alternative in {@link calParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpBit(calParser.ExpBitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpBit}
	 * labeled alternative in {@link calParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpBit(calParser.ExpBitContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterBinary_arith_op(calParser.Binary_arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitBinary_arith_op(calParser.Binary_arith_opContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitID}
	 * labeled alternative in {@link calParser#bit}.
	 * @param ctx the parse tree
	 */
	void enterBitID(calParser.BitIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitID}
	 * labeled alternative in {@link calParser#bit}.
	 * @param ctx the parse tree
	 */
	void exitBitID(calParser.BitIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitNeg}
	 * labeled alternative in {@link calParser#bit}.
	 * @param ctx the parse tree
	 */
	void enterBitNeg(calParser.BitNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitNeg}
	 * labeled alternative in {@link calParser#bit}.
	 * @param ctx the parse tree
	 */
	void exitBitNeg(calParser.BitNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitNum}
	 * labeled alternative in {@link calParser#bit}.
	 * @param ctx the parse tree
	 */
	void enterBitNum(calParser.BitNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitNum}
	 * labeled alternative in {@link calParser#bit}.
	 * @param ctx the parse tree
	 */
	void exitBitNum(calParser.BitNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitTru}
	 * labeled alternative in {@link calParser#bit}.
	 * @param ctx the parse tree
	 */
	void enterBitTru(calParser.BitTruContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitTru}
	 * labeled alternative in {@link calParser#bit}.
	 * @param ctx the parse tree
	 */
	void exitBitTru(calParser.BitTruContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitFals}
	 * labeled alternative in {@link calParser#bit}.
	 * @param ctx the parse tree
	 */
	void enterBitFals(calParser.BitFalsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitFals}
	 * labeled alternative in {@link calParser#bit}.
	 * @param ctx the parse tree
	 */
	void exitBitFals(calParser.BitFalsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConParens}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConParens(calParser.ConParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConParens}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConParens(calParser.ConParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConComp}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConComp(calParser.ConCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConComp}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConComp(calParser.ConCompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConNeg}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConNeg(calParser.ConNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConNeg}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConNeg(calParser.ConNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConBinOp}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterConBinOp(calParser.ConBinOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConBinOp}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitConBinOp(calParser.ConBinOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(calParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(calParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(calParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(calParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NempID}
	 * labeled alternative in {@link calParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterNempID(calParser.NempIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NempID}
	 * labeled alternative in {@link calParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitNempID(calParser.NempIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NempArgLst}
	 * labeled alternative in {@link calParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterNempArgLst(calParser.NempArgLstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NempArgLst}
	 * labeled alternative in {@link calParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitNempArgLst(calParser.NempArgLstContext ctx);
}