public class prog114 {
    public static void main(String args[]) {
        int[] arr = { 2, 5, 1, 8, 3, 4 };
        int target = 15;
        int left = 0;
        int right = 0;
        int sum = 0;
        int min_length = Integer.MAX_VALUE;
        while (right < arr.length && left <= right) {
            sum += arr[right];
            if (sum == target) {
                min_length = Math.min(min_length, right - left + 1);
            } else if (sum > target) {
                while (sum > target) {
                    sum -= arr[left];
                    left++;
                }
                if (sum == target)
                    min_length = Math.min(min_length, right - left + 1);
            }
            right++;
        }
        System.out.println(min_length == Integer.MAX_VALUE ? -1 : min_length);
    }
}
