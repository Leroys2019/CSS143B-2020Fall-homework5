package Problem2;

import Problem1.TreeNode;

public class LCA {
    public static TreeNode<Integer> lowestCommonAncestor(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) {
        // homework
        // hint: pay attention to the assumptions of this problem.
        if (root == null) {
            return null;// If empty returns a null.
        } else {
            if (root == p || root == q) {
                return root;
            }
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            if (right != null && left != null) {
                return root;
            }

            if (right != null) {
                return right;
            } else {
                return left;
            }
        }
    }
}
