/* 49. Group Anagrams
   Given an array of strings strs, group the anagrams together. 
   You can return the answer in any order.
   -> 2nd Attempt (Brute Force using Lists)
   TC ~ O(N^2 * M), SC ~ O(N*M)
*/

import java.util.*;

public class prog34 {
    public static List<List<String>> groupAnagrams(String[] array) {

        // ✅ Change 1: Use List of Lists instead of 2D array
        List<List<String>> result = new ArrayList<>();

        // ✅ Track visited words so we don’t group the same one twice
        boolean[] visited = new boolean[array.length];

        // Outer loop: pick each word as a base
        for (int i = 0; i < array.length; i++) {
            if (visited[i]) continue; // skip already grouped words

            // ✅ Create one group for current word
            List<String> group = new ArrayList<>();
            group.add(array[i]);
            visited[i] = true;

            // ✅ Build frequency map of the base word only ONCE
            HashMap<Character, Integer> baseMap = new HashMap<>();
            for (char c : array[i].toCharArray()) {
                baseMap.put(c, baseMap.getOrDefault(c, 0) + 1);
            }

            // Compare with all following words
            for (int j = i + 1; j < array.length; j++) {
                if (visited[j]) continue;
                if (array[i].length() != array[j].length()) continue;

                // ✅ Clone baseMap instead of rebuilding it
                HashMap<Character, Integer> temp = new HashMap<>(baseMap);
                for (char c : array[j].toCharArray()) {
                    if (temp.containsKey(c)) {
                        temp.put(c, temp.get(c) - 1);
                        if (temp.get(c) == 0) temp.remove(c);
                    } else {
                        temp.put(c, 1); // mismatch, will fail later
                    }
                }

                // ✅ If empty, it’s an anagram
                if (temp.isEmpty()) {
                    group.add(array[j]);
                    visited[j] = true;
                }
            }

            // Add one completed group to the result
            result.add(group);
        }

        return result;
    }

    public static void main(String[] args) {
        List<List<String>> groups = groupAnagrams(
            new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}
        );
        System.out.println(groups);
    }
}
