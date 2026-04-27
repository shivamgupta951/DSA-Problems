/* climbing stairs with 3 steps!*/

import java.util.Arrays;

public class prog94 {
    public static int solve(int n , int dp[])
    {
        if(n<0) return 0;
        if(n==0) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = solve(n-1,dp) + solve(n-2,dp) + solve(n-3,dp);
    }
    public static void main(String args[])
    {
        int N = 7;
        int dp[] = new int[N+1];
        Arrays.fill(dp,-1);
        System.out.println(solve(N,dp));
    }
}
