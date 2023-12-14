public class ConditionalOperations {

  public static void main(String[] args) {
    int operation = 5;
    int numb_1 = 6;
    int numb_2 = 5;
    int result = 0;

    if (operation == 1) {
      result = numb_1 + numb_2;
      System.out.println("The operation is: " + operation + " and the result is: " + result);
    }
    if (operation == 2) {
      result = numb_1 - numb_2;
      System.out.println("The operation is: " + operation + " and the result is: " + result);
    }
    if (operation == 3) {
      result = numb_1 * numb_2;
      System.out.println("The operation is: " + operation + " and the result is: " + result);
    }
    if (operation == 4) {
      result = numb_1 / numb_2;
      System.out.println("The operation is: " + operation + " and the result is: " + result);
    } else {
      System.err.println("the value is out of range");
    }
  }
}