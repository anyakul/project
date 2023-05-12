// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

package task064;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class program1 {
  public static void main(String[] args) {
    calcInput();
    GetDict();
  }

  public static void calcInput() {
    Scanner iScanner = new Scanner(System.in);
    System.out.print("Введите первое число: ");
    String num1 = iScanner.nextLine();
    System.out.print("Введите второе число: ");
    String num2 = iScanner.nextLine();

    if (num1.matches("-?\\d+(\\.\\d+)?") && num2.matches("-?\\d+(\\.\\d+)?")) {
      int res = calc(Integer.parseInt(num1), Integer.parseInt(num2));
      System.out.println(num1 + " + " + num2 + " = " + res);
    } else {
      iScanner.close();
      throw new NumberFormatException("Введены не целые числа");
    }
    iScanner.close();
  }

  public static int calc(int a, int b) {
    return a + b;
  }

  static void GetDict() {
    try {
      String pathProject = System.getProperty("user.dir");
      String pathFile = pathProject.concat("/task064/data.json");
      File f = new File(pathFile);
      FileReader fr = new FileReader(f);
      BufferedReader reader = new BufferedReader(fr);
      String line = "";

      try {
        line = reader.readLine();
        while (line != null) {
          System.out.println(line);
          line = reader.readLine();
        }
        reader.close();
      } catch (IOException e) {
        System.out.println("Строки нет");
      }
    } catch (FileNotFoundException e) {
      System.out.println("Файл не найден");
    }
  }
}
