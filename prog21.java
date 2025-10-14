/* 268. Missing Number 
   Given an array nums containing n distinct numbers in the range [0, n], 
   return the only number in the range that is missing from the array.
   1st Approach O(N)!
*/
class prog21 {
    public static int missingNumber(int[] nums) {
        int result=0;
        int temp_sum = 0;
        for(int i = 0; i<nums.length; i++)
        {
            temp_sum+=nums[i];
        }
        int sum = (nums.length*(nums.length+1))/2;
        result = sum - temp_sum;
        return result;
    }

    public static void main(String args[]) {
        int[] nums = {0,1};
        int result = missingNumber(nums);
        System.out.println(result);
    }
}
