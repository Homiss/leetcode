package arithmetic;

/**
 * Created by homiss on 2017/5/18.
 */
public class _9PalindromeNumber {

  public static void main(String[] args) {
    isPalindrome(1221);
  }

  public static boolean isPalindrome(int x) {
    if(x < 0) return false;
    if(x < 10) return true;

    int t = x;
    int d = 0;

    while(t != 0) {
      t = t/10;
      d++;
    }


    return true;
  }

}
