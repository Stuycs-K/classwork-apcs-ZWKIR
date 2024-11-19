import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class Day4 {
  public static boolean realRoom(String room) {
    int lastDashI = room.lastIndexOf('-');
    int checkSumI = room.indexOf('[');
    String roomName = room.substring(0, lastDashI);
    String sectorID = room.substring(lastDashI+1, checkSumI);
    String sum = room.substring(checkSumI+1, room.length()-1);
    roomName = roomName.replace("-", "");
    String checkSum = myCheckSum(roomName);
    return checkSum.equals(sum);
  }

  public static String myCheckSum(String check) {
    return "";
  }

  public static int rooms(String filename) {
    int roomCount = 0;
    try {
      Scanner file = new Scanner(new File(filename));
      while (file.hasNextLine()) {
        String str = file.nextLine();
        /*
        if (realRoom(str)) {
          roomCount += 1;
        }
        */
      }
      file.close();
    } catch (FileNotFoundException e)  {
      System.err.println("File not found");
    }
    return roomCount;
  }

  public static String toString(String[] nums) {
    String returnStr = "[";
    for (int i = 0; i < nums.length; i++) {
      returnStr += nums[i];
      if (i < nums.length - 1) {
        returnStr += ", ";
      }
    }
    return returnStr + "]";
  }

  public static void main(String[] args) {
    System.out.println(realRoom("aaaaa-bbb-z-y-x-123[abxyz]"));
    //System.out.println(rooms("day4.txt"));
  }
}
