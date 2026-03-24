class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int mod = 12345;
        int size = n * m;
        int[] arr = new int[size];
        
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[k] = grid[i][j];
                k++;
            }
        }

        int res[] = new int[size];

        int prefix = 1;
        for (int i = 0; i < size; i++) {
            res[i] = prefix;
            prefix = (int)((1L * prefix * arr[i]) % mod);
        }

        int suffix = 1;
        for (int i = size - 1; i >= 0; i--) {
            res[i] = (int)((1L * res[i] * suffix) % mod);
            suffix = (int)((1L * suffix * arr[i]) % mod);
        }

        int[][] ans = new int[n][m];
        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = res[k++];
            }
        }
        return ans;
    }
}