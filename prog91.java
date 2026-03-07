/* Memorization for fibnacci series */

import java.util.Arrays;

public class prog91 {
    public static int fib(int n, int dp[]) {
        if (n == 0 || n == 1) {
            dp[n] = n;
            return n;
        }
        if (dp[n] != -1)
            return dp[n];
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }

    public static void main(String args[]) {
        int value = 9;
        int[] dp = new int[value + 1];
        Arrays.fill(dp, -1);
        System.out.println(fib(value, dp));
    }
}
