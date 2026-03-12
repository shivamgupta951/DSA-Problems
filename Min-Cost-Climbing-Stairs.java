1class Solution {
2    // Optimized Tabulation
3    public int minCostClimbingStairs(int[] cost) {
4        int n = cost.length;
5        int val1 = cost[0];
6        int val2 = cost[1];
7        for(int i=2; i<cost.length; i++)
8        {
9            int temp = cost[i] + Math.min(val1,val2);
10            val1 = val2;
11            val2 = temp;
12        }
13        return Math.min(val1,val2);
14    }
15}