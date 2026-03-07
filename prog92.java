/* Tabulation for fibnacci series */

import java.util.Arrays;

public class prog92 {
    public static void main(String args[]) {
        int value = 9;
        int[] dp = new int[value + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=value; i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[value]);
    }
}
