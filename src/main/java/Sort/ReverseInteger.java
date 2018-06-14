package Sort;

/**
 * Created by zhang on2017/8/29
 */
public class ReverseInteger {
    public static void main(String[]args){
        System.out.println(numReverse(-123450));
    }
    public static int reverse(int num){
        //自己写的,运行速度不如第二个
        StringBuffer buffer = new StringBuffer();
        if (num < 0){
            String str = buffer.append(-num).reverse().toString();
            return -Integer.parseInt(str);
        }
        String str = buffer.append(num).reverse().toString();
        return Integer.parseInt(str);
    }
    public static int numReverse(int num){
        long rev = 0;
        while (num!=0){
            rev = rev * 10+num % 10;
            num = num/10;
            if (rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE)
                return 0;
        }
        return (int)rev;
    }


}

