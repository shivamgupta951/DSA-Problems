1class Solution {
2    public int uniquePaths(int m, int n) {
3        int dp[][] = new int[m][n];
4        dp[0][0] = 1;
5        for (int i = 0; i < m; i++) {
6            for (int j = 0; j < n; j++) {
7                if(i==0 && j==0) continue;
8                int down = 0;
9                int right = 0;
10                if (i > 0) {
11                    down = dp[i - 1][j];
12                }
13                if (j > 0) {
14                    right = dp[i][j - 1];
15                }
16                dp[i][j] = down + right;
17            }
18        }
19        return dp[m - 1][n - 1];
20    }
21}
22