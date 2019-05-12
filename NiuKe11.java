package niuke;

/**
 * Auther:vincent-Dou
 * Date: 2019/5/12
 * Time: 14:32
 * Description：
 */
public class NiuKe11 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null){
            return null;
        }
        ListNode pA = pHead1;
        ListNode pB = pHead2;
        while(pA != pB) {
            pA = pA == null ? pHead2 : pA.next;
            pB = pB == null ? pHead1 : pB.next;
        }
        return pA;
    }
}
