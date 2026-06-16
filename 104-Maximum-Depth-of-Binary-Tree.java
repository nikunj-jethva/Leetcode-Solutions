/*
LeetCode #104 - Maximum Depth of Binary Tree

Difficulty: Easy

Approach:
Breadth-First Search (BFS)

Traverse the tree level by level using a queue.
For each level:
1. Process all nodes in the current level.
2. Add their children to the queue.
3. Increment the depth counter.

The number of levels processed equals the maximum depth.

Time Complexity: O(n)
Space Complexity: O(n)

where:
n = number of nodes
*/

import java.util.*;

class Solution {

    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int depth = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();
            depth++;

            for (int i = 0; i < size; i++) {

                TreeNode node = queue.poll();

                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);
            }
        }

        return depth;
    }
}
