package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/18
 * @description 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class N16 {

    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode listNode = null;
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val < list2.val) {
            listNode = list1;
            list1 = list1.next;
        } else {
            listNode = list2;
            list2 = list2.next;
        }
        ListNode result = listNode;
        while (list1 != null && list2 != null) {
            int valA = list1.val;
            int valB = list2.val;
            if (valA < valB) {
                listNode.next = list1;
                list1 = list1.next;
                listNode = listNode.next;
            } else {
                listNode.next = list2;
                list2 = list2.next;
                listNode = listNode.next;
            }
        }
        if (list1 == null) {
            listNode.next = list2;
        }
        if (list2 == null) {
            listNode.next = list1;
        }
        return result;
    }

}
