package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/19
 * @description 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class N18 {

    public void Mirror(TreeNode root) {
        if (root != null) {
            TreeNode leftNode = root.left;
            TreeNode rightNode = root.right;
            root.right = leftNode;
            root.left = rightNode;
            Mirror(rightNode);
            Mirror(leftNode);
        }
    }

}
