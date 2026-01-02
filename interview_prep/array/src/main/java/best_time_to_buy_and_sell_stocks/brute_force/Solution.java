package best_time_to_buy_and_sell_stocks.brute_force;

/**
 * Finds the maximum profit that can be achieved by buying and selling a stock.
 * This solution uses a brute-force approach.
 */
public class Solution {
    /**
     * Calculates the maximum profit that can be achieved.
     * <p>
     * The method iterates through all possible pairs of days to buy and sell the stock,
     * calculating the profit for each pair and keeping track of the maximum profit found.
     *
     * @param prices an array of stock prices where prices[i] is the price on day i.
     * @return the maximum profit, or 0 if no profit can be made.
     */
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                result = Math.max(result, prices[j] - prices[i]);
            }
        }
        return result;
    }
}
