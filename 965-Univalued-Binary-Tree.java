/*
LeetCode #965 - Univalued Binary Tree

Difficulty: Easy

Approach:
Depth-First Search (DFS)

1. Store the value of the root node.
2. Recursively traverse the entire tree.
3. If any node has a different value, return false.
4. Otherwise, continue checking both left and right subtrees.
5. Return true if all nodes have the same value.

Time Complexity: O(n)
Space Complexity: O(h)
*/

class Solution {

    public boolean helper(TreeNode root, int val) {

        if (root == null) {
            return true;
        }

        if (root.val != val) {
            return false;
        }

        return helper(root.left, val) &&
               helper(root.right, val);
    }

    public boolean isUnivalTree(TreeNode root) {
        return helper(root, root.val);
    }
}
