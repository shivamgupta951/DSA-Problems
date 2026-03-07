class Solution {
    public class Pair {
        int row;
        int column;

        Pair(int r, int c) {
            this.row = r;
            this.column = c;
        }
    }

    public int numIslands(char[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        int count = 0;
        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    count++;
                    q.offer(new Pair(i, j));
                    visited[i][j] = true;
                    while (!q.isEmpty()) {
                        Pair cur = q.poll();
                        int cr = cur.row;
                        int cc = cur.column;
                        for (int k = 0; k < 4; k++) {
                            int r = cr + dx[k];
                            int c = cc + dy[k];
                            if (r >= 0 && r < grid.length && c >= 0 && c < grid[0].length && grid[r][c] == '1'
                                    && !visited[r][c]) {
                                q.offer(new Pair(r, c));
                                visited[r][c] = true;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}