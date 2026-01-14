/* 
   fibnacci series using recursion -> 1D DP! 
   ~Tabulation!
*/

import java.util.Arrays;

public class prog83 {

    public static void main(String args[]) {
        int dp[] = new int[10 + 1];
        dp[1] = 0;
        dp[2] = 1;
        for(int i=3; i<dp.length; i++)
        {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(Arrays.toString(dp));
    }
}
