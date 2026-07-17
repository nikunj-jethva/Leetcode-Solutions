/*
LeetCode #543 - Diameter of Binary Tree

Difficulty: Easy

Approach:
Recursive DFS

1. Compute the height of the left and right subtrees recursively.
2. At each node, calculate the diameter passing through it as:
   leftHeight + rightHeight.
3. Maintain the maximum diameter encountered during traversal.
4. Return the height of the current subtree.
5. After the traversal, return the maximum diameter.

Time Complexity: O(n)
Space Complexity: O(h)

where h is the height of the tree.
*/

class Solution {

    int diameter = 0;

    public int height(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null) {
            return 0;
        }

        height(root);

        return diameter;
    }
}
