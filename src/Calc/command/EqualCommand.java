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

