1class Solution {
2    public int solve(int[] nums , int idx , int[] dp)
3    {
4        if(idx==0) return nums[0];
5        if(idx<0) return 0;
6        if(dp[idx]!=-1) return dp[idx];
7        int rob = nums[idx] + solve(nums,idx-2,dp);
8        int drop = solve(nums,idx-1,dp);
9        return dp[idx] = Math.max(rob,drop);
10    }
11    public int rob(int[] nums) {
12        int[] dp = new int[nums.length];
13        Arrays.fill(dp,-1);
14        return solve(nums,nums.length-1,dp);
15    }
16}