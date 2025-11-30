/* 950. Reveal Cards In Increasing Order
   -> 1st Attempt TC ~ O(N.logN) , SC ~ O(N)!
*/

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class prog66 {
    public static int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] result = new int[n];
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(i);
        }
        for (int card : deck) {
            int index = q.poll();
            result[index] = card;

            if (!q.isEmpty()) {
                q.offer(q.poll());
            }
        }
        return result;
    }

    public static void main(String args[])
    {
        int[] nums = {17,13,11,2,3,5,7};
        System.out.println(Arrays.toString(deckRevealedIncreasing(nums)));
    }
}
