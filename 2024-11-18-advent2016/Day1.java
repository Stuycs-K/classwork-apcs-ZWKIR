import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
  public static String[] shortestDist(String filename) {
    int yCount = 0;
    int xCount = 0;
    int deg = 0;
    try {
      Scanner file = new Scanner(new File(filename));
      if (file.hasNextLine()) {
        String[] ary = file.nextLine().split(", ");
        for (int i = 0; i < ary.length; i++) {
          if (ary[i].substring(0,2).equals("R")) {
            deg += 90;
            xCount += Integer.parseInt(ary[i].substring(1));
          }
        }
        return ary;
      }
      file.close();
    } catch (FileNotFoundException e)  {
      System.err.println("File not found");
    }
    return new String[2];
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
    System.out.println(toString(shortestDist("day1.txt")));
  }
}
