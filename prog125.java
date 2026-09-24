import java.util.Arrays;

public class prog125 {
    public static long solve(int[] energy, int[] cooldown, int idx, long[] dp) {
        if (idx >= energy.length)
            return 0;
        if (dp[idx] != -1)
            return dp[idx];
        long skip = solve(energy, cooldown, idx + 1, dp);

        int next = idx + cooldown[idx] + 1;
        long take = energy[idx] + solve(energy, cooldown, next, dp);
        return dp[idx] = Math.max(take, skip);
    }

    public static void main(String args[]) {
        int[] energy = { 5, 10, 20, 1, 30 };
        int[] cooldown = { 0, 1, 1, 0, 0 };
        long[] dp = new long[energy.length];
        Arrays.fill(dp, -1);
        long sum = solve(energy, cooldown, 0, dp);
        System.out.println(sum);
    }
}
