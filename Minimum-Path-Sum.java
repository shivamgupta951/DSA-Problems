1class Solution {
2    public int solve(int[][] grid , int m , int n, int[][] dp)
3    {
4        if(m<0 || n<0) return Integer.MAX_VALUE;
5        if(m==0 && n==0) return grid[m][n];
6        if(dp[m][n]!=-1) return dp[m][n];
7        int up = solve(grid,m-1,n,dp);
8        int left = solve(grid,m,n-1,dp);
9        return dp[m][n] = grid[m][n] + Math.min(up,left);
10    }
11    public int minPathSum(int[][] grid) {
12        int m = grid.length;
13        int n = grid[0].length;
14        int [][]dp = new int[m][n];
15        for(int i=0; i<m; i++)
16        {
17            for(int j=0; j<n; j++)
18            {
19                dp[i][j] = -1;
20            }
21        }
22        return solve(grid,m-1,n-1,dp);
23    }
24}