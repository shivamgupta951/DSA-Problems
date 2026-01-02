/*
recursion subsequence method used to check the target sum!
*/

public class prog78 {
    public static boolean checkSubsequence(int i, int[] arr, int sum, int currSum) {
        if (currSum == sum) {
            return true;
        }
        if (i >= arr.length) {
            return false;
        }
        currSum += arr[i];
        boolean include =  checkSubsequence(i+1, arr, sum, currSum);
        currSum -= arr[i];
        boolean exclude =  checkSubsequence(i+1, arr, sum, currSum);
        return include || exclude;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 1 };
        System.out.println(checkSubsequence(0, arr, 4, 0));
    }
}
