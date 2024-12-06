public class Driver {
  public static void main(String[] args) {
    Adventurer p1 = new Mage("Leah", 10);
    Adventurer p2 = new Mage("Carol", 10);
    System.out.println(p1.getmaxHP());
    for (int times = 0; times < 10; times++) {
      System.out.println(p1.attack(p2));
    }
    System.out.println(p1.support(p2));
  }
}
