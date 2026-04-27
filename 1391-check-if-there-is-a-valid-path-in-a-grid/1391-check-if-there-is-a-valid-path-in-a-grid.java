class Solution {
    int m, n;
    boolean visited[][];

    boolean canLeft[]  = {false, true, false, true, false, true, false};
    boolean canRight[] = {false, true, false, false, true, false, true};
    boolean canUp[]    = {false, false, true, false, false, true, true};
    boolean canDown[]  = {false, false, true, true, true, false, false};

    int dir[][] = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

    public boolean hasValidPath(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];
        return dfs(0, 0, grid);
    }

    boolean dfs(int row, int column, int[][] grid) {
        if (row == m - 1 && column == n - 1)
            return true;

        visited[row][column] = true;

        for (int i = 0; i < 4; i++) {
            int nextRow = row + dir[i][0];
            int nextColumn = column + dir[i][1];

            if (nextRow >= 0 && nextRow < m &&
                nextColumn >= 0 && nextColumn < n &&
                !visited[nextRow][nextColumn] &&
                canMove(grid[row][column], grid[nextRow][nextColumn], i)) {

                if (dfs(nextRow, nextColumn, grid))
                    return true;
            }
        }
        return false;
    }

    boolean canMove(int curr, int next, int dir) {
        if (dir == 0) { // right
            return canRight[curr] && canLeft[next];
        } else if (dir == 1) { // left
            return canLeft[curr] && canRight[next];
        } else if (dir == 2) { // up
            return canUp[curr] && canDown[next];
        } else if (dir == 3) { // down
            return canDown[curr] && canUp[next];
        }
        return false;
    }
}