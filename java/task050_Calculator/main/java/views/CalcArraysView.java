package task050_Calculator.main.java.views;

import java.util.StringJoiner;

public class CalcArraysView<T extends Number> {
    private final boolean error;
    private final String errorMessage;
    private Double[] arr;

    public CalcArraysView(boolean error, String errorMessage, Double[] arr) {
        this.error = error;
        this.errorMessage = errorMessage;
        this.arr = arr;
    }

    public void printList() {
        StringJoiner res = new StringJoiner(", ");

        if (error) {
            res.add(errorMessage);
        } else {
            for (Double el : arr) {
                res.add(el + "");
            }
        }

        System.out.println(res);
    }

    public final String getErrorMessage() {
        return errorMessage;
    }

    public final boolean getError() {
        return error;
    }

    public Double[] getArr() {
        return arr;
    }
}
