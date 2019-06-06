package LeetCode;

/**
 * Date: 2019/6/6
 * Time: 21:27
 * Author: vincent-Dou
 * Description：字符串转换整数 (atoi)
 */
public class Solution8 {
    public static void main(String[] args) {
        System.out.println(myAtoi(
                "0-1"));
    }
    public static int myAtoi(String str) {
        int result = 0;
        boolean isFU = false;
        StringBuffer sb = new StringBuffer();
        int sum = 0;
        int flag = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '+'){
                flag++;
                continue;
            }

            if(str.charAt(i) == '-'){
                flag++;
                isFU = true;
                continue;
            }
            if(flag >= 2){
                return 0;
            }
            if((isFU || flag!=0) && str.charAt(i) == ' ' ){
                return 0;
            }
            if(sb.length() > 0 && (str.charAt(i) == '+' || str.charAt(i) == '-')){
                return 0;
            }
            if(sb.length() > 0 && str.charAt(i) == ' '){
                if (isFU) {
                    result = Integer.parseInt(sb.insert(0, '-').toString());
                    return result;
                }
                result = Integer.parseInt(sb.toString());
                return result;
            }
            if(str.charAt(i) == ' ')
                continue;
            if(sb.length() > 0){
                if(isFU){
                    sum = Integer.parseInt(sb.toString()) * -1;
                }else{
                    sum = Integer.parseInt(sb.toString());
                }
            }
            if(str.charAt(i) < 48 || str.charAt(i) > 57){
                break;
            }else{
                int temp = 0;
                if (isFU) {
                    temp = Integer.parseInt(String.valueOf(str.charAt(i))) * -1;
                }else {
                    temp = Integer.parseInt(String.valueOf(str.charAt(i)));
                }
                if(sum > Integer.MAX_VALUE/10 || (sum == Integer.MAX_VALUE/10 && temp > 7)){
                    return Integer.MAX_VALUE;
                }
                if(sum < Integer.MIN_VALUE/10 || (sum == Integer.MIN_VALUE/10 && temp < -8)){
                    return Integer.MIN_VALUE;
                }
                sb.append(str.charAt(i));
            }
        }
        if(sb.length() == 0){
            return result;
        }else{
            if (isFU) {
                result = Integer.parseInt(sb.insert(0, '-').toString());
                return result;
            }
            result = Integer.parseInt(sb.toString());
            return result;
        }
    }
    //            if(sum > Integer.MAX_VALUE/10 || (sum == Integer.MAX_VALUE/10 && temp > 7)){
    //                return 0;
    //            }
    //            if(sum < Integer.MIN_VALUE/10 || (sum == Integer.MIN_VALUE/10 && temp < -8)){
    //                return 0;
    //            }
}
