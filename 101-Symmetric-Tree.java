/*
LeetCode #101 - Symmetric Tree

Difficulty: Easy

Approach:
Recursive DFS

1. Compare the left and right subtrees recursively.
2. If both nodes are null, they are symmetric.
3. If only one node is null or their values differ, return false.
4. Compare:
   - Left child of first tree with right child of second tree.
   - Right child of first tree with left child of second tree.
5. Return true only if both comparisons are true.

Time Complexity: O(n)
Space Complexity: O(h)
*/

class Solution {

    public boolean helper(TreeNode r1, TreeNode r2) {

        if (r1 == null || r2 == null) {
            return r1 == r2;
        }

        if (r1.val != r2.val) {
            return false;
        }

        return helper(r1.left, r2.right) &&
               helper(r1.right, r2.left);
    }

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        return helper(root.left, root.right);
    }
}
