1class Solution {
2    public int solve(String s, String t, int m, int n, int[][] dp) {
3        if (n < 0)
4            return 1;
5        if (m < 0)
6            return 0;
7        if (dp[m][n] != -1)
8            return dp[m][n];
9        if (s.charAt(m) == t.charAt(n)) {
10            return dp[m][n] = solve(s, t, m - 1, n - 1, dp) + solve(s, t, m - 1, n, dp);
11        } else {
12            return dp[m][n] = solve(s, t, m - 1, n, dp);
13        }
14    }
15
16    public int numDistinct(String s, String t) {
17        int dp[][] = new int[s.length()][t.length()];
18        for (int i = 0; i < s.length(); i++) {
19            for (int j = 0; j < t.length(); j++) {
20                dp[i][j] = -1;
21            }
22        }
23        return solve(s, t, s.length() - 1, t.length() - 1, dp);
24    }
25}