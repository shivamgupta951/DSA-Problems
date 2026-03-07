1import java.util.*;
2
3class Solution {
4
5    static class Pair {
6        int node;
7        int dist;
8        Pair(int node, int dist) {
9            this.node = node;
10            this.dist = dist;
11        }
12    }
13    public int networkDelayTime(int[][] times, int n, int k) {
14        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
15        for(int i = 0; i <= n; i++) adj.add(new ArrayList<>());
16        for(int[] t : times){
17            int u = t[0];
18            int v = t[1];
19            int w = t[2];
20            adj.get(u).add(new Pair(v, w));
21        }
22        int[] dist = new int[n + 1];
23        Arrays.fill(dist, Integer.MAX_VALUE);
24        dist[k] = 0;
25        PriorityQueue<Pair> pq = new PriorityQueue<>(
26            (a, b) -> a.dist - b.dist
27        );
28        pq.add(new Pair(k, 0));
29        while(!pq.isEmpty()){
30            Pair cur = pq.poll();
31            int node = cur.node;
32            int d = cur.dist;
33            if(d > dist[node]) continue;
34            for(Pair nei : adj.get(node)){
35                int nextNode = nei.node;
36                int wt = nei.dist;
37                if(dist[node] + wt < dist[nextNode]){
38                    dist[nextNode] = dist[node] + wt;
39                    pq.add(new Pair(nextNode, dist[nextNode]));
40                }
41            }
42        }
43        int ans = 0;
44        for(int i = 1; i <= n; i++){
45            if(dist[i] == Integer.MAX_VALUE) return -1; 
46            ans = Math.max(ans, dist[i]);
47        }
48        return ans;
49    }
50}