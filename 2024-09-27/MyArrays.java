public class MyArrays {
  public static String arrayToString(int[] nums) {
    String returnStr = "[";
    for (int i = 0; i < nums.length; i++) {
      returnStr += nums[i];
      if (i < nums.length - 1) {
        returnStr += ", ";
      }
    }
    return returnStr + "]";
  }

  public static void main(String[] args) {
    // test arrayToString
    int[] arr = new int[] {1, 2, 3};
    System.out.println("Expected [1, 2, 3], recieved " + arrayToString(arr));
    int[] arr2 = new int[] {};
    System.out.println("Expected [], recieved " + arrayToString(arr2));

    // test returnCopy
    int[] arr = new int[] {2, 5, 1, 35};
    int[] arr2 = new int[] {24, 2, 1, 4};
    System.out.println("Expected true " + "recieved " + (arr == arr2));

    // test concatArray

  }
}
