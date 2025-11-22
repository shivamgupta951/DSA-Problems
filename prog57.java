/* A. Helpful Maths
   -> 1st Attempt (Brute Force Counting)
   TC ~ O(N), SC ~ O(1)
*/

public class prog57 {
    public static String HelpfulMaths(String s) {
        int ones = 0, twos = 0, threes = 0;

        // Count digits
        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
            else if (c == '2') twos++;
            else if (c == '3') threes++;
        }

        // Build sorted result
        StringBuilder sb = new StringBuilder();

        while (ones-- > 0) sb.append("1+");
        while (twos-- > 0) sb.append("2+");
        while (threes-- > 0) sb.append("3+");

        // Remove last '+'
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "3+2+1";
        System.out.println(HelpfulMaths(input));
    }
}
