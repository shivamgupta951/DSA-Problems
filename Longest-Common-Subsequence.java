1class Solution {
2    public int solve(String text1 , String text2 , int idx1 , int idx2 , int[][] dp)
3    {
4        if(idx1<0 || idx2<0) return 0;
5        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];
6        if(text1.charAt(idx1)==text2.charAt(idx2))
7        {
8            return dp[idx1][idx2] = 1 + solve(text1,text2,idx1-1,idx2-1,dp);
9        }
10        return dp[idx1][idx2] = Math.max(solve(text1,text2,idx1,idx2-1,dp),solve(text1,text2,idx1-1,idx2,dp));
11    }
12    public int longestCommonSubsequence(String text1, String text2) {
13        int[][] dp = new int[text1.length()][text2.length()];
14        for(int i=0; i<dp.length; i++)
15        {
16            Arrays.fill(dp[i],-1);
17        }
18        return solve(text1,text2,text1.length()-1,text2.length()-1,dp);
19    }
20}