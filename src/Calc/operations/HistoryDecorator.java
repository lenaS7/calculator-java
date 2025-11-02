/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc.operations;

/**
 *
 * @author lynasaleh
 */

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
