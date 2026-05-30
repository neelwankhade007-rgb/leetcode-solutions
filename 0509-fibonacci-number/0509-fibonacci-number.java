class Solution {
    int []dp;

    public int solve(int n) {
        if (n <= 1) return n;
        dp[n] = solve(n-1) + solve(n-2);
        return dp[n];
    }

    public int fib(int n) {
        dp = new int[n + 1];
        return solve(n);
    }
}