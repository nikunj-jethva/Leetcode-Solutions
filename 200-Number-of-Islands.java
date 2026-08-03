/*
LeetCode #200 - Number of Islands

Difficulty: Medium

Approach:
Depth-First Search (DFS)

1. Traverse every cell in the grid.
2. Whenever an unvisited land cell ('1') is found, increment the island count.
3. Perform DFS to visit all connected land cells.
4. Mark visited cells as water ('0') to avoid revisiting them.
5. Continue until the entire grid has been processed.

Time Complexity: O(m × n)
Space Complexity: O(m × n)

where m = number of rows and n = number of columns.
*/

class Solution {

    public int numIslands(char[][] grid) {

        int count = 0;

        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] == '1') {

                    count++;
                    callDFS(grid, i, j);
                }
            }
        }

        return count;
    }

    public void callDFS(char[][] grid, int i, int j) {

        if (i < 0 || i >= grid.length ||
            j < 0 || j >= grid[i].length ||
            grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';

        callDFS(grid, i + 1, j);
        callDFS(grid, i - 1, j);
        callDFS(grid, i, j - 1);
        callDFS(grid, i, j + 1);
    }
}
