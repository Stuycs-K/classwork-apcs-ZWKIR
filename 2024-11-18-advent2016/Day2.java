import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {
  int xCoor;
  int yCoor;

  public Day2() {
    this.xCoor = 1;
    this.yCoor = 1;
  }

  public static String password(String filename) {
    String code = "";
    try {
      Scanner file = new Scanner(new File(filename));
      Day2 obj2 = new Day2();
      while (file.hasNextLine()) {
        String[] ary = file.nextLine().split("");
        code = obj2.move(ary, code);
      }
      file.close();
    } catch (FileNotFoundException e)  {
      System.err.println("File not found");
    }
    return code;
  }

  public static int number(int x, int y) {
    int[][] keypad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    return keypad[y][x];
  }

  public String move(String[] ary, String code1) {
    for (int i = 0; i < ary.length; i++) {
      if (ary[i].equals("U") && yCoor > 0) yCoor -= 1;
      else if (ary[i].equals("D") && yCoor < 2) yCoor += 1;
      else if (ary[i].equals("L") && xCoor > 0) xCoor -= 1;
      else if (ary[i].equals("R") && xCoor < 2) xCoor += 1;
    }
    return code1 + number(xCoor, yCoor);
  }

  public static void main(String[] args) {
    System.out.println(password("day2.txt"));
  }
}
