import java.util.Scanner;
public class TriangleTester {
  public static int countTrianglesA(String filename) {
    int count = 0;
    return count;
  }

  public static boolean isTriangle(String lengths) {
    Scanner scan = new Scanner(lengths);
    int[] ary = new int[3];
    while (scan.hasNext()) {
      for (int i = 0; i < ary.length; i++) {
        ary[i] = Integer.parseInt(scan.next());
      }
    }
    System.out.println(toString(ary));
    return false;
  }

  public static int countTrianglesB(String filename) {
    return 0;
  }

  public static String toString(int[] nums) {
    String returnStr = "[";
    for (int i = 0; i < nums.length; i++) {
      returnStr += nums[i];
      if (i < nums.length - 1) {
        returnStr += ", ";
      }
    }
    return returnStr + "]";
  }
}
