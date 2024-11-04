import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  public static int countTrianglesA(String filename) {
    int count = 0;
    try {
      Scanner file = new Scanner(new File(filename));
      while (file.hasNextLine()) {
        if (isTriangle(file.nextLine())) {
          count++;
        }
      }
      file.close();
    } catch (FileNotFoundException e)  {
      System.err.println("File not found");
    }
    return count;
  }

  // helper function for countTrianglesA
  public static boolean isTriangle(String lengths) {
    Scanner scan = new Scanner(lengths);
    int[] ary = new int[3];
    while (scan.hasNextInt()) {
      for (int i = 0; i < ary.length; i++) {
        ary[i] = scan.nextInt();
      }
    }
    scan.close();
    return (ary[0] + ary[1] > ary[2] && ary[1] + ary[2] > ary[0] && ary[0] + ary[2] > ary[1]);
  }

  public static int numLines(Scanner scanned) {
    int count = 0;
    while (scanned.hasNextLine()) {
      scanned.nextLine();
      count++;
    }
    return count;
  }

  public static int countTrianglesB(String filename) {
    try {
      Scanner scan = new Scanner(new File(filename));
      int[][] ary = new int[numLines(scan)][3];
    } catch (FileNotFoundException e)  {
      System.err.println("File not found");
    }
    return 0;
  }

  public static void main(String[] args) {
    // Tests
    System.out.println(isTriangle("5 10 25")); // false
    System.out.println(isTriangle("3 4 5")); // true
    System.out.println(countTrianglesA("inputTri.txt")); // 2
    try {
      System.out.println(numLines(new Scanner(new File("inputTri.txt")))); // 99
    } catch (FileNotFoundException e)  {
      System.err.println("File not found");
    }

  }
}
