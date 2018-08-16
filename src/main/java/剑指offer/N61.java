package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Blse
 * @date 2018/8/6
 * @description  从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
public class N61 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(8);
        TreeNode treeNodeb = new TreeNode(6);
        TreeNode treeNodec = new TreeNode(10);
        TreeNode treeNoded = new TreeNode(5);
        TreeNode treeNodee = new TreeNode(7);
        TreeNode treeNodef = new TreeNode(9);
        TreeNode treeNodeg = new TreeNode(11);
        treeNode.left = treeNodeb;
        treeNode.right = treeNodec;
        treeNodeb.left = treeNoded;
        treeNodeb.right = treeNodee;
        treeNodec.left = treeNodef;
        treeNodec.right = treeNodeg;
        ArrayList<ArrayList<Integer>> print = new N61().Print(treeNode);
        System.out.println(print);
    }


    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList();
        if (pRoot == null) {
            return result;
        }
        boolean isA = true;
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        LinkedList<TreeNode> list2 = new LinkedList<TreeNode>();
        list.add(pRoot);
        while (!list.isEmpty() || !list2.isEmpty()) {
            ArrayList<Integer> tempList = new ArrayList();
            if (!list.isEmpty()) {
                while(!list.isEmpty()) {
                    TreeNode temp = list.remove();
                    tempList.add(temp.val);
                    if (temp.left != null) {
                        list2.add(temp.left);
                    }
                    if (temp.right != null) {
                        list2.add(temp.right);
                    }
                }
            } else if (!list2.isEmpty()) {
                while (!list2.isEmpty()) {
                    TreeNode temp = list2.remove();
                    tempList.add(temp.val);
                    if (temp.left != null) {
                        list.add(temp.left);
                    }
                    if (temp.right != null) {
                        list.add(temp.right);
                    }
                }
            }
            result.add(tempList);
        }
        return result;
    }

}
