package two_sum.hash_table;

import java.util.HashMap;
import java.util.Map;

/**
 * This class implements the solution to the Two Sum problem using a hash table (HashMap).
 * This approach offers an optimal time complexity by sacrificing some space complexity.
 */
public class Solution {

    /**
     * Finds two numbers in the given array that add up to the target value.
     * This method uses a hash map to store numbers and their indices, allowing for
     * O(1) average time complexity for lookups and insertions.
     *
     * Time complexity: O(n) on average, as each number is processed once, and hash map operations
     * (put and get) take average O(1) time. In the worst case (hash collisions), it can be O(n).
     *
     * Space complexity: O(n) in the worst case, as the hash map can store up to n elements
     * if no two numbers sum up to the target until the very end.
     *
     * @param nums the array of integers
     * @param target the target value
     * @return an array containing the indices of the two numbers that add up to the target value.
     *         The problem statement guarantees exactly one solution.
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        // As per problem description, there will always be exactly one solution,
        // so this part should ideally not be reached.
        return new int[0];
    }
}
