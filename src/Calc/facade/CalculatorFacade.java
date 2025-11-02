package Calc.facade;
//Rital yahya alghates-2210683
//lena saleh alshehri-2211985
//Shahad hassan alqarni-2217309 
import Calc.core.CalculatorContext;
import Calc.operations.Operation;
import Calc.operations.OperationFactory;

public class CalculatorFacade {
    private CalculatorContext context;

    public CalculatorFacade() {
        context = CalculatorContext.getInstance();
    }

    public float compute(String operator, float a, float b) {
    
        context.setPreviousOperand(Float.toString(a));
        context.setCurrentOperand(Float.toString(b));
        context.setOperation(operator);

        Operation op = OperationFactory.create(operator);
        float result = op.apply(a, b);

        context.setCurrentOperand(Float.toString(result));
      
        context.setPreviousOperand("");
        context.setOperation("");

        return result;
    }

    public String getLastResult() {
        return context.getCurrentOperand();
    }
}
