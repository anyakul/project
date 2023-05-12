package task052_Calculator.Core.Models;

import java.util.Arrays;
import java.util.LinkedList;

public class Example<T extends Number> {
    private LinkedList<String> example = new LinkedList<>();
    String[] signs = new String[] { "+", "-", "*", "/" };
    private Double result;

    public void AddElement(String el) {
        example.add(el);
    }

    public void RemoveElement() {
        example.removeLast();
    }

    public String GetLastElement() {
        return example.getLast();
    }

    public double GetPrevRes() {
        example.removeLast();
        example.removeLast();
        example.removeLast();
        return Double.parseDouble(example.getLast());
    }

    public boolean checkSign(String sign) {
        if (Arrays.asList(signs).contains(sign)) {
            return true;
        }

        return false;
    }

    public boolean checkLastElemSign() {
        if (Arrays.asList(signs).contains(example.getLast())) {
            return true;
        }

        return false;
    }

    public void ShowExample(String result) {
        example.removeLast();
        System.out.println(String.join(" ", example) + " = " + result);
    }

    public double getResult() {
        return result;
    }

    public void SetResult(Double result) {
        this.result = result;
    }
}
