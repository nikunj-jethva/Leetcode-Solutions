/*
LeetCode #110 - Balanced Binary Tree

Difficulty: Easy

Approach:
Recursive DFS

1. Compute the height of the left and right subtrees.
2. If their height difference is greater than 1, the tree is not balanced.
3. Recursively check whether the left and right subtrees are balanced.
4. Return true only if all subtrees are balanced.

Time Complexity: O(n²)
Space Complexity: O(h)

where h is the height of the tree.
*/

class Solution {

    public int height(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        return isBalanced(root.left) &&
               isBalanced(root.right);
    }
}
