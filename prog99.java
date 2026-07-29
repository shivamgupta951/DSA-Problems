import java.util.*;

public class prog99{
    public static int solve(int[] arr)
    {
        int count = 0;
        if(arr.length<3) return count;
        int idx1 = 0;
        int idx2 = 2;
        while(idx2<arr.length)
        {
            if(arr[idx1] + arr[idx2] == arr[idx1+1]) count++;
            idx1++;
            idx2++;
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++)
        {
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        System.out.println(solve(arr));
        sc.close();
    }
}