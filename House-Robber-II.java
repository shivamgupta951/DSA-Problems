1class Solution {
2    // Memorization
3    public int solve(int[] nums , int idx , int dp[])
4    {
5        if(idx<0) return 0;
6        if(dp[idx]!=-1) return dp[idx];
7        int pick = nums[idx] + solve(nums , idx-2 , dp);
8        int drop = solve(nums , idx-1 , dp);
9        return dp[idx] = Math.max(pick , drop);
10    }
11    public int rob(int[] nums) {
12        if(nums.length==1) return nums[0];
13        int[] dp = new int[nums.length-1];
14        Arrays.fill(dp,-1);
15        int[] arr1 = new int[nums.length-1];
16        int[] arr2 = new int[nums.length-1];
17        for(int i=0; i<nums.length-1; i++)
18        {
19            arr1[i] = nums[i];
20        }
21        for(int i=1; i<nums.length; i++)
22        {
23            arr2[i-1] = nums[i];
24        }
25        int ans1 = solve(arr1,arr1.length-1,dp);
26        Arrays.fill(dp,-1);
27        int ans2 = solve(arr2,arr2.length-1,dp);
28        int result = Math.max(ans1,ans2);
29        return result;
30    }
31}