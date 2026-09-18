import java.util.HashSet;

public class prog110{
    public static void main(String[] args) {
        int[] arr = {4,7,4,9,7,4};
        if(arr.length==0) {
            System.out.println(-1);
            return;
        }
        int idx = arr.length-1;
        HashSet<Integer> set = new HashSet<>();
        while(idx>=0)
        {
            if(set.contains(arr[idx]))
            {
                break;
            }
            set.add(arr[idx]);
            idx--;
        }
        idx++;
        System.out.println(idx);
    }
}