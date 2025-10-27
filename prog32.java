/* 3. Longest Substring Without Repeating Characters
   Given a string s, find the length of the longest substring without duplicate characters. 
   -> 2nd Approach O(N)!
*/

import java.util.HashMap;

public class prog32 {
    public static int lolss(String s) {
        int max = 0;
        int start = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int end = 0; end<s.length(); end++)
        {
            char c = s.charAt(end);
            if(map.containsKey(c))
            {
                start = Math.max(start,map.get(c)+1);
            }
            map.put(c,end);
            if(max<end-start+1) max=end-start+1;
        }
        return max;
    }
    
    public static void main(String args[])
    {
        System.out.println(lolss("pwwkew"));
    }
}