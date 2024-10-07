import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    System.out.println("---------TEST CASES FOR arrToString (1D)---------");
    int [] arr1 = new int[]{1, 4, 2, 5};
    System.out.println("Expected: " + Arrays.toString(arr1) + ", Received: " + arrToString(arr)1
    + "| Equals? " + (arrToString(arr1).equals(Arrays.toString(arr1))));
    arr1 = new int[]{-3, 5, 0};
    System.out.println("Expected: " + Arrays.toString(arr1) + ", Received: " + arrToString(arr)1
    + "| Equals? " + (arrToString(arr1).equals(Arrays.toString(arr1))));
    arr1 = new int[]{7, 8, -9, 100000, 1, 3, 4, 2};
    System.out.println("Expected: " + Arrays.toString(arr1) + ", Received: " + arrToString(arr)1
    + "| Equals? " + (arrToString(arr1).equals(Arrays.toString(arr1))));
    arr1 = new int[]{5, 3, 2}, 4};
    System.out.println("Expected: " + Arrays.toString(arr1) + ", Received: " + arrToString(arr)1
    + "| Equals? " + (arrToString(arr1).equals(Arrays.toString(arr1))));
    arr1 = new int[]{94, 3323, 888, 3, 2, 2};
    System.out.println("Expected: " + Arrays.toString(arr1) + ", Received: " + arrToString(arr)1
    + "| Equals? " + (arrToString(arr1).equals(Arrays.toString(arr1))));
    arr1 = new int[]{-13464, 2, 1093, 23234, 3};
    System.out.println("Expected: " + Arrays.toString(arr1) + ", Received: " + arrToString(arr)1
    + "| Equals? " + (arrToString(arr1).equals(Arrays.toString(arr1))));

    System.out.println("---------TEST CASES FOR arrToString (2D)---------");
    int [][] arr = new int[][]{{1, 4},{2, 5},{3, 6}};
    System.out.println("Expected: " + Arrays.deeptoString(arr) + ", Received: " + arrToString(arr)
    + "| Equals? " + (arrToString(arr).equals(Arrays.deeptoString(arr))));
    arr = new int[][]{{-3, 5, 0},{1}};
    System.out.println("Expected: " + Arrays.deeptoString(arr) + ", Received: " + arrToString(arr)
    + "| Equals? " + (arrToString(arr).equals(Arrays.deeptoString(arr))));
    arr = new int[][]{{7, 8, -9},{100000, 1, 3, 4, 2},{}};
    System.out.println("Expected: " + Arrays.deeptoString(arr) + ", Received: " + arrToString(arr)
    + "| Equals? " + (arrToString(arr).equals(Arrays.deeptoString(arr))));
    arr = new int[][]{{}, {5, 3, 2}, {4}};
    System.out.println("Expected: " + Arrays.deeptoString(arr) + ", Received: " + arrToString(arr)
    + "| Equals? " + (arrToString(arr).equals(Arrays.deeptoString(arr))));
    arr = new int[][]{{94, 3323, 888}, {3, 2, 2}};
    System.out.println("Expected: " + Arrays.deeptoString(arr) + ", Received: " + arrToString(arr)
    + "| Equals? " + (arrToString(arr).equals(Arrays.deeptoString(arr))));
    arr = new int[][]{{-13464, 2}, {1093, 23234, 3}};
    System.out.println("Expected: " + Arrays.deeptoString(arr) + ", Received: " + arrToString(arr)
    + "| Equals? " + (arrToString(arr).equals(Arrays.deeptoString(arr))));

    // Tests for countZeros2D
    System.out.println("\n---------TEST CASES FOR countZeros2D---------");
    arr = new int[][]{{1, 4},{2, 5},{3, 6}};
    System.out.println("Expected: 0, Received: " + countZeros2D(arr) + "| Equals? " + (countZeros2D(arr) ==  0));
    arr = new int[][]{{-3, 5, 0},{1}};
    System.out.println("Expected: 1, Received: " + countZeros2D(arr) + "| Equals? " + (countZeros2D(arr) ==  1));
    arr = new int[][]{{7, 8, -9},{100000, 1, 3, 4, 2},{}};
    System.out.println("Expected: 0, Received: " + countZeros2D(arr) + "| Equals? " + (countZeros2D(arr) ==  0));
    arr = new int[][]{{}, {}, {}};
    System.out.println("Expected: 0, Received: " + countZeros2D(arr) + "| Equals? " + (countZeros2D(arr) ==  0));
    arr = new int[][]{{0}, {0, 0, 2}, {0, 0, 0, 0}};
    System.out.println("Expected: 7, Received: " + countZeros2D(arr) + "| Equals? " + (countZeros2D(arr) ==  7));
    arr = new int[][]{{-3}, {-5}, {8, 0}};
    System.out.println("Expected: 1, Received: " + countZeros2D(arr) + "| Equals? " + (countZeros2D(arr) ==  1));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
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

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][] ary) {
    //this should use arrToString(int[])
    String returnStr = "[";
    for (int i = 0; i < ary.length; i++) {
      returnStr += arrToString(ary[i]);
      if (i < ary.length - 1) {
        returnStr += ", ";
      }
    }
    return returnStr + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int i2 = 0; i2 < nums[i].length; i2++) {
        if (nums[i][i2] == 0) {
          count++;
        }
      }
    }
    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
   public static int arr2DSum(int[][] nums){
     //use a nested loop to solve this
     int sum = 0;
     for (int i = 0; i < nums.length; i++) {
       for (int i2 = 0; i2 < nums[i].length; i2++) {
         sum += nums[i][i2];
       }
     }
     return sum;//place holder return value so it compiles.
   }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++) {
      for (int i2 = 0; i2 < vals[i].length; i2++) {
        if (vals[i][i2] < 0) {
          if (i == i2) {
            vals[i][i2] = 1;
          }
          else {
            vals[i][i2] = 0;
          }
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] ary = new int[nums.length][nums[0].length];
    for (int i = 0; i < nums.length; i++) {
      ary[i] = helper(nums[i]);
    }
    return ary; //placeholder so it compiles
  }

  public static int[] helper(int[] ary) {
    int[] ary1 = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      ary1[i] = ary[i];
    }
    return ary1;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][] nums) {
    int origRows = nums.length;
    int origCols = nums[0].length;
    int[][] ary = new int[origCols][origRows];
    for (int i = 0; i < origRows; i++) {
      for (int i2 = 0; i2 < nums[i].length; i2++) {
        ary[i2][i] = nums[i][i2];
      }
    }
    return ary;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    return "";
  }
}
