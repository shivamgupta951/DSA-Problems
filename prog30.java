/* 7. Reverse Integer
   Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value 
   to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
   Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
   -> 1st Approach (Optimal)
*/

public class prog30 {
    public static int reverseDigits(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;

            // Check for overflow before multiplying by 10
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            rev = rev * 10 + digit;
            x /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverseDigits(123));        // 321
        System.out.println(reverseDigits(-123));       // -321
        System.out.println(reverseDigits(1534236469)); // 0 (overflow)
    }
}
