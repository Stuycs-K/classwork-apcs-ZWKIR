import java.util.*;

public class Game {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter username: ");
    String userName = userInput.nextLine();
    Adventurer p1 = new CodeWarrior(userName, 20);
    Adventurer p2 = new CodeWarrior("Carol", 20);
    for (int times = 0; times < 5; times++) {
      System.out.println(p1.getName() + " " + p1.getHP() + "/" + p1.getmaxHP()
       + " HP, " + p1.getSpecial() + "/" + p1.getSpecialMax() + " " + p1.getSpecialName());
      System.out.println("\n" + p2.getName() + " " + p2.getHP() + "/" + p2.getmaxHP()
        + " HP, " + p2.getSpecial() + "/" + p2.getSpecialMax() + " " + p2.getSpecialName());
      userInput = new Scanner(System.in);
      String attack = userInput.nextLine();
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");

    }
  }
}
