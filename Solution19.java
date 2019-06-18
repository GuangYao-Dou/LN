package LeetCode;

import java.util.List;

/**
 * Date: 2019/6/18
 * Time: 18:39
 * Author: vincent-Dou
 * Description：删除链表的倒数第N个节点
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 */
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur1 = head;
        ListNode cur2 = head;
        int count = 0;
        while (count < n - 1){
            cur1 = cur1.next;
            count++;
        }
        ListNode temp = new ListNode(-1);
        while (cur1.next != null){
            cur1 = cur1.next;
            temp = cur2;
            cur2 = cur2.next;
        }
        if(cur2 == head){
            head = head.next;
        }else{
            ListNode temp2 = cur2.next;
            temp.next = temp2;
        }
        return head;
    }
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode dummyhead = new ListNode(-1);
        dummyhead.next = head;
        ListNode cur1 = dummyhead;
        ListNode cur2 = dummyhead;
        int count = 0;
        while (count < n - 1){
            cur1 = cur1.next;
            count++;
        }
        ListNode temp = dummyhead;
        while (cur1 != null){
            temp = cur2;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        ListNode temp1 = cur1.next;
        temp.next = temp1;
        return dummyhead.next;
    }
}
