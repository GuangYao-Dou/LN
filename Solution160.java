package LeetCode;

import java.util.List;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/14
 * Time: 13:50
 * description：编写一个程序，找到两个单链表相交的起始节点。
 */
public class Solution160 {

    //第一种方法
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        if(lenA < lenB){
            for(int i = 0; i < lenB - lenA; i++){
                headB = headB.next;
            }
        }else if(lenA > lenB){
            for(int i = 0; i < lenA - lenB ; i++){
                headA = headA.next;
            }
        }
        while(headA != null && headB != null){
            if(headA == headB ){
                break;
            }
            headA = headA.next;
            headB = headB.next;
        }
        if(headA == headB){
            return headA;
        }
        return null;
    }
    public static int getLength(ListNode head){
        ListNode temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }


    //第二种方法

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB){
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

}
