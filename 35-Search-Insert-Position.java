/*
LeetCode #35 - Search Insert Position

Difficulty: Easy

Approach:
Binary Search

Use binary search to find the target.
If the target is not present, return the position where
it should be inserted to maintain sorted order.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}
