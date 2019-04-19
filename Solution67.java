package LeetCode;

import java.math.BigInteger;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/16
 * Time: 18:52
 * Description： 二进制求和....给定两个二进制字符串，返回他们的和（用二进制表示）。
 */
public class Solution67 {
    public static void main(String[] agrs){
        String s1 = "100110";
        String s2 = "111111";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(Integer.toBinaryString(Integer.parseInt(s1,2) + Integer.parseInt(s2,2)));
        System.out.println(addBinary(s1,s2));
    }
    public static String addBinary(String a, String b) {
        StringBuilder A = new StringBuilder();
        StringBuilder B = new StringBuilder();
        int len = Math.abs(a.length() - b.length());
        if(a.length() > b.length()){
            for(int i = 0; i < len; i++){
                B.append(0);
            }
        }else if(a.length() < b.length()){
            for(int i = 0; i < len; i++){
                A.append(0);
            }
        }
        A = A.append(new StringBuilder(a));
        B = B.append(new StringBuilder(b));
        char sum = '0';
        StringBuilder s = new StringBuilder();
        for(int i = A.length() - 1; i >= 0; i--){
            if((A.charAt(i) + B.charAt(i) + sum) == 144){
                sum = '0';
                s.append(0);
            }else if((A.charAt(i) + B.charAt(i) + sum) == 145) {
                sum = '0';
                s.append(1);
            }else if((A.charAt(i) + B.charAt(i) + sum) == 146) {
                sum = '1';
                s.append(0);
            }else{
                sum = 1;
                s.append(1);
            }
        }
        if(sum != '0'){
            s.append(1);
        }
        return new String(s.reverse());
    }
}
