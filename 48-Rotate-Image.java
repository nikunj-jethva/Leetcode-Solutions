/*
LeetCode #48 - Rotate Image

Difficulty: Medium

Approach:
Transpose + Reverse

To rotate the matrix by 90 degrees clockwise:

1. Transpose the matrix
   (convert rows into columns).
2. Reverse every row.

This performs the rotation in-place
without using extra matrix space.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void rotate(int[][] matrix) {

        int n = matrix.length;

        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            reverse(matrix[i]);
        }
    }

    public void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
