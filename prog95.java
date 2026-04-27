import java.util.*;

public class prog95 {
    static int mod = 1000000007;

    public static int solve(int n, int[] dp) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        if (dp[n] != -1)
            return dp[n];
        int ways = 0;
        for (int i = 1; i <= 6; i++) {
            ways = (ways + solve(n - i, dp)) % mod;
        }
        return dp[n] = ways;
    }

    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(solve(n, dp));
        sc.close();
    }
}