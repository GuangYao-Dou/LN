package LeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Auther:vincent-Dou
 */
//输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) { val = x; }
//}
public class Soution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp1 = new ListNode(-1);
        temp1.next = l1;
        ListNode temp2 = new ListNode(-1);
        temp2.next = l2;
        for( ListNode flag = l1; flag.next != null; flag = flag.next){
            temp1 = flag;
            for(ListNode flag2 = l2; flag.val > temp1.val;flag2 = flag2.next){
                flag2.val = temp1.val;
            }
        }
        return temp2;
    }
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode temp1 = new ListNode(0);
        temp1.next = l1;
        ListNode temp2 = new ListNode(0);
        temp2.next = l2;
        return l1;
    }
    //输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4

    public ListNode mergeTwoList3(ListNode l1, ListNode l2){
        ListNode tempL1 = new ListNode(-1);
        tempL1.next = l1;
        ListNode tempL2 = new ListNode(-1);
        tempL2.next = l2;
        ListNode flag = new ListNode(0);
        for(flag = tempL1.next; tempL1.next != null; tempL1 = tempL1.next){
            ListNode flag2 = new ListNode(0);
            for(flag2 = tempL2.next; flag2.next != null; flag2 = flag2.next){
                ListNode temp3 = new ListNode(0);
                temp3.next = flag2;
                if(flag.val < flag2.val){
                    tempL1.next = flag2;
                    flag2.next = tempL1.next;
                }
            }
        }
        return tempL1.next;
    }
    public ListNode mergeTwoList4(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        // 任一为空，直接连接另一条链表
        if (l1 == null) {
            cur.next = l2;
        } else {
            cur.next = l1;
        }
        return dummyHead.next;
    }
    public ListNode mergeTwoList5(ListNode l1, ListNode l2){
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
        }
        if(l1 == null){
            temp.next = l2;
        }else{
            temp.next = l1;
        }
        return dummyNode.next;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m,j = 0; i < m+n; i++, j++){
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
        int[] arr = new int[]{1,2,3,4,5,6};
        for(int i = 0; i < arr.length; i++){
            System.out.println();
        }
    }

}
