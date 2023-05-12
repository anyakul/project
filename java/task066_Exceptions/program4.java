// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package task066_Exceptions;

import java.util.Scanner;

public class program4 {
  public static void main(String[] args) {
    getStr();
  }

  public static void getStr() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Строка: ");
    String str = scan.nextLine();
    if (str.isEmpty()) {
      scan.close();
      throw new NullPointerException("Строка не может быть пустой");
    } else {
      System.out.println(str);
      scan.close();
    }
  }
}
