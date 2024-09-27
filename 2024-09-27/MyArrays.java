public class MyArrays {
  public static String arrayToString(int[] nums) {
    String returnStr = "[";
    for (int i = 0; i < nums.length; i++) {
      returnStr += nums[i];
      if (i < nums.length - 1) {
        returnStr += ", ";
      }
    }
    return returnStr;
  }

  public static void main(String[] args) {
    System.out.println("N/a");
  }
}
