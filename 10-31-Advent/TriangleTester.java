import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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

  public static int countTrianglesB(String filename) {
    int numTri = 0;
    ArrayList<int[]> ary = new ArrayList<>();
    try {
      Scanner scan = new Scanner(new File(filename));
      while (scan.hasNextInt()) {
        int[] ary2 = new int[3];
        for (int i = 0; i < 3; i++) {
          if (scan.hasNextInt()) {
            ary2[i] = scan.nextInt();
          }
        }
        ary.add(ary2);
      }
      scan.close();
    } catch (FileNotFoundException e)  {
      System.err.println("File not found");
    }
    return numTri;
  }

  // helper function for countTrianglesB
  public static boolean isTriangle(int[] lengths) {
    return (lengths[0] + lengths[1] > lengths[2] && lengths[1] + lengths[2] > lengths[0] && lengths[0] + lengths[2] > lengths[1]);
  }

  public static void main(String[] args) {
    // Tests
    System.out.println(isTriangle("5 10 25")); // false
    System.out.println(isTriangle("3 4 5")); // true
    System.out.println(countTrianglesA("inputTri.txt"));
    System.out.println(countTrianglesB("inputTri.txt")); // 6 for first dataset
  }
}
