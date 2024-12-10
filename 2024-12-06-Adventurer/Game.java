import java.util.*;

public class Game {
  public static boolean attackChoice(Adventurer p1, Adventurer p2, String input) {
    if (input.equals("a") || input.equals("attack")) {
      System.out.println(p1.attack(p2));
    }
    else if (input.equals("sp") || input.equals("special")) {
      System.out.println(p1.specialAttack(p2));
    }
    else if (input.equals("su") || input.equals("support")) {
      System.out.println(p1.support());
    }
    else if (input.equals("quit")) {
      return true;
    }
    else {
      System.out.println("Please enter one of the options above.");
      attackChoice(p1, p2, input);
    }
    return false;
  }

  public static void main(String[] args) {
    // get username for Mage player
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter username: ");
    String userName = userInput.nextLine();

    Adventurer p1 = new Mage(userName);
    Adventurer p2 = new CodeWarrior();
    String[] compChoice = {"a", "sp", "su"};

    boolean isQuit = false;
    while (!isQuit && p1.getHP() > 0 && p2.getHP() > 0) {
      System.out.println("\n" + p1.getName() + " " + p1.getHP() + "/" + p1.getmaxHP()
       + " HP, " + p1.getSpecial() + "/" + p1.getSpecialMax() + " " + p1.getSpecialName());
      System.out.println(p2.getName() + " " + p2.getHP() + "/" + p2.getmaxHP()
        + " HP, " + p2.getSpecial() + "/" + p2.getSpecialMax() + " " + p2.getSpecialName());

      // choosing attack method (user)
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String attack = userInput.nextLine();
      isQuit = attackChoice(p1, p2, attack);
      if (!isQuit && p2.getHP() > 0) {
        // choosing attack method (computer)
        Random rand = new Random();
        int randIdx = rand.nextInt(compChoice.length);
        attackChoice(p2, p1, compChoice[randIdx]);
      }

      if (isQuit) {
        System.out.println("Battle over!");
      }
    }
    if (p1.getHP() <= 0) {
      System.out.println(p2.getName() + " wins!");
    }
    else if (p2.getHP() <= 0) {
      System.out.println(p1.getName() + " wins!");
    }
    else {
      System.out.println("Both players tied!");
    }
  }
}
