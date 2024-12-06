import java.util.Random;
public class Mage extends Adventurer {
  private String name;
  private int HP,maxHP;

  public Mage(String name){
      super(name, 10);
  }

  public Mage(String name, int hp){
    super(name, hp);
    this.name = super.getName();
    this.HP = super.getHP();
    this.maxHP = super.getHP();
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
    return 0;
  }
  public void setSpecial(int n) {

  }
  public int getSpecialMax() {
    return 0;
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
    other.setHP(other.getHP() - damage);
    String lines = "You shot a magic bullet at " + other.getName() + ", causing " + damage + " damage."
     + "\nYour HP: " + this.HP + "\n" + other.getName() + "'s HP: " + other.getHP();
    return lines;
  }

  //heall or buff the target adventurer
  public String support(Adventurer other) {
    return "";
  }

  //heall or buff self
  public String support() {
    return "";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other) {
    return "";
  }
}
