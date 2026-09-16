import java.util.*;

public class prog106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String binary = Integer.toBinaryString(n);
        StringBuilder str = new StringBuilder(binary);
        int val = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
            char c = binary.charAt(i);
            if (val == 1 || val == 3 || val == 5) {
                if (c == '0')
                    str.setCharAt(i, '1');
                else
                    str.setCharAt(i, '0');
            }
            val++;
        }

        int ans = Integer.parseInt(str.toString(), 2);
        sc.close();
        System.out.println(ans);
    }
}