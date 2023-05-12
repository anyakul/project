package task060_Exception;

public class program {
  public static void main(String[] args) {
    int[] array = { 1, 2 };
    int length = arrayLength(array);
    if (length < 0) {
      System.out.println("length of array less then minimum");
    } else {
      System.out.println("Length of array: " + length);
    }
  }

  public static int arrayLength(int[] array) {
    if (array.length < 2) {
      return -1;
    }
    return array.length;
  }
}
