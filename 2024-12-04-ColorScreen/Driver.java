import java.util.*;

public class Driver {
  public static void border(int text, int back, int height, int length, int[] ary) {
    for (int i = 1; i <= height; i++) {
      Text.color(text, back);
      if (i == 1 || i == height) {
        for (int a = 0; a < length; a++) {
          System.out.print("-");
        }
      }
      else if (i == 2) {
        Text.color(text, back);
        System.out.print(" ");
        System.out.print(Text.RESET);
        int pixel_length = length - pixels(ary) + 1;
        for (int a = 1; a <= pixel_length; a++) {
          if (a == 15) {
            textColor(ary[0]);
            System.out.print(ary[0]);
          }
          else if (a == 38) {
            textColor(ary[1]);
            System.out.print(ary[1]);
          }
          else if (a == 60) {
            textColor(ary[2]);
            System.out.print(ary[2]);
          }
          else {
            System.out.print(" ");
          }
        }
        Text.color(text, back);
        System.out.print(" ");
      }
      else if (i == 3) {
        for (int a = 0; a < length; a++) {
          System.out.print("+");
        }
      }
      else {
        Text.color(text, back);
        System.out.print(" ");
        System.out.print(Text.RESET);
        for (int a = 0; a < length - 2; a++) {
          System.out.print(" ");
        }
        Text.color(text, back);
        System.out.print(" ");
      }
      System.out.print(Text.RESET);
      System.out.println("");
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
    return pixel;
  }

  public static void textColor(int num) {
    if (num < 25) {
      Text.color(Text.BRIGHT, Text.RED);
    }
    else if (num > 75) {
      Text.color(Text.BRIGHT, Text.GREEN);
    }
    else {
      Text.color(Text.WHITE);
    }
  }

  public static void main(String[] args) {
    int[] ary = mkary();
    //System.out.print(Text.HIDE_CURSOR);
    border(Text.BLACK, Text.background(Text.CYAN), 30, 80, ary);
    /*
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    */
    System.out.print(Text.SHOW_CURSOR);
    System.out.println("");
    // The code below only works if you ran "clear" in terminal
    // beforehand and then ran "javac Driver.java&& java Driver"
    // because it goes to the line on the screen, not on
    // each play
    Text.go(32, 1); // must be at 32 because first line is
    // a terminal command line
    
    //System.out.println(Arrays.toString(ary));
  }
}
