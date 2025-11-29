package Calc.operations;
//Rital yahya alghates-2210683
//lena saleh alshehri-2211985
//Shahad hassan alqarni-2217309 
      
public class HistoryDecorator extends OperationDecorator {

    public HistoryDecorator(Operation wrapped) {
        super(wrapped);
    }

    @Override
    public float apply(float a, float b) {
        float result = wrapped.apply(a, b);
        System.out.println("[LOG] " + wrapped.getClass().getSimpleName()
                + "(" + a + ", " + b + ") = " + result);
        return result;
    }
}
