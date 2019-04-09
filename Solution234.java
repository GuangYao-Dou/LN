package LeetCode;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/9
 * Time: 17:07
 * description：回文链表...请判断一个链表是否为回文链表。
 */
public class Solution234 {
    
    public boolean isPalindrome(ListNode head) {
        int len = getLengh(head);
        int[] arr = new int[len];
        ListNode temp = head;
        int i = 0;
        while(temp != null){
            arr[i] = temp.val;
            i++;
            temp = temp.next;
        }
        return isHuiWen(arr);
    }

    public static boolean isHuiWen(int[] arr){
        boolean flag = true;
        for(int i = 0, j = arr.length - 1; i <= j; i++, j--){
            if(arr[i] != arr[j]){
                flag = false;
            }
        }
        return flag;
    }
    public static int getLengh(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
