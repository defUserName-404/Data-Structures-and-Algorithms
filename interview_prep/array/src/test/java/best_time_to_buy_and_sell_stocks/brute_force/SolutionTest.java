package best_time_to_buy_and_sell_stocks.brute_force;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testMaxProfit() {
        Solution solution = new Solution();

        // Example 1 from README
        assertEquals(5, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));

        // Example 2 from README
        assertEquals(0, solution.maxProfit(new int[]{7, 6, 4, 3, 1}));

        // Test with a single element
        assertEquals(0, solution.maxProfit(new int[]{1}));

        // Test with all prices being the same
        assertEquals(0, solution.maxProfit(new int[]{5, 5, 5, 5}));

        // Test with increasing prices
        assertEquals(4, solution.maxProfit(new int[]{1, 2, 3, 4, 5}));

        // Test with decreasing prices
        assertEquals(0, solution.maxProfit(new int[]{5, 4, 3, 2, 1}));
        
        // Another test case
        assertEquals(2, solution.maxProfit(new int[]{2, 4, 1}));
    }
}
