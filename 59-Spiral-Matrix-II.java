/*
LeetCode #59 - Spiral Matrix II

Difficulty: Medium

Approach:
Spiral Traversal

Generate an n × n matrix and fill it in spiral order.

Steps:
1. Fill the top row.
2. Fill the right column.
3. Fill the bottom row.
4. Fill the left column.
5. Shrink the boundaries and repeat.

Time Complexity: O(n²)
Space Complexity: O(n²)
*/

class Solution {

    public int[][] generateMatrix(int n) {

        int[][] arr = new int[n][n];

        int count = 1;

        int minRow = 0;
        int maxRow = n - 1;
        int minCol = 0;
        int maxCol = n - 1;

        while (count <= n * n) {

            // Top
            for (int c = minCol; c <= maxCol; c++) {
                arr[minRow][c] = count++;
            }

            // Right
            for (int r = minRow + 1; r <= maxRow; r++) {
                arr[r][maxCol] = count++;
            }

            // Bottom
            if (minRow < maxRow) {
                for (int c = maxCol - 1; c >= minCol; c--) {
                    arr[maxRow][c] = count++;
                }
            }

            // Left
            if (minCol < maxCol) {
                for (int r = maxRow - 1; r > minRow; r--) {
                    arr[r][minCol] = count++;
                }
            }

            minRow++;
            maxRow--;
            minCol++;
            maxCol--;
        }

        return arr;
    }
}
