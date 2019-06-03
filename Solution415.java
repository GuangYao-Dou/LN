package LeetCode;

/**
 * Auther:vincent-Dou
 * Date: 2019/6/3
 * Time: 12:42
 * Description：
 */
public class Solution415 {
    public String addStrings(String num1, String num2) {
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
