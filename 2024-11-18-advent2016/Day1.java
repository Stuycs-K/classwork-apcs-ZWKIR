import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
  public static int shortestDist(String filename) {
    int yCount = 0;
    int xCount = 0;
    int deg = 0;
    try {
      Scanner file = new Scanner(new File(filename));
      if (file.hasNextLine()) {
        String[] ary = file.nextLine().split(", ");
        for (int i = 0; i < ary.length; i++) {
          if (ary[i].substring(0,1).equals("R")) {
            deg += 90;
          }
          else {
            deg -= 90;
          }
          deg = (deg + 360) % 360;
          if (deg == 0) {
            yCount += Integer.parseInt(ary[i].substring(1)); //N
          }
          else if (deg == 90) {
            xCount += Integer.parseInt(ary[i].substring(1)); //E
          }
          else if (deg == 180) {
            yCount -= Integer.parseInt(ary[i].substring(1)); //S
          }
          else if (deg == 270) {
            xCount -= Integer.parseInt(ary[i].substring(1)); //W
          }
        }
        return Math.abs(xCount) + Math.abs(yCount);
      }
      file.close();
    } catch (FileNotFoundException e)  {
      System.err.println("File not found");
    }
    return 0;
  }

  public static String toString(String[] nums) {
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
    // Tests
    //System.out.println(toString(shortestDist("day1.txt")));
    System.out.println(shortestDist("day1.txt"));
  }
}
