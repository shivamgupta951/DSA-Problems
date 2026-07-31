import java.util.*;

public class prog102 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * (i + 1)) / 2;
            sum += (i * (i + 1)) / 2 - 1;
        }
        System.out.println(sum);
        sc.close();
    }
}
