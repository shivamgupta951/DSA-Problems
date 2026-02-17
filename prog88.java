/* Subarray of an array using backtracking! */
import java.util.ArrayList;

public class prog88 {
    public static void subSets(int[] array , int idx, ArrayList<Integer> ans)
    {
        if(idx==array.length)
        {
            System.out.println(ans);
            return;
        }
        ans.add(array[idx]);
        subSets(array,idx+1,ans);
        ans.remove(ans.size()-1);
        subSets(array,idx+1,ans);
    }
    public static void main(String args[])
    {
        int[] arr = {1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        subSets(arr,0,ans);
    }
}
