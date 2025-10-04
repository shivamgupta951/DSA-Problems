/* 121. Best Time to Buy and Sell Stock
  You are given an array prices where prices[i] is the price of a given stock on the ith day.
  You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
  Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
  -> 2nd Approach O(n)
*/

public class prog15 {
  public static int maxProfit(int[] nums) {
    /* used min and tracked max profit with next price - min price. */
    int min = nums[0];
    int profit = 0;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      } else {
        profit = Math.max(profit, nums[i] - min);
      }
    }

    return profit;

  }

  public static void main(String args[]) {
    int[] array = { 7, 1, 5, 3, 6, 4 };
    int profit = maxProfit(array);
    System.out.println(profit);
  }

}
