/*
recursion subsequence method used to check the target sum and return the count!
*/

import java.util.ArrayList;

public class prog80 {
    public static int checkSubsequence(int i, int[] arr, int sum, int currSum) {
        if (i >= arr.length) {
            if (currSum == sum) {
                return 1;
            } else {
                return 0;
            }
        }
        currSum += arr[i];
        int include = checkSubsequence(i + 1, arr, sum, currSum);
        currSum -= arr[i];
        int exclude = checkSubsequence(i + 1, arr, sum, currSum);
        return include + exclude;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 1 };
        System.out.println(checkSubsequence(0, arr, 3, 0 ));
    }
}
