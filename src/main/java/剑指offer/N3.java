package 剑指offer;

import java.util.ArrayList;

/**
 * @author Blse
 * @date 2018/6/17
 * @description 输入一个链表，从尾到头打印链表每个节点的值。
 */

public class N3 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }
        int size = list.size() - 1;
        for (int i = size; i >= 0; i--) {
            result.add(list.get(i));
        }
        return result;
    }


}
