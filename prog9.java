/* 53. Maximum Subarray 
Given an integer array nums, find the subarray with the largest sum, and return its sum.
  -> 1st Approach! O(N)
*/

class prog9 {
    public static int MaxSubArray(int[] nums) {
        int max = nums[0];   // stores the maximum subarray sum
        int sum = 0;         // running sum

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];   // add current element
            if (sum > max) max = sum; // update max if better
            if (sum < 0) sum = 0;     // reset if sum goes negative
        }
        return max;
    }

    public static void main(String args[]) {
        int[] arr = {5, 4, -1, 7, 8};   
        int MaximumSubArray = MaxSubArray(arr);
        System.out.println(MaximumSubArray);
    }
}
