/*
LeetCode #28 - Find the Index of the First Occurrence in a String

Difficulty: Easy

Approach:
Brute Force String Matching

Check every possible starting position in the haystack.
Compare characters one by one with the needle.
Return the index when a complete match is found.

Time Complexity: O((n - m + 1) * m)
Space Complexity: O(1)

where:
n = length of haystack
m = length of needle
*/

class Solution {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        if (nLen == 0) return 0;
        if (hLen < nLen) return -1;

        for (int i = 0; i <= hLen - nLen; i++) {
            int j;

            for (j = 0; j < nLen; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            if (j == nLen) {
                return i;
            }
        }

        return -1;
    }
}
