public class Driver {
  public static void border(int text, int back, int height, int length) {
    for (int i = 1; i <= height; i++) {
      int count = 0;
      if (i == 1 || i == height) {
        Text.color(text, back);
        while (count < length) {
          System.out.print(" ");
          count++;
        }
        count = 0;
      }
      /*
      else {
        System.out.println(" ");
        System.out.print(Text.RESET);
        System.out.println(" ");
        Text.color(text, back);
        System.out.println(" ");
      }
      */
      System.out.print(Text.RESET);
      System.out.println("");
    }
  }
  public static void main(String[] args) {
    border(30, 45, 5, 80);
  }
}
