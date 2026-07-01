/*
LeetCode #704 - Binary Search

Difficulty: Easy

Approach:
Binary Search

1. Initialize two pointers: start and end.
2. Calculate the middle index.
3. If the target is found, return its index.
4. If the target is greater than the middle element, search the right half.
5. Otherwise, search the left half.
6. If the target is not found, return -1.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {

    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
