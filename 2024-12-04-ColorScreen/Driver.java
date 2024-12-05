import java.util.*;

public class Driver {
  public static void border(int text, int back, int height, int length, int[] ary) {
    for (int i = 1; i <= height; i++) {
      Text.color(text, back);
      if (i == 1 || i == height) {
        repeat(length);
      }
      else if (i == 2) {
        Text.color(text, back);
        System.out.print(" ");
        System.out.print(Text.RESET);
        int pixel_length = length - pixels(ary);
        for (int a = 1; a <= pixel_length; a++) {
          if (a == 15) {
            System.out.print(ary[0]);
          }
          else if (a == 38) {
            System.out.print(ary[1]);
          }
          else if (a == 60) {
            System.out.print(ary[2]);
          }
          else {
            System.out.print(" ");
          }
        }
        Text.color(text, back);
        System.out.print(" ");
      }
      else {
        Text.color(text, back);
        System.out.print(" ");
        System.out.print(Text.RESET);
        repeat(length - 2);
        Text.color(text, back);
        System.out.print(" ");
      }
      System.out.print(Text.RESET);
      System.out.println("");
    }
  }

  public static void repeat(int length) {
    for (int i = 0; i < length; i++) {
      System.out.print(" ");
    }
  }

  public static int[] mkary() {
    int[] ary = new int[3];
    Random rand = new Random();
    for (int i = 0; i < ary.length; i++) {
      ary[i] = rand.nextInt(100);
    }
    return ary;
  }

  public static int pixels(int[] ary) {
    int pixel = 0;
    for (int i = 0; i < ary.length; i++) {
      if (ary[i] / 10 > 0) {
        pixel += 2;
      }
      else {
        pixel++;
      }
    }
    return pixel - 1;
  }

  public static void main(String[] args) {
    int[] ary = mkary();
    //System.out.print(Text.HIDE_CURSOR);
    border(Text.BLACK, Text.background(Text.BLUE), 30, 80, ary);
    System.out.print(Text.SHOW_CURSOR);
    System.out.println(Text.RESET);
    System.out.println(Arrays.toString(ary));
  }
}
