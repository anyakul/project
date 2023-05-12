// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

package task066_Exceptions;

import java.util.Scanner;

public class program1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Float res = getNum(scan);
    System.out.println(res);
    scan.close();
  }

  public static Float getNum(Scanner scan) {
    Float res;
    System.out.print("Число: ");
    String str = scan.nextLine();
    try {
      res = Float.parseFloat(str);
      return res;
    } catch (NumberFormatException e) {
      System.out.println("Строка должна быть числом");
      getNum(scan);
      return null;
    }
  }
}
