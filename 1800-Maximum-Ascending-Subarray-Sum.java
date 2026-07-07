/*
LeetCode #1800 - Maximum Ascending Subarray Sum

Difficulty: Easy

Approach:
Greedy

1. Initialize the current sum and maximum sum with the first element.
2. Traverse the array from left to right.
3. If the current element is greater than the previous one, extend the ascending subarray.
4. Otherwise, update the maximum sum and start a new ascending subarray.
5. Return the maximum ascending subarray sum.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int maxAscendingSum(int[] nums) {

        int max = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i - 1] < nums[i]) {
                currentSum += nums[i];
            } else {
                max = Math.max(max, currentSum);
                currentSum = nums[i];
            }
        }

        max = Math.max(max, currentSum);

        return max;
    }
}
