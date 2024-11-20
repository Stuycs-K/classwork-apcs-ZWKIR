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

  public static int firstDoubleVisit(String filename) {
    int xCount = 0, yCount = 0, deg = 0;
    String[] place = new String[1000];
    int placeI = 0;
    place[placeI] = "0,0";
    placeI++;

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

          int val = Integer.parseInt(ary[i].substring(1));
          for (int j = 0; j < val; j++) {
            if (deg == 0) {
              yCount++; //N
            }
            else if (deg == 90) {
              xCount++; //E
            }
            else if (deg == 180) {
              yCount--; //S
            }
            else if (deg == 270) {
              xCount--; //W
            }

            String currCoor = xCount + "," + yCount;
            for (int k = 0; k < placeI; k++) {
              if (place[k].equals(currCoor)) {
                return Math.abs(xCount) + Math.abs(yCount);
              }
            }
            place[placeI++] = currCoor;
          }
        }
      }
      file.close();
    } catch (FileNotFoundException e) {
      System.err.println("File not found");
    }
    return 0;
  }

  public static void main(String[] args) {
    // Tests
    //System.out.println(Array.toString(shortestDist("day1.txt")));
    //System.out.println(shortestDist("day1.txt"));
    System.out.println(firstDoubleVisit("day1.txt"));
  }
}
