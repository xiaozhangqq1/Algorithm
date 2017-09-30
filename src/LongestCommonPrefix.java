/**
 * Created by zhangxuelong on 2017/9/5
 */
public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] strings = {"lee","leeeee","le"};
        System.out.println(longestCommonPrefix(strings));
    }
    public static  String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}
