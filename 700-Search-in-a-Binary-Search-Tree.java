/*
LeetCode #700 - Search in a Binary Search Tree

Difficulty: Easy

Approach:
Iterative Binary Search on BST

1. Start from the root node.
2. If the current node's value equals the target, return the node.
3. If the target is smaller, move to the left child.
4. If the target is larger, move to the right child.
5. Continue until the node is found or the tree becomes null.

Time Complexity: O(h)
Space Complexity: O(1)

where h = height of the BST.
*/

class Solution {

    public TreeNode searchBST(TreeNode root, int val) {

        TreeNode temp = root;

        while (temp != null) {

            if (temp.val == val) {
                break;
            } else if (temp.val > val) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }

        return temp;
    }
}
