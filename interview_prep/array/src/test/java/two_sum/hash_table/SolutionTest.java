package two_sum.hash_table;

import org.junit.jupiter.api.Test;
import two_sum.sliding_window.Solution;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void twoSum_example1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = solution.twoSum(nums, target);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    @Test
    void twoSum_example2() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        int[] result = solution.twoSum(nums, target);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    @Test
    void twoSum_example3() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        int[] result = solution.twoSum(nums, target);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }
}
