1class Solution {
2    public class Pair {
3        int row;
4        int column;
5
6        Pair(int r, int c) {
7            this.row = r;
8            this.column = c;
9        }
10    }
11
12    public int numIslands(char[][] grid) {
13        Queue<Pair> q = new LinkedList<>();
14        boolean visited[][] = new boolean[grid.length][grid[0].length];
15        int count = 0;
16        int[] dx = { -1, 1, 0, 0 };
17        int[] dy = { 0, 0, -1, 1 };
18        for (int i = 0; i < grid.length; i++) {
19            for (int j = 0; j < grid[0].length; j++) {
20                if (!visited[i][j] && grid[i][j] == '1') {
21                    count++;
22                    q.offer(new Pair(i, j));
23                    visited[i][j] = true;
24                    while (!q.isEmpty()) {
25                        Pair cur = q.poll();
26                        int cr = cur.row;
27                        int cc = cur.column;
28                        for (int k = 0; k < 4; k++) {
29                            int r = cr + dx[k];
30                            int c = cc + dy[k];
31                            if (r >= 0 && r < grid.length && c >= 0 && c < grid[0].length && grid[r][c] == '1'
32                                    && !visited[r][c]) {
33                                q.offer(new Pair(r, c));
34                                visited[r][c] = true;
35                            }
36                        }
37                    }
38                }
39            }
40        }
41        return count;
42    }
43}