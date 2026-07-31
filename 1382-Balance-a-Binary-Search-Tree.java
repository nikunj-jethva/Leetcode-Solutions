/*
LeetCode #1382 - Balance a Binary Search Tree

Difficulty: Medium

Approach:
Inorder Traversal + Divide and Conquer

1. Perform an inorder traversal to store all BST values in a sorted list.
2. Build a height-balanced BST from the sorted list.
3. Choose the middle element as the root.
4. Recursively build the left subtree from the left half.
5. Recursively build the right subtree from the right half.

Time Complexity: O(n)
Space Complexity: O(n)

where n = number of nodes in the BST.
*/

class Solution {

    List<Integer> list = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return buildBST(0, list.size() - 1);
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    private TreeNode buildBST(int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(list.get(mid));

        root.left = buildBST(start, mid - 1);
        root.right = buildBST(mid + 1, end);

        return root;
    }
}
