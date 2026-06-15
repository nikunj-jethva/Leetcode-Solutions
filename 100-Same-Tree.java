/*
LeetCode #100 - Same Tree

Difficulty: Easy

Approach:
Recursive DFS

Two trees are identical if:
1. Both nodes are null.
2. Both nodes have the same value.
3. Their left subtrees are identical.
4. Their right subtrees are identical.

Recursively compare corresponding nodes.

Time Complexity: O(n)
Space Complexity: O(h)

where:
n = number of nodes
h = height of the tree
*/

class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Both nodes are null
        if (p == null && q == null)
            return true;

        // One node is null
        if (p == null || q == null)
            return false;

        // Values differ
        if (p.val != q.val)
            return false;

        // Compare left and right subtrees
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}
