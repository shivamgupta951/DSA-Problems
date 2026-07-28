1class Solution {
2    public void sortColors(int[] nums) {
3        int start = 0;
4        int mid = 0;
5        int end = nums.length-1;
6        while(mid<=end)
7        {
8            if(nums[mid]==0)
9            {
10                int temp = nums[start];
11                nums[start] = nums[mid];
12                nums[mid] = temp;
13                mid++;
14                start++;
15            }
16            else if(nums[mid]==1)
17            {
18                mid++;
19            }
20            else
21            {
22                int temp = nums[end];
23                nums[end] = nums[mid];
24                nums[mid] = temp;
25                end--;
26            }
27        }
28    }
29}
30