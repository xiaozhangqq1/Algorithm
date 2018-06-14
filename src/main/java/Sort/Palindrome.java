package Sort;

/**
 * Created by zhangxuelong on 2017/9/1
 */
public class Palindrome {
    public static void main(String[]args){
        System.out.println(IsPalinadrome(12344321));
    }
    public static boolean isPalinadrome(int x){
        String s = String.valueOf(x);
        String reverse = new StringBuffer(s).reverse().toString();
        if(s.equals(reverse)){
            return true;
        }
        return false;
    }
    public static boolean IsPalinadrome(int x){
        if(x<0 ||(x%10 == 0&& x != 0)){
            return false;
        }
        int revertedNumber = 0;
        while (x>revertedNumber){
            revertedNumber = revertedNumber*10+x%10;
            x/=10;
        }
        return x == revertedNumber||x==revertedNumber/10;
    }


}
