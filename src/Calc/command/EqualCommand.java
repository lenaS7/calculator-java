package Calc.command;
//Rital yahya alghates-2210683
//lena saleh alshehri-2211985
//Shahad hassan alqarni-2217309
import Calc.Calculator;

public class EqualCommand implements Command {

    private final Calculator calculator;

    public EqualCommand(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void execute() {
        calculator.compute();
    }
}

