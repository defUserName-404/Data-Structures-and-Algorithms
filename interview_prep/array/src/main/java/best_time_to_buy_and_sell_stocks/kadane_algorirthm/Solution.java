package best_time_to_buy_and_sell_stocks.kadane_algorirthm;

/**
 * Finds the maximum profit that can be achieved by buying and selling a stock.
 * This solution uses a single pass approach similar to Kadane's algorithm.
 */
public class Solution {
    /**
     * Calculates the maximum profit that can be achieved.
     * <p>
     * This method iterates through the prices array once. It keeps track of the
     * minimum price found so far and calculates the potential profit if the stock
     * were sold on the current day. The maximum profit found is updated accordingly.
     * This is more efficient than the brute-force approach.
     *
     * @param prices an array of stock prices where prices[i] is the price on day i.
     * @return the maximum profit, or 0 if no profit can be made.
     */
    public int maxProfit(int[] prices) {
        int maxProfit = 0, minPrice = Integer.MAX_VALUE;
        for(final var price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
