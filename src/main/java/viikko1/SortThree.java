package viikko1;

public class SortThree {
  public static String ascending(int a, int b, int c) {
    int[] nums = {a, b, c};

    if (nums[0] > nums[2]) {
      nums[0] = c;
      nums[2] = a;
    }

    if (nums[0] > nums[1]) {
      int tempNum = nums[0];
      nums[0] = nums[1];
      nums[1] = tempNum;
    }

    if (nums[1] > nums[2]) {
      int tempNum = nums[1];
      nums[1] = nums[2];
      nums[2] = tempNum;
    }

    return nums[0] + "," + nums[1] + "," + nums[2];
  }
}
