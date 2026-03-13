1class Solution {
2    public int solve(int i, int j, int[][] dp) {
3        if (i == 0 && j == 0)
4            return 1;
5        if (i < 0 || j < 0)
6            return 0;
7        if (dp[i][j] != -1)
8            return dp[i][j];
9        int up = solve(i - 1, j, dp);
10        int left = solve(i, j - 1, dp);
11        return dp[i][j] = up + left;
12    }
13
14    public int uniquePaths(int m, int n) {
15        int dp[][] = new int[m][n];
16        for (int i = 0; i < m; i++) {
17            for (int j = 0; j < n; j++) {
18                dp[i][j] = -1;
19            }
20        }
21        return solve(m - 1, n - 1, dp);
22    }
23}
24