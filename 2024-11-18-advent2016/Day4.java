import java.util.*;
import java.io.*;

public class Day4 {
  public static boolean realRoom(String room) {
    int lastDashI = room.lastIndexOf('-');
    int checkSumI = room.indexOf('[');
    String roomName = room.substring(0, lastDashI);
    //System.out.println(roomName);
    String sectorID = room.substring(lastDashI+1, checkSumI);
    //System.out.println(sectorID);
    String sum = room.substring(checkSumI+1, room.length()-1);
    //System.out.println(sum);
    roomName = roomName.replace("-", "");
    String checkSum = myCheckSum(roomName);
    //System.out.println(roomName);
    return checkSum.equals(sum);
  }

  public static String myCheckSum(String check) {
    String returnVal = "";
    String letterStr = "";
    String letter = check.substring(0,1);
    for (int i = 0; i < check.length() - 1; i++) {
      int count = 0;
      while (check.substring(i, i+1).equals(letter)) {
        count++;
        i++;
        System.out.println(check.substring(i, i+1));
        System.out.println("Count: " + count);
        System.out.println("Index: " + i);
      }
      returnVal = returnVal + letter + count;
      letter = check.substring(i, i+1);
      System.out.println(returnVal);
      System.out.println("Letter: " + letter + "\n");
      i--;
    }
    return returnVal;
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

  public static void main(String[] args) {
    System.out.println(myCheckSum("aaaaabbbzyx"));
    //System.out.println(realRoom("aaaaa-bbb-z-y-x-123[abxyz]"));
    //System.out.println(rooms("day4.txt"));
  }
}
