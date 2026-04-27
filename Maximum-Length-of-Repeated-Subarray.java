1class Solution {
2    public int findLength(int[] nums1, int[] nums2) {
3        int m = nums1.length, n = nums2.length;
4        int[][] dp = new int[m+1][n+1];
5        int maxLen = 0;
6
7        for(int i=1; i<=m; i++){
8            for(int j=1; j<=n; j++){
9                if(nums1[i-1] == nums2[j-1]){
10                    dp[i][j] = 1 + dp[i-1][j-1];
11                    maxLen = Math.max(maxLen, dp[i][j]);
12                } else {
13                    dp[i][j] = 0;
14                }
15            }
16        }
17        return maxLen;
18    }
19}