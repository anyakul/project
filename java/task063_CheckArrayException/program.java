package task063_CheckArrayException;

import java.util.ArrayList;
import java.util.List;

public class program {
  public static void main(String[] args) {
    Integer[] array = { 1, 2, null, null, 3 };
    System.out.println("Значения null на индексах:");
    System.out.println(checkArray(array));
  }

  public static List<Integer> checkArray(Integer[] arr) {
    if (arr == null) {
      throw new RuntimeException("Array equals null");
    } else {
      List<Integer> nulls = new ArrayList<>();
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] == null) {
          nulls.add(i);
        }
      }

      return nulls;
    }
  }
}
