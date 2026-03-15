1class Solution {
2    public int solve(int i, int j1, int j2, int m, int n, int[][] grid, int[][][] dp) {
3        if (j1 < 0 || j2 < 0 || j1 > n || j2 > n)
4            return (int) -1e8;
5        if (i == m) {
6            if (j1 == j2)
7                return grid[i][j1];
8            else
9                return grid[i][j1] + grid[i][j2];
10        }
11        if (dp[i][j1][j2] != -1)
12            return dp[i][j1][j2];
13        int maxi = (int) -1e8;
14        for (int dj1 = -1; dj1 <= 1; dj1++) {
15            for (int dj2 = -1; dj2 <= 1; dj2++) {
16                int value = 0;
17                if (j1 == j2)
18                    value = grid[i][j1];
19                else
20                    value = grid[i][j1] + grid[i][j2];
21                value += solve(i + 1, j1 + dj1, j2 + dj2, m, n, grid, dp);
22                maxi = Math.max(value, maxi);
23            }
24        }
25        return dp[i][j1][j2] = maxi;
26    }
27
28    public int cherryPickup(int[][] grid) {
29        int m = grid.length;
30        int n = grid[0].length;
31        int[][][] dp = new int[m][n][n];
32        for (int i = 0; i < m; i++) {
33            for (int j = 0; j < n; j++) {
34                for (int k = 0; k < n; k++) {
35                    dp[i][j][k] = -1;
36                }
37            }
38        }
39        return solve(0, 0, n - 1, m - 1, n - 1, grid, dp);
40    }
41}