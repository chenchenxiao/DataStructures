package 剑指offer;

import java.util.ArrayList;

/**
 * @author Blse
 * @date 2018/6/19
 * @description 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class N26 {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(10);
        TreeNode node2 = new TreeNode(6);
        TreeNode node3 = new TreeNode(14);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(8);
        TreeNode node6= new TreeNode(12);
        TreeNode node7 = new TreeNode(16);
        node.left = node2;
        node.right = node3;
        node2.left =  node4;
        node2.right =  node5;
        node3.right = node7;
        node3.left = node6;
        new N26().Convert(node);
    }

    public TreeNode Convert(TreeNode node) {
        if (node.left.left != null) {
            Convert(node.left);
            node.right.right = node.left;
            node.left.left = node.right;
        }

        return node;
    }



}
