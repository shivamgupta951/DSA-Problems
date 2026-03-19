1class Solution {
2    // Tabulation + Space Optimization
3    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
4        int[] prev = new int [target+1]; 
5        for(int i=0; i<=target; i++)
6        {
7            prev[i] = -(int) 1e9;
8        }
9        prev[0] = nums.get(0)==0? 1 : 0;
10        if(nums.get(0)<=target)
11        {
12            prev[nums.get(0)] = 1;
13        }
14        for(int i=1; i<nums.size(); i++)
15        {
16            int[] curr = new int[target+1];
17            for(int j=0; j<=target; j++)
18            {
19                int pick = -(int) 1e9;
20                if(nums.get(i)<=j) pick = 1 + prev[j-nums.get(i)];
21                int drop = prev[j];
22                curr[j] = Math.max(pick,drop);
23            }
24            prev = curr;
25        }
26        if(prev[target]<0) return -1;
27        return prev[target];
28    }
29}