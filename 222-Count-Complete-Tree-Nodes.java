/*
LeetCode #222 - Count Complete Tree Nodes

Difficulty: Easy

Approach:
Recursive DFS

1. If the current node is null, return 0.
2. Recursively count the nodes in the left subtree.
3. Recursively count the nodes in the right subtree.
4. Return left count + right count + 1 (for the current node).

Time Complexity: O(n)
Space Complexity: O(h)

where h is the height of the tree.
*/

class Solution {

    public int countNodes(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return leftCount + rightCount + 1;
    }
}
