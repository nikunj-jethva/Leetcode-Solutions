/*
LeetCode #11 - Container With Most Water
https://leetcode.com/problems/container-with-most-water/

Difficulty: Medium

Approach:
Two Pointers

Start with pointers at both ends of the array.
Calculate the area formed by the two lines.
Move the pointer with the smaller height inward
because it is the limiting factor.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxArea(int[] height) {

        int st = 0;
        int end = height.length - 1;
        int max = 0;

        while (st < end) {

            int h = Math.min(height[st], height[end]);
            int width = end - st;

            int curr = h * width;

            max = Math.max(curr, max);

            if (height[st] < height[end]) {
                st++;
            } else {
                end--;
            }
        }

        return max;
    }
}
