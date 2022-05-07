#include <climits>
#include <vector>

/*
? Given an integer array, calculate the maximum sum of k consequtive elements
*/

//* Brute Force Approach
// int max_sum_of_k_elements(const std::vector<int> &nums, int k)
// {
//     int global_max = INT_MIN;
//     int n = nums.size();

//     for (int i = 0; i < n - k + 1; i++)
//     {
//         int current = 0;

//         for (int j = i; j < i + k; j++)
//             current += nums[j];

//         if (current > global_max)
//             global_max = current;
//     }

//     return global_max;
// }

//* Window Sliding Technique
int max_sum_of_k_elements(const std::vector<int> &nums, int k)
{
    int n = nums.size();

    // Initializing global max as 0 because it will hold the sum of the first window
    int global_max = 0;
    for (int i = 0; i < k; i++)
        global_max += nums[i];

    // Compute sum of remaining windows one by one
    // removing first element of previous window and adding a new element
    int current_max = global_max;
    for (int i = k; i < n; i++)
    {
        current_max += nums[i] - nums[i - k];

        if (current_max > global_max)
            global_max = current_max;
    }

    return global_max;
}