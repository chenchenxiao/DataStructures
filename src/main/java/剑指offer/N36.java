package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/21
 * @description 输入两个链表，找出它们的第一个公共结点。
 *              思路：把第一个链表的每个节点都拿去和第二个链表的所有节点比较，如果两个链表的当前值和下一个节点的值相同则证明是公共节点
 */
public class N36 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;
        node4.next = node5;
//        node6.next = node7;
        node3.next = node6;
        node5.next = node6;
        new N36().FindFirstCommonNode(node1, node4);
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        ListNode tempA = pHead1;
        ListNode tempB = pHead2;
        //所求的公共节点
        ListNode result = null;
        //当公共节点为空并且第一个链表不为空时，循环
        while (result == null && tempA != null) {
            //当第一个链表和第二个链表走到尾部，并且他们是值一样时，公共节点就是最后的这个节点
            if (tempA.next == null && tempB.next == null && tempA.val == tempB.val) {
                    result = tempA;
            } else {
                //当第一个链表和第二个链表节点的值相同，并且他们的下一个节点的值也相同时，当前的节点就是公共节点
                if (tempA.val == tempB.val && tempA.next.val ==  tempB.next.val) {
                    result = tempA;
                } else {
                    //如果不相同则另第二个链表向后移
                    tempB = tempB.next;
                }
                //当链表为空时，给链表重新初始化
                if (tempB == null && result == null) {
                    tempB = pHead2;
                    tempA = tempA.next;
                }
            }
        }
        return result;
    }

}
