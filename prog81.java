/*
Merge sort algo using recursion!    
*/

import java.util.Arrays;

public class prog81 {
    public static void mergeSort(int arr[], int start, int end) {
        if (start >= end)
            return;
        int n = start + (end - start) / 2;
        mergeSort(arr, start, n);
        mergeSort(arr, n + 1, end);
        merge(arr, start, n, end);
        //tail recursion
        return;
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int size = end - start + 1;
        int[] nums = new int[size];
        int idx = 0;
        int i = start;
        int j = mid + 1;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                nums[idx++] = arr[i++];
            } else {
                nums[idx++] = arr[j++];
            }
        }
        while(i<=mid)
        {
            nums[idx++] = arr[i++];
        }
        while(j<=end)
        {
            nums[idx++] = arr[j++];
        }
        int index = start;
        for(int k = 0; k<nums.length; k++)
        {
            arr[index++] = nums[k];
        }
        return;
    }

    public static void main(String args[]) {
        int[] arr = { 5, 3, 6, 4, 2, 1 };
        mergeSort(arr, 0, 5);
        System.out.println(Arrays.toString(arr));
    }
}
