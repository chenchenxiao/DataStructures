package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/22
 * @description 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class N40{
    public boolean IsBalanced_Solution(TreeNode root) {
        return isBalance(root,new int[1]);
    }
    public boolean isBalance(TreeNode root,int []depth){
        if (root == null) {
             depth[0] = 0;
             return true;
        }
        boolean left = isBalance(root.left, depth);
        int leftdepth = depth[0];
        boolean right = isBalance(root.right, depth);
        int rightdepth = depth[0];
        depth[0] = Math.max(leftdepth + 1, rightdepth + 1);
        if(left && right && Math.abs(leftdepth - rightdepth) <= 1) {
            return true;
        }
        return false;
    }
}
