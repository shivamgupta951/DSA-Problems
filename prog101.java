import java.util.*;

public class prog101 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> map = new HashMap<>(); // character & index
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                for (int j = 0; j <= i; j++) {
                    ans.append(c);
                }
                map.put(c, i + 1);
                if (i == s.length() - 1)
                    continue;
                ans.append('-');
            } else {
                int count = map.get(c);
                for (int j = 0; j < count; j++) {
                    ans.append(c);
                }
                if (i == s.length() - 1)
                    continue;
                ans.append('-');
            }
        }
        System.out.println(ans.toString());
        sc.close();
    }
}
