/*
reverse an array using recursion!
*/

public class prog74 {
    public static void reverseArray(int[] arr ,int start ,int end)
    {
        if(start >= end) return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start+1, end-1);
    }
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5,6};
        reverseArray(arr , 0 , arr.length-1);
        for(int num : arr)
        {
            System.out.print(num+" ");
        }
    }
}
