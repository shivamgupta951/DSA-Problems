/* 71A. Way Too Long Words
   -> 1st Attempt TC ~ O(N) , SC ~ O(1)!
*/

import java.util.Arrays;

public class prog42 {
    public static String[] WayTooLongWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            String temp = new String();
            for (int j = 0; j < words[i].length(); j++) {
                count++;
                if (j == 0)
                    temp = temp + words[i].charAt(j);
                if (j == words[i].length() - 1) {
                    if (count >10) {
                        temp = temp + Integer.toString(count-2);
                        temp = temp + words[i].charAt(j);
                        words[i] = temp;
                    }
                }
            }
        }
        return words;
    }

    public static void main(String args[]) {
        String[] words = { "word", "localization", "internationalization",
                "pneumonoultramicroscopicsilicovolcanoconiosis" };
        String[] newWords = WayTooLongWords(words);
        System.out.println(Arrays.toString(newWords));
    }
}
