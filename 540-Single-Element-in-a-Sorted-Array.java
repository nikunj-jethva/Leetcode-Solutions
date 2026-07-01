/*
LeetCode #540 - Single Element in a Sorted Array

Difficulty: Medium

Approach:
Binary Search

1. Handle edge cases where the single element is at the beginning,
   end, or the array contains only one element.
2. Use binary search to locate the unique element.
3. Before the unique element, pairs start at even indices.
4. After the unique element, this pattern breaks.
5. Narrow the search space until the single element is found.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {

    public int singleNonDuplicate(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums[0] != nums[1]) {
            return nums[0];
        }

        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            if (mid % 2 == 1) {

                if (nums[mid - 1] == nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            } else {

                if (nums[mid] == nums[mid + 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
