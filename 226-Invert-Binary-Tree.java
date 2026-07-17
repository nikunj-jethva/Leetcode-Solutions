/*
LeetCode #226 - Invert Binary Tree

Difficulty: Easy

Approach:
Recursive DFS

1. If the current node is null, return null.
2. Recursively invert the left subtree.
3. Recursively invert the right subtree.
4. Swap the left and right child pointers.
5. Return the root of the inverted tree.

Time Complexity: O(n)
Space Complexity: O(h)

where h is the height of the tree.
*/

class Solution {

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
