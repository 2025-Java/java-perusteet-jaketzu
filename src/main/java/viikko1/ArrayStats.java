package viikko1;

public class ArrayStats {
  public static double average(int[] arr) {

    if (arr.length == 0) {
      return 0.0;
    }

    int sum = 0;
    for (int num : arr) sum += num;

    double result = (double) sum / arr.length;
    return result;
  }

  public static int max(int[] arr) {
    if (arr.length == 0) {
      return Integer.MIN_VALUE;
    }

    int result = arr[0];
    for (int i = 1; i < arr.length; i++) if (arr[i] > result) result = arr[i];

    return result;
  }
}
