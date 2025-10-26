/* 3. Longest Substring Without Repeating Characters
   Given a string s, find the length of the longest substring without duplicate characters. 
   -> 1st Approach O(N^2)!
*/

public class prog31 {
    public static int lolss(String s) {
        int max = 0;
        int start = 0;
        for (int i = 1; i < s.length(); i++) {
            for (int j = start; j < i; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    start = j + 1;
                    max = Math.max(max, i - start + 1);
                    break;
                }
            }
            if(i-start+1> max) max = i-start+1;
        }
        return max;
    }
    
    public static void main(String args[])
    {
        System.out.println(lolss("abcabcbb"));
    }
}