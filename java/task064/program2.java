// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

package task064;

public class program2 {
  public static void main(String[] args) {
    String[][] matrix = { { "34", "35", "33", "45", "67" }, { "23", "45", "43", "22", "45" },
        { "4", "5", "6", "34", "67" }, { "23", "45", "43", "22", "45" },
        { "4", "5", "6", "34", "67" } };
    System.out.println(String.format("Sum of matrix: " + sum2d(matrix)));

  }

  public static int sum2d(String[][] arr) {
    int sum = 0;
    if (arr == null) {
      throw new NullPointerException("Matrix is null");
    }
    if (arr.length != 5) {
      throw new IndexOutOfBoundsException("Matrix length must be 5");
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].length != arr.length) {
        throw new IndexOutOfBoundsException("Matrix must be square");
      }
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < 5; j++) {
        if (!arr[i][j].matches("[0-9]+")) {
          throw new NumberFormatException("Nums must be integer");
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < 5; j++) {
        int val = Integer.parseInt(arr[i][j]);
        sum += val;
      }
    }

    return sum;
  }
}
