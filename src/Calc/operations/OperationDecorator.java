/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc.operations;

/**
 *
 * @author lynasaleh
 */
public abstract class OperationDecorator implements Operation {
    protected Operation wrapped;

    public OperationDecorator(Operation wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public float apply(float a, float b) {
        return wrapped.apply(a, b);
    }
}
