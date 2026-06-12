/*
LeetCode #27 - Remove Element


Difficulty: Easy

Approach:
Two Pointers

Use a pointer (p) to track the position where the next
valid element should be placed.
Traverse the array and copy elements that are not equal
to the given value.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeElement(int[] nums, int val) {

        int p = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[p] = nums[i];
                p++;
            }
        }

        return p;
    }
}
