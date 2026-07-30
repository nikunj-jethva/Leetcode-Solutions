/*
LeetCode #701 - Insert into a Binary Search Tree

Difficulty: Medium

Approach:
Recursion

1. If the current node is null, create and return a new node.
2. If the value is smaller than the current node, insert it into the left subtree.
3. Otherwise, insert it into the right subtree.
4. Return the current root after insertion.

Time Complexity: O(h)
Space Complexity: O(h)

where h = height of the BST.
*/

class Solution {

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }

        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }
}
