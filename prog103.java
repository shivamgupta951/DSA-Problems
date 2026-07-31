import java.util.*;

public class prog103 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        int cap = sc.nextInt();

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (sum - arr[i] >= cap)
                ans[i] = cap;
            else
                ans[i] = sum - arr[i];
        }

        for(int i=0; i<n; i++)
        {
            System.out.print(ans[i]+" ");
        }

        sc.close();
    }
}