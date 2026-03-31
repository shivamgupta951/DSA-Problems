1class Solution {
2    public int solve(int[] nums , int idx , int[] dp)
3    {
4        if(idx==0) return nums[idx];
5        if(idx<0) return 0;
6        if(dp[idx]!=-1) return dp[idx];
7        int pick = nums[idx] + solve(nums,idx-2,dp);
8        int drop = solve(nums,idx-1,dp);
9        return dp[idx] = Math.max(pick,drop);
10    }
11    public int rob(int[] nums) {
12        if(nums.length==1) return nums[0];
13        int[] nums1 = new int[nums.length-1]; 
14        int[] dp = new int[nums.length-1]; 
15        int[] nums2 = new int[nums.length-1];
16        for(int i=0; i<nums.length-1; i++)
17        {
18            nums1[i] = nums[i];
19        } 
20        for(int i=1; i<nums.length; i++)
21        {
22            nums2[i-1] = nums[i];
23        } 
24        Arrays.fill(dp,-1);
25        int pick1 = solve(nums1,nums1.length-1,dp);
26        Arrays.fill(dp,-1);
27        int pick2 = solve(nums2,nums2.length-1,dp);
28        return Math.max(pick1,pick2);
29    }
30}