/* Find the Largest Element in an Array */

public class prog1 {
    public static void main(String args[])
    {
        int[] array = {10,5,30,50,67,78,43};
        int max=Integer.MIN_VALUE;
        for(int i=0 ; i<array.length; i++)
        {
            if(max<array[i])max=array[i];
        }
        System.out.println(max);
    }
}