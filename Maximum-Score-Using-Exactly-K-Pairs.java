1class Solution {
2    public long maxScore(int[] nums1, int[] nums2, int k) {
3        int n = nums1.length;
4        int m = nums2.length;
5        long NEG = Long.MIN_VALUE / 4;
6        long[][] dp = new long[m + 1][k + 1];
7        for (int j = 0; j <= m; j++) {
8            Arrays.fill(dp[j], NEG);
9            dp[j][0] = 0;
10        }
11        for (int i = 1; i <= n; i++) {
12            long[][] newDp = new long[m + 1][k + 1];
13            for (int j = 0; j <= m; j++) {
14                Arrays.fill(newDp[j], NEG);
15                newDp[j][0] = 0;
16            }
17            for (int j = 1; j <= m; j++) {
18                for (int t = 0; t <= k; t++) {
19                    newDp[j][t] = Math.max(newDp[j][t], dp[j][t]);
20                    newDp[j][t] = Math.max(newDp[j][t], newDp[j - 1][t]);
21                    if (t > 0 && dp[j - 1][t - 1] != NEG) {
22                        long val = dp[j - 1][t - 1] + (long) nums1[i - 1] * nums2[j - 1];
23                        newDp[j][t] = Math.max(newDp[j][t], val);
24                    }
25                }
26            }
27            dp = newDp;
28        }
29        return dp[m][k];
30    }
31}