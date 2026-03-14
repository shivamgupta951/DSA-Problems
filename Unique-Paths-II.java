1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        if (obstacleGrid[0][0] == 1)
4            return 0;
5        int m = obstacleGrid.length;
6        int n = obstacleGrid[0].length;
7        int dp[][] = new int[m][n];
8        dp[0][0] = 1;
9        for (int i = 0; i < m; i++) {
10            for (int j = 0; j < n; j++) {
11                if(i==0 && j==0) continue;
12                if(obstacleGrid[i][j]==1) {
13                    dp[i][j] = 0;
14                    continue;
15                }
16                int right = 0;
17                int down = 0;
18                if(j>0) right = dp[i][j-1];
19                if(i>0) down = dp[i-1][j];
20                dp[i][j] = right + down;
21            }
22        }
23        return dp[m-1][n-1];
24    }
25}