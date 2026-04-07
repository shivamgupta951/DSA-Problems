1class Solution {
2    public int solve(int[][] grid , int m , int n , int[][] dp)
3    {
4        if(m<0 || n<0) return (int)1e9;
5        if(m==0 && n==0) return grid[0][0];
6        if(dp[m][n]!=-1) return dp[m][n];
7        int up = grid[m][n] + solve(grid,m-1,n,dp);
8        int right = grid[m][n] + solve(grid,m,n-1,dp);
9        return dp[m][n] = Math.min(up,right);
10
11    }
12    public int minPathSum(int[][] grid) {
13        
14        int m = grid.length;
15        int n = grid[0].length;
16        int[][] dp = new int[m][n];
17        for(int i=0; i<m; i++)
18        {
19            Arrays.fill(dp[i],-1);
20        }
21        return solve(grid,m-1,n-1,dp);
22    }
23}