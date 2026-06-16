/*
LeetCode #107 - Binary Tree Level Order Traversal II

Difficulty: Medium

Approach:
Breadth-First Search (BFS)

Perform a standard level order traversal using a queue.
Instead of adding levels at the end of the result,
insert each level at the beginning to obtain
bottom-up order.

Time Complexity: O(n)
Space Complexity: O(n)

where:
n = number of nodes
*/

import java.util.*;

class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        LinkedList<List<Integer>> result = new LinkedList<>();

        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = queue.poll();

                level.add(node.val);

                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);
            }

            result.addFirst(level);
        }

        return result;
    }
}
