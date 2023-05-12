// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

package task064;

public class program3 {
  public static void main(String[] args) {
    int[] array1 = { 5, 3, 4 };
    int[] array2 = { 1, 2, 5 };

    Integer[] res = method(array1, array2);
    printArr(res);
  }

  public static Integer[] method(int[] arr1, int[] arr2) {
    Integer res[] = new Integer[arr1.length];

    if (arr1 == null || arr2 == null) {
      throw new NullPointerException("Array is null");
    }
    if (arr1.length < 1 || arr2.length < 1) {
      throw new IndexOutOfBoundsException("Array is empty");
    }
    if (arr1.length != arr2.length) {
      throw new IndexOutOfBoundsException("Array length must be equal");
    }
    for (int i = 0; i < arr1.length; i++) {
      Integer num = (Integer) arr1[i] - arr2[i];
      res[i] = num;
    }
    return res;
  }

  public static void printArr(Integer[] arr) {
    for (int num : arr) {
      System.out.println(num);
    }
  }
}
