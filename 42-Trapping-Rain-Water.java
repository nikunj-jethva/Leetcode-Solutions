/*
LeetCode #42 - Trapping Rain Water

Difficulty: Hard

Approach:
Prefix Maximum Arrays

For each index:
1. Find the maximum height on the left.
2. Find the maximum height on the right.
3. Water trapped at an index =
   min(leftMax, rightMax) - height[i]

Sum the trapped water at all indices.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int trap(int[] height) {

        int n = height.length;

        int[] leftmax = new int[n];
        leftmax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        }

        int[] rightmax = new int[n];
        rightmax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], height[i]);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            ans += Math.min(leftmax[i], rightmax[i]) - height[i];
        }

        return ans;
    }
}
