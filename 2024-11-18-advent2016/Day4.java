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
    char[] letters = new char[26];
    int[] repeats = new int[26];
    for (int i = 0; i < 26; i++) {
      letters[i] = (char) ('a' + i);
    }

    for (int i = 0; i < check.length(); i++) {
        char c = check.charAt(i);
        repeats[c - 'a']++;
    }

    for (int i = 0; i < 26; i++) {
        for (int j = i + 1; j < 26; j++) {
            if (repeats[j] > repeats[i] || ((repeats[j] == repeats[i]) && (letters[j] < letters[i]))) {
                int repeatsVal = repeats[i];
                repeats[i] = repeats[j];
                repeats[j] = repeatsVal;
                char lettersVal = letters[i];
                letters[i] = letters[j];
                letters[j] = lettersVal;
            }
        }
    }

    for (int i = 0; i < 5; i++) {
        if (repeats[i] > 0) {
            returnVal += letters[i];
        }
    }
    return returnVal;
  }

  public static int charFreq(char c, String check) {
    int count = 0;
    for (int i = 0; i < check.length(); i++) {
        if (c == check.charAt(i)) {
            count++;
        }
    }
    return count;
  }

  public static int realRoomSum(String filename) {
        int sum = 0;
        try {
            Scanner file = new Scanner(new File(filename));
            while (file.hasNextLine()) {
                String str = file.nextLine();
                if (realRoom(str)) {
                    int lastDashI = str.lastIndexOf('-');
                    int checkSumI = str.indexOf('[');
                    String sectorID = str.substring(lastDashI + 1, checkSumI);
                    sum += Integer.parseInt(sectorID);
                }
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
        return sum;
    }

  public static void main(String[] args) {
    /*
    System.out.println(charFreq('a', "aaaaabbbzyx")); //5
    System.out.println(charFreq('b', "aaaaabbbzyx")); //3
    System.out.println(charFreq('x', "aaaaabbbzyx")); //1
    */
    //System.out.println(myCheckSum("aaaaabbbzyx"));
    //System.out.println(realRoom("aaaaa-bbb-z-y-x-123[abxyz]"));
    System.out.println(realRoomSum("day4.txt"));
  }
}
