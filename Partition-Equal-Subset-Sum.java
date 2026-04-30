1class Solution {
2    static Boolean solve(int[] arr , int target , int idx)
3    {
4        if(idx==0){
5            if(target==0) return true;
6            else return false;
7        }
8        Boolean take = false;
9        if(arr[idx]<=target)
10        take = solve(arr,target-arr[idx],idx-1);
11        Boolean drop = solve(arr,target,idx-1);
12        return take || drop;
13    }
14
15    static Boolean canPartition(int arr[]) {
16        int sum = 0;
17        for (int ele : arr) {
18            sum += ele;
19        }
20        if (sum % 2 == 1)
21            return false;
22        int mid = sum / 2;
23        return solve(arr, mid, arr.length - 1);
24    }
25}