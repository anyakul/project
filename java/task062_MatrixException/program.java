package task062_MatrixException;

public class program {
  public static void main(String[] args) {
    int[][] matrix = { { 1, 0, 1 }, { 1, 1, 0 }, { 1, 1, 1 } };
    int[][] matrix1 = { { 1, 1 }, { 1, 1, 0 }, { 1, 1, 1 } };
    int[][] matrix2 = { { 1, 1, 0 }, { 1, 1, 0 }, { 2, 1, 1 } };
    int[][] matrix3 = new int[0][0];
    int[][] matrix4 = null;
    System.out.println(String.format("Sum of matrix: " + sumMatrix(matrix)));
    System.out.println(String.format("Sum of matrix: " + sumMatrix(matrix1)));
    System.out.println(String.format("Sum of matrix: " + sumMatrix(matrix2)));
    System.out.println(String.format("Sum of matrix: " + sumMatrix(matrix3)));
    System.out.println(String.format("Sum of matrix: " + sumMatrix(matrix4)));
  }

  private static int sumMatrix(int[][] matrix) {
    if (matrix == null) {
      throw new NullPointerException("Matrix is null");
    }
    if (matrix.length == 0) {
      throw new RuntimeException("Matrix is empty");
    }
    for (int i = 0; i < matrix.length; i++) {
      if (matrix[i].length != matrix.length) {
        throw new RuntimeException("Matrix must be square");
      }
    }
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (matrix[i][j] != 0 && matrix[i][j] != 1) {
          throw new RuntimeException("Element was not correct");
        } else {
          sum += matrix[i][j];
        }
      }
    }

    return sum;
  }

}
