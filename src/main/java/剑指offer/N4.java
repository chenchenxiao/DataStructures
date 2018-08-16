package 剑指offer;

/**
 * @author Blse
 * @date 2018/6/19
 * @description  输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 *                假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *                例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class N4 {

    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        return reConBTree(pre,0,pre.length-1,in,0,in.length-1);
    }
    public TreeNode reConBTree(int [] pre, int preleft, int preright, int [] in, int inleft, int inright){
        if (preleft > preright || inleft> inright) {
            return null;
        }
        TreeNode root = new TreeNode(pre[preleft]);
        for (int i = inleft; i<= inright; i++) {
             if (pre[preleft] == in[i]) {
                root.left = reConBTree(pre,preleft+1,preleft+i-inleft,in,inleft,i-1);
                root.right = reConBTree(pre,preleft+i+1-inleft,preright,in,i+1,inright);
             }
        }
        return root;
    }
}
