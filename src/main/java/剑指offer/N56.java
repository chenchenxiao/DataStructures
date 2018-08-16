package 剑指offer;

import jdk.nashorn.internal.objects.NativeUint8Array;

/**
 * @author Blse
 * @date 2018/7/19
 * @description 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class N56 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode;
        ListNode result = new N56().EntryNodeOfLoop(listNode);
        System.out.println(result);
    }

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode firstNode = pHead;
        if (firstNode == null || firstNode.next == null) {
            return null;
        }
        ListNode nextNode = firstNode.next;
        while (nextNode.next != null && firstNode.next != null) {
            if (nextNode.next == firstNode) {
                return nextNode;
            }
            nextNode = nextNode.next;
            if (nextNode.next == null) {
                firstNode = firstNode.next;
                nextNode = firstNode.next;
            }
        }
        return null;
    }

}
