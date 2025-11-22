/* 496. Next Greater Element I
   The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
   You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
   For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element 
   of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.
   Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
   -> 1st Attempt TC ~ O(n+m) , SC ~ O(N)
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class prog58 {
    public static int[] NextGreater(int[] nums1 , int[] nums2)
    {
        Stack<Integer> s = new Stack<>();
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i=nums2.length-1; i>=0; i--)
        {
            while(!s.empty() && s.peek()<nums2[i])
            {
                s.pop();
            }

            if(s.empty())
            {
                hashmap.put(nums2[i],-1);
            }
            else 
            {
                hashmap.put(nums2[i],s.peek());
            }
            s.push(nums2[i]);
        }
        for(int i=0; i<nums1.length; i++)
        {
            nums1[i] = hashmap.get(nums1[i]); 
        }
        return nums1;
    }

    public static void main(String args[])
    {
        int[] arr1 = {4,1,2};
        int[] arr2 = {1,3,4,2};
        int[] result = NextGreater(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
 }
