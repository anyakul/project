package task052_Calculator.UI;

import java.util.Scanner;

import task052_Calculator.Core.MVP.Presenter;
import task052_Calculator.Core.Models.Example;

public class App {
    public static void clickButton() {
        Example<Double> example = new Example<>();
        Presenter<Double> presenter = new Presenter<>(example);
        double result = 0;
        System.out.print(
                "Калькулятор. Действия - + - * /, отменить последнюю операцию - d, вывести результат и завершить - =:\n ");

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Число: ");
            String str = in.nextLine();

            if (str.chars().allMatch(Character::isDigit)) {
                result = Float.parseFloat(str);
                example.AddElement(str);
            }

            while (!str.equals("=")) {
                if (example.checkLastElemSign()) {
                    System.out.print("Число: ");
                    str = in.nextLine();
                    if (str.equals("d")) {
                        example.RemoveElement();
                    } else if (str.chars().allMatch(Character::isDigit)) {
                        presenter.CalcNums(Double.parseDouble(str));
                    }
                    System.out.println("Результат " + result);
                } else {
                    System.out.print("Знак операции: ");
                    str = in.nextLine();
                    if (str.equals("d")) {
                        result = example.GetPrevRes();
                        System.out.println("Результат " + result);
                    } else if (example.checkSign(str)) {
                        example.AddElement(str);
                    }
                }
            }

            if (str.equals("=")) {
                example.ShowExample("" + result);
            }
        }
    }
}
