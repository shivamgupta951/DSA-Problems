1class Solution {
2    // public int solve(int[] coins, int idx, int amount, int dp[][]) {
3    //     if (idx == 0) {
4    //         return (amount % coins[0] == 0) ? 1 : 0;
5    //     }
6    //     if (dp[idx][amount] != -1) {
7    //         return dp[idx][amount];
8    //     }
9    //     int pick = 0;
10    //     if (coins[idx] <= amount)
11    //         pick = solve(coins, idx, amount - coins[idx], dp);
12    //     int drop = solve(coins, idx - 1, amount, dp);
13    //     return dp[idx][amount] = pick + drop;
14    // }
15
16    public int change(int amount, int[] coins) {
17        int[][] dp = new int[coins.length][amount + 1];
18        for (int i = 0; i <= amount; i++) {
19            if (i % coins[0] == 0)
20                dp[0][i] = 1;
21        }
22        for (int i = 1; i < coins.length; i++) {
23            for (int j = 0; j <= amount; j++) {
24                int pick = 0;
25                if (coins[i] <= j)
26                    pick = dp[i][j - coins[i]];
27                int drop = dp[i - 1][j];
28                dp[i][j] = pick + drop;
29            }
30        }
31        return dp[coins.length - 1][amount];
32    }
33}