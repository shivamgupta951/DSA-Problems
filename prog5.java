/* 189.Rotate Array 
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative. 
 ->2nd Approach! O(n+m)
*/

public class prog5 {
    public static void ReverseKSteps(int[] arr, int k) {
        int count = k - 1;
        int[] temp = new int[k];
        /* copied last 3 elements in a new array~ */
        for (int i = arr.length - 1; count >= 0; count--, i--) {
            temp[count] = arr[i];
        }
        /* shifting elements to right and then copied the i<k index elements same as the temp array values~ */
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i > k - 1) {
                arr[i] = arr[i - k];
            } else {
                arr[i] = temp[i];
            }
        }
        return;
    }

    public static void main(String args[]) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        int[] array2 = { -1, -100, 3, 99 };
        ReverseKSteps(array, 3);
        ReverseKSteps(array2, 2);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
