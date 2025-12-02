package Calc.command;
//Rital yahya alghates-2210683
//lena saleh alshehri-2211985
//Shahad hassan alqarni-2217309
import Calc.Calculator;

public class ClearCommand implements Command {

    private final Calculator calculator;

    public ClearCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        calculator.clear();
    }
}

