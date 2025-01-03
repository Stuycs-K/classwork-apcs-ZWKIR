public class MakeWords {
  public static void makeWords(int remainingLetters, String result, String alphabet){
    if (remainingLetters < 1) {
      System.out.println(result);
    } else {
      for (int i = 0; i < alphabet.length(); i++) {
        result += alphabet.substring(0,1);
        makeWords(remainingLetters - 1, result, alphabet);
      }
    }
  }

  public static void main(String[] args) {
    makeWords(2,"","abc");
  }
}
