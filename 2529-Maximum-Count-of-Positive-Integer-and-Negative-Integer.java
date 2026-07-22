/*
LeetCode #2529 - Maximum Count of Positive Integer and Negative Integer

Difficulty: Easy

Approach:
Binary Search

1. Use binary search to find the last negative number.
2. Use another binary search to find the first positive number.
3. Count the number of negative and positive integers.
4. Return the larger of the two counts.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {

    public int maximumCount(int[] nums) {

        int negativeCount = lastNegativeIndex(nums) + 1;
        int positiveCount = nums.length - firstPositiveIndex(nums);

        return Math.max(negativeCount, positiveCount);
    }

    private int lastNegativeIndex(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] < 0) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    private int firstPositiveIndex(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        int ans = nums.length;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] > 0) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}
