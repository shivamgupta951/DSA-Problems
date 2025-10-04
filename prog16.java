/* 238. Product of Array Except Self
   Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
   The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
   You must write an algorithm that runs in O(n) time and without using the division operation.
   -> 1st Approach O(n)
 */

import java.util.Arrays;
public class prog16 {
    public static int[] ProductArray(int[] nums)
    {
        int n = nums.length;
        int[] output = new int[n];
        for(int i=0; i<nums.length;i++)
        {
            if(i==0)
            {
                output[i] = 1;
            }
            else{
                output[i] = nums[i-1] * output[i-1];
            }
        }
        int temp = 1;
        for(int i = n-1; i>=0; i--)
        {
            output[i] = output[i] * temp;
            temp = temp * nums[i];
        }
        return output;
    }

    public static void main(String args[])
    {
        int[] array = {1,2,3,4};
        int[] output = ProductArray(array);
        System.out.println(Arrays.toString(output));
    }
}
