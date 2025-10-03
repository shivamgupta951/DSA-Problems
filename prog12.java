/* 1. Two Sum
   Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
   You may assume that each input would have exactly one solution, and you may not use the same element twice.
   You can return the answer in any order.
  -> 2nd Approach! O(n)
 */

import java.util.HashMap;

public class prog12 {
    public static int[] twoSum(int[] nums , int target)
    {
      /* using hashmap to check the req number in the array~ */
      HashMap <Integer,Integer> mapnumber = new HashMap<>();
      for(int i=0 ; i<nums.length; i++)
      {
         int req = target - nums[i];
         if(mapnumber.containsKey(req))
         {
            return new int[] {mapnumber.get(req) , i};
         }  
         mapnumber.put(nums[i],i);
      }
      return new int[] {};
    }

    public static void main(String args[])
    {
      int[] array = {2,5,6,7,4};
      int[] output = twoSum(array , 8);
      for(int ele : output)
      {
         System.out.print(ele+" ");
      }
    }
}
