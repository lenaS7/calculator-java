package Calc.operations;
//Rital yahya alghates-2210683
//lena saleh alshehri-2211985
//Shahad hassan alqarni-2217309 
public final class OperationFactory {
    private OperationFactory() {}

    public static Operation create(String symbol) {
        if (symbol == null) throw new IllegalArgumentException("Null op");
        String s = symbol.trim();
        if (s.equals("+")) return new AddOp();
        if (s.equals("-")) return new SubOp();
        if (s.equals("*") || s.equals("×")) return new MulOp();
        if (s.equals("/") || s.equals("÷")) return new DivOp();
        throw new IllegalArgumentException("Unknown op: " + symbol);
    }
}
