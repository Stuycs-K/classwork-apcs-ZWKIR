public class Driver {
  public static void border(int text, int back, int height, int length) {
    int count = 0;
    for (int i = 1; i <= height; i++) {
      Text.color(text, 47);
      if (i == 1 || i == height) {
        count = repeat(count, length);
      }
      else {
        System.out.println("");
        System.out.print(" ");
        System.out.print(Text.RESET);
        count = repeat(count, length - 2);
        Text.color(text, 44);
        System.out.print(" ");
      }
      System.out.print(Text.RESET);
    }
  }

  public static int repeat(int count, int length) {
    while (count < length) {
      System.out.print(" ");
      count++;
    }
    count = 0;
    return count;
  }

  public static void main(String[] args) {
    border(30, 45, 5, 80);
  }
}
