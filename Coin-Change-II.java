1class Solution {
2    public int solve(int[] coins , int idx , int amount, int dp[][])
3    {
4        if(idx==0)
5        {
6            return (amount % coins[0] == 0) ? 1 : 0;
7        }
8        if(dp[idx][amount]!=-1)
9        {
10            return dp[idx][amount];
11        }
12        int pick = 0;
13        if(coins[idx]<=amount) pick = solve(coins,idx,amount-coins[idx],dp);
14        int drop = solve(coins,idx-1,amount,dp);
15        return dp[idx][amount] = pick + drop;
16    }
17    public int change(int amount, int[] coins) {
18        int[][] dp = new int[coins.length][amount+1];
19        for(int i=0; i<coins.length; i++)
20        {
21            for(int j=0; j<=amount; j++)
22            {
23                dp[i][j] = -1;
24            }
25        }
26        return solve(coins,coins.length-1,amount,dp);
27    }
28}