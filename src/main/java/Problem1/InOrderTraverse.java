package Problem1;

import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

public class InOrderTraverse {
    public static List<Integer> inorderTraversalIterative(TreeNode<Integer> root) {
        // homework
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null) {
            return result;
        }
        stack.push(root);
        TreeNode num = stack.peek();
        while (stack.size() != 0) {
            num = stack.peek();

            if (num.left != null) {
                stack.push(num.left);
                num.left = null;
                continue;
            }
            result.add((Integer) num.val);
            stack.pop();

            if (num.right != null) {
                stack.push(num.right);
                num.right = null;
                continue;
            }

        }
        return result;
    }

}
