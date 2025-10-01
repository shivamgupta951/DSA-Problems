/* 540. Single Element in a Sorted Array
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
Return the single element that appears only once.
  -> 1st Approach! O(log n)
*/

class prog10 {
    public static int Single_Element(int[] nums)
    {
      /* checking nums[i]==nums[i+1] for even places! 
         if pointer reached the last value that value will be single 
       */
      for(int i = 0; i<nums.length; i=i+2)
      {
        if(i==nums.length-1)
        {
          return nums[i];
        }
        else if(nums[i]!=nums[i+1])
        {
          return nums[i];
        }
      }
      return 0;
    }
    public static void main(String args[])
    {
      int[] arr = {3,3,7,7,10,11,11};
      int single = Single_Element(arr);
      System.out.println(single);
    }
}
