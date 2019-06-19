package niuke;

/**
 * Date: 2019/6/19
 * Time: 18:21
 * Author: vincent-Dou
 * Description：写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号
 * https://www.nowcoder.com/practice/59ac416b4b944300b617d4f7f111b215?tpId=13&tqId=11201&tPage=3&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 */
public class NiuKe06191 {
    public static void main(String[] args) {
        System.out.println(5 ^ 6);
    }
    public int Add(int num1,int num2) {
        while(num1 != 0){ //进位为0 时跳出循环
            int sum = (num1 ^ num2); //不考虑进位，相加时直接异或
            int carryBit = (num1 & num2)<< 1;  //carryBit保存两个加数的进位
            num2 = sum;
            num1 = carryBit;
        }
        return num2;
    }
}
