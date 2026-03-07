1import java.util.*;
2
3class Solution {
4    public class Pair {
5        int row;
6        int col;
7
8        Pair(int r, int c) {
9            this.row = r;
10            this.col = c;
11        }
12    }
13
14    public int orangesRotting(int[][] grid) {
15        Queue<Pair> q = new LinkedList<>();
16        int fresh = 0;
17        int n = grid.length;
18        int m = grid[0].length;
19        for (int i = 0; i < n; i++) {
20            for (int j = 0; j < m; j++) {
21                if (grid[i][j] == 2)
22                    q.offer(new Pair(i, j));
23                else if (grid[i][j] == 1)
24                    fresh++;
25            }
26        }
27        if (fresh == 0)
28            return 0;
29        int dr[] = { -1, 1, 0, 0 };
30        int dc[] = { 0, 0, -1, 1 };
31        int time = 0;
32        while (!q.isEmpty()) {
33            int size = q.size();
34            boolean roten = false;
35            for (int i = 0; i < size; i++) {
36                Pair curr = q.poll();
37                int r = curr.row;
38                int c = curr.col;
39                for (int j = 0; j < 4; j++) {
40                    int cr = r + dr[j];
41                    int cc = c + dc[j];
42                    if (cr >= 0 && cr < n && cc >= 0 && cc < m && grid[cr][cc] == 1) {
43                        grid[cr][cc] = 2;
44                        q.offer(new Pair(cr, cc));
45                        fresh--;
46                        roten = true;
47                    }
48                }
49            }
50            if(roten) time++;
51        }
52        if (fresh > 0)
53            return -1;
54        return time;
55    }
56}
57