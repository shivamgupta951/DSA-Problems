import java.util.*;

public class prog100 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = -1;
        for (int i = 0; i < size - 1; i++) {
            int sum = arr[i] + arr[i + 1];
            if (sum > max && sum % 2 == 1)
                max = sum;
        }
        System.out.println(max);
        sc.close();
    }
}
