// Generated from /home/jaime/Documents/TranslationTraceUppaal/src/translation/Antlr/TraceUppaalParser.g4 by ANTLR 4.9.2
package translation.Antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TraceUppaalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TraceUppaalParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TraceUppaalParser#trace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrace(TraceUppaalParser.TraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraceUppaalParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(TraceUppaalParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraceUppaalParser#transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition(TraceUppaalParser.TransitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraceUppaalParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(TraceUppaalParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraceUppaalParser#loc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoc(TraceUppaalParser.LocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code values}
	 * labeled alternative in {@link TraceUppaalParser#exprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprexprtypetypetypetypetypetypetypetypetypearrayDeclarrayDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(TraceUppaalParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraceUppaalParser#clocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClocks(TraceUppaalParser.ClocksContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraceUppaalParser#delay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay(TraceUppaalParser.DelayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraceUppaalParser#discrete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscrete(TraceUppaalParser.DiscreteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraceUppaalParser#aDiscrete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADiscrete(TraceUppaalParser.ADiscreteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraceUppaalParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard(TraceUppaalParser.GuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraceUppaalParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(TraceUppaalParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraceUppaalParser#sync}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSync(TraceUppaalParser.SyncContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraceUppaalParser#tau}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTau(TraceUppaalParser.TauContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraceUppaalParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(TraceUppaalParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraceUppaalParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(TraceUppaalParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncrementExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementExpr(TraceUppaalParser.IncrementExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(TraceUppaalParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesisExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpr(TraceUppaalParser.ParenthesisExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpr(TraceUppaalParser.TrueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(TraceUppaalParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(TraceUppaalParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIncrement}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIncrement(TraceUppaalParser.ExprIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExpr(TraceUppaalParser.DotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForallExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForallExpr(TraceUppaalParser.ForallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(TraceUppaalParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumExpr(TraceUppaalParser.SumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(TraceUppaalParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDecrement}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDecrement(TraceUppaalParser.ExprDecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpr(TraceUppaalParser.FalseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(TraceUppaalParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleExpr(TraceUppaalParser.DoubleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(TraceUppaalParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StopWatchExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopWatchExpr(TraceUppaalParser.StopWatchExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(TraceUppaalParser.IdentifierExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NatExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNatExpr(TraceUppaalParser.NatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExistsExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsExpr(TraceUppaalParser.ExistsExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecrementExpr}
	 * labeled alternative in {@link TraceUppaalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementExpr(TraceUppaalParser.DecrementExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraceUppaalParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(TraceUppaalParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierType(TraceUppaalParser.IdentifierTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(TraceUppaalParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleType(TraceUppaalParser.DoubleTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClockType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClockType(TraceUppaalParser.ClockTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChanType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChanType(TraceUppaalParser.ChanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(TraceUppaalParser.BoolTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntDomainType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDomainType(TraceUppaalParser.IntDomainTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScalarType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarType(TraceUppaalParser.ScalarTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructType}
	 * labeled alternative in {@link TraceUppaalParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructType(TraceUppaalParser.StructTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraceUppaalParser#fieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDecl(TraceUppaalParser.FieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TraceUppaalParser#varFieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarFieldDecl(TraceUppaalParser.VarFieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDeclExpr}
	 * labeled alternative in {@link TraceUppaalParser#arrayDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclExpr(TraceUppaalParser.ArrayDeclExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayDeclType}
	 * labeled alternative in {@link TraceUppaalParser#arrayDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclType(TraceUppaalParser.ArrayDeclTypeContext ctx);
}