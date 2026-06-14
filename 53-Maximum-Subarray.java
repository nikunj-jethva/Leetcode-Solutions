/*
LeetCode #53 - Maximum Subarray

Difficulty: Medium

Approach:
Kadane's Algorithm

Maintain a running sum of the current subarray.
At each position, decide whether to:
1. Extend the current subarray.
2. Start a new subarray from the current element.

Keep track of the maximum sum encountered.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxSubArray(int[] nums) {

        int curr = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (curr + nums[i] > nums[i]) {
                curr += nums[i];
            } else {
                curr = nums[i];
            }

            max = Math.max(max, curr);
        }

        return max;
    }
}
