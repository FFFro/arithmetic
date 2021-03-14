package top100;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的中序遍历
 * @author : FFFro
 * @date : 2021-03-08 22:31
 **/
public class Q94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        mid(result, root);
        return result;
    }

    private void mid(List<Integer> result, TreeNode root) {
        if (root == null) {
            return;
        }
        mid(result, root.left);
        result.add(root.val);
        mid(result, root.right);
    }
}
