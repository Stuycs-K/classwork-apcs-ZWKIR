public class Driver {
  public static void border(int text, int back, int height, int length) {
    for (int i = 1; i <= height; i++) {
      Text.color(text, back);
      if (i == 1 || i == height) {
        repeat(length);
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

  public static void main(String[] args) {
    //System.out.print(Text.HIDE_CURSOR);
    border(Text.BLACK, Text.background(Text.BLUE), 30, 80);
    System.out.print(Text.SHOW_CURSOR);
    System.out.println(Text.RESET);
  }
}
