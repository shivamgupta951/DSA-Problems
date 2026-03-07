1class Solution {
2    public int Solve(int n, int[] dp) {
3        if (n <= 2) {
4            return dp[n] = n;
5        }
6        if (dp[n] != -1)
7            return dp[n];
8        return dp[n] = Solve(n - 1, dp) + Solve(n - 2, dp);
9    }
10
11    public int climbStairs(int n) {
12        int dp[] = new int[n + 1];
13        Arrays.fill(dp, -1);
14        return Solve(n, dp);
15    }
16}