package Calc.state;
//Rital yahya alghates-2210683
//lena saleh alshehri-2211985
//Shahad hassan alqarni-2217309

import Calc.core.CalculatorContext;
import Calc.facade.CalculatorFacade;

public class NormalState implements CalculatorState {

    @Override
    public void appendNumber(CalculatorContext ctx, String number) {
        ctx.clearError();

        if (ctx.getCurrentOperand().equals("0") && number.equals("0")) {
            return;
        }

        if (number.equals(".") && ctx.getCurrentOperand().contains(".")) {
            return;
        }

        if (ctx.getCurrentOperand().equals("0")
                && !number.equals("0")
                && !number.equals(".")) {
            ctx.setCurrentOperand("");
        }

        ctx.setCurrentOperand(ctx.getCurrentOperand() + number);
    }

    @Override
    public void chooseOperation(CalculatorContext ctx, String operation, CalculatorFacade facade) {
        if (ctx.getCurrentOperand().equals("") && !ctx.getPreviousOperand().equals("")) {
            ctx.setOperation(operation);
            return;
        }
        if (ctx.getCurrentOperand().equals("")) {
            return;
        }

        if (!ctx.getPreviousOperand().equals("")) {
            compute(ctx, facade);
        }

        ctx.setOperation(operation);
        ctx.setPreviousOperand(ctx.getCurrentOperand());
        ctx.setCurrentOperand("");
    }

    @Override
    public void compute(CalculatorContext ctx, CalculatorFacade facade) {
        if (ctx.getCurrentOperand().equals("") || ctx.getPreviousOperand().equals("")) {
            return;
        }

        try {
            float curr = Float.parseFloat(ctx.getCurrentOperand());
            float prev = Float.parseFloat(ctx.getPreviousOperand());
            String op = ctx.getOperation();

            float result = facade.compute(prev, op, curr);

            if ((result - (int) result) != 0) {
                ctx.setCurrentOperand(Float.toString(result));
            } else {
                ctx.setCurrentOperand(Integer.toString((int) result));
            }

            ctx.setOperation("");
            ctx.setPreviousOperand("");
        } catch (Exception ex) {
            ctx.clear();
            ctx.setCurrentOperand("Error");
            ctx.setState(new ErrorState());
        }
    }

    @Override
    public void clear(CalculatorContext ctx, CalculatorFacade facade) {
        facade.clear();
    }
}
