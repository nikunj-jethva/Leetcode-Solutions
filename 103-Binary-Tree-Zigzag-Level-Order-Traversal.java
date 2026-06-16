/*
LeetCode #103 - Binary Tree Zigzag Level Order Traversal

Difficulty: Medium

Approach:
Breadth-First Search (BFS)

Perform a normal level order traversal using a queue.
For each level:
1. Collect all node values.
2. Reverse the level if traversal direction is right-to-left.
3. Toggle the direction for the next level.

Time Complexity: O(n)
Space Complexity: O(n)

where:
n = number of nodes
*/

class Solution {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean leftToRight = true;

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode node = queue.poll();

                level.add(node.val);

                if (node.left != null)
                    queue.offer(node.left);

                if (node.right != null)
                    queue.offer(node.right);
            }

            if (!leftToRight) {
                Collections.reverse(level);
            }

            result.add(level);

            leftToRight = !leftToRight;
        }

        return result;
    }
}
