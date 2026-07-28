import java.util.*;

class Solution {
    public int maxFixedPoints(int[] nums) {
        List<int[]> candidates = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= i) {
                candidates.add(new int[] { nums[i], i - nums[i] });
            }
        }
        Collections.sort(candidates, (a, b) -> {
            if (a[0] != b[0])
                return Integer.compare(a[0], b[0]);
            return Integer.compare(b[1], a[1]);
        });
        List<Integer> tails = new ArrayList<>();
        for (int[] c : candidates) {
            int val = c[1];
            int idx = bisectRight(tails, val);
            if (idx < tails.size()) {
                tails.set(idx, val);
            } else {
                tails.add(val);
            }
        }
        return tails.size();
    }

    private int bisectRight(List<Integer> list, int target) {
        int lo = 0, hi = list.size();
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (list.get(mid) <= target)
                lo = mid + 1;
            else
                hi = mid;
        }
        return lo;
    }
}
