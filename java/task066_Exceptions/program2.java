//Если необходимо, исправьте данный код

package task066_Exceptions;

public class program2 {
  public static void main(String[] args) {
    int[] intArray = { 5, 23, 34, 12, 45, 56, 67, 78, 89 };
    try {
      int d = 1;
      double catchedRes1 = intArray[8] / d;
      System.out.println("catchedRes1 = " + catchedRes1);
    } catch (NullPointerException e) {
      System.out.println("Catching exception: " + e);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Catching exception: " + e);
    } catch (ArithmeticException e) {
      System.out.println("Catching exception: " + e);
    }
  }
}
