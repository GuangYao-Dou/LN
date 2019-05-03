package LeetCode;

/**
 * Auther: Vincent-Dou
 * Date: 19-5-3
 * Time: 下午8:48
 * Description: 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 */
public class Solution125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0, len = s.length(); i < len; i++){
            if((s.charAt(i) >= '0' && s.charAt(i) <= '9') ||
                    (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
                    (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
                sb.append(String.valueOf(s.charAt(i)));
            }
        }
        String temp = (sb.toString()).toUpperCase();
        for(int i = 0, j = temp.length() - 1; i < j; i++, j--){
            if(temp.charAt(i) != temp.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
