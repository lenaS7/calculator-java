/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc.facade;

/**
 *
 * @author lynasaleh
 */


import Calc.core.CalculatorContext;
import Calc.operations.Operation;
import Calc.operations.OperationFactory;

public class CalculatorFacade {
    private CalculatorContext context;

    public CalculatorFacade() {
        context = CalculatorContext.getInstance();
    }

    public float compute(String operator, float a, float b) {
        // نستخدم previous و current كما هو في CalculatorContext
        context.setPreviousOperand(Float.toString(a));
        context.setCurrentOperand(Float.toString(b));
        context.setOperation(operator);

        Operation op = OperationFactory.create(operator);
        float result = op.apply(a, b);

        // نخزن النتيجة في الـ currentOperand
        context.setCurrentOperand(Float.toString(result));
        // نفرغ القديم بعد الحساب
        context.setPreviousOperand("");
        context.setOperation("");

        return result;
    }

    public String getLastResult() {
        return context.getCurrentOperand();
    }
}
