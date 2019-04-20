package LeetCode;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/20
 * Time: 15:21
 * Description：分隔链表  给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
 *
 * 你应当保留两个分区中每个节点的初始相对位置。
 */
public class Solution86 {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode small = new ListNode(-1);
        ListNode big   = new ListNode(-1);
        ListNode cur1 = small;
        ListNode cur2 = big;
        while (head != null){
            if(head.val < x){
                cur1.next = head;
                cur1 = cur1.next;
                head = head.next;
                cur1.next = null;
            }else{
                cur2.next = head;
                cur2 = cur2.next;
                head = head.next;
                cur2.next = null;
            }
        }
        cur1.next = big.next;
        return small.next;
    }
}
