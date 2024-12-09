import java.util.*;

public class Game {
  public static boolean attackChoice() {
    Scanner userIn = new Scanner(System.in);
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    String attack = userIn.nextLine();
    if (attack.equals("a") || attack.equals("attack")) {
      p1.attack(p2);
    }
    else if (attack.equals("sp") || attack.equals("special")) {
      p1.specialAttack(p2);
    }
    else if (attack.equals("su") || attack.equals("support")) {
      p1.support();
    }
    else if (attack.equals("quit")) {
      return true;
    }
    else {
      System.out.println("Please enter one of the options above.");
      attackChoice();
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter username: ");
    String userName = userInput.nextLine();
    Adventurer p1 = new CodeWarrior(userName, 20);
    Adventurer p2 = new CodeWarrior("Carol", 20);
    int times = 10;
    while (times > 0) {
      System.out.println("\n" + p1.getName() + " " + p1.getHP() + "/" + p1.getmaxHP()
       + " HP, " + p1.getSpecial() + "/" + p1.getSpecialMax() + " " + p1.getSpecialName());
      System.out.println(p2.getName() + " " + p2.getHP() + "/" + p2.getmaxHP()
        + " HP, " + p2.getSpecial() + "/" + p2.getSpecialMax() + " " + p2.getSpecialName());
      boolean isQuit = attackChoice();
      if (isQuit) {
        times = 0;
      }
    }
  }
}
