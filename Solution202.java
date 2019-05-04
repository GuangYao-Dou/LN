package LeetCode;

/**
 * Auther: Vincent-Dou
 * Date: 19-5-4
 * Time: 下午7:40
 * Description:编写一个算法来判断一个数是不是“快乐数”。一个“快乐数”定义为：
 * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，
 * 也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 * 输入: 19
 * 输出: true
 * 解释:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class Solution202 {
    public static boolean isHappy(int n) {
        while (true) {
            int flag = getNext(n);
            if (flag == 1) {
                return true;
            } else {
                n = flag;
                if (n == 89) {
                    return false;
                }
            }
        }
    }


    public static int getNext(int num){//取得各个位上，数的平方和
        int result = 0;
        result = result+((num%10)*(num%10));
        num = num / 10;
        if(num == 0){
            return result;
        }else{
            return result + getNext(num);
        }
    }
}
