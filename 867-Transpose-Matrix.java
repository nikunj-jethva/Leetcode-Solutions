/*
LeetCode #867 - Transpose Matrix

Difficulty: Easy

Approach:
Matrix Traversal

1. Create a new matrix with swapped dimensions.
2. Traverse every element of the original matrix.
3. Place each element at its transposed position.
4. Return the transposed matrix.

Time Complexity: O(m × n)
Space Complexity: O(m × n)
*/

class Solution {

    public int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
}
