package leetcode;

/**
 * @program: arithmetic
 * @description: 对称二叉树
 * @author: FFFro
 * @create: 2019-11-29 20:44
 **/

public class q22 {

    public boolean isSymmetric(TreeNode root) {
        return isDuiChen(root, root);
    }

    private boolean isDuiChen(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }

        return node1.val == node2.val && isDuiChen(node1.left, node2.right) && isDuiChen(node1.right, node2.left);
    }
}

//给定一个二叉树，检查它是否是镜像对称的。
//
//        例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
//
//        1
//        / \
//        2   2
//        / \ / \
//        3  4 4  3
//        但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
//
//        1
//        / \
//        2   2
//        \   \
//        3    3