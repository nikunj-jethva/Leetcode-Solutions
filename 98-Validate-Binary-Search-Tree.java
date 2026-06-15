/*
LeetCode #98 - Validate Binary Search Tree

Difficulty: Medium

Approach:
DFS with Range Validation

For each node:
- All values in the left subtree must be smaller.
- All values in the right subtree must be greater.

Maintain a valid range (min, max) for each node
during recursion.

Time Complexity: O(n)
Space Complexity: O(h)

where:
n = number of nodes
h = height of the tree
*/

class Solution {

    public boolean isValidBST(TreeNode root) {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean check(TreeNode node, long min, long max) {

        if (node == null) {
            return true;
        }

        if (node.val <= min || node.val >= max) {
            return false;
        }

        return check(node.left, min, node.val) &&
               check(node.right, node.val, max);
    }
}
