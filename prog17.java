/* 26. Remove Duplicates from Sorted Array 
   Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
   Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
   -Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
   -Return k.

   The judge will test your solution with the following code:
   int[] nums = [...]; // Input array
   int[] expectedNums = [...]; // The expected answer with correct length
   int k = removeDuplicates(nums); // Calls your implementation
   assert k == expectedNums.length;
   for (int i = 0; i < k; i++) {
   assert nums[i] == expectedNums[i];
   }
   If all assertions pass, then your solution will be accepted.
   -> 1st Approach O(N)
*/

import java.util.Arrays;

public class prog17 {
    public static int RemoveDuplicates(int[] nums)
    {
        int k=1;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String args[]) {
        int[] array = {1,1,1,2,2,3,4,4,5,5,5};
        int num = RemoveDuplicates(array);
        System.out.println(Arrays.toString(array));
    }
}
