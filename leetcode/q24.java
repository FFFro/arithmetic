package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: arithmetic
 * @description: 二叉树的层次遍历 II
 * @author: FFFro
 * @create: 2019-11-30 08:25
 **/

public class q24 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        DSF(root, 0, ans);
        return ans;
    }

    private void DSF(TreeNode root, int level, List<List<Integer>> ans) {
        if (root == null) {
            return;
        }

        if (ans.size() <= level) {
            ans.add(0, new ArrayList<>());
        }

        ans.get(ans.size() - 1 - level).add(root.val);

        DSF(root.left, level + 1, ans);
        DSF(root.right, level + 1, ans);
    }
}

//给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
//
//        例如：
//        给定二叉树 [3,9,20,null,null,15,7],
//
//        3
//        / \
//        9  20
//        /  \
//        15   7
//        返回其自底向上的层次遍历为：
//
//        [
//        [15,7],
//        [9,20],
//        [3]
//        ]
