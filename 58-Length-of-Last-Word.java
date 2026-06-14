/*
LeetCode #58 - Length of Last Word

Difficulty: Easy

Approach:
Reverse Traversal

Start from the end of the string.
1. Skip trailing spaces.
2. Count characters until a space or the beginning of the string is reached.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int lengthOfLastWord(String s) {

        int len = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count last word characters
        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }

        return len;
    }
}
