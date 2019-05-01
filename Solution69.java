package LeetCode;

/**
 * Auther: Vincent-Dou
 * Date: 19-5-1
 * Time: 下午9:41
 * Description:实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去
 */
public class Solution69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(22));
    }
    public static int mySqrt(int x) {
        for(long i = 1; i <= x; i++){
            if(i*i == x || (i*i < x && (i+1)*(i+1) > x)){
                return (int)i;
            }
        }
        return 0;
    }
}
