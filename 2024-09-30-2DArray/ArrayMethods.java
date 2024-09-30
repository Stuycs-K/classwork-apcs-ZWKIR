//1. Write both your names + emails at the top of the document as a comment.
// Amy Shrestha (amys90@nycstudents.net) & Michelle Ng (michellen83@nycstudents.net)

public class ArrayMethods {
//2. Copy your arrToString method from before.
/**Return a String that represets the array in the format:
* "[2, 3, 4, 9]"
* Note the comma+space between values, and between values
*/
public static String arrToString(int[] nums) {
  String returnStr = "[";
  for (int i = 0; i < nums.length; i++) {
    returnStr += nums[i];
    if (i < nums.length - 1) {
      returnStr += ", ";
    }
  }
  return returnStr + "]";
}

//3. Write arrToString, with a 2D array parameter.
//Note: Different parameters are allowed with the same function name.
/**Return a String that represets the 2D array in the format:
  * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
  * Note the comma+space between values, and between arrays
  * You are encouraged to notice that you may want to re-use
  * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
  */
public static String arrToString(int[][]ary){
  //this should use arrToString(int[])
  return "";
}

/*Return the sum of all of the values in the 2D array */
public static int arr2DSum(int[][]nums){
  //use a nested loop to solve this
  return null;//place holder return value so it compiles.
}

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
public static int[][] swapRC(int[][]nums){
  return new int[1][1];
}

public static void main(String[] args) {
  int [][] arr = new int{{1, 4},{2, 5},{3, 6}};
  System.out.println("Expected: {{1,4},{2,5},{3,6}}" + ", Received: " + arrToString(arr));
  int [][] arr = new int{{-3, 5, 0},{1}};
  System.out.println("Expected: {{-3, 5, 0},{1}}" + ", Received: " + arrToString(arr));
  int [][] arr = new int{{7, 8, -9},{100000, 1, 3, 4, 2},{}};
  System.out.println("Expected: {{7, 8, -9},{100000, 1, 3, 4, 2},{}}" + ", Received: " + arrToString(arr));

  int [][] arr = new int{{1, 4},{2, 5},{3, 6}};
  System.out.println("Expected: 21" + ", Received: " + arr2DSum(arr));
  int [][] arr = new int{{-3, 5, 0},{1}};
  System.out.println("Expected: 3" + ", Received: " + arr2DSum(arr));
  int [][] arr = new int{{7, 8, -9},{100000, 1, 3, 4, 2},{}};
  System.out.println("Expected: 100016" + ", Received: " + arr2DSum(arr));

  int [][] arr = new int{{1, 4},{2, 5},{3, 6}};
  System.out.println("Expected: {{1, 4, 2}, {5, 3, 6}}" + ", Received: " + swapRC(arr));
  int [][] arr = new int{{-3, 5},{1, 2}};
  System.out.println("Expected: {{-3, 5},{1, 2}}" + ", Received: " + swapRC(arr));
  int [][] arr = new int{{7, 8, -9},{100000, 1, 3}};
  System.out.println("Expected: {{7, 8}, {-9, 100000}, {1, 3}}" + ", Received: " + swapRC(arr));
}
}
