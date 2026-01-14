/* 
   fibnacci series using recursion -> 1D DP! 
   ~Memorization!
*/

import java.util.Arrays;

public class prog84 {
    public static int fibnacci_Series(int n, int[] dp) {
        if (n <= 1)
        {
            dp[n] = n;
            return n;
        }
        if(dp[n] != -1) return dp[n];
        dp[n] = fibnacci_Series(n-1, dp) + fibnacci_Series(n-2, dp);
        return dp[n];
    }

    public static void main(String args[]) {
        int dp[] = new int[10 + 1];
        for(int i=0; i<dp.length; i++)
        {
            dp[i] = -1;
        }
        fibnacci_Series(10, dp);
        System.out.println(Arrays.toString(dp));
    }
}