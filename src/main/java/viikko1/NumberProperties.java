package viikko1;

public class NumberProperties {
  public static String describe(int n) {
    if (n == 0) return "nolla";

    String signString = n >= 0 ? "positiivinen" : "negatiivinen";
    String oddEvenString = n % 2 == 0 ? "parillinen" : "pariton";

    return signString + " " + oddEvenString;
  }
}
