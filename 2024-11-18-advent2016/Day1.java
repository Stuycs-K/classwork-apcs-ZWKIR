import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {
  public static int shortestDist(String filename) {
    int yCount = 0;
    int xCount = 0;
    int deg = 0;
    try {
      Scanner file = new Scanner(new File(filename));
      while (file.hasNext(", ")) {
        if(file.next(", ").substring(0, 2) == "R") {
          deg += 90;
          if (deg >= 360) {
            deg = deg - 360;
          }
          if (deg == 90) {
            xCount += (file.nextInt());
          }
          else if (deg == 270) {
            xCount -= (file.nextInt());
          }
          else if (deg == 180) {
            yCount -= (file.nextInt());
          }
          else {
            yCount += (file.nextInt());
          }
        }
        else {
          deg -= 90;
          if (deg >= 360) {
            deg = deg - 360;
          }
          if (deg == 90) {
            xCount += (file.nextInt());
          }
          else if (deg == 270) {
            xCount -= (file.nextInt());
          }
          else if (deg == 180) {
            yCount -= (file.nextInt());
          }
          else {
            yCount += (file.nextInt());
          }
        }
      }
      file.close();
    } catch (FileNotFoundException e)  {
      System.err.println("File not found");
    }
    return Math.abs(xCount) + Math.abs(yCount);
  }

  public static void main(String[] args) {
    // Tests
    System.out.println(shortestDist("day1.txt"));
  }
}
