/* 560. Subarray Sum Equals K
   Given an array of integers nums and an integer k, return the total number of 
   subarrays whose sum equals to k. A subarray is a contiguous non-empty sequence of elements within an array.
   -> 1st Attempt (Optimal Solution!)
*/

class prog26 {
    public static int subarraySumEqualk(int[] nums , int target)
    {
        int count = 0;
        for(int i = 0; i<nums.length; i++)
        {
            int sum = 0;
            for(int j = i; j<nums.length; j++)
            {
                sum=sum+nums[j];
                if(sum==target)count++;
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        int[] array = {1,3,5,6};
        int target = 3;
        int result = subarraySumEqualk(array,target);
        System.out.print(result);
    }
    
}
