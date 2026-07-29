/*
LeetCode #108 - Convert Sorted Array to Binary Search Tree

Difficulty: Easy

Approach:
Divide and Conquer (Recursion)

1. Select the middle element of the current array segment as the root.
2. Recursively build the left subtree using the left half.
3. Recursively build the right subtree using the right half.
4. Continue until the subarray becomes empty.

Time Complexity: O(n)
Space Complexity: O(log n)   // Recursive call stack
*/

class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int start, int end) {

        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = helper(nums, start, mid - 1);
        root.right = helper(nums, mid + 1, end);

        return root;
    }
}
