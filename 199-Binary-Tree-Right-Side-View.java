/*
LeetCode #199 - Binary Tree Right Side View

Difficulty: Medium

Approach:
Recursive DFS (Right-First Traversal)

1. Traverse the tree using DFS, visiting the right subtree before the left subtree.
2. Keep track of the current level.
3. If visiting a level for the first time, add the node's value to the answer.
4. Continue recursively for the right and left children.
5. Return the list containing the rightmost node at each level.

Time Complexity: O(n)
Space Complexity: O(h)

where h is the height of the tree.
*/


class Solution {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        helper(root, ans, 0);

        return ans;
    }

    private void helper(TreeNode root, List<Integer> ans, int level) {

        if (root == null) {
            return;
        }

        if (ans.size() == level) {
            ans.add(root.val);
        }

        helper(root.right, ans, level + 1);
        helper(root.left, ans, level + 1);
    }
}
