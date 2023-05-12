package task065_Exceptions;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;

public class program {
  public static void main(String[] args) {
    // method();
    method1();
  }

  public static void method() {
    int num = 1;
    try {
      num = 10 / 1;
      // String test = null;
      // System.out.println(test.length());
      Collections.emptyList().add(new Object());
    } catch (ArithmeticException e) {
      System.out.println("Operation divide by zero nor supported");
    } catch (NullPointerException e) {
      System.out.println("Nullpointer exception");
    } catch (Exception e) {
      System.out.println("Exception");
    }
    System.out.println(num);
  }

  public static void method1() {
    FileReader test = null;
    try {
      test = new FileReader("test");
      test.read();
    } catch (RuntimeException | IOException e) {
      System.out.println("catch eception: " + e.getClass().getSimpleName());
    } finally {
      if (test != null) {
        try {
          test.close();
        } catch (IOException e) {
          System.out.println("exception while close");
        }
      }
      System.out.println("finally catched");
    }
  }
}
