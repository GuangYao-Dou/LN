package LeetCode;

import javax.lang.model.element.NestingKind;

/**
 * Auther:vincent-Dou
 * Date: 2019/6/2
 * Time: 21:10
 * Description：
 */
public class Solution43 {
    public static void main(String[] args) {
        String a = "123";
        String s = "456";
//        System.out.println(getSingleMul(s,a));
//        System.out.println(getStringAdd(a,s,0));
        System.out.println(multiply(a,s));
        //49262238
        //System.out.println(getSingleMul(a,s));
//        System.out.println(Integer.parseInt(String.valueOf(s.charAt(2))));
//        System.out.println(Integer.valueOf(String.valueOf(s.charAt(2))));
    }
    public static String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        if(num1.equals("1")){
            return num2;
        }
        if(num2.equals("1")){
            return num1;
        }
        String str = "";
        for(int i = num2.length() - 1 , j = 0; i >= 0; i --, j++){
            str = getStringAdd(str,getSingleMul(String.valueOf(num2.charAt(i)),num1),str.length() - j );
        }
        return str;
    }
    public static String getStringAdd(String str1, String str2, int index){
        if(str1.equals("")){
            return str2;
        }
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer(str1);
        StringBuffer sb2 = new StringBuffer(str2);
        for(int i = index; i < sb1.length(); i++){
            sb2.append(0);
        }
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
    public static String getSingleMul(String singnum, String num){
        int single = Integer.valueOf(singnum);
        int count = 0;
        StringBuffer sb = new StringBuffer();
        for(int i = num.length() - 1; i >= 0; i--){
            int tmp = (Integer.parseInt(String.valueOf(num.charAt(i))) * single) + count;
            if(tmp >= 10){
                sb.append(tmp % 10);
                count = tmp / 10;
            }
            if(tmp < 10){
               sb.append(tmp);
               count = 0;
            }
        }
        if(count != 0){
            sb.append(count);
        }
        return sb.reverse().toString();
    }
}
