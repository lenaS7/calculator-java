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

public interface CalculatorState {
    void appendNumber(CalculatorContext ctx, String number);
    void chooseOperation(CalculatorContext ctx, String operation, CalculatorFacade facade);
    void compute(CalculatorContext ctx, CalculatorFacade facade);
    void clear(CalculatorContext ctx, CalculatorFacade facade);
}
