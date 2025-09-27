/* 189.Rotate Array 
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative. 
 ->3rd Approach! O(n)
*/

class prog6 {
    public static void RotateArray(int[] nums, int k) {
        /* Swap whole array~ */
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        /* swap first k elements of the array~ */
        for (int i = 0, j = k - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        /* swap last n-k elements of the array~ */
        for (int i = k, j = nums.length - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

        }
    }

    public static void main(String args[])
    {
        int[] array = {1,2,3,4,5,6,7,8};
        RotateArray(array,3);
        for(int ele : array)
        {
            System.out.print(ele+" ");
        }
    }
}
