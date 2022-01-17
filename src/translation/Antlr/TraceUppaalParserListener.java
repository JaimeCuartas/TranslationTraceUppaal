// Generated from /home/jaime/Documents/TranslationTraceUppaal/src/translation/Antlr/TraceUppaalParser.g4 by ANTLR 4.9.2
package translation.Antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TraceUppaalParser}.
 */
public interface TraceUppaalParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TraceUppaalParser#trace}.
	 * @param ctx the parse tree
	 */
	void enterTrace(TraceUppaalParser.TraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraceUppaalParser#trace}.
	 * @param ctx the parse tree
	 */
	void exitTrace(TraceUppaalParser.TraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraceUppaalParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(TraceUppaalParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraceUppaalParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(TraceUppaalParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraceUppaalParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(TraceUppaalParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraceUppaalParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(TraceUppaalParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraceUppaalParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(TraceUppaalParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraceUppaalParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(TraceUppaalParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraceUppaalParser#loc}.
	 * @param ctx the parse tree
	 */
	void enterLoc(TraceUppaalParser.LocContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraceUppaalParser#loc}.
	 * @param ctx the parse tree
	 */
	void exitLoc(TraceUppaalParser.LocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code values}
	 * labeled alternative in {@link TraceUppaalParser#exprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprtypetypetypetypetypetypetypetypetypearrayDeclarrayDecl}.
	 * @param ctx the parse tree
	 */
	void enterValues(TraceUppaalParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code values}
	 * labeled alternative in {@link TraceUppaalParser#exprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprtypetypetypetypetypetypetypetypetypearrayDeclarrayDecl}.
	 * @param ctx the parse tree
	 */
	void exitValues(TraceUppaalParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraceUppaalParser#clocks}.
	 * @param ctx the parse tree
	 */
	void enterClocks(TraceUppaalParser.ClocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraceUppaalParser#clocks}.
	 * @param ctx the parse tree
	 */
	void exitClocks(TraceUppaalParser.ClocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraceUppaalParser#delay}.
	 * @param ctx the parse tree
	 */
	void enterDelay(TraceUppaalParser.DelayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraceUppaalParser#delay}.
	 * @param ctx the parse tree
	 */
	void exitDelay(TraceUppaalParser.DelayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraceUppaalParser#discrete}.
	 * @param ctx the parse tree
	 */
	void enterDiscrete(TraceUppaalParser.DiscreteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraceUppaalParser#discrete}.
	 * @param ctx the parse tree
	 */
	void exitDiscrete(TraceUppaalParser.DiscreteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraceUppaalParser#aDiscrete}.
	 * @param ctx the parse tree
	 */
	void enterADiscrete(TraceUppaalParser.ADiscreteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraceUppaalParser#aDiscrete}.
	 * @param ctx the parse tree
	 */
	void exitADiscrete(TraceUppaalParser.ADiscreteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraceUppaalParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(TraceUppaalParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraceUppaalParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(TraceUppaalParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraceUppaalParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(TraceUppaalParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraceUppaalParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(TraceUppaalParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraceUppaalParser#sync}.
	 * @param ctx the parse tree
	 */
	void enterSync(TraceUppaalParser.SyncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraceUppaalParser#sync}.
	 * @param ctx the parse tree
	 */
	void exitSync(TraceUppaalParser.SyncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraceUppaalParser#tau}.
	 * @param ctx the parse tree
	 */
	void enterTau(TraceUppaalParser.TauContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraceUppaalParser#tau}.
	 * @param ctx the parse tree
	 */
	void exitTau(TraceUppaalParser.TauContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraceUppaalParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(TraceUppaalParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraceUppaalParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(TraceUppaalParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraceUppaalParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(TraceUppaalParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraceUppaalParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(TraceUppaalParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncrementExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIncrementExpr(TraceUppaalParser.IncrementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncrementExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIncrementExpr(TraceUppaalParser.IncrementExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(TraceUppaalParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(TraceUppaalParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpr(TraceUppaalParser.ParenthesisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpr(TraceUppaalParser.ParenthesisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(TraceUppaalParser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(TraceUppaalParser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(TraceUppaalParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(TraceUppaalParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(TraceUppaalParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(TraceUppaalParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIncrement}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIncrement(TraceUppaalParser.ExprIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIncrement}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIncrement(TraceUppaalParser.ExprIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDotExpr(TraceUppaalParser.DotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDotExpr(TraceUppaalParser.DotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForallExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterForallExpr(TraceUppaalParser.ForallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForallExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitForallExpr(TraceUppaalParser.ForallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(TraceUppaalParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(TraceUppaalParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSumExpr(TraceUppaalParser.SumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSumExpr(TraceUppaalParser.SumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(TraceUppaalParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(TraceUppaalParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDecrement}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDecrement(TraceUppaalParser.ExprDecrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDecrement}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDecrement(TraceUppaalParser.ExprDecrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(TraceUppaalParser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(TraceUppaalParser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(TraceUppaalParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(TraceUppaalParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDoubleExpr(TraceUppaalParser.DoubleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDoubleExpr(TraceUppaalParser.DoubleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(TraceUppaalParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(TraceUppaalParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StopWatchExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStopWatchExpr(TraceUppaalParser.StopWatchExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StopWatchExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStopWatchExpr(TraceUppaalParser.StopWatchExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(TraceUppaalParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(TraceUppaalParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NatExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNatExpr(TraceUppaalParser.NatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NatExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNatExpr(TraceUppaalParser.NatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExistsExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExistsExpr(TraceUppaalParser.ExistsExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExistsExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExistsExpr(TraceUppaalParser.ExistsExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecrementExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDecrementExpr(TraceUppaalParser.DecrementExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecrementExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDecrementExpr(TraceUppaalParser.DecrementExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraceUppaalParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(TraceUppaalParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraceUppaalParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(TraceUppaalParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierType(TraceUppaalParser.IdentifierTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierType(TraceUppaalParser.IdentifierTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntType(TraceUppaalParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntType(TraceUppaalParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleType(TraceUppaalParser.DoubleTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleType(TraceUppaalParser.DoubleTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClockType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterClockType(TraceUppaalParser.ClockTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClockType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitClockType(TraceUppaalParser.ClockTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChanType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterChanType(TraceUppaalParser.ChanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChanType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitChanType(TraceUppaalParser.ChanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(TraceUppaalParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(TraceUppaalParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntDomainType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntDomainType(TraceUppaalParser.IntDomainTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntDomainType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntDomainType(TraceUppaalParser.IntDomainTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScalarType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterScalarType(TraceUppaalParser.ScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScalarType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitScalarType(TraceUppaalParser.ScalarTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterStructType(TraceUppaalParser.StructTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitStructType(TraceUppaalParser.StructTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraceUppaalParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(TraceUppaalParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraceUppaalParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(TraceUppaalParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TraceUppaalParser#varFieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarFieldDecl(TraceUppaalParser.VarFieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TraceUppaalParser#varFieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarFieldDecl(TraceUppaalParser.VarFieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDeclExpr}
	 * labeled alternative in {@link TraceUppaalParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclExpr(TraceUppaalParser.ArrayDeclExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDeclExpr}
	 * labeled alternative in {@link TraceUppaalParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclExpr(TraceUppaalParser.ArrayDeclExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayDeclType}
	 * labeled alternative in {@link TraceUppaalParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclType(TraceUppaalParser.ArrayDeclTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayDeclType}
	 * labeled alternative in {@link TraceUppaalParser#arrayDecl}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclType(TraceUppaalParser.ArrayDeclTypeContext ctx);
}