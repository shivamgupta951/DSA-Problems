/* 121. Best Time to Buy and Sell Stock
  You are given an array prices where prices[i] is the price of a given stock on the ith day.
  You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
  Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
  -> 1st Approach O(n.n)
*/

public class prog14 {
  public static int maxProfit(int[] nums) {
    int profit = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] - nums[i] > profit) {
          profit = nums[j] - nums[i];
        }
      }
    }
    return profit;
  }

  public static void main(String args[])
  {
    int[] array = {7,6,4,3,1};
    int profit = maxProfit(array);
    System.out.println(profit);
  }

}
