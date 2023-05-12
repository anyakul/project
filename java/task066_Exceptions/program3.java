//Дан следующий код, исправьте его там, где требуется 
package task066_Exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class program3 {
  public static void main(String[] args) throws Exception {
    try {
      int a = 90;
      int b = 3;
      System.out.println(a / b);
      printSum(23, 234);
      int[] abc = { 1, 2, 3, 4 };
      abc[3] = 9;
      System.out.println(Arrays.toString(abc));
    } catch (NullPointerException ex) {
      System.out.println("Указатель не может указывать на null!");
    } catch (ArithmeticException e) {
      System.out.println("Делитель не может быть нулем");
    } catch (IOException ex) {
      System.out.println("Файл для записи не найден");
    } catch (IndexOutOfBoundsException ex) {
      System.out.println("Массив выходит за пределы своего размера!");
    } catch (Throwable ex) {
      System.out.println("Что-то пошло не так...");
    }
  }

  public static void printSum(Integer a, Integer b) throws IOException {
    FileWriter fw = new FileWriter("t.txt");
    int res = a + b;
    fw.write(res);
    fw.close();
    System.out.println(res);
  }
}
