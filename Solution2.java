package LeetCode;

import java.util.List;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/20
 * Time: 10:35
 * Description：两数相加 给出两个 非空 的链表用来表示两个非负的整数。其中，它们
 * 各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 */
public class Solution2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        int sum = 0;
        while (l1 != null && l2 != null) {
            int res = sum + l1.val + l2.val;
            if (res < 10) {
                sum = 0;
                ListNode temp = new ListNode(res);
                cur.next = temp;
                cur = temp;
            } else {
                sum = (res / 10) % 10;
                ListNode temp = new ListNode(res % 10);
                cur.next = temp;
                cur = temp;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null) {
            while (l2 != null) {
                int res = sum + l2.val;
                if (res < 10) {
                    sum = 0;
                    ListNode temp = new ListNode(res);
                    cur.next = temp;
                    cur = temp;
                } else {
                    sum = (res / 10) % 10;
                    ListNode temp = new ListNode(res % 10);
                    cur.next = temp;
                    cur = temp;
                }
                l2 = l2.next;
            }
        } else if (l2 == null) {
            while (l1 != null) {
                int res = sum + l1.val;
                if (res < 10) {
                    sum = 0;
                    ListNode temp = new ListNode(res);
                    cur.next = temp;
                    cur = temp;
                } else {
                    sum = (res / 10) % 10;
                    ListNode temp = new ListNode(res % 10);
                    cur.next = temp;
                    cur = temp;
                }
                l1 = l1.next;
            }
        }
        if(sum != 0){
            ListNode temp = new ListNode(sum);
            cur.next = temp;
        }
        return head.next;
    }
}
