package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Auther: Vincent-Dou
 * Date: 19-6-27
 * Time: 下午9:08
 * Description:对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。
 *
 * 给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-to-array-form-of-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution989 {
    public static void main(String[] args){
        int[] arr = {1, 2, 0, 0};
        List<Integer> list = addToArrayForm(arr,34);
        System.out.println(list);
    }
    public static List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> lists = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < A.length; i++){
            sb.append(A[i]);
        }
        String resultStr = addStrings(sb.toString(), K+"");
        for(int i = 0; i < resultStr.length(); i++){
            lists.add(resultStr.charAt(i) - 48);
        }
        return lists;
    }
    public static String addStrings(String num1, String num2) {
        if(num1.equals("0")){
            return num2;
        }
        if(num2.equals("0")){
            return num1;
        }
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer(num1);
        StringBuffer sb2 = new StringBuffer(num2);
        if(sb1.length() < sb2.length()){
            sb1 = sb1.reverse();
            while (sb1.length() != sb2.length()){
                sb1.append(0);
            }
            sb1 = sb1.reverse();
        }
        if(sb1.length() > sb2.length()){
            sb2 = sb2.reverse();
            while (sb2.length() != sb1.length()){
                sb2.append(0);
            }
            sb2 = sb2.reverse();
        }
        int count = 0;
        for(int i = sb1.length() - 1; i >= 0; i--){
            int temp = Integer.parseInt(String.valueOf(sb1.charAt(i))) + Integer.parseInt(String.valueOf(sb2.charAt(i))) + count;
            if(temp < 10){
                sb.append(temp);
                count = 0;
            }
            if(temp >= 10){
                sb.append(temp % 10);
                count = temp / 10;
            }
        }
        if(count != 0){
            sb.append(count);
        }
        return sb.reverse().toString();
    }
}
