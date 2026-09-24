import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class prog124 {
    public static void main(String args[]) {
        int n = 6;
        int[][] conn = { { 0, 1 }, { 0, 2 }, { 1, 3 }, { 2, 3 }, { 3, 4 }, { 4, 5 } };
        int s = 0;
        int time = 0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < conn.length; i++) {
            int u = conn[i][0];
            int v = conn[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        q.offer(s);
        visited[s] = true;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int node = q.poll();
                for (int neigh : adj.get(node)) {
                    if (!visited[neigh]) {
                        q.offer(neigh);
                        visited[neigh] = true;
                    }
                }
            }
            if (q.isEmpty())
                break;
            time++;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(time);
    }
}