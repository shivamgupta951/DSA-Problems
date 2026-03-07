1class Solution {
2    public class Pair{
3        int node;
4        long time;
5        Pair(int n , long t){
6            this.node = n;
7            this.time = t;
8        }
9    }
10    public int countPaths(int n, int[][] roads) {
11        int MOD = (int)1e9 + 7;
12        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
13        for(int i = 0; i < n; i++){
14            adj.add(new ArrayList<>());
15        }
16        for(int[] r : roads){
17            int u = r[0];
18            int v = r[1];
19            int t = r[2];
20            adj.get(u).add(new Pair(v, t));
21            adj.get(v).add(new Pair(u, t));
22        }
23        long[] dist = new long[n];
24        Arrays.fill(dist, Long.MAX_VALUE);
25        long[] ways = new long[n];
26        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Long.compare(a.time, b.time));
27        dist[0] = 0;
28        ways[0] = 1;
29        pq.add(new Pair(0, 0));
30        while(!pq.isEmpty()){
31            Pair cur = pq.poll();
32            int node = cur.node;
33            long time = cur.time;
34            if(time > dist[node]) continue;
35            for(Pair nei : adj.get(node)){
36                int next = nei.node;
37                long newTime = time + nei.time;
38                if(newTime < dist[next]){
39                    dist[next] = newTime;
40                    ways[next] = ways[node];
41                    pq.add(new Pair(next, newTime));
42                }
43                else if(newTime == dist[next]){
44                    ways[next] = (ways[next] + ways[node]) % MOD;
45                }
46            }
47        }
48        return (int)(ways[n-1] % MOD);
49    }
50}