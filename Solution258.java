package LeetCode;

/**
 * Auther:vincent-Dou
 * Date: 2019/5/26
 * Time: 12:33
 * Description：给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 *
 * 示例:
 *
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 */

/**
 * 在递归求解的算法中， 不仅仅只限于一个函数， 还可以去递归调用另外的函数
 */
public class Solution258 {
    public static void main(String[] args){
        System.out.println(addDigits(578));
    }
    public static int addDigits(int num) {
        if(getEveryNumAdd(num) < 10){
            return getEveryNumAdd(num);
        }else{
            return addDigits(getEveryNumAdd(num));
        }
    }
    public static int getEveryNumAdd(int num){
        int sum = 0;
        while(num  != 0){
            sum = sum + num%10;
            num = num / 10;
        }
//        System.out.println(sum);
        return sum;
    }
}
