/* 1. Two Sum
   Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
   You may assume that each input would have exactly one solution, and you may not use the same element twice.
   You can return the answer in any order.
  -> 1st Approach! O(n.n)
 */

public class prog11 {
    public static int[] TwoSum(int[] nums, int target) {
        /* just using double loop to check! */
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0, k = nums.length - 1; j <= k; j++, k--) {
                if (nums[i] + nums[j] == target) {
                    if (i != j) {
                        arr[0] = i;
                        arr[1] = j;
                        return arr;

                    }
                } else if (nums[i] + nums[k] == target) {
                    if (i != k) {
                        arr[0] = i;
                        arr[1] = k;
                        return arr;
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        int[] array = { 3, 2, 4 };
        int[] output = TwoSum(array, 6);
        for (int ele : output) {
            System.out.print(ele + " ");
        }
    }
}
