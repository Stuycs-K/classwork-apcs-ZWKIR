import java.util.ArrayList;
public class Driver {

  public static void main (String[] args){
    ArrayList<String> ary = new ArrayList<String>();
    ary = ArrayListPractice.createRandomArray(5);
    System.out.println(ary);
    //System.out.println(ArrayListPractice.createRandomArray(200000));
    ArrayListPractice.replaceEmpty(ary);
    System.out.println(ary);
  }




}
