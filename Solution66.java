package LeetCode;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/27
 * Time: 16:47
 * Description：给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class Solution66 {
    public static void main(String[] agrs) {
        /**
         * 笔记：
         * 1. 时刻要考虑溢出的情况；
         * 2. System.arraycopy(被拷贝数组,开始位置, 需要拷贝的数组, 从哪开始，拷贝多少);
         */
    }

    public static int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] < 9){
            digits[digits.length - 1]++;
            return digits;
        }
        int temp = 1;
        for(int i = digits.length - 1; i >= 0; i--){
            if(temp + digits[i] > 9){
                temp = 1;
                digits[i] = 0;
            }else{
                digits[i] = digits[i] + temp;
                temp = 0;
            }
        }
        if(temp != 0){
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            System.arraycopy(digits,0,arr,1,digits.length);
            return arr;
        }
        return digits;
    }
}
