/*
LeetCode #153 - Find Minimum in Rotated Sorted Array

Difficulty: Medium

Approach:
Binary Search

The array is sorted and then rotated.
Use binary search to locate the pivot point where
the order breaks. The minimum element is located
at the pivot.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {

    public int findMin(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums[0] < nums[nums.length - 1]) {
            return nums[0];
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (mid != 0 && nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }

            if (mid != nums.length - 1 &&
                nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
