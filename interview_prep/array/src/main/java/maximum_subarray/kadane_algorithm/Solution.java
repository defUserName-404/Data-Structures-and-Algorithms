package maximum_subarray.kadane_algorithm;

/**
 * Solves the maximum subarray problem using Kadane's algorithm.
 * This algorithm finds the contiguous subarray within a one-dimensional
 * array of numbers that has the largest sum.
 */
class Solution {
    /**
     * Finds the contiguous subarray within a one-dimensional array of numbers
     * that has the largest sum.
     *
     * @param nums The array of integers.
     * @return The sum of the contiguous subarray with the largest sum.
     */
    public int maxSubArray(int[] nums) {
        int globalMax = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            var num = nums[i];
            currentMax = Math.max(num, currentMax + num);
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }
}