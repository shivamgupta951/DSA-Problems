1class Solution {
2    public class Pair {
3        int row, col;
4        Pair(int r, int c) {
5            row = r;
6            col = c;
7        }
8    }
9
10    public void solve(char[][] board) {
11        if (board == null || board.length == 0) return;
12
13        int n = board.length;
14        int m = board[0].length;
15
16        Queue<Pair> q = new LinkedList<>();
17        int[] dx = {-1, 1, 0, 0};
18        int[] dy = {0, 0, -1, 1};
19
20        
21        for (int i = 0; i < n; i++) {
22            if (board[i][0] == 'O') {
23                q.offer(new Pair(i, 0));
24                board[i][0] = 'A';
25            }
26            if (board[i][m-1] == 'O') {
27                q.offer(new Pair(i, m-1));
28                board[i][m-1] = 'A';
29            }
30        }
31
32        for (int j = 0; j < m; j++) {
33            if (board[0][j] == 'O') {
34                q.offer(new Pair(0, j));
35                board[0][j] = 'A';
36            }
37            if (board[n-1][j] == 'O') {
38                q.offer(new Pair(n-1, j));
39                board[n-1][j] = 'A';
40            }
41        }
42
43        
44        while (!q.isEmpty()) {
45            Pair cur = q.poll();
46            for (int k = 0; k < 4; k++) {
47                int r = cur.row + dx[k];
48                int c = cur.col + dy[k];
49
50                if (r >= 0 && r < n && c >= 0 && c < m && board[r][c] == 'O') {
51                    board[r][c] = 'A';
52                    q.offer(new Pair(r, c));
53                }
54            }
55        }
56
57        
58        for (int i = 0; i < n; i++) {
59            for (int j = 0; j < m; j++) {
60                if (board[i][j] == 'O') board[i][j] = 'X';  
61                else if (board[i][j] == 'A') board[i][j] = 'O'; 
62            }
63        }
64    }
65}