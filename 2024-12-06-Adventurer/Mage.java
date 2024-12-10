import java.util.Random;
public class Mage extends Adventurer {
  private int mana = 15;

  public Mage(String name){
    super(name, 25);
  }

  public Mage(String name, int hp){
    super(name, hp);
  }

  public Mage(){
    this("Macy");
  }

  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */
  //give it a short name (fewer than 13 characters)
  public String getSpecialName() {
    return "mana";
  }
  //accessor methods
  public int getSpecial() {
    return mana;
  }
  public void setSpecial(int n) {
    mana = n;
  }
  public int getSpecialMax() {
    return 20;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other) {
    // random damage from 1-4
    Random rand = new Random();
    int damage = rand.nextInt(3)+1;
    other.applyDamage(damage);
    restoreSpecial(2);
    String lines = this + " has shot a magic bullet at " + other + ", causing " + damage + " damage.";
    if (other.getHP() < 0) {
      other.setHP(0);
      return lines + "\n" + other + " has 0 HP left. " + this + " has defeated " + other + "!" + "\n";
    }
    return lines;
  }

  //heal or buff the target adventurer
  public String support(Adventurer other) {
    other.setHP(other.getHP() + 2);
    other.restoreSpecial(2);
    restoreSpecial(2);
    String lines = this + " has casted magic armor on " + other + ", providing 2 extra health points and restoring 2 mana!";
    return lines;
  }

  //heal or buff self
  public String support() {
    setHP(getHP() + 2);
    String lines = this + " has casted magic armor on themself, providing 2 extra health points and restoring 2 mana!";
    restoreSpecial(2);
    return lines;
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other) {
    if (getSpecial() >= 5) {
      // random damage from 4-6
      Random rand = new Random();
      int damage = rand.nextInt(2) + 4;
      setSpecial(getSpecial() - 5);
      other.applyDamage(damage);
      String lines = this + " has shot an inferno at " + other + ", causing " + damage + " damage!";
      if (other.getHP() < 0) {
        other.setHP(0);
        return lines + "\n" + other + " has 0 HP left. " + this + " has defeated " + other + "!" + "\n";
      }
      return lines;
    }
    else {
      System.out.println(this + " does not have enough mana. Instead " + attack(other));
    }
    return "";
  }
}
