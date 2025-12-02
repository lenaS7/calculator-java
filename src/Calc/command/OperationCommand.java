package Calc.command;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lynasaleh
 */

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

