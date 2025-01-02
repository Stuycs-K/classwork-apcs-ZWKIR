public class Fibbonacci {
  public static int fib(int n) {
    if (n < 2) {
      return n;
    } else {
      return fib(n-1) + fib(n-2);
    }
  }

  public static void main(String[] args) {
    // 46 is the largest fib number you can calculate under
    // 10 sec; also the largest fib(n) that fits into an int
    System.out.println(fib(46));
  }
}
