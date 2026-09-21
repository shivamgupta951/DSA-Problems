import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class prog115 {
    public static void main(String args[]) {
        int V = 4;
        int[][] roads = { { 0, 1, 4 }, { 0, 2, 1 }, { 2, 1, 2 }, { 1, 3, 1 }, { 2, 3, 5 } };
        List<List<int[]>> l = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            l.add(new ArrayList<>());
        }
        for (int[] arr : roads) {
            int u = arr[0];
            int v = arr[1];
            int w = arr[2];
            l.get(u).add(new int[] { v, w });
            l.get(v).add(new int[] { u, w });
        }

        int[] dis = new int[V];
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[0] = 0;
        int src = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.add(new int[] { 0, src });
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int dist = curr[0];
            int node = curr[1];
            if (dist > dis[node])
                continue;
            for (int[] neighbours : l.get(node)) {
                int neighWt = neighbours[1];
                int neighNode = neighbours[0];
                if (dist + neighWt < dis[neighNode]) {
                    dis[neighNode] = dist + neighWt;
                    pq.offer(new int[] { (dist + neighWt), neighNode });
                }
            }
        }
        System.out.println(Arrays.toString(dis));
    }
}
