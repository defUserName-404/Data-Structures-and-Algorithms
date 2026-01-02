package two_sum.sliding_window;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * This class implements the solution to the Two Sum problem using a two-pointer approach,
 * which is a variation of the sliding window technique.
 * The input array is first associated with its indices, then sorted.
 * Two pointers are used to find the two numbers that sum up to the target.
 */
public class Solution {

    /**
     * Finds two numbers in the given array that add up to the target value.
     * This method uses a two-pointer approach on a sorted list of number-index pairs.
     * The time complexity is O(n log n) because of the sorting step.
     * The space complexity is O(n) to store the list of pairs.
     *
     * @param nums the array of integers
     * @param target the target value
     * @return an array containing the indices of the two numbers that add up to the target value
     */
    public int[] twoSum(int[] nums, int target) {
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            pairs.add(new int[]{nums[i], i});
        }

        pairs.sort(Comparator.comparingInt(a -> a[0]));

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = pairs.get(left)[0] + pairs.get(right)[0];
            if (sum == target) {
                return new int[]{pairs.get(left)[1], pairs.get(right)[1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[0]; // Should not happen given the problem constraints
    }
}