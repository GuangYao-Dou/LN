package LeetCode;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/21
 * Time: 9:51
 * Description：给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 */
public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = new ListNode(-1);
        ListNode cur = list;
        while (head != null) {
            ListNode cur2 = list;
            boolean flag = false;
            while (cur2.next != null){
                if (head.val == cur2.next.val) {
                    flag = true;
                    break;
                }
                cur2 = cur2.next;
            }
            if(flag){
                head = head.next;
            }else{
                cur.next = head;
                cur = cur.next;
                head = head.next;
                cur.next = null;
            }
        }
        return list.next;
    }
}
