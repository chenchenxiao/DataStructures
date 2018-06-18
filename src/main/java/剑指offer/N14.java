package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/18
 * @description 输入一个链表，输出该链表中倒数第k个结点。
 */
public class N14 {

    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) {
            return null;
        }
        ListNode listNode = head;
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        if (k > count) {
            return null;
        }
        for (int i = 0; i < count - k; i++) {
            listNode = listNode.next;
        }
        return listNode;
    }
}
