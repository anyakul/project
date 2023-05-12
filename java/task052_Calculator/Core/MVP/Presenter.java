package task052_Calculator.Core.MVP;

import task052_Calculator.Core.Models.Example;

public class Presenter<T extends Number> {
    private Example<T> example;

    public Presenter(Example<T> example) {
        this.example = example;
    }

    public void CalcNums(T num1) {
        double result = example.getResult();
        Model<T> model = new Model<>(result, num1);
        String sign = example.GetLastElement();

        if (sign.equals("+")) {
            result = model.sum();
        } else if (sign.equals("-")) {
            result = model.subtract();
        } else if (sign.equals("*")) {
            result = model.multiply();
        } else if (sign.equals("/")) {
            if (num1.equals(0) && example.GetLastElement().equals("/")) {
                System.out.print("На 0 делить нельзя. Введите другое число: ");
            }
            result = model.divide();
        }

        example.AddElement("" + num1);
        example.AddElement("" + result);
        example.SetResult(result);
    }
}
