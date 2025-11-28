/* 2073. Time Needed to Buy Tickets
   There are n people in a line queuing to buy tickets, where the 0th person is at the front 
   of the line and the (n - 1)th person is at the back of the line.
   You are given a 0-indexed integer array tickets of length n where 
   the number of tickets that the ith person would like to buy is tickets[i].
   -> 1st Attempt TC ~ O() , SC ~ O()!
*/

import java.util.LinkedList;
import java.util.Queue;

public class prog61 {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        boolean check = false;
        int count = 0;

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            q.offer(i);
        }

        while (!check) {
            count++;
            int x = q.poll();
            tickets[x]--;

            if (tickets[x] != 0) {
                q.offer(x);
            } else if (x == k) {
                check = true;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2};
        int result = timeRequiredToBuy(arr, 2);
        System.out.println(result);
    }
}
