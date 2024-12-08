public class Driver {
  public static void main(String[] args) {
    Adventurer p1 = new Mage("Leah", 10);
    Adventurer p2 = new Mage("Carol", 20);
    System.out.println("Your HP: " + p1.getHP());
    System.out.println(p2.getName() + "'s HP: " + p2.getHP() + "\n");
    for (int times = 0; times < 5; times++) {
      System.out.println(p1.attack(p2));
    }
    System.out.println(p1.support(p2));
    System.out.println(p1.specialAttack(p2));
    System.out.println(p2.support());

    System.out.println("MP TESTING");
    System.out.println("Leah's MP: " + p1.getSpecial() + "\n");
    p1.restoreSpecial(11);
    System.out.println("Leah's MP: " + p1.getSpecial() + "\n");
    System.out.println(p1.specialAttack(p2));
    p1.restoreSpecial(2);
    System.out.println("Leah's MP: " + p1.getSpecial() + "\n");
    System.out.println(p1.specialAttack(p2));
    p1.setSpecial(20);
    System.out.println("Leah's MP: " + p1.getSpecial() + "\n");

  }
}
