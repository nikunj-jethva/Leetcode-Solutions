/*
LeetCode #287 - Find the Duplicate Number

Difficulty: Medium

Approach:
Negative Marking

1. Traverse the array.
2. Use the absolute value of each element as an index.
3. If the value at that index is already negative, the index is the duplicate number.
4. Otherwise, mark the value at that index as negative.
5. Restore the array before returning the duplicate.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int findDuplicate(int[] nums) {

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            int index = Math.abs(nums[i]);

            if (nums[index] > 0) {
                nums[index] = -nums[index];
            } else {
                ans = index;
                break;
            }
        }

        // Restore the array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        return ans;
    }
}
