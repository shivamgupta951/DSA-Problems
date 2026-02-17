1import java.util.*;
2
3class Solution {
4    public static boolean dfs(ArrayList<ArrayList<Integer>> AdjList,int curr,int destination,boolean[] visited)
5    {
6        if(curr==destination) return true;
7        visited[curr] = true;
8        for(int ele: AdjList.get(curr))
9        {
10            if(!visited[ele])
11            {
12                if(dfs(AdjList,ele,destination,visited))
13                {
14                    return true;
15                }
16            }
17        }
18        return false;
19    }
20    public boolean validPath(int n, int[][] edges, int source, int destination) {
21
22        ArrayList<ArrayList<Integer>> AdjList = new ArrayList<>();
23        for (int i = 0; i < n; i++) {
24            AdjList.add(new ArrayList<>());
25        }
26
27        for (int i = 0; i < edges.length; i++) {
28            int from = edges[i][0];
29            int to = edges[i][1];
30            AdjList.get(from).add(to);
31            AdjList.get(to).add(from);   
32        }
33        boolean[] visited = new boolean[n];
34        return dfs(AdjList,source,destination,visited);
35    }
36}
37