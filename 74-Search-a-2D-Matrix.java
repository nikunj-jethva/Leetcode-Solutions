/*
LeetCode #74 - Search a 2D Matrix

Difficulty: Medium

Approach:
Binary Search

The matrix can be treated as a single sorted array
because:
1. Each row is sorted.
2. First element of each row is greater than the
   last element of the previous row.

Use binary search on the virtual 1D array and
convert the index back to row and column.

Time Complexity: O(log(m * n))
Space Complexity: O(1)
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int r = 0;
        int c = matrix[0].length - 1;

        while (r < matrix.length && c >= 0) {

            if (matrix[r][c] == target) {
                return true;

            } else if (matrix[r][c] > target) {
                c--;

            } else {
                r++;
            }
        }

        return false;
    }
}
