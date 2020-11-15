package Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraverse {
    public static List<List<Integer>> levelOrder(TreeNode<Integer> root) {
        // homework
        //Gained help from https://stackoverflow.com/questions/7305369/binary-tree-level-order-traversal
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (queue.isEmpty() == false) {

            int size = queue.size();
            List<Integer> firstResult = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                firstResult.add((Integer)current.val);

                if (current.left != null) {
                    queue.add(current.left);
                }

               if (current.right != null) {
                    queue.add(current.right);
                }
            }
            result.add(firstResult);
        }
        return result;
    }

}
