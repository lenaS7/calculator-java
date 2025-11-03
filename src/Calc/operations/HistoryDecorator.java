package Calc.operations;
//Rital yahya alghates-2210683
//lena saleh alshehri-2211985
//Shahad hassan alqarni-2217309 


public class HistoryDecorator implements Operation {
    private final Operation wrapped;

    public HistoryDecorator(Operation wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public float apply(float a, float b) {
        float result;
        try {
            result = wrapped.apply(a, b);
            System.out.println("[LOG] " + wrapped.getClass().getSimpleName()
                    + "(" + a + "," + b + ") = " + result);
        } catch (ArithmeticException e) {
            System.out.println("[LOG] " + wrapped.getClass().getSimpleName()
                    + "(" + a + "," + b + ") = Error");
            throw e;
        }
        return result;
    }
}
