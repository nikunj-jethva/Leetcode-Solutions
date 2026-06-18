/*
LeetCode #144 - Binary Tree Preorder Traversal

Difficulty: Easy

Approach:
Recursive DFS

Preorder Traversal Order:
1. Visit Root Node
2. Traverse Left Subtree
3. Traverse Right Subtree

Store the visited nodes in a list and return it.

Time Complexity: O(n)
Space Complexity: O(h)

where:
n = number of nodes
h = height of the tree
*/

class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        preorder(root, result);

        return result;
    }

    public void preorder(TreeNode root, List<Integer> result) {

        if (root == null)
            return;

        result.add(root.val);

        preorder(root.left, result);

        preorder(root.right, result);
    }
}
