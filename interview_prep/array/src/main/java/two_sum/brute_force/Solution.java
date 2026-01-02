package two_sum.brute_force;


/**
 * This class implements the solution to the Two Sum problem.
 * The problem is to find two numbers in an array that add up to a target value.
 * The brute force approach is used, which is to iterate through all the pairs of elements
 * in the array and check if their sum equals the target value.
 *
 */
public class Solution {
    /**
     * Finds two numbers in the given array that add up to the target value.
     *
     * @param nums the array of integers
     * @param target the target value
     * @return an array containing the indices of the two numbers that add up to the target value
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;

                    return result;
                }
            }
        }

        return result;
    }
}