public class ColorDemo {
  public static int BLACK = 30;
  public static int RED = 31;

  public static void color(int foreground,int background){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
  }

  public static void color(int foreground, int background, int modifier){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + ";" + modifier + "m");
  }

  public static void go(int r,int c){
    System.out.print("\u001b[" + r + ";" + c + "f");
  }

  public static void draw() {
    color(35, 41);
    System.out.println("A visually colorful picture below:");
    for (int r = 0; r < 256; r++) {
      for (int g = 0; g < 153; g++) {
        for(int b = 0; b <= 57; b++){
          System.out.print("\u001b[38;2" + r + ";" + g + ";" + b + "m-");
        }
      }
      System.out.println();
    }
    System.out.print("\u001b[0m");
  }
}
