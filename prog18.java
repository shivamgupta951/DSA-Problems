/* 152. Maximum Product Subarray
   Given an integer array nums, find a subarray that has the largest product, and return the product.
   The test cases are generated so that the answer will fit in a 32-bit integer. 
   -> 1st Approach O(N)
*/

public class prog18 {
    public static int maxProduct(int[] nums)
    {
        int maxproduct = nums[0];
        int temp = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            temp = temp*nums[i];
            if(temp>maxproduct) maxproduct = temp;
            else if(temp<0)
            {
                temp=0;
            }
        }
        return maxproduct;
    }

    public static void main(String args[])
    {
        int[] array = {-2,0,-1};
        int output = maxProduct(array);
        System.out.println(output);
    }
}
