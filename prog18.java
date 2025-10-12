/* 152. Maximum Product Subarray
   Given an integer array nums, find a subarray that has the largest product, and return the product.
   The test cases are generated so that the answer will fit in a 32-bit integer. 
   -> 1st Approach O(N)
*/

public class prog18 {
    /* fix code it contains error! */
    public static int maxProduct(int[] nums) {
        int maxproduct = Integer.MIN_VALUE;
        int product = 1;
        int neg = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                if (neg == 0) {
                    neg++;
                    product = product * nums[i];
                } else if (neg == 1) {
                    neg--; // 0
                    product = product * nums[i]; // positive value
                    if (product > maxproduct)
                        maxproduct = product;
                }
            } else if (nums[i] >= 0) {
                if (neg == 0) {
                    product = product * nums[i];
                    if (product > maxproduct)
                        maxproduct = product;
                } else {
                    product = nums[i];
                    neg--;
                }
            }
            if (product > maxproduct) {
                maxproduct = product;
            }
            if (product==0) {
                product=1;
            }
        }
        return maxproduct;
    }

    public static void main(String args[]) {
        int[] array = { -2, 0, -4 };
        int output = maxProduct(array);
        System.out.println(output);
    }
}
