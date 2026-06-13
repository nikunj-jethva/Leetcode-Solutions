/*
LeetCode #34 - Find First and Last Position of Element in Sorted Array

Difficulty: Medium

Approach:
Binary Search

Perform two binary searches:
1. Find the first occurrence of the target.
2. Find the last occurrence of the target.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        if (nums.length == 0) {
            return ans;
        }

        ans[0] = first(nums, target);
        ans[1] = last(nums, target);

        return ans;
    }

    public int first(int[] nums, int target) {

        int start = 0, end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = end - 1;
            }
        }

        return ans;
    }

    public int last(int[] nums, int target) {

        int start = 0, end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = end - 1;
            }
        }

        return ans;
    }
}
