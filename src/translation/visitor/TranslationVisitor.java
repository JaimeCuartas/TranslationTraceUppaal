package translation.visitor;

import translation.Antlr.TraceUppaalParser;
import translation.Antlr.TraceUppaalParserBaseVisitor;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class TranslationVisitor extends TraceUppaalParserBaseVisitor<String> {

    private final Set<String> channels;
    private float timeout;

    public TranslationVisitor(Set<String> channels){
        this.timeout = 0;
        this.channels = channels;
    }

    public float getTimeout(){
        return this.timeout;
    }

    public Set<String> getChannels() {
        return this.channels;
    }

    @Override
    public String visitTrace(TraceUppaalParser.TraceContext ctx) {
        String output = "";
        for(TraceUppaalParser.TransitionContext transition: ctx.transition()){
            output = output.concat(visit(transition));
        }
        return output;
    }

    @Override
    public String visitState(TraceUppaalParser.StateContext ctx) {
        return super.visitState(ctx);
    }

    @Override
    public String visitTransition(TraceUppaalParser.TransitionContext ctx) {
        return super.visitTransition(ctx);
    }

    @Override
    public String visitLocation(TraceUppaalParser.LocationContext ctx) {
        return super.visitLocation(ctx);
    }

    @Override
    public String visitLoc(TraceUppaalParser.LocContext ctx) {
        return super.visitLoc(ctx);
    }

    @Override
    public String visitValues(TraceUppaalParser.ValuesContext ctx) {
        return super.visitValues(ctx);
    }

    @Override
    public String visitClocks(TraceUppaalParser.ClocksContext ctx) {
        return super.visitClocks(ctx);
    }

    @Override
    public String visitDelay(TraceUppaalParser.DelayContext ctx) {
        String delayString = ctx.POINT().toString();
        double delayDouble = Double.parseDouble(delayString);


        //DecimalFormat dFormat = new DecimalFormat("#.####");
        //delayString = dFormat.format(delayDouble);
        delayString = String.format(Locale.US, "%.4f", delayDouble);

        this.timeout += Float.parseFloat(delayString);

        return "delay ".concat(delayString).concat(";\n");
    }

    @Override
    public String visitDiscrete(TraceUppaalParser.DiscreteContext ctx) {
        return visit(ctx.aDiscrete(0));
    }

    @Override
    public String visitADiscrete(TraceUppaalParser.ADiscreteContext ctx) {
        String nameChan = visit(ctx.action());
        String output = "output ".concat(nameChan).concat("();\n");
        this.channels.add(nameChan);
        return output;
    }

    @Override
    public String visitGuard(TraceUppaalParser.GuardContext ctx) {
        return super.visitGuard(ctx);
    }

    @Override
    public String visitAction(TraceUppaalParser.ActionContext ctx){
        if(ctx.tau()!=null){
            return visit(ctx.tau());
        }
        if(ctx.sync()!=null){
            return visit(ctx.sync());
        }
        return ctx.toString();
    }

    @Override
    public String visitTau(TraceUppaalParser.TauContext ctx) {
        return "tau";
    }

    @Override
    public String visitSync(TraceUppaalParser.SyncContext ctx) {
        return ctx.IDENTIFIER().toString();
    }

    @Override
    public String visitUpdate(TraceUppaalParser.UpdateContext ctx) {
        return super.visitUpdate(ctx);
    }

    @Override
    public String visitAssign(TraceUppaalParser.AssignContext ctx) {
        return super.visitAssign(ctx);
    }

    @Override
    public String visitIncrementExpr(TraceUppaalParser.IncrementExprContext ctx) {
        return super.visitIncrementExpr(ctx);
    }

    @Override
    public String visitIfExpr(TraceUppaalParser.IfExprContext ctx) {
        return super.visitIfExpr(ctx);
    }

    @Override
    public String visitParenthesisExpr(TraceUppaalParser.ParenthesisExprContext ctx) {
        return super.visitParenthesisExpr(ctx);
    }

    @Override
    public String visitTrueExpr(TraceUppaalParser.TrueExprContext ctx) {
        return super.visitTrueExpr(ctx);
    }

    @Override
    public String visitComparisonExpr(TraceUppaalParser.ComparisonExprContext ctx) {
        return super.visitComparisonExpr(ctx);
    }

    @Override
    public String visitBinaryExpr(TraceUppaalParser.BinaryExprContext ctx) {
        return super.visitBinaryExpr(ctx);
    }

    @Override
    public String visitExprIncrement(TraceUppaalParser.ExprIncrementContext ctx) {
        return super.visitExprIncrement(ctx);
    }

    @Override
    public String visitDotExpr(TraceUppaalParser.DotExprContext ctx) {
        return super.visitDotExpr(ctx);
    }

    @Override
    public String visitForallExpr(TraceUppaalParser.ForallExprContext ctx) {
        return super.visitForallExpr(ctx);
    }

    @Override
    public String visitUnaryExpr(TraceUppaalParser.UnaryExprContext ctx) {
        return super.visitUnaryExpr(ctx);
    }

    @Override
    public String visitSumExpr(TraceUppaalParser.SumExprContext ctx) {
        return super.visitSumExpr(ctx);
    }

    @Override
    public String visitFuncExpr(TraceUppaalParser.FuncExprContext ctx) {
        return super.visitFuncExpr(ctx);
    }

    @Override
    public String visitExprDecrement(TraceUppaalParser.ExprDecrementContext ctx) {
        return super.visitExprDecrement(ctx);
    }

    @Override
    public String visitFalseExpr(TraceUppaalParser.FalseExprContext ctx) {
        return super.visitFalseExpr(ctx);
    }

    @Override
    public String visitAssignExpr(TraceUppaalParser.AssignExprContext ctx) {
        return super.visitAssignExpr(ctx);
    }

    @Override
    public String visitDoubleExpr(TraceUppaalParser.DoubleExprContext ctx) {
        return super.visitDoubleExpr(ctx);
    }

    @Override
    public String visitArrayExpr(TraceUppaalParser.ArrayExprContext ctx) {
        return super.visitArrayExpr(ctx);
    }

    @Override
    public String visitStopWatchExpr(TraceUppaalParser.StopWatchExprContext ctx) {
        return super.visitStopWatchExpr(ctx);
    }

    @Override
    public String visitIdentifierExpr(TraceUppaalParser.IdentifierExprContext ctx) {
        return super.visitIdentifierExpr(ctx);
    }

    @Override
    public String visitNatExpr(TraceUppaalParser.NatExprContext ctx) {
        return super.visitNatExpr(ctx);
    }

    @Override
    public String visitExistsExpr(TraceUppaalParser.ExistsExprContext ctx) {
        return super.visitExistsExpr(ctx);
    }

    @Override
    public String visitDecrementExpr(TraceUppaalParser.DecrementExprContext ctx) {
        return super.visitDecrementExpr(ctx);
    }

    @Override
    public String visitArguments(TraceUppaalParser.ArgumentsContext ctx) {
        return super.visitArguments(ctx);
    }

    @Override
    public String visitIdentifierType(TraceUppaalParser.IdentifierTypeContext ctx) {
        return super.visitIdentifierType(ctx);
    }

    @Override
    public String visitIntType(TraceUppaalParser.IntTypeContext ctx) {
        return super.visitIntType(ctx);
    }

    @Override
    public String visitDoubleType(TraceUppaalParser.DoubleTypeContext ctx) {
        return super.visitDoubleType(ctx);
    }

    @Override
    public String visitClockType(TraceUppaalParser.ClockTypeContext ctx) {
        return super.visitClockType(ctx);
    }

    @Override
    public String visitChanType(TraceUppaalParser.ChanTypeContext ctx) {
        return super.visitChanType(ctx);
    }

    @Override
    public String visitBoolType(TraceUppaalParser.BoolTypeContext ctx) {
        return super.visitBoolType(ctx);
    }

    @Override
    public String visitIntDomainType(TraceUppaalParser.IntDomainTypeContext ctx) {
        return super.visitIntDomainType(ctx);
    }

    @Override
    public String visitScalarType(TraceUppaalParser.ScalarTypeContext ctx) {
        return super.visitScalarType(ctx);
    }

    @Override
    public String visitStructType(TraceUppaalParser.StructTypeContext ctx) {
        return super.visitStructType(ctx);
    }

    @Override
    public String visitFieldDecl(TraceUppaalParser.FieldDeclContext ctx) {
        return super.visitFieldDecl(ctx);
    }

    @Override
    public String visitVarFieldDecl(TraceUppaalParser.VarFieldDeclContext ctx) {
        return super.visitVarFieldDecl(ctx);
    }

    @Override
    public String visitArrayDeclExpr(TraceUppaalParser.ArrayDeclExprContext ctx) {
        return super.visitArrayDeclExpr(ctx);
    }

    @Override
    public String visitArrayDeclType(TraceUppaalParser.ArrayDeclTypeContext ctx) {
        return super.visitArrayDeclType(ctx);
    }
}
