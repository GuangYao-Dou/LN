package LeetCode;

/**
 * Auther:vincent-Dou
 */
public class Solution9 {
    public static void main(String[] agrs){
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        if(x < 0 || (x%10==0) && x!=0) {
            return false;
        }
        if(x < 10) {
            return true;
        }
        String str = String.valueOf(x);
        StringBuilder builder = new StringBuilder(str);
        if(builder.reverse().toString().equals(str)){
            return true;
        }
        return false;
    }
}