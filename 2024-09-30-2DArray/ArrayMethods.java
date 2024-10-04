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

/*Return the sum of all of the values in the 2D array */
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

/**Rotate an array by returning a new array with the rows and columns swapped.
  * You may assume the array is rectangular and neither rows nor cols is 0.
  * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  */
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

public static void main(String[] args) {
  // Tests for 2D array function arrToString
  System.out.println("---------TEST CASES FOR arrToString---------");
  int [][] arr = new int[][]{{1, 4},{2, 5},{3, 6}};
  System.out.println("Expected: [[1, 4], [2, 5], [3, 6]], Received: " + arrToString(arr)
  + "| Equals? " + (arrToString(arr).equals("[[1, 4], [2, 5], [3, 6]]")));
  arr = new int[][]{{-3, 5, 0},{1}};
  System.out.println("Expected: [[-3, 5, 0], [1]], Received: " + arrToString(arr)
  + "| Equals? " + (arrToString(arr).equals("[[-3, 5, 0], [1]]")));
  arr = new int[][]{{7, 8, -9},{100000, 1, 3, 4, 2},{}};
  System.out.println("Expected: [[7, 8, -9], [100000, 1, 3, 4, 2}, []], Received: " + arrToString(arr)
  + "| Equals? " + (arrToString(arr).equals("[[7, 8, -9], [100000, 1, 3, 4, 2], []]")));
  arr = new int[][]{{}, {5, 3, 2}, {4}};
  System.out.println("Expected: [[], [5, 3, 2], [4]], Received: " + arrToString(arr)
  + "| Equals? " + (arrToString(arr).equals("[[], [5, 3, 2], [4]]")));
  arr = new int[][]{{94, 3323, 888}, {3, 2, 2}};
  System.out.println("Expected: [[94, 3323, 888], [3, 2, 2]], Received: " + arrToString(arr)
  + "| Equals? " + (arrToString(arr).equals("[[94, 3323, 888], [3, 2, 2]]")));
  arr = new int[][]{{-13464, 2}, {1093, 23234, 3}};
  System.out.println("Expected: [[-13464, 2], [1093, 23234, 3]], Received: " + arrToString(arr)
  + "| Equals? " + (arrToString(arr).equals("[[-13464, 2], [1093, 23234, 3]]")));

  // Tests for arr2DSum
  System.out.println("\n---------TEST CASES FOR arr2DSum---------");
  arr = new int[][]{{1, 4},{2, 5},{3, 6}};
  System.out.println("Expected: 21, Received: " + arr2DSum(arr) + "| Equals? " + (arr2DSum(arr) ==  21));
  arr = new int[][]{{-3, 5, 0},{1}};
  System.out.println("Expected: 3, Received: " + arr2DSum(arr) + "| Equals? " + (arr2DSum(arr) ==  3));
  arr = new int[][]{{7, 8, -9},{100000, 1, 3, 4, 2},{}};
  System.out.println("Expected: 100016, Received: " + arr2DSum(arr) + "| Equals? " + (arr2DSum(arr) ==  100016));
  arr = new int[][]{{}, {}, {}};
  System.out.println("Expected: 0, Received: " + arr2DSum(arr) + "| Equals? " + (arr2DSum(arr) ==  0));
  arr = new int[][]{{0}, {0, 0, 2}, {0, 0, 0, 0}};
  System.out.println("Expected: 2, Received: " + arr2DSum(arr) + "| Equals? " + (arr2DSum(arr) ==  2));
  arr = new int[][]{{-3}, {-5}, {8, 0}};
  System.out.println("Expected: 0, Received: " + arr2DSum(arr) + "| Equals? " + (arr2DSum(arr) ==  0));

  // Tests for swapRC
  System.out.println("\n---------TEST CASES FOR swapRC---------");
  arr = new int[][]{{1, 4}, {2, 5}, {3, 6}};
  System.out.println("Expected: [[1, 2, 3], [4, 5, 6]], Received: " + arrToString(swapRC(arr))
  + "| Equals? " + (arrToString(swapRC(arr)).equals("[[1, 2, 3], [4, 5, 6]]")));
  arr = new int[][]{{-3, 5}, {1, 2}};
  System.out.println("Expected: [[-3, 1], [5, 2]], Received: " + arrToString(swapRC(arr))
  + "| Equals? " + (arrToString(swapRC(arr)).equals("[[-3, 1], [5, 2]]")));
  arr = new int[][]{{7, 8, -9}, {100000, 1, 3}};
  System.out.println("Expected: [[7, 100000], [8, 1], [-9, 3]], Received: " + arrToString(swapRC(arr))
  + "| Equals? " + (arrToString(swapRC(arr)).equals("[[7, 100000], [8, 1], [-9, 3]]")));
  arr = new int[][]{{3, 2, 6, 8}, {4, 5, 10, 14}};
  System.out.println("Expected: [[3, 4], [2, 5], [6, 10], [8, 14]], Received: " + arrToString(swapRC(arr))
  + "| Equals? " + (arrToString(swapRC(arr)).equals("[[3, 4], [2, 5], [6, 10], [8, 14]]")));
  arr = new int[][]{{7}, {11}, {24}};
  System.out.println("Expected: [[7, 11, 24]], Received: " + arrToString(swapRC(arr))
  + "| Equals? " + (arrToString(swapRC(arr)).equals("[[7, 11, 24]]")));
  arr = new int[][]{{8, 8, 8}, {8, 8, 8}, {8, 8, 8}};
  System.out.println("Expected: [[8, 8, 8], [8, 8, 8], [8, 8, 8]], Received: " + arrToString(swapRC(arr))
  + "| Equals? " + (arrToString(swapRC(arr)).equals("[[8, 8, 8], [8, 8, 8], [8, 8, 8]]")));

  //Tests for replaceNegative
  System.out.println("\n---------TEST CASES FOR replaceNegative---------");
  arr = new int[][]{{1, 4}, {-2, -5}, {3, -6}};
  replaceNegative(arr);
  System.out.println("Expected: [[1, 4], [0, 1], [3, 0]], Received: " + arrToString(arr));
  arr = new int[][]{{-3, 5}, {1, 2}};
  replaceNegative(arr);
  System.out.println("Expected: [[1, 5], [1, 2]], Received: " + arrToString(arr));
  arr = new int[][]{{7, 8, -9}, {100000, 1, 3}};
  replaceNegative(arr);
  System.out.println("Expected: [[7, 8, 0], [100000, 1, 3]], Received: " + arrToString(arr));

  //Tests for copy
  System.out.println("\n---------TEST CASES FOR copy---------");
  arr = new int[][]{{1, 4}, {-2, -5}, {3, -6}};
  System.out.println("Expected: " + arrToString(arr) + ", Received: " + arrToString(copy((arr)))
  + "| Equals? " + arr.equals(copy(arr)));
  arr = new int[][]{{-3, 5}, {1, 2}};
  System.out.println("Expected: " + arrToString(arr) + ", Received: " + arrToString(copy((arr)))
  + "| Equals? " + arr.equals(copy(arr)));
  arr = new int[][]{{7, 8, -9}, {100000, 1, 3}};
  System.out.println("Expected: " + arrToString(arr) + ", Received: " + arrToString(copy((arr)))
  + "| Equals? " + arr.equals(copy(arr)));
}
}
