package arithmetic;

/**
 * Created by homiss on 2017/5/18.
 */
public class _7ReverseInteger {

  public static void main(String[] args) {
    System.out.println(reverse(0));
  }

  public static int reverse(int x) {
    String val = String.valueOf(x);
    String res = "";
    char[] vals = val.toCharArray();
    for(int i = vals.length - 1; i >= 0; i--){
      if(i == 0 && vals[i] == '-'){
        res = '-' + res;
        continue;
      }
      res += vals[i];
    }
    Long v = Long.valueOf(res);
    if(v > Integer.MAX_VALUE || v < Integer.MIN_VALUE){
      return 0;
    } else {
      return Integer.valueOf(res);
    }
  }
}
