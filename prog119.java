public class prog119 {
    public static void main(String args[])
    {
        int[] arr = {1,1,1,1,1,0};
        int ones = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==1) ones++;
        }
        if(ones%2==1)
        {
            System.out.println(-1);
            return;
        }
        System.out.println(ones/2);
    }
}
