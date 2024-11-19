import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day4 {
  public static boolean realRoom(String room) {
    return false;
  }

  public static int rooms(String filename) {
    int roomCount = 0;
    try {
      Scanner file = new Scanner(new File(filename));
      while (file.hasNextLine()) {
        String str = file.nextLine();
        if (realRoom(str)) {
          roomCount += 1;
        }
      }
      file.close();
    } catch (FileNotFoundException e)  {
      System.err.println("File not found");
    }
    return roomCount;
  }

  public static void main(String[] args) {
    System.out.println(rooms("day4.txt"));
  }
}
