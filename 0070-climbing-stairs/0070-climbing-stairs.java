class Solution {
    public int climbStairs(int n) {
        // Edge case: if n=0, there is 1 way (do nothing)
        if (n <= 1) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 1;  // Don't climb at all
        dp[1] = 1;  // Climb 1 step

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}