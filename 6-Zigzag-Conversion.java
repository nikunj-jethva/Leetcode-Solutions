/*
LeetCode #6 - Zigzag Conversion
https://leetcode.com/problems/zigzag-conversion/

Difficulty: Medium

Approach:
Simulation

Create a StringBuilder for each row.
Traverse the string while moving up and down
through the rows in a zigzag pattern.
Finally, concatenate all rows.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length())
            return s;

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int curRow = 0;
        int direction = -1;

        for (char c : s.toCharArray()) {
            rows[curRow].append(c);

            if (curRow == 0 || curRow == numRows - 1) {
                direction = -direction;
            }

            curRow += direction;
        }

        StringBuilder result = new StringBuilder();

        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
