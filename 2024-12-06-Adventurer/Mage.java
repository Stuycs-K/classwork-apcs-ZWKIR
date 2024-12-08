import java.util.Random;
public class Mage extends Adventurer {
  private int mana = 15;

  public Mage(String name){
    super(name, 10);
  }

  public Mage(String name, int hp){
    super(name, hp);
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
      if (n < getSpecialMax()) {
        mana = n;
      }
      else {
        mana = getSpecialMax();
      }
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
    // random damage from 0-3
    Random rand = new Random();
    int damage = rand.nextInt(3);
    other.applyDamage(damage);
    String lines = this.getName() + " has shot a magic bullet at " + other.getName() + ", causing " + damage + " damage.";
    if (other.getHP() < 0) {
      other.setHP(0);
      return lines + "\n" + other.getName() + " has 0 HP left. " + this.getName() + " has defeated " + other.getName() + "!" + "\n";
    }
    return lines + "\n" + this.getName() + "'s HP: " + this.getHP() + "\n" + other.getName() + "'s HP: " + other.getHP() + "\n";
  }

  //heal or buff the target adventurer
  public String support(Adventurer other) {
    other.setHP(other.getHP() + 2);
    String lines = this.getName() + " has casted magic armor on " + other.getName() + ", providing 2 extra health points!\n"
     + other.getName() + "'s HP: " + other.getHP() + "\n";
    return lines;
  }

  //heal or buff self
  public String support() {
    setHP(this.getHP() + 2);
    String lines = this.getName() + " has casted magic armor on themself, providing 2 extra health points!\n"
     + this.getName() + "'s HP: " + this.getHP() + "\n";
    return lines;
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other) {
    // random damage from 4-6
    Random rand = new Random();
    int damage = rand.nextInt(2) + 4;
    other.applyDamage(damage);
    String lines = this.getName() + " has shot an inferno at " + other.getName() + ", causing " + damage + " damage!";
    if (other.getHP() < 0) {
      other.setHP(0);
      return lines + "\n" + other.getName() + " has 0 HP left. " + this.getName() + " has defeated " + other.getName() + "!" + "\n";
    }
    mana = mana - 5;
    return lines + "\n" + this.getName() + "'s HP: " + this.getHP() + "\n" + other.getName() + "'s HP: " + other.getHP() + "\n" + this.getName() + "'s MP: " + mana + "\n";
  }
}
