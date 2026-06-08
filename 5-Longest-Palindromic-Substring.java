/*
LeetCode #5 - Longest Palindromic Substring
https://leetcode.com/problems/longest-palindromic-substring/

Difficulty: Medium

Approach:
Expand Around Center

For each character, consider it as the center of a palindrome.
Check both odd-length and even-length palindromes and keep
track of the longest one found.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }
}
