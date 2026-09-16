import java.util.*;

public class prog105 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int total = 0;
        int target = 0;
        for (char c : map.keySet()) {
            if (map.get(c) > target)
                target = map.get(c);
            total += map.get(c);
        }
        System.out.println(total - target);
        sc.close();
    }
}
