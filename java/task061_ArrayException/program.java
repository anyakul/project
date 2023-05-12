package task061_ArrayException;

public class program {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3 };

    int error = method(array, 3);

    if (error >= 0) {
      System.out.println("Index = " + error);
    } else if (error == -1) {
      System.out.println("Length of array < 2");
    } else if (error == -2) {
      System.out.println("Value not found");
    } else if (error == -3) {
      System.out.println("Array = null");
    }
  }

  public static int method(int[] array, int value) {
    if (array.length == 0) {
      return -3;
    } else if (array.length < 2) {
      return -1;
    } else {
      for (int i = 0; i < array.length; i++) {
        if (array[i] == value) {
          return i;
        }
      }
    }
    return -2;
  }
}
