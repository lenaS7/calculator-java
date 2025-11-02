package Calc.operations;
//Rital yahya alghates-2210683
//lena saleh alshehri-2211985
//Shahad hassan alqarni-2217309 
import java.util.ArrayList;
import java.util.List;

public class HistoryDecorator implements Operation {
    private Operation wrappedOperation;
    private static List<String> history = new ArrayList<>();

    public HistoryDecorator(Operation wrappedOperation) {
        this.wrappedOperation = wrappedOperation;
    }

    @Override
    public float apply(float a, float b) {
        float result = wrappedOperation.apply(a, b);
        String record = wrappedOperation.getClass().getSimpleName() +
                        " executed with inputs (" + a + ", " + b + ") = " + result;
        history.add(record);
        System.out.println("[LOG] " + record);
        return result;
    }

    public static List<String> getHistory() {
        return history;
    }
}
