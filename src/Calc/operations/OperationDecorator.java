package Calc.operations;
//Rital yahya alghates-2210683
//lena saleh alshehri-2211985
//Shahad hassan alqarni-2217309
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
