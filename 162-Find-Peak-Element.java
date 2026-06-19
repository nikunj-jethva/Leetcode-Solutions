/*
LeetCode #162 - Find Peak Element

Difficulty: Medium

Approach:
Binary Search

A peak element is greater than its neighbors.

Key Observation:
- If nums[mid] < nums[mid + 1], a peak exists on the right.
- Otherwise, a peak exists on the left (including mid).

Use binary search to find any peak element.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {

    public int findPeakElement(int[] nums) {

        if (nums.length == 1) {
            return 0;
        }

        if (nums[0] > nums[1]) {
            return 0;
        }

        if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }

        int start = 1;
        int end = nums.length - 2;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] > nums[mid - 1] &&
                nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
