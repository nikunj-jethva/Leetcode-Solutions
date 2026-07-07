/*
LeetCode #977 - Squares of a Sorted Array

Difficulty: Easy

Approach:
Two Pointers

1. Initialize two pointers:
   - One at the beginning of the array.
   - One at the end of the array.
2. Compare the squares of both elements.
3. Place the larger square at the end of the result array.
4. Move the corresponding pointer inward.
5. Repeat until all elements are processed.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public int[] sortedSquares(int[] nums) {

        int[] ans = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;
        int index = nums.length - 1;

        while (start <= end) {

            int leftSquare = nums[start] * nums[start];
            int rightSquare = nums[end] * nums[end];

            if (leftSquare > rightSquare) {
                ans[index] = leftSquare;
                start++;
            } else {
                ans[index] = rightSquare;
                end--;
            }

            index--;
        }

        return ans;
    }
}
