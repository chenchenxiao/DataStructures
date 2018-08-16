package 剑指offer;

import java.util.Stack;

/**
 * @author Blse
 * @date 2018/8/5
 * @description 请实现一个函数，用来判断一颗二叉树是不是对称的。注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class N59 {
    public boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) {
            return true;
        }
        return isSym(pRoot.left, pRoot.right);
    }

    private  boolean isSym(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null) {
            return rightNode == null;
        }
        if (rightNode == null) {
            return false;
        }
        return leftNode.val == rightNode.val && isSym(leftNode.right, rightNode.left) && isSym(leftNode.left, rightNode.right);
    }
 }

