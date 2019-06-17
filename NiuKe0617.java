package niuke;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 2019/6/17
 * Time: 18:07
 * Author: vincent-Dou
 * Description：输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&tqId=11156&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class NiuKe0617 {
    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode four = new ListNode(4);
        first.next = second;
        second.next = third;
        third.next = four;
        four.next = null;
        ArrayList<Integer> list = printListFromTailToHead(first);
        for(int i : list){
            System.out.println(i);
        }
    }
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode == null){
            return new ArrayList<>();
        }
        ListNode temp = resever(listNode);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (temp != null){
            arrayList.add(temp.val);
            temp = temp.next;
        }
        return arrayList;
    }
    public static ListNode resever(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummyHead = null;
        ListNode cur = head;
        ListNode temp = cur;
        while (cur != null){
            temp = cur.next;
            cur.next = dummyHead;
            dummyHead = cur;
            cur = temp;
        }
        return dummyHead;
    }
}
