package niuke;

import java.util.Scanner;

/**
 * Date: 2019/6/4
 * Time: 13:56
 * Author: vincent-Dou
 * Description：请设计一个算法完成两个超长正整数的加法。
 */
public class NiuKe0603 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strs = new String[2];
        strs[0] = scanner.next();
        strs[1] = scanner.next();
        int index = 0;
        StringBuffer sb1 = new StringBuffer(strs[0]);
        StringBuffer sb2 = new StringBuffer(strs[1]);
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
        StringBuffer sb = new StringBuffer();
        for(int i = sb1.length() - 1; i >= 0; i--){
            int temp = Integer.parseInt(String.valueOf(sb1.charAt(i))) + Integer.parseInt(String.valueOf(sb2.charAt(i)))+index;
            if(temp >= 10){
                sb.append(temp % 10);
                index = temp / 10;
            }
            if(temp < 10){
                sb.append(temp);
                index = 0;
            }
        }
        if(index != 0){
            sb.append(index);
        }
        System.out.println(sb.reverse().toString());
    }

//988054740175542169641297617563414809038
    public String AddLongInteger(String addend, String augend) {
        String[] strs = new String[2];
        strs[0] = addend;
        strs[1] = augend;
        int index = 0;
        StringBuffer sb1 = new StringBuffer(strs[0]);
        StringBuffer sb2 = new StringBuffer(strs[1]);
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
        StringBuffer sb = new StringBuffer();
        for(int i = sb1.length() - 1; i >= 0; i--){
            int temp = Integer.parseInt(String.valueOf(sb1.charAt(i))) + Integer.parseInt(String.valueOf(sb2.charAt(i)))+index;
            if(temp >= 10){
                sb.append(temp % 10);
                index = temp / 10;
            }
            if(temp < 10){
                sb.append(temp);
                index = 0;
            }
        }
        if(index != 0){
            sb.append(index);
        }
        return sb.reverse().toString();
    }
}