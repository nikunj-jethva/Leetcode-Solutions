/*
LeetCode #167 - Two Sum II - Input Array Is Sorted

Difficulty: Medium

Approach:
Two Pointers

Since the array is sorted:
1. Place one pointer at the beginning.
2. Place another pointer at the end.
3. If sum equals target, return indices.
4. If sum is too large, move right pointer left.
5. If sum is too small, move left pointer right.

Note:
The problem requires 1-based indexing.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int[] twoSum(int[] numbers, int target) {

        int[] ans = new int[2];

        int st = 0;
        int end = numbers.length - 1;

        while (st < end) {

            int sum = numbers[st] + numbers[end];

            if (sum == target) {

                ans[0] = st + 1;
                ans[1] = end + 1;
                break;

            } else if (sum > target) {

                end--;

            } else {

                st++;
            }
        }

        return ans;
    }
}
