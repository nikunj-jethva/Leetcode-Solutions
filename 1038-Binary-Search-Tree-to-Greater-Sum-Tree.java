/*
LeetCode #1038 - Binary Search Tree to Greater Sum Tree

Difficulty: Medium

Approach:
Reverse Inorder Traversal

1. Traverse the BST in reverse inorder (Right → Root → Left).
2. Maintain a running sum of visited node values.
3. Update the current node's value with the running sum.
4. Continue until all nodes are processed.
5. Return the modified root.

Time Complexity: O(n)
Space Complexity: O(h)

where n = number of nodes and h = height of the tree.
*/

class Solution {

    int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        reverseInorder(root);
        return root;
    }

    private void reverseInorder(TreeNode root) {

        if (root == null) {
            return;
        }

        reverseInorder(root.right);

        sum += root.val;
        root.val = sum;

        reverseInorder(root.left);
    }
}
