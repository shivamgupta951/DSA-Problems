/*
  Subset sum problem!
*/

import java.util.ArrayList;

public class prog82 {
    public static void subsets(int[] arr, int idx, ArrayList<Integer> l, int sum, int target) {
        if (idx >= arr.length) {
            if (sum == target)
                System.out.println(l);
            return;
        }
        l.add(arr[idx]);
        sum = sum + arr[idx];
        subsets(arr, idx + 1, l, sum, target);
        sum = sum - l.get(l.size() - 1);
        l.remove(l.size() - 1);
        subsets(arr, idx + 1, l, sum, target);
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3 };
        ArrayList<Integer> l = new ArrayList<>();
        subsets(arr, 0, l, 0, 3);
    }
}
