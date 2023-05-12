// * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

package task064;

public class program4 {
  public static void main(String[] args) {
    Integer[] array1 = { 5, 26, 4 };
    Integer[] array2 = { 1, 4, 5 };

    Integer[] res = method(array1, array2);
    printArr(res);
  }

  public static Integer[] method(Integer[] arr1, Integer[] arr2) {
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
      if (arr2[i] == 0) {
        throw new NumberFormatException("Second num can't be zero");
      } else {
        Integer num = arr1[i] / arr2[i];
        res[i] = num;
      }
    }

    return res;
  }

  public static void printArr(Integer[] arr) {
    for (Integer num : arr) {
      System.out.println(num);
    }
  }
}
