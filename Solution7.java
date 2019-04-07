package LeetCode;

/**
 * Auther:vincent-Dou
 */
class Solution7 {
    public static void main(String[] agrs){
        System.out.println(reverse(10025));
    }
    public static int reverse(int x) {
        int sum = 0;
        for(; x != 0;){
            int temp = x % 10;
            x = x/10;
            if(sum > Integer.MAX_VALUE/10 || (sum == Integer.MAX_VALUE/10 && temp > 7)){
                return 0;
            }
            if(sum < Integer.MIN_VALUE/10 || (sum == Integer.MIN_VALUE/10 && temp < -8)){
                return 0;
            }

            sum = sum*10 +temp;
        }
        // if(x < 0){
        //     return sum*-1;
        // }
        return sum;
    }
}