/* 66. Plus One
   You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
   Increment the large integer by one and return the resulting array of digits.
   -> 1st Approach O(N)!
*/

import java.util.Arrays;

class prog20 {
    public static int[] plusOne(int[] nums) {
        for(int i=nums.length-1; i>=0; i--)
        {
            int temp = nums[i]+1;
            if(temp<10)
            {
                nums[i]=nums[i]+1;
                return nums;
            }
            else
            {
                nums[i] = 0;
            }
        }
        int[] new_result = new int[nums.length+1];
        new_result[0] = 1;
        return new_result;
    }

    public static void main(String args[])
    {
        int[] nums = {9};
        int[] result = plusOne(nums);
        System.out.println(Arrays.toString(result));
    }
}
