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

    return count;
    // create arraylist of each line, separated by letter,
    // check index of each character and count the occurences
    // in each index in another array, return a message
    // with the character that is most frequent at each
    // index (if multiple w highest freq, use any most frequent)
  }

  public static void main(String[] args) {
    System.out.println(freq('a', "day6.txt"));
  }
}
