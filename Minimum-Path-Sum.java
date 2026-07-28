1class Solution {
2    public int solve(int[][] grid , int m , int n, int[][] dp)
3    {
4        if(m==0 && n==0) return grid[0][0];
5        if(m<0 || n<0) return (int) 1e9;
6        if(dp[m][n]!=-1) return dp[m][n];
7        int left = grid[m][n] + solve(grid,m,n-1,dp);
8        int up = grid[m][n] + solve(grid,m-1,n,dp);
9        return dp[m][n] = Math.min(left,up);
10    }
11    public int minPathSum(int[][] grid) {
12        int m = grid.length;
13        int n = grid[0].length;
14        int[][] dp = new int[m][n];
15        for(int i=0; i<m; i++)
16        {
17            Arrays.fill(dp[i],-1);
18        }
19        return solve(grid,m-1,n-1,dp);       
20    }
21}