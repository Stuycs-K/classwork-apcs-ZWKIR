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
    for (int i = 0; i < ary.length && scan.hasNextInt(); i++) {
      ary[i] = scan.nextInt();
    }
    scan.close();
    return (ary[0] + ary[1] > ary[2] && ary[1] + ary[2] > ary[0] && ary[0] + ary[2] > ary[1]);
  }

  public static int numLines(String file) {
    int count = 0;
    try {
      Scanner scanned = new Scanner(new File(file));
      while (scanned.hasNextLine()) {
        scanned.nextLine();
        count++;
      }
      scanned.close();
    } catch (FileNotFoundException e)  {
      System.err.println("File not found");
    }
    return count;
  }

  public static int countTrianglesB(String filename) {
    int numTri = 0;
    int numRow = numLines(filename);
    try {
      Scanner scan = new Scanner(new File(filename));
      int[][] ary = new int[numRow][3];
      for (int i = 0; i < numRow; i++) {
        for (int j = 0; j < 3; i++) {
          if (scan.hasNextInt()) {
            ary[i][j] = scan.nextInt();
          }
        }
      }
      scan.close();
    } catch (FileNotFoundException e)  {
      System.err.println("File not found");
    }
    return numTri;
  }

  public static void main(String[] args) {
    // Tests
    System.out.println(isTriangle("5 10 25")); // false
    System.out.println(isTriangle("3 4 5")); // true
    System.out.println(countTrianglesA("inputTri.txt"));
    System.out.println(numLines("inputTri.txt"));
  }
}
