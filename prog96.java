import java.util.Arrays;
import java.util.Scanner;

public class prog96 {
    static int mod = 1000000007;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            for (int num = 1; num <= 6; num++) {
                if (i - num >= 0)
                    dp[i] = (dp[i] + dp[i - num]) % mod;
            }
        }
        System.out.println(dp[dp.length - 1]);
        sc.close();
    }
}
