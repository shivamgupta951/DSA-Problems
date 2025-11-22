/* 739. Daily Temperatures
   Given an array of daily temperatures, return how many days until a warmer temperature.
   -> 1st Attempt: Monotonic Stack, TC ~ O(N), SC ~ O(N)
*/

import java.util.Arrays;
import java.util.Stack;

public class prog56 {
    public static int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] result = new int[n];
        Stack<Integer> s = new Stack<>(); // stores indices

        for (int i = n - 1; i >= 0; i--) {

            // Pop all smaller or equal temperatures
            while (!s.isEmpty() && temp[s.peek()] <= temp[i]) {
                s.pop();
            }

            // If stack is empty → no warmer day
            if (s.isEmpty()) {
                result[i] = 0;
            } 
            else {
                result[i] = s.peek() - i;
            }

            // Push current index
            s.push(i);
        }
        return result;
    }

    public static void main(String args[]) {
        int[] arr = {73,74,75,71,69,72,76,73};
        int[] result = dailyTemperatures(arr);
        System.out.println(Arrays.toString(result));
    }
}
