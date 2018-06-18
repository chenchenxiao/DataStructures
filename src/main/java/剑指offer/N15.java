package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/18
 * @description 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class N15 {

    public ListNode ReverseList(ListNode head) {
        ListNode temp = head;
        ListNode result = null;
        while (temp != null) {
            ListNode node = temp.next;
            temp.next = result;
            result = temp;
            temp = node;
        }
        return result;
    }
}
