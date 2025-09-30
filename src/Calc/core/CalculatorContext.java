package Calc.core;
//Rital yahya alghates-2210683
//lena saleh alshehri-2211985
//Shahad hassan alqarni-2217309 

public final class CalculatorContext {
    // Singleton 
    private static volatile CalculatorContext INSTANCE;

    private String currentOperand = "";
    private String previousOperand = "";
    private String operation = "";

    private CalculatorContext() {}

    public static CalculatorContext getInstance() {
        CalculatorContext local = INSTANCE;
        if (local == null) {
            synchronized (CalculatorContext.class) {
                local = INSTANCE;
                if (local == null) {
                    local = new CalculatorContext();
                    INSTANCE = local;
                }
            }
        }
        return local;
    }

    public String getCurrentOperand() { return currentOperand; }
    public void setCurrentOperand(String v) { currentOperand = (v != null) ? v : ""; }

    public String getPreviousOperand() { return previousOperand; }
    public void setPreviousOperand(String v) { previousOperand = (v != null) ? v : ""; }

    public String getOperation() { return operation; }
    public void setOperation(String op) { operation = (op != null) ? op : ""; }

    public boolean isReadyToCompute() {
        return !operation.isBlank() && !previousOperand.isBlank() && !currentOperand.isBlank();
    }

    public boolean hasError() { return "Error".equals(currentOperand); }

    public void clearError() {
        if (hasError()) currentOperand = "";
    }

    public void clear() {
        currentOperand = "";
        previousOperand = "";
        operation = "";
    }
}
