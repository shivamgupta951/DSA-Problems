import java.util.*;

public class prog104 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String[] names = name.split(" ");
        String target = sc.next();

        Arrays.sort(names);
        int idx = -1;

        if (names.length > 2 * m * n) {
            System.out.println(-1 + " " + -1);
            sc.close();
            return;
        }

        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(target)) {
                idx = i + 1;
                break;
            }
        }

        if (idx == -1) {

            System.out.println(-1 + " " + -1);
            sc.close();
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                idx -= 2;
                if (idx == 0 || idx == -1) {
                    System.out.println((i + 1) + " " + (j + 1));
                    sc.close();
                    return;
                }
            }
        }
        sc.close();

    }
}