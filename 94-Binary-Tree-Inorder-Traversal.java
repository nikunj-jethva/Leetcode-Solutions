/*
LeetCode #94 - Binary Tree Inorder Traversal

Difficulty: Easy

Approach:
Recursive DFS

Inorder Traversal Order:
1. Traverse Left Subtree
2. Visit Root Node
3. Traverse Right Subtree

Store the visited nodes in a list and return it.

Time Complexity: O(n)
Space Complexity: O(h)

where:
n = number of nodes
h = height of the tree
*/

class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        inorder(root, result);

        return result;
    }

    public void inorder(TreeNode root, List<Integer> result) {

        if (root == null)
            return;

        inorder(root.left, result);

        result.add(root.val);

        inorder(root.right, result);
    }
}
