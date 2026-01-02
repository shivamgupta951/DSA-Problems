/*
program of recursion for subsequence , try convert into dp!
*/

import java.util.ArrayList;

public class prog77 {
    public static void subsequences(int n , int[] arr , ArrayList<Integer> l)
    {
        if(n>=arr.length)
        {
            System.out.println(l);
            return;
        }
        l.add(arr[n]);
        subsequences(n+1, arr, l);
        l.removeLast();
        subsequences(n+1, arr, l);
    }
    public static void main(String args[])
    {
        int[] arr = {3,1,2};
        ArrayList<Integer> l = new ArrayList<>();
        subsequences(0, arr, l);
    }
}
