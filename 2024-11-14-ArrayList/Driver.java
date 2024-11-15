import java.util.ArrayList;
public class Driver {

  public static void main (String[] args){
    ArrayList<String> ary = new ArrayList<String>();
    ary = ArrayListPractice.createRandomArray(5);
    ArrayList<String> ary1 = new ArrayList<String>();
    ary1 = ArrayListPractice.createRandomArray(5);
    System.out.println("ArrayList 1: " + ary);
    System.out.println("ArrayList 2: " + ary1);
    //System.out.println(ArrayListPractice.createRandomArray(200000));
    ArrayListPractice.replaceEmpty(ary);
    System.out.println(ary);
    ArrayListPractice.replaceEmpty(ary1);
    System.out.println(ary1);
    System.out.println("Ary reversed: " + ArrayListPractice.makeReversedList(ary));
    System.out.println("Mixed: " + ArrayListPractice.mixLists(ary, ary1));
  }




}
