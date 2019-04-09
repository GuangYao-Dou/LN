package niuke;

/**
 * Auther:vincent-Dou
 * Date: 2019/4/9
 * Time: 16:03
 * description：删除链表中重复的结点
 *              在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，
 *              返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class NiuKe6 {
    public static void main(String[] agrs){
    }
    public ListNode deleteDuplication(ListNode pHead){
        int len  = getLength(pHead);
        int[] arr = new int[len];
        ListNode temp1 = pHead;
        int i0 = 0;
        while(temp1 != null){
            arr[i0] = temp1.val;
            i0++;
            temp1 = temp1.next;
        }
        int[] arr1 = new int[len];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            boolean flag = false;
            for(int j = i+1; j <arr.length; j++){
                if(arr[i] == arr[j]){
                    flag  = true;
                    continue;
                }
            }
            if(flag){
                continue;
            }else{
                arr1[count] = arr[i];
                count++;
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        for(int i = 0; i < count+1;i++){
            ListNode tmp = new ListNode(arr1[i]);
            head.next = tmp;
            head = head.next;
        }
        return dummy.next;
    }

    public static int getLength(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
