package task059_ExceptionsErrors;

import java.io.File;

public class program {
  public static void main(String[] args) {
    System.out.println(getFileSize(new File("123")));
    System.out.println(divide(1, 0));
    a();
    int[] ints = new int[10];
    System.out.println(ints[1000]);
    System.out.println(divideException(5, 0));
    System.out.println(divide(5, 0));
  }

  public static void a() {
    b();
  }

  public static void b() {
    c();
  }

  public static void c() {
    int[] ints = new int[10];
    System.out.println(ints[1000]);
  }

  public static int divide(int a1, int a2) {
    return a1 / a2;
  }

  public static long getFileSize(File file) {
    if (!file.exists()) {
      return -1;
    }
    return file.length();
  }

  public static int divideException(int a1, int a2) {
    if (a2 == 0) {
      throw new RuntimeException("Divide by zero not permited");
    }
    return a1 / a2;
  }
}
