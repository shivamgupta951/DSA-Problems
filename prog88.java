import java.util.*;

class Solution {

    static HashMap<Character, String> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) return result;
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    public void backtrack(String digits, int idx, StringBuilder path, List<String> result) {
        if (idx == digits.length()) {
            result.add(path.toString());
            return;
        }

        String letters = map.get(digits.charAt(idx));

        for (int i = 0; i < letters.length(); i++) {
            path.append(letters.charAt(i));      
            backtrack(digits, idx + 1, path, result); 
            path.deleteCharAt(path.length() - 1); 
        }
    }
}
