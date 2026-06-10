/*
LeetCode #10 - Regular Expression Matching
https://leetcode.com/problems/regular-expression-matching/

Difficulty: Hard

Approach:
Dynamic Programming

dp[i][j] represents whether the first i characters
of string s match the first j characters of pattern p.

Handle:
1. Direct character matches.
2. '.' wildcard matches.
3. '*' operator matches zero or more occurrences
   of the preceding character.

Time Complexity: O(m × n)
Space Complexity: O(m × n)

where:
m = length of s
n = length of p
*/

class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();

        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        // Handle patterns like a*, a*b*, etc.
        for (int j = 2; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                char sc = s.charAt(i - 1);
                char pc = p.charAt(j - 1);

                if (pc == '*') {

                    char match = p.charAt(j - 2);

                    dp[i][j] =
                        dp[i][j - 2] ||
                        ((sc == match || match == '.') &&
                         dp[i - 1][j]);

                } else {

                    boolean firstMatch =
                        (pc == sc || pc == '.');

                    dp[i][j] =
                        firstMatch &&
                        dp[i - 1][j - 1];
                }
            }
        }

        return dp[m][n];
    }
}
