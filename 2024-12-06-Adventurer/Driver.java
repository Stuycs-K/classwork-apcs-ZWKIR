public class Driver {
  public static void main(String[] args) {
    Adventurer p1 = new Mage("Leah", 10);
    Adventurer p2 = new Mage("Carol", 10);
    System.out.println(p1.getmaxHP());
    System.out.println(p1.attack(p2));
  }
}
