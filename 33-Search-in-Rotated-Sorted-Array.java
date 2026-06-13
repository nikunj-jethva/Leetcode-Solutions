/*
LeetCode #33 - Search in Rotated Sorted Array

Difficulty: Medium

Approach:
Modified Binary Search

At each step, one half of the array is always sorted.
Determine which half is sorted and check whether the target
lies within that range. Discard the other half and continue.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[start] <= nums[mid]) {

                // Left half is sorted
                if (target >= nums[start] &&
                    target < nums[mid]) {

                    end = mid - 1;

                } else {

                    start = mid + 1;
                }

            } else {

                // Right half is sorted
                if (target > nums[mid] &&
                    target <= nums[end]) {

                    start = mid + 1;

                } else {

                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
