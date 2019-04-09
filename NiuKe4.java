package niuke;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/9
 * Time: 12:42
 * description：输入一个链表，反转链表后，输出新链表的表头
 */
public class NiuKe4 {
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode prv = null;
        ListNode cur = head;
        while(cur != null){
            ListNode tmp = cur.next;
            cur.next = prv;
            prv = cur;
            cur = tmp;
        }
        return prv;
    }
}
