import java.util.HashMap;
import java.util.HashSet;

public class prog109 {
    public static int solution(int[] arr) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        while (right < arr.length) {
            if (map.containsKey(arr[right]) && map.get(arr[right]) == 2) {
                while (map.get(arr[right]) == 2) {
                    map.put(arr[left], map.get(arr[left]) - 1);
                    if (map.get(arr[left]) == 0)
                        map.remove(arr[left]);
                    left++;
                }
            }
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 1, 3, 2, 2, 4 };
        System.out.println(solution(arr));
    }
}
