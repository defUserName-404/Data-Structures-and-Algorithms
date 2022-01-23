/*
 * @lc app=leetcode id=1 lang=cpp
 *
 * [1] Two Sum
 */

#include <bits/stdc++.h>

using namespace std;

class Solution
{
  public:
    vector<int> twoSum(vector<int> &nums, int target)
    {
        map<int, int> id;
        for (int i = 0; i < nums.size(); i++)
        {
            int make = target - nums[i];
            if (id[make])
            {
                return {id[make] - 1, i};
            }
            id[nums[i]] = i + 1;
        }
        return {-1, -1};
    }
};