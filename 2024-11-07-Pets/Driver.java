// As we did step 7, the rerunned Driver code overwrote every instance of
// where we called getName() in the Animal.java file with "The Mighty [name]"
// when we called it with a Bird object.

public class Driver {
  public static void main(String[] args) {
    Animal a1 = new Animal("moo", 10, "Stacy");
    a1.speak();
    Bird b1 = new Bird("squawk", 2, "Squash", 4.0, "blue");
    b1.speak();
  }
}
