/* 189.Rotate Array 
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative. 
 ->1st Approach! O(n*m)
*/

public class prog4 {
    public static void ReverseKSteps(int[] array, int k) {
        int count = 0;
        while (count < k) {
            int temp = array[array.length - 1];/* correction -> stored only index value instead of array value! */
            for (int i = array.length - 1; i >= 1; i--) {
                array[i] = array[i - 1];
            }
            array[0] = temp;
            count++;
        }
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arr2 = { -1, -100, 3, 99 };
        ReverseKSteps(arr, 3);
        ReverseKSteps(arr2, 2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
