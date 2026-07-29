/*
LeetCode #617 - Merge Two Binary Trees

Difficulty: Easy

Approach:
Recursion

1. If both nodes are null, return null.
2. If one node is null, return the other node.
3. Create a new node with the sum of the current node values.
4. Recursively merge the left subtrees.
5. Recursively merge the right subtrees.
6. Return the merged tree.

Time Complexity: O(n)
Space Complexity: O(h)
where n = number of nodes and h = height of the tree.
*/

class Solution {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null) {
            return null;
        } else if (root1 == null) {
            return root2;
        } else if (root2 == null) {
            return root1;
        }

        TreeNode root = new TreeNode(root1.val + root2.val);

        root.left = mergeTrees(root1.left, root2.left);
        root.right = mergeTrees(root1.right, root2.right);

        return root;
    }
}
