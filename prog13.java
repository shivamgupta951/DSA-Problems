/* 217. Contains Duplicate 
   Given an integer array nums, return true if any value appears at least twice in the array, 
   and return false if every element is distinct.
  -> 1st Approach! O(n)
 */

import java.util.HashSet;

public class prog13 {
    public static boolean containDuplicates(int[] nums)
    {
        /* using HashSet to find the duplicate value! */
        HashSet<Integer> numbers = new HashSet<>();
        for(int i = 0; i<nums.length; i++)
        {
            if(numbers.contains(nums[i]))
            {
                return true;
            }
            else
            {
                numbers.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String args[])
    {
        int[] array = {1,2,3,4,5,6};
        boolean output = containDuplicates(array);
        System.out.print(output);
    }
}
