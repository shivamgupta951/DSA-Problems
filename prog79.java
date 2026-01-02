/*
recursion subsequence method used to check the target sum and also print the list!
*/

import java.util.ArrayList;

public class prog79 {
    public static void checkSubsequence(int i, int[] arr, int sum, int currSum , ArrayList<Integer> l) {
        if (i >= arr.length) {
            if (currSum == sum) {
                System.out.println(l);
                return;
            } else {
                return;
            }
        }
        currSum += arr[i];
        l.add(arr[i]);
        checkSubsequence(i + 1, arr, sum, currSum , l);
        currSum -= arr[i];
        l.removeLast();
        checkSubsequence(i + 1, arr, sum, currSum , l);
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 1 };
        ArrayList<Integer> l = new ArrayList<>();
        checkSubsequence(0, arr, 2, 0 , l);
    }
}
