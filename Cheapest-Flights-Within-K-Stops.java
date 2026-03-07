1import java.util.*;
2
3class Solution {
4    
5    public class Pair{
6        int node;
7        int weight;
8        Pair(int n , int w){
9            this.node = n;
10            this.weight = w;
11        }
12    }
13    public class Tuple{
14        int stops;
15        int node;
16        int cost;
17        Tuple(int s, int n, int c){
18            this.stops = s;
19            this.node = n;
20            this.cost = c;
21        }
22    }
23    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
24        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
25        for(int i = 0; i < n; i++){
26            adj.add(new ArrayList<>());
27        }
28        for(int i = 0; i < flights.length; i++){
29            int u = flights[i][0];
30            int v = flights[i][1];
31            int w = flights[i][2];
32            adj.get(u).add(new Pair(v, w));
33        }
34        int[] dist = new int[n];
35        Arrays.fill(dist, Integer.MAX_VALUE);
36        dist[src] = 0;
37        Queue<Tuple> q = new LinkedList<>();
38        q.add(new Tuple(0, src, 0));
39        while(!q.isEmpty()){
40            Tuple cur = q.poll();
41            int stops = cur.stops;
42            int node = cur.node;
43            int cost = cur.cost;
44            if(stops > k) continue;
45            for(Pair it : adj.get(node)){
46                int nextNode = it.node;
47                int wt = it.weight;
48                if(cost + wt < dist[nextNode]){
49                    dist[nextNode] = cost + wt;
50                    q.add(new Tuple(stops + 1, nextNode, dist[nextNode]));
51                }
52            }
53        }
54        if(dist[dst] == Integer.MAX_VALUE) return -1;
55        return dist[dst];
56    }
57}