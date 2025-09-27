/* 283. Move Zeroes 
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
  ->1st Approach! O(n*m)
*/

class prog7 {
  public static void moveZeroes(int[] nums) {
    int end = nums.length - 1;
    for (int i = 0; i < end; i++) {
      /* pushing 0 to the end and shifting all elements to front and reduce i index by 1 */
      if (nums[i] == 0) {
        int temp = i;
        while (temp < end) {
          nums[temp] = nums[temp + 1];
          temp++;
        }
        nums[end] = 0;
        end--;
        i--;
      }
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
