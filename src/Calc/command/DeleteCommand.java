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
