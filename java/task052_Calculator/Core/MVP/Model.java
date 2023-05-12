package task052_Calculator.Core.MVP;

public class Model<T extends Number> {
    private Double num1;
    private T num2;

    public Model(Double num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sum() {
        if (num1 == null || num2 == null) {
            return 0;
        }

        return num1 + num2.doubleValue();
    }

    public double subtract() {
        if (num1 == null || num2 == null) {
            return 0;
        }

        return Math.round((num1 - num2.doubleValue()) * 100.0) / 100.0;
    }

    public double multiply() {
        if (num1 == null || num2 == null) {
            return 0;
        }

        return Math.round(num1 * num2.doubleValue() * 100.0) / 100.0;
    }

    public double divide() {
        if (num1 == null || num2 == null) {
            return 0;
        } else if (num2.equals(0)) {
            System.out.println("На 0 делить нельзя");
        }

        return Math.round(num1 / num2.doubleValue() * 100.0) / 100.0;
    }
}
