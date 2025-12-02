package Calc.command;
//Rital yahya alghates-2210683
//lena saleh alshehri-2211985
//Shahad hassan alqarni-2217309
import Calc.Calculator;
import Calc.core.CalculatorContext;

public class ToggleSignCommand implements Command {

    private final Calculator calculator;
    private final CalculatorContext ctx;

    public ToggleSignCommand(Calculator calculator, CalculatorContext ctx) {
        this.calculator = calculator;
        this.ctx = ctx;
    }

    @Override
    public void execute() {
        String curr = ctx.getCurrentOperand();
        if (!curr.isBlank()) {
            float tmp = -Float.parseFloat(curr);
            ctx.setCurrentOperand(
                    (tmp - (int) tmp) != 0 ? Float.toString(tmp) : Integer.toString((int) tmp)
            );
            calculator.updateDisplay();
        }
    }
}

