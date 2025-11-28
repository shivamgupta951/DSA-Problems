/* 649. Dota2 Senate
   In the world of Dota2, there are two parties: the Radiant and the Dire.
   The Dota2 senate consists of senators coming from two parties. Now the Senate 
   wants to decide on a change in the Dota2 game. The voting for this change 
   is a round-based procedure. In each round, each senator can exercise one of the two rights:
   -> 1st Attempt TC ~ O(N) , SC ~ O(N)
*/

import java.util.LinkedList;
import java.util.Queue;

public class prog62 {
    public static String predictPartyVictory(String senate){
        String result = "";
        char res = 'A';
        Queue<Character> q = new LinkedList<>(); 
        for(int i = 0; i<senate.length(); i++)
        {
            char t = senate.charAt(i);
            q.offer(t);
        }
        while(!q.isEmpty())
        {
            char first = q.poll();
            if(q.isEmpty())
            {
                res = first;
                break;
            }
            char second = q.poll();
            if(second==first)
            {
                res = second;
            }
            else{
                res = first;
                q.offer(first);
            }

        }
        if(res=='R')
        {
            result=result+"Radiant";
        }
        else{
            result=result+"Dire";
        }
        return result;
    }

    public static void main(String args[])
    {
        String input = "RD";
        System.out.println(predictPartyVictory(input));
    }
 }
