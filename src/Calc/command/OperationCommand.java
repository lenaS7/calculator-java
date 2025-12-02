package Calc.command;
//Rital yahya alghates-2210683
//lena saleh alshehri-2211985
//Shahad hassan alqarni-2217309
import Calc.Calculator;

public class OperationCommand implements Command {

    private final Calculator calculator;
    private final String operationSymbol;

    public OperationCommand(Calculator calculator, String operationSymbol) {
        this.calculator = calculator;
        this.operationSymbol = operationSymbol;
    }

    @Override
    public void execute() {
        calculator.chooseOperation(operationSymbol);
    }
}

