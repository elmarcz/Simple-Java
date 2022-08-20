// Functions allow code to be reused and made more scalable and optimized.
package java.Functions;

public class Functions {

  public static void main(String[] args) {
    sum(1, 9);
    doubleSum(1.9, 9);
    circleArea(10);
    converToDolar(10, "MXN");

    isTrue(true);
  }

  public static void isTrue(boolean a) {
    if (a) {
      System.out.println("Is true");
    } else {
      System.out.println("Is false");
    }
  }

  public static int sum(int a, int b) {
    return a + b;
  }

  public static double doubleSum(double a, double b) {
    return a + b;
  }

  public static double circleArea(double r) {
    return Math.PI * Math.pow(r, 2);
  }

  /**
   * Converts some currency to US dollars.
   * @param quantity The quantity to convert.
   * @param currency The currency to convert. (Only accepts MXN or COP)
   * @return Quantity in US Dollars.
   */
  public static double converToDolar(double quantity, String currency) {
    // MXN COP
    switch (currency) {
      case "MXN":
        quantity *= 0.052;
        break;
      case "COP":
        quantity *= 0.00031;
        break;
    }
    return quantity;
  }
}
