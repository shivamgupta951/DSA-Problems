/*
fibnacci number using multiple recursive calls!
*/

public class prog76 {
    public static int fib(int n)
    {
        if(n==0 || n==1) return n;
        int last = fib(n-1);
        int slast = fib(n-2);
        return last+slast;
    }

    public static void main (String args[])
    {
        System.out.println(fib(7));
    }
}
