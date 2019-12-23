package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树的所有路径
 *
 * @author : FFFro
 * @date : 2019-12-23 19:40
 **/
public class q62 {


    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList<>();
        path(root, "", paths);
        return paths;
    }

    private void path(TreeNode root, String path, LinkedList<String> paths) {
        if (root != null) {
            path += root.val;
            if (root.left == null && root.right == null) {
                paths.add(path);
            } else {
                path += "->";
                path(root.left, path, paths);
                path(root.right, path, paths);
            }
        }
    }
}

//给定一个二叉树，返回所有从根节点到叶子节点的路径。
//
//        说明: 叶子节点是指没有子节点的节点。
//
//        示例:
//
//        输入:
//
//        1
//        /   \
//        2     3
//        \
//        5
//
//        输出: ["1->2->5", "1->3"]
//
//        解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3

