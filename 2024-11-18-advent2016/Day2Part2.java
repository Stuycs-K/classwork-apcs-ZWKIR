import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2Part2 {
  int xCoor;
  int yCoor;

  public Day2Part2() {
    this.xCoor = 0;
    this.yCoor = 2;
  }

  public static String password(String filename) {
    String code = "";
    try {
      Scanner file = new Scanner(new File(filename));
      Day2Part2 obj2 = new Day2Part2();
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

  public static char number(int x, int y) {
    char[][] keypad = {
      {'0', '0', '1', '0', '0'},
      {'0', '2', '3', '4', '0'},
      {'5', '6', '7', '8', '9'},
      {'0', 'A', 'B', 'C', '0'},
      {'0', '0', 'D', '0', '0'}};
    return keypad[y][x];
  }

  public String move(String[] ary, String code1) {
    for (int i = 0; i < ary.length; i++) {
      if (ary[i].equals("U") && yCoor > 0 && number(xCoor, yCoor - 1) != '0') {
        yCoor -= 1;
      }
      else if (ary[i].equals("D") && yCoor < 4 && number(xCoor, yCoor + 1) != '0') {
        yCoor += 1;
      }
      else if (ary[i].equals("L") && xCoor > 0 && number(xCoor - 1, yCoor) != '0') {
        xCoor -= 1;
      }
      else if (ary[i].equals("R") && xCoor < 4 && number(xCoor + 1, yCoor) != '0') {
        xCoor += 1;
      }
    }
    return code1 + number(xCoor, yCoor);
  }

  public static void main(String[] args) {
    System.out.println(password("day2.txt"));
  }
}
