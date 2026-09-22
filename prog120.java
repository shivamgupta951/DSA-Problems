import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class prog120 {
    public static void main(String args[]) {
        int arr[] = { 4, 2, 7, 2, 4, 9, 7, 5, 2 };
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i]))
                q.offer(arr[i]);
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int value = -1;
        while (!q.isEmpty()) {
            int num = q.poll();
            if (map.get(num) == 1) {
                value = num;
                break;
            }
        }

        System.out.println(value);

    }
}