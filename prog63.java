/* 349. Intersection of Two Arrays
   Given two integer arrays nums1 and nums2, return an array of their intersection. 
   Each element in the result must be unique and you may return the result in any order.
   -> 1st Attempt TC ~ O(N+M) , SC ~ O(N)!
*/

import java.util.Arrays;
import java.util.HashSet;

public class prog63 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int[] result = new int[Math.min(nums1.length, nums2.length)];

        for (int num : nums1) {
            set.add(num);
        }

        int index = 0;
        for (int num : nums2) {
            if (set.contains(num)) {
                result[index++] = num;
                set.remove(num);
            }
        }

        return Arrays.copyOf(result, index); // FIX
    }

    public static void main(String args[]) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }
}
