#include <climits>
#include <vector>

/*
! Given an integer array, calculate the maximum sum of k consequtive elements
*/

//* Brute Force Approach
int max_sum_of_k_elements(const std::vector<int> &nums, int k)
{
    int global_max = INT_MIN;
    int n = nums.size();

    for (int i = 0; i < n - k + 1; i++)
    {
        int current = 0;

        for (int j = i; j < i + k; j++)
            current += nums[j];

        if (current > global_max)
            global_max = current;
    }

    return global_max;
}