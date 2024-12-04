public class Driver {
  public static void border(int text, int back) {
    for (int i = 1; i <= 2; i++) {
      for (int j = 1; j <= 30; j++) {
        Text.color(text, back);
        System.out.println(" ");
      }
      System.out.println("");
    }
  }
  public static void main(String[] args) {
    border(30, 42);
  }
}
