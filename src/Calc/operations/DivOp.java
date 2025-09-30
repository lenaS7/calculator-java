package Calc.operations;
//Rital yahya alghates-2210683
//lena saleh alshehri-2211985
//Shahad hassan alqarni-2217309 
public class DivOp implements Operation {
    @Override public float apply(float a, float b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
}
