/*
  Undirected and Unweighted Graph! 
*/

import java.util.Scanner;

public class prog86 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        int[][] adjMatrix = new int[n][n];
        for (int i = 0; i < e; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            adjMatrix[from][to] = 1;
            adjMatrix[to][from] = 1;
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
