/*
 Sum on N natural numbers by recursion and recursion backtrack!
*/

public class prog72 {
    public static int findSum(int num)
    {
        if(num==0) return 0;
        return num + findSum(num-1);
    }
    public static void main(String args[])
    {
        System.out.println(findSum(3));
    }
}
