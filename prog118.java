public class prog118 {
    public static void main(String args[]) {
        int[] arr = { 1, 3, 5, 7, 9, 12, 15 };
        int target = 8;
        int idx = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (arr[mid] > target) {
                idx = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (idx == -1) {
            System.out.println(-1);
            return;
        }

        System.out.println(arr[idx]);
    }
}
