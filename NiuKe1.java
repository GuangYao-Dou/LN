package niuke;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/9
 * Time: 11:44
 * description：输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class NiuKe1 {
    public static void main(String[] agrs){
        System.out.println(NumberOf1(Integer.MAX_VALUE));
    }
    public static int NumberOf1(int n) {
        String str = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}

