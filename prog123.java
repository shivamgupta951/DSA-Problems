import java.util.Arrays;
import java.util.PriorityQueue;

public class prog123 {
    public static void main(String args[]) {
        int arr[][] = { { 1, 10 }, { 2, 3 }, { 4, 5 } };
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int maxGates = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(a, b));
        for (int i = 0; i < arr.length; i++) {
            int st = arr[i][0];
            int et = arr[i][1];
            while (!pq.isEmpty() && st >= pq.peek()) {
                pq.poll();
                // free the gates
            }
            pq.offer(et);
            maxGates = Math.max(maxGates, pq.size());
        }
        System.out.println(maxGates);
    }
}