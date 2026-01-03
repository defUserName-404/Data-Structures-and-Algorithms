package maximum_subarray.kadane_algorithm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Solution that solves the maximum subarray problem using Kadane's algorithm.
 */
class SolutionTest {

    private final Solution solution = new Solution();

    /**
     * Test case with a mix of positive and negative numbers.
     */
    @Test
    void testMaxSubArray_standardCase() {
        assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    /**
     * Test case with mostly positive numbers.
     */
    @Test
    void testMaxSubArray_allPositiveNumbers() {
        assertEquals(24, solution.maxSubArray(new int[]{5, 4, 7, 8}));
    }

    /**
     * Test case with all negative numbers. The largest sum should be the largest number (least negative).
     */
    @Test
    void testMaxSubArray_allNegativeNumbers() {
        assertEquals(-1, solution.maxSubArray(new int[]{-2, -1}));
        assertEquals(-1, solution.maxSubArray(new int[]{-2, -3, -1, -5}));
    }

    /**
     * Test case with a single element array.
     */
    @Test
    void testMaxSubArray_singleElementArray() {
        assertEquals(1, solution.maxSubArray(new int[]{1}));
        assertEquals(-5, solution.maxSubArray(new int[]{-5}));
    }

    /**
     * Test case with arrays containing zero.
     */
    @Test
    void testMaxSubArray_arrayWithZeros() {
        assertEquals(0, solution.maxSubArray(new int[]{0}));
        assertEquals(6, solution.maxSubArray(new int[]{0, 5, -1, 2}));
        assertEquals(0, solution.maxSubArray(new int[]{-1, 0, -2}));
    }

    /**
     * More complex test scenarios.
     */
    @Test
    void testMaxSubArray_complexScenarios() {
        assertEquals(4, solution.maxSubArray(new int[]{1, 2, -1, -2, 4}));
        assertEquals(4, solution.maxSubArray(new int[]{-1, 3, -1, 2}));
    }
}

