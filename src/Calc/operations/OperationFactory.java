package Calc.operations;
//Rital yahya alghates-2210683
//lena saleh alshehri-2211985
//Shahad hassan alqarni-2217309 

public final class OperationFactory {
    private OperationFactory() {}

    public static Operation create(String symbol) {
        if (symbol == null) throw new IllegalArgumentException("Null op");
        String s = symbol.trim();

        Operation op;
        if (s.equals("+")) op = new AddOp();
        else if (s.equals("-")) op = new SubOp();
        else if (s.equals("*") || s.equals("×")) op = new MulOp();
        else if (s.equals("/") || s.equals("÷")) op = new DivOp();
        else throw new IllegalArgumentException("Unknown op: " + symbol);

        op = new HistoryDecorator(op);

        return op;
    }
}
