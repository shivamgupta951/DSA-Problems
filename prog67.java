/*
Sunday Contest LC!
*/

import java.util.HashSet;

public class prog67 {
    public static int maxDistinct(String s) {
        if (s==null || s.length() == 0)
            return 0;
        HashSet<Character> sets = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sets.add(ch);
        }

        return sets.size();
    }

    public static void main(String agrs[])
    {
        String input = "abcd";
        System.out.println(maxDistinct(input));
    }
}
