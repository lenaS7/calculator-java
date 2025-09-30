package Calc.operations;

public class DivOp implements Operation {
    @Override public float apply(float a, float b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
}
