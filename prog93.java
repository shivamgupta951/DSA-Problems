/* Optimised dp or Optimised Tabulation for fibnacci series */

import java.util.Arrays;

public class prog93 {
    public static void main(String args[]) {
        int value = 9;
        if(value<=1)
        {
            System.out.println(value);
            return;
        }
        int val1 = 0;
        int val2 = 1;
        int ans=0;
        for(int i=2; i<=value; i++)
        {
            ans = val1 + val2;
            val1 = val2;
            val2 = ans;
        }
        System.out.println(ans);
    }
}
