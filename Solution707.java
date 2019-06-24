package com.dgy.domain;

public class Solution707 {

    private class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    private ListNode head;
    /** Initialize your data structure here. */
    public Solution707() {
        head = null;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0 || index > getLength() - 1){
            return -1;
        }
        int count = 0;
        ListNode cur = head;
        while (count < index){
            cur = cur.next;
            count++;
        }
        return cur.val;
    }
    public int getLength(){
        int len = 0;
        ListNode cur = head;
        while (cur != null){
            cur = cur.next;
            len++;
        }
        return len;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if(head == null){
            head = new ListNode(val);
            return;
        }
        ListNode temp = new ListNode(val);
        temp.next = head;
        head = temp;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if(head == null){
            head = new ListNode(val);
            return;
        }
        ListNode cur = head;
        ListNode temp = new ListNode(val);
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = temp;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);
        }else if(index == getLength()){
            addAtTail(val);
        }else if(index < -1 || index > getLength()){
            return;
        }else if(index == -1 && head == null) {
            head = new ListNode(val);
        }else if(index == -1){
            ListNode temp = new ListNode(val);
            temp.next = head;
            head.next = temp;
        }else {
                ListNode cur1 = head;
                ListNode cur2 = cur1.next;
                ListNode temp = new ListNode(val);
                int count = 0;
                while (count < index - 1){
                    cur1 = cur1.next;
                    cur2 = cur1.next;
                    count++;
                }
                cur1.next = temp;
                cur1.next.next = cur2;
            }

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index < 0 || index > getLength() - 1 || head == null){
            return;
        }
        if(index == 0){
            head = head.next;
            return;
        }
        if(index == getLength() - 1){
            ListNode cur = head;
            while (cur.next.next != null){
                cur = cur.next;
            }
            cur.next = null;
            return;
        }
        int count = 0;
        ListNode cur1 = head;
        ListNode cur2 = cur1.next.next;
        while (count < index - 1){
            cur1 = cur1.next;
            cur2 = cur1.next.next;
            count++;
        }
        cur1.next = cur2;
    }

    public void disPlay(){
        if(head == null){
            System.out.println("链表位空");
            return;
        }
        ListNode cur = head;
        while (cur != null){
            System.out.printf(cur.val + ", ");
            cur = cur.next;
        }
        System.out.println();
    }
}
