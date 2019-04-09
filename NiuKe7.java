package niuke;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/9
 * Time: 21:23
 * description：整数中1出现的次数（从1到n整数中1出现的次数）

 */
public class NiuKe7 {
    public static void main(String[] agrs){
        int num = NumberOf1Between1AndN_Solution(11);
        System.out.println(num);
    }
    public static int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++){
            String str = i+"";
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == '1'){
                    count++;
                }
            }
        }
        return count;
    }
}

