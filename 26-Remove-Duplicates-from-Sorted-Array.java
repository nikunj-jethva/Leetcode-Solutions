/*
LeetCode #26 - Remove Duplicates from Sorted Array


Difficulty: Easy

Approach:
Two Pointers

Use one pointer (i) to track the position of the last unique element.
Traverse the array using another pointer (j).
Whenever a new unique element is found, place it at the next position.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
