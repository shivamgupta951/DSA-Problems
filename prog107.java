import java.util.*;

public class prog107 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int count = 0;
        int idx = 0;
        while (idx < input.length() - 1) {
            if (input.charAt(idx) == input.charAt(idx + 1)) {
                count++;
                idx++;
            } else
                idx++;
        }
        System.out.println(count);
        sc.close();
    }
}
