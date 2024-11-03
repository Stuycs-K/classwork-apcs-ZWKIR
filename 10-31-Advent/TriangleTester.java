import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  public static int countTrianglesA(String filename) {
    int count = 0;
    try (Scanner file = new Scanner(new File(filename))) {
      while (file.hasNextLine()) {
        if (isTriangle(file.nextLine())) {
          count++;
        }
      }
    } catch (FileNotFoundException e)  {
      System.err.println("File not found");
    }
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
    return (ary[0] + ary[1] > ary[2] && ary[1] + ary[2] > ary[0] && ary[0] + ary[2] > ary[1]);
  }

  public static int countTrianglesB(String filename) {
    return 0;
  }

  public static void main(String[] args) {
    // Tests
    System.out.println(isTriangle("5 10 25")); // false
    System.out.println(isTriangle("3 4 5")); // true
    System.out.println(countTrianglesA("inputTri.txt")); // 2
  }
}
