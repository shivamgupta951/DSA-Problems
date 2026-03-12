1class Solution {
2    int[] dx = {0,1};
3    int[] dy = {1,0};
4    public int solve(int i , int j , int m , int n , int[][] dp)
5    {
6        if(i==m-1 && j==n-1)
7        {
8            return 1;
9        }
10        if(dp[i][j]!=-1) return dp[i][j];
11        int ways = 0;
12        for(int k=0; k<2; k++)
13        {
14            int r = i + dx[k];
15            int c = j + dy[k];
16            if(r<m && c<n)
17            {
18                ways += solve(r,c,m,n,dp);
19            }
20        }
21        return dp[i][j] = ways;
22    }
23    public int uniquePaths(int m, int n) {
24        int[][] dp = new int[m][n];
25        for(int i=0; i<m; i++)
26        {
27            for(int j=0; j<n; j++)
28            {
29                dp[i][j] = -1;
30            }
31        }
32        return solve(0,0,m,n,dp);
33    }
34}