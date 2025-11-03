package Calc.facade;
//Rital yahya alghates-2210683
//lena saleh alshehri-2211985
//Shahad hassan alqarni-2217309 

import Calc.core.CalculatorContext;
import Calc.operations.Operation;
import Calc.operations.OperationFactory;

public class CalculatorFacade {
    private final CalculatorContext context;

    public CalculatorFacade(CalculatorContext context) {
        this.context = context;
    }

    public float compute(float a, String opSymbol, float b) {
        Operation op = OperationFactory.create(opSymbol);
        float result = op.apply(a, b);
        context.setCurrentOperand(String.valueOf(result)); 
        return result;
    }

    public String getLastResult() {
        return context.getCurrentOperand();
    }

    public void clear() {
        context.setCurrentOperand("");
        context.setPreviousOperand("");
        context.setOperation("");
    }
}
