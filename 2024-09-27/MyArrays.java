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

  public static int[] returnCopy(int[]ary) {
     int[] newary = new int[ary.length];
     for (int i = 0; i < ary.length; i++) {
        newary[i] = ary[i];
     }
     return newary;
  }

  public static int[] concatArray(int[] ary1,int[] ary2) {
     int[] returnary = new int[ary1.length + ary2.length];
     int idx = 0;
     // add ary1 values
     for (int i = 0; i < ary1.length; i++) {
        returnary[i] = ary1[i];
     }
     // add ary2 values
     for (int i = ary1.length; i < returnary.length; i++) {
        returnary[i] = ary2[idx];
        idx++;
     }
     return returnary;
  }

  public static void main(String[] args) {
    // test arrayToString
    System.out.println("------Test for arrayToString------");
    int[] arr = new int[] {1, 2, 3};
    System.out.println("Expected [1, 2, 3], recieved " + arrayToString(arr));
    int[] arr2 = new int[] {};
    System.out.println("Expected [], recieved " + arrayToString(arr2));

    // tests for returnCopy
    System.out.println("\n------Tests for returnCopy------");
    arr = new int[] {2, 5, 1, 35};
    System.out.println("Old array: " + arrayToString(arr) + ", New Array: " + arrayToString(returnCopy(arr)));
    System.out.println("Expected false, recieved " + (arr == returnCopy(arr)));
    arr = new int[] {-324, 21, 3, 0};
    System.out.println("Old array: " + arrayToString(arr) + ", New Array: " + arrayToString(returnCopy(arr)));
    System.out.println("Expected false, recieved " + (arr == returnCopy(arr)));
    arr = new int[] {20, 204, -1, 5};
    System.out.println("Old array: " + arrayToString(arr) + ", New Array: " + arrayToString(returnCopy(arr)));
    System.out.println("Expected false, recieved " + (arr == returnCopy(arr)));

    // tests for concatArray
    System.out.println("\n------Tests for concatArray------");
    arr = new int[] {-5, 21, 3};
    arr2 = new int[] {1, 35, 0, 4};
    System.out.println("Expected [-5, 21, 3, 1, 35, 0, 4], recieved " + arrayToString(concatArray(arr, arr2)));
    arr = new int[] {842};
    arr2 = new int[] {1, 29};
    System.out.println("Expected [842, 1, 29], recieved " + arrayToString(concatArray(arr, arr2)));
    arr = new int[] {};
    arr2 = new int[] {35, 0, 39, 60, 1, 3};
    System.out.println("Expected [35, 0, 39, 60, 1, 3], recieved " + arrayToString(concatArray(arr, arr2)));

  }
}
