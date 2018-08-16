package 剑指offer;

import java.util.List;

/**
 * @author Blse
 * @date 2018/7/20
 * @description  在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
 *                重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class N57 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode33 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode44 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode33;
        listNode33.next = listNode4;
        listNode4.next = listNode44;
        listNode44.next = listNode5;
        ListNode re = new N57().deleteDuplication(listNode);
        System.out.println();
    }

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return null;
        }
        ListNode temp = new ListNode(-1);
        temp.next = pHead;
        ListNode curNode = pHead;
        ListNode pre = temp;
        while (curNode != null && curNode.next != null) {
            ListNode next = curNode.next;
            if (curNode.val == next.val) {
                while (next != null && curNode.val == next.val) {
                    next = next.next;
                }
                pre.next = next;
                curNode = next;
            } else {
                pre = curNode;
                curNode = curNode.next;
            }
        }
        return temp.next;
    }

}
