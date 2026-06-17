/*
LeetCode #128 - Longest Consecutive Sequence

Difficulty: Medium

Approach:
HashMap / HashSet

Store all numbers in a hash-based structure.
A number is considered the start of a sequence if
its previous number does not exist.

For every sequence start:
1. Count consecutive numbers.
2. Track the maximum sequence length.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;

class Solution {

    public int longestConsecutive(int[] nums) {

        HashMap<Integer, Boolean> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], false);
        }

        for (int key : hm.keySet()) {
            if (!hm.containsKey(key - 1)) {
                hm.put(key, true);
            }
        }

        int max = 0;

        for (int key : hm.keySet()) {

            int k = 1;

            if (hm.get(key)) {

                while (hm.containsKey(key + k)) {
                    k++;
                }
            }

            max = Math.max(max, k);
        }

        return max;
    }
}
