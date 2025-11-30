/* 347. Top K Frequent Elements
   Given an integer array nums and an integer k, return the k 
   most frequent elements. You may return the answer in any order.
   ->1st Attempt TC ~ O(N) , SC ~ O(n)!
*/

import java.util.Arrays;
import java.util.HashMap;

public class prog65 {
   public static int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int num : nums)
      {
         if(map.containsKey(num))
         {
            int temp = map.get(num);
            map.put(num,temp+1);
         }
         else{
            map.put(num,1);
         }
      }
      int[] result = {0};
      // int count = 0;
      // for(int key : map.keySet())
      // {
      //    if(map.get(key)>=k) count++;         
      // }

      // int[] result = new int[count];
      // int index = 0;
      // for(int key : map.keySet())
      // {
      //    if(map.get(key)>=k) result[index++] = key;
      // }
      return result;
   }

   public static void main (String args[])
   {
      int[] numbers = {1,2,1,2,1,2,3,1,3,2};
      System.out.println(Arrays.toString(topKFrequent(numbers, 2)));
   }
}
