/* 242. Valid Anagram
   Given two strings s and t, return true if t is an anagram of s, and false otherwise.
   -> 1st Approach (Optimal With Time Space)
 */

import java.util.HashMap;

public class prog28 {
    public static boolean isAnagram(String s , String l)
    {
        if(s.length()!=l.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : l.toCharArray())
        {
            if(!map.containsKey(c)) return false;
            map.put(c,map.get(c)-1);
            if(map.get(c)==0) map.remove(c);
        }
        return map.isEmpty();
    }

    public static void main(String args[])
    {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
