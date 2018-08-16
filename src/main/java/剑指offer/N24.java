package 剑指offer;

import java.util.ArrayList;

/**
 * @author Blse
 * @date 2018/6/19
 * @description 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 *               路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class N24 {
    public static void main(String[] args) {

    }
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> paths = new ArrayList<ArrayList<Integer>>();
        if(root==null) {
            return paths;
        }
        find(paths,new ArrayList<Integer>(),root,target);
        return paths;
    }
    public void find(ArrayList<ArrayList<Integer>> paths,ArrayList<Integer> path,TreeNode root,int target){
        path.add(root.val);
        if(root.left == null && root.right == null){
            if (target == root.val) {
                 paths.add(path);
            }
            return;
        }
        ArrayList<Integer> path2 = new ArrayList<Integer>();
        path2.addAll(path);
        if (root.left != null) {
             find(paths,path,root.left,target-root.val);
        }
        if (root.right != null) {
            find(paths,path2,root.right,target-root.val);
        }
    }
}
