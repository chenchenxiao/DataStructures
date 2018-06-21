package 剑指offer;

import java.util.ArrayList;

/**
 * @author Blse
 * @date 2018/6/19
 * @description 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class N21 {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6= new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node.left = node2;
        node.right = node3;
        node2.left =  node4;
        node2.right =  node5;
        node3.right = node7;
        node3.left = node6;
        new N21().PrintFromTopToBottom(node);
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> valList = new ArrayList<Integer>();
        if (root == null) {
            return valList;
        }
        ArrayList<TreeNode> nodeList = new ArrayList<TreeNode>();
        valList.add(root.val);
        nodeList.add(root);
        print(valList, nodeList, 0);
        return valList;
    }

    public void print(ArrayList<Integer> valList, ArrayList<TreeNode> nodeList, int i) {

        if (i < nodeList.size()) {
            TreeNode node = nodeList.get(i);
            TreeNode leftNode = node.left;
            TreeNode rightNode = node.right;
            if (leftNode != null) {
                valList.add(leftNode.val);
                nodeList.add(leftNode);
            }
            if (rightNode != null) {
                valList.add(rightNode.val);
                nodeList.add(rightNode);
            }
            print(valList, nodeList, ++i);
        }
    }


}
