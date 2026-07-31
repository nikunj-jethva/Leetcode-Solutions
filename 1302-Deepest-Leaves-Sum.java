/*
LeetCode #1302 - Deepest Leaves Sum

Difficulty: Medium

Approach:
Depth-First Search (DFS)

1. Traverse the tree recursively while keeping track of the current depth.
2. If a deeper level is found, update the maximum depth and reset the sum.
3. If another node is found at the deepest level, add its value to the sum.
4. Continue until all nodes are visited.
5. Return the sum of the deepest leaves.

Time Complexity: O(n)
Space Complexity: O(h)

where n = number of nodes and h = height of the tree.
*/

class Solution {

    int maxDepth = -1;
    int sum = 0;

    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode root, int depth) {

        if (root == null) {
            return;
        }

        if (depth > maxDepth) {
            maxDepth = depth;
            sum = root.val;
        } else if (depth == maxDepth) {
            sum += root.val;
        }

        dfs(root.left, depth + 1);
        dfs(root.right, depth + 1);
    }
}
