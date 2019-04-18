package niuke;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/18
 * Time: 20:36
 * Description：你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”
 *  abcXYZdef  ->  XYZdefabc
 */
public class NiuKe10 {
    public static void main(String[] agrs){
    }
    public String LeftRotateString(String str,int n) {
        if(str.length() <= 1){
            return "";
        }
        int len = str.length();
        int remv = n % len;
        char[] arr = str.toCharArray();
        for(int i = 0; i < remv; i++){
            char temp = arr[0];
            for(int j = 0; j < len - 1; j++){
                arr[j] = arr[j+1];
            }
            arr[len - 1] = temp;
        }
        return new String(arr);
    }
}
