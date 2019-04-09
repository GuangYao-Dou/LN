package niuke;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/9
 * Time: 12:05
 * description：输入一个链表，输出该链表中倒数第k个结点。
 */
public class NiuKe3 {
    public static void main(String[] args) throws InterruptedException {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fouth = new ListNode(21);
        ListNode five = new ListNode(9);
        head.next = second;
        second.next = third;
        third.next = fouth;
        fouth.next = five;
        System.out.println((FindKthToTail(head,2)).val);
    }
    public static ListNode FindKthToTail(ListNode head,int k) {
        int n = getLength(head);
        if(k > n || k < 0){
            return null;
        }
        int len = 0;
        ListNode temp = head;
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        while( count < k){
            fast = fast.next;
            count++;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    public  static int getLength(ListNode head){
        if(head == null){
            return 0;
        }
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count ++;
            temp = temp.next;
        }
        return count;
    }
}
