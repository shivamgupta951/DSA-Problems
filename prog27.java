/* 344. Reverse String
   Write a function that reverses a string. The input string is given as an array of characters s.
   You must do this by modifying the input array in-place with O(1) extra memory.
   -> 1st Attempt (Optimal Solution!)
*/

class prog27 {
    public static void reverseString(char[] s)
    {
        for(int i = 0 , j = s.length-1; i<j; i++, j--)
        {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }

    public static void main(String args[])
    {
        char[] array = {'h','e','l','l','o'};
        reverseString(array);
        System.out.print(array);
    }
    
    
}
