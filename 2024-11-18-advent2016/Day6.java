import java.util.*;
import java.io.*;

public class Day6 {
  public static String returnStr(String filename) {
    String freqStr = "";
    int[] count = new int[6];
    try {
      Scanner file = new Scanner(new File(filename));
      for (int i = 0; i < 26; i++) {

      }
    } catch (FileNotFoundException e)  {
      System.err.println("File not found");
    }
    return freqStr;
  }

  public static int freq(char letter, String filename) {
    int count = 0;
    char[] alphabet = new char[26];
    for (int i = 0; i < 26; i++) {
      alphabet[i] = (char) ('a' + i);
    }
    // create arraylist of each line, separated by letter,
    // check index of each character and count the occurences
    // in each index in another array, return a message
    // with the character that is most frequent at each
    // index (if multiple w highest freq, use any most frequent)
    ArrayList<char[]> ary = new ArrayList<>();
    try {
        Scanner scan = new Scanner(new File(filename));
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            Scanner scanned = new Scanner(line);
            char[] ary2 = new char[6];

            for (int i = 0; i < 6; i++) {
                ary2[i] = line.charAt(i);
            }
            ary.add(ary2);
            scanned.close();
            System.out.println(toString(ary));
        }
        scan.close();
    } catch (FileNotFoundException e) {
        System.err.println("File not found");
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(freq('a', "day6.txt"));
  }
}
