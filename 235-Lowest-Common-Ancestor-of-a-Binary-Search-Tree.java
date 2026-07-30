/*
LeetCode #235 - Lowest Common Ancestor of a Binary Search Tree

Difficulty: Easy

Approach:
Iterative BST Traversal

1. Start from the root node.
2. If both target nodes are smaller than the current node,
   move to the left subtree.
3. If both target nodes are greater than the current node,
   move to the right subtree.
4. Otherwise, the current node is the Lowest Common Ancestor.

Time Complexity: O(h)
Space Complexity: O(1)

where h = height of the BST.
*/

class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return null;
        }

        TreeNode temp = root;

        while (temp != null) {

            if (temp.val > p.val && temp.val > q.val) {
                temp = temp.left;
            } 
            else if (temp.val < p.val && temp.val < q.val) {
                temp = temp.right;
            } 
            else {
                break;
            }
        }

        return temp;
    }
}
