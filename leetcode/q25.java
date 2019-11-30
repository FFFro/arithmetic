package leetcode;

import java.util.zip.Inflater;

/**
 * @program: arithmetic
 * @description: 将有序数组转换为二叉搜索树
 * @author: FFFro
 * @create: 2019-11-30 08:40
 **/

public class q25 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return BST(0, nums.length - 1, nums);
    }

    private TreeNode BST(int start, int end, int[] nums) {
        if (end < start) {
            return null;
        }
        if (end - start == 0) {
            return new TreeNode(nums[start]);
        }

        int mid = start + (end - start) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = BST(start, mid - 1, nums);
        treeNode.right = BST(mid + 1, end, nums);

        return treeNode;
    }
}

//将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
//
//        本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
//
//        示例:
//
//        给定有序数组: [-10,-3,0,5,9],
//
//        一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
//
//        0
//        / \
//        -3   9
//        /   /
//        -10  5
