/*
LeetCode #102 - Binary Tree Level Order Traversal

Difficulty: Medium

Approach:
Breadth-First Search (BFS)

Use a queue to process nodes level by level.
For each level:
1. Store the current queue size.
2. Process all nodes of that level.
3. Add their children to the queue.
4. Store the level values in the result.

Time Complexity: O(n)
Space Complexity: O(n)

where:
n = number of nodes
*/

import java.util.*;

class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {

                TreeNode node = queue.poll();

                currentLevel.add(node.val);

                if (node.left != null)
                    queue.offer(node.left);

                if (node.right != null)
                    queue.offer(node.right);
            }

            result.add(currentLevel);
        }

        return result;
    }
}
