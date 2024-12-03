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

  public static void drawFrog() {
    color(35, 41, 4);
    System.out.println("This is a frog.");
  }
}
