package Calc.state;
//Rital yahya alghates-2210683
//lena saleh alshehri-2211985
//Shahad hassan alqarni-2217309
import Calc.core.CalculatorContext;
import Calc.facade.CalculatorFacade;

public interface CalculatorState {
    void appendNumber(CalculatorContext ctx, String number);
    void chooseOperation(CalculatorContext ctx, String operation, CalculatorFacade facade);
    void compute(CalculatorContext ctx, CalculatorFacade facade);
    void clear(CalculatorContext ctx, CalculatorFacade facade);
}
