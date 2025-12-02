package Calc.state;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lynasaleh
 */

import Calc.core.CalculatorContext;
import Calc.facade.CalculatorFacade;

public class ErrorState implements CalculatorState {

    @Override
    public void appendNumber(CalculatorContext ctx, String number) {
        ctx.clear();
        if (".".equals(number)) {
            ctx.setCurrentOperand("0.");
        } else {
            ctx.setCurrentOperand(number);
        }
        ctx.setState(new NormalState());
    }

    @Override
    public void chooseOperation(CalculatorContext ctx, String operation, CalculatorFacade facade) {
        // ignore while in error
    }

    @Override
    public void compute(CalculatorContext ctx, CalculatorFacade facade) {
        // ignore while in error
    }

    @Override
    public void clear(CalculatorContext ctx, CalculatorFacade facade) {
        facade.clear();
        ctx.setState(new NormalState());
    }
}

