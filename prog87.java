// Number of Islands using BFS

import java.util.*;

public class prog87 {

    public class Pair {
        int rows;
        int columns;
        Pair(int r, int c) {
            this.rows = r;
            this.columns = c;
        }
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    bfs(grid, visited, i, j, n, m);
                    count++; 
                }
            }
        }
        return count;
    }

    private void bfs(char[][] grid, boolean[][] visited, int r, int c, int n, int m) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(r, c));
        visited[r][c] = true;

        int[] dr = {-1, 1, 0, 0}; 
        int[] dc = {0, 0, -1, 1}; 

        while (!q.isEmpty()) {
            Pair cur = q.poll();

            for (int i = 0; i < 4; i++) {
                int nr = cur.rows + dr[i];
                int nc = cur.columns + dc[i];

                if (nr >= 0 && nc >= 0 && nr < n && nc < m &&
                    grid[nr][nc] == '1' && !visited[nr][nc]) {

                    visited[nr][nc] = true;
                    q.offer(new Pair(nr, nc));
                }
            }
        }
    }

}
