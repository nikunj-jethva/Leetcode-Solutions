/*
LeetCode #112 - Path Sum

Difficulty: Easy

Approach:
Recursive DFS

1. If the current node is null, return false.
2. If the current node is a leaf, check whether its value equals the remaining target sum.
3. Recursively search the left and right subtrees with the updated target (target - current node value).
4. Return true if either subtree contains a valid root-to-leaf path.

Time Complexity: O(n)
Space Complexity: O(h)

where h is the height of the tree.
*/

class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null && root.val == targetSum) {
            return true;
        }

        return hasPathSum(root.left, targetSum - root.val) ||
               hasPathSum(root.right, targetSum - root.val);
    }
}
