/*
LeetCode #145 - Binary Tree Postorder Traversal

Difficulty: Easy

Approach:
Recursive DFS

Postorder Traversal Order:
1. Traverse Left Subtree
2. Traverse Right Subtree
3. Visit Root Node

Store the visited nodes in a list and return it.

Time Complexity: O(n)
Space Complexity: O(h)

where:
n = number of nodes
h = height of the tree
*/

class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        postorder(root, result);

        return result;
    }

    public void postorder(TreeNode root, List<Integer> result) {

        if (root == null)
            return;

        postorder(root.left, result);

        postorder(root.right, result);

        result.add(root.val);
    }
}
