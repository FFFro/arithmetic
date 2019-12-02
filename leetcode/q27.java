package leetcode;

/**
 * @program: arithmetic
 * @description: 二叉树的最小深度
 * @author: FFFro
 * @create: 2019-12-01 20:01
 **/

public class q27 {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }
        int min = Integer.MAX_VALUE;
        if (root.left != null) {
            min = Math.min(minDepth(root.left), min);
        }if (root.right != null) {
            min = Math.min(minDepth(root.right), min);
        }

        return min + 1;
    }
}

//给定一个二叉树，找出其最小深度。
//
//        最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
//
//        说明: 叶子节点是指没有子节点的节点。
//
//        示例:
//
//        给定二叉树 [3,9,20,null,null,15,7],
//
//        3
//        / \
//        9  20
//        /  \
//        15   7
//        返回它的最小深度  2.
