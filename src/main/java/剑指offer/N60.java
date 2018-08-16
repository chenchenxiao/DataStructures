package 剑指offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Blse
 * @date 2018/8/6
 * @description  请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
 *                第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class N60 {

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
        ArrayList<ArrayList<Integer>> print = new N60().Print(treeNode);
        System.out.println(print);
    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList();
        if (pRoot == null) {
            return result;
        }
        Stack<TreeNode> stackA = new Stack<TreeNode>();
        Stack<TreeNode> stackB = new Stack<TreeNode>();
        boolean isA = true;
        stackA.push(pRoot);
        while (!stackA.isEmpty() || !stackB.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            if (isA) {
                while (!stackA.isEmpty()) {
                    TreeNode temp = stackA.pop();
                    list.add(temp.val);
                    if (temp.left != null) {
                        stackB.push(temp.left );
                    }
                    if (temp.right != null) {
                        stackB.push(temp.right);
                    }
                }
                isA = false;
            } else {
                while (!stackB.isEmpty()) {
                    TreeNode temp = stackB.pop();
                    list.add(temp.val);
                    if (temp.right != null) {
                        stackA.push(temp.right);
                    }
                    if (temp.left != null) {
                        stackA.push(temp.left );
                    }
                }
                isA = true;
            }
            result.add(list);
        }
        return result;
    }

}
