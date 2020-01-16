package leetcode;

/**
 * 左叶子之和
 * @author : FFFro
 * @date : 2020-01-16 20:59
 **/
public class q85 {

    int temp = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root != null) {
            if (root.left != null && root.left.left == null && root.left.right == null) {
                temp += root.left.val;
            }

            sumOfLeftLeaves(root.right);
            sumOfLeftLeaves(root.left);
        }

        return temp;
    }
}

//计算给定二叉树的所有左叶子之和。
//
//        示例：
//
//        3
//        / \
//        9  20
//        /  \
//        15   7
//
//        在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
