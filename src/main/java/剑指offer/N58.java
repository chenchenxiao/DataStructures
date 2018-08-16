package 剑指offer;

/**
 * @author Blse
 * @date 2018/8/2
 * @description  给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 *                注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class N58 {

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }
        if (pNode.right != null) {
            pNode = pNode.right;
            while (pNode.left != null) {
                pNode = pNode.left;
            }
            return pNode;
        }
        while (pNode.next != null) {
            if (pNode.next.left == pNode) {
                return pNode.next;
            }
            pNode = pNode.next;
        }
        return null;
    }

}
