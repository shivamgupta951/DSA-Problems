import java.util.Arrays;

public class prog122 {
    public static void reverseArr(int[] arr, int start) {
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return;
    }

    public static void reverseArr(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k = 2;
        reverseArr(arr, 0);
        reverseArr(arr, k);
        reverseArr(arr, 0, k - 1);
        System.out.println(Arrays.toString(arr));
    }
}