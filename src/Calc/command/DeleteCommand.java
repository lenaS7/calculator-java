package Calc.command;
//Rital yahya alghates-2210683
//lena saleh alshehri-2211985
//Shahad hassan alqarni-2217309
import Calc.Calculator;
import Calc.core.CalculatorContext;

public class DeleteCommand implements Command {

    private final Calculator calculator;
    private final CalculatorContext ctx;

    public DeleteCommand(Calculator calculator, CalculatorContext ctx) {
        this.calculator = calculator;
        this.ctx = ctx;
    }

    @Override
    public void execute() {
        String curr = ctx.getCurrentOperand();
        if (!curr.equals("")) {
            ctx.setCurrentOperand(curr.substring(0, curr.length() - 1));
            calculator.updateDisplay();
        }
    }
}
