1class Solution {
2    public int solve(int[] cost , int n , int[] dp)
3    {
4        if(n==0 || n==1) return cost[n];
5        if(n<0) return 0;
6        if(dp[n]!=-1) return dp[n];
7        int step1 = cost[n] + solve(cost,n-1,dp);
8        int step2 = cost[n] + solve(cost,n-2,dp);
9        return dp[n] = Math.min(step1,step2);
10    }
11    public int minCostClimbingStairs(int[] cost) {
12        int N = cost.length-1;
13        int dp[] = new int[N+2];
14        Arrays.fill(dp,-1);
15        return Math.min(solve(cost,N,dp),solve(cost,N-1,dp));
16    }
17}