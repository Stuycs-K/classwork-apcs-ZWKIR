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
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            Scanner scanned = new Scanner(line);
            int[] ary2 = new int[3];

            for (int i = 0; i < 3; i++) {
                if (scanned.hasNextInt()) {
                    ary2[i] = scanned.nextInt();
                }
            }
            ary.add(ary2);
            scanned.close();
        }

        for (int col = 0; col < 3; col++) {
            int[] tri = new int[3];
            for (int row = 0; row < ary.size(); row += 3) {
                tri[0] = ary.get(row)[col];
                tri[1] = ary.get(row + 1)[col];
                tri[2] = ary.get(row + 2)[col];
                String str = tri[0] + " " + tri[1] + " " + tri[2];
                if (isTriangle(str)) {
                    numTri++;
                }
            }
        }
        scan.close();
    } catch (FileNotFoundException e) {
        System.err.println("File not found");
    }
    return numTri;
}

  public static void main(String[] args) {
    // Tests
    System.out.println(isTriangle("5 10 25")); // false
    System.out.println(isTriangle("3 4 5")); // true
    System.out.println(countTrianglesA("inputTri.txt"));
    System.out.println(countTrianglesB("inputTri.txt")); // 6 or 95
  }
}
