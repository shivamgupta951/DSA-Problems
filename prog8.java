/* 283. Move Zeroes 
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
  ->2nd Approach! O(n+m+c)
*/

class prog8 {
    public static void moveZeroes(int[] nums) {
        int index = 0;
        /* store non zero values in first places~ */
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        /* rest places filled with 0 */
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String args[]) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        for (int ele : nums) {
            System.out.print(ele + " ");
        }
    }
}
