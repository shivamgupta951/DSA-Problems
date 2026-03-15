1class Solution {
2    public int cherryPickup(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5        int prev[][] = new int[n][n];
6        for (int i = 0; i < n; i++) {
7            for (int j = 0; j < n; j++) {
8                if (i == j)
9                    prev[i][j] = grid[m - 1][i];
10                else
11                    prev[i][j] = grid[m - 1][i] + grid[m - 1][j];
12            }
13        }
14        for (int i = m - 2; i >= 0; i--) {
15            int curr[][] = new int[n][n];
16            for (int j1 = 0; j1 < n; j1++) {
17                for (int j2 = 0; j2 < n; j2++) {
18                    int maxi = (int) -1e8;
19                    for (int dj1 = -1; dj1 <= 1; dj1++) {
20                        for (int dj2 = -1; dj2 <= 1; dj2++) {
21                            int value = 0;
22                            if (j1 == j2)
23                                value = grid[i][j1];
24                            else
25                                value = grid[i][j1] + grid[i][j2];
26                            if (j1 + dj1 >= 0 && j1 + dj1 < n && j2 + dj2 >= 0 && j2 + dj2 < n)
27                                value += prev[j1 + dj1][j2 + dj2];
28                            else {
29                                value += (int) -1e8;
30                            }
31                            maxi = Math.max(value, maxi);
32                        }
33                    }
34                    curr[j1][j2] = maxi;
35                }
36            }
37            prev = curr;
38        }
39        return prev[0][n - 1];
40    }
41}