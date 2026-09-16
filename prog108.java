import java.util.HashMap;

public class prog108 {
    public static boolean solution(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int i2 = map.get(arr[i]);
                int mod = Math.abs(i - i2);
                if (mod <= k)
                    return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }

    public static void main(String args[]) {
        int[] arr = { 5, 8, 2, 5 };
        int k = 3;
        System.out.println(solution(arr, k));
    }
}