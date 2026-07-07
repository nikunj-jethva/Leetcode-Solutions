/*
LeetCode #1394 - Find Lucky Integer in an Array

Difficulty: Easy

Approach:
HashMap (Frequency Count)

1. Count the frequency of each element using a HashMap.
2. Traverse all keys in the map.
3. If an element's value equals its frequency, it is a lucky integer.
4. Keep track of the largest lucky integer.
5. Return the answer, or -1 if none exists.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;

class Solution {

    public int findLucky(int[] arr) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int num : arr) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        int ans = -1;

        for (int key : hm.keySet()) {
            if (hm.get(key) == key) {
                ans = Math.max(ans, key);
            }
        }

        return ans;
    }
}
