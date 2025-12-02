package Calc.state;
//Rital yahya alghates-2210683
//lena saleh alshehri-2211985
//Shahad hassan alqarni-2217309

import Calc.core.CalculatorContext;
import Calc.facade.CalculatorFacade;

public class ErrorState implements CalculatorState {

    @Override
    public void appendNumber(CalculatorContext ctx, String number) {
        ctx.clear();
        if (".".equals(number)) {
            ctx.setCurrentOperand("0.");
        } else {
            ctx.setCurrentOperand(number);
        }
        ctx.setState(new NormalState());
    }

    @Override
    public void chooseOperation(CalculatorContext ctx, String operation, CalculatorFacade facade) {
       
    }

    @Override
    public void compute(CalculatorContext ctx, CalculatorFacade facade) {
       
    }

    @Override
    public void clear(CalculatorContext ctx, CalculatorFacade facade) {
        facade.clear();
        ctx.setState(new NormalState());
    }
}

