package LeetCode;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/23
 * Time: 7:45
 * Description：报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 */
public class Solution38 {
    public static void main(String[] agrs){
        System.out.println(countAndSay(3));
    }
    public static String countAndSay(int n) {
        StringBuilder result = new StringBuilder();
        if (n == 1) {
            result.append(1);
            return result.toString();
        }
//        if( n == 2){
//            result.append(11);
//            return result.toString();
//        }
        result.append(1);
        for(int i = 2; i <= n; i++){
            char temp = result.charAt(0);
            int count = 1;
            int len = result.length();
            for(int j = 1; j < len; j++){
                if(result.charAt(j) != temp){
                    result.append(count);
                    result.append(temp);
                    temp = result.charAt(j);
                    count = 1;
                    continue;
                }
                count++;
            }
            result.append(count).append(temp);
            result.delete(0,len);
        }
        return  result.toString();
    }
}
