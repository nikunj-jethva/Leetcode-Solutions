/*
LeetCode #230 - Kth Smallest Element in a BST

Difficulty: Medium

Approach:
Inorder Traversal (DFS)

1. Perform an inorder traversal of the BST.
2. Keep a count of visited nodes.
3. When the count equals k, store the current node's value.
4. Continue the traversal and return the stored answer.

Time Complexity: O(n)
Space Complexity: O(h)

where h is the height of the tree.
*/

class Solution {

    int count = 0;
    int ans = 0;

    public int kthSmallest(TreeNode root, int k) {

        helper(root, k);
        return ans;
    }

    private void helper(TreeNode root, int k) {

        if (root == null) {
            return;
        }

        helper(root.left, k);

        count++;

        if (count == k) {
            ans = root.val;
            return;
        }

        helper(root.right, k);
    }
}
