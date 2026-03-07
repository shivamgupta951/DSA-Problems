/* Subarray of an array for target sum using backtracking! */

import java.util.ArrayList;

public class prog89 {
    public static void subSetsTargets(int[] array, int idx, int sum, int target, ArrayList<Integer> ans) {
        if (sum == target) {
            System.out.println(ans);
            return;
        }
        if (idx >= array.length)
            return;
        ans.add(array[idx]);
        subSetsTargets(array, idx + 1, sum + array[idx], target, ans);
        ans.remove(ans.size() - 1);
        subSetsTargets(array, idx + 1, sum, target, ans);
    }
    public static void main(String args[]) {
        int[] arr = { 2, 3, 4, 5 };
        ArrayList<Integer> ans = new ArrayList<>();
        subSetsTargets(arr, 0, 0, 9, ans);
    }
}
