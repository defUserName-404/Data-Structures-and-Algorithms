/*
 * @lc app=leetcode id=7 lang=cpp
 *
 * [7] Reverse Integer
 */
#include <bits/stdc++.h>

using namespace std;

class Solution
{
  public:
    int reverse(int x)
    {
        long long rev = 0;
        long long limit = (1LL << 31);
        while (x)
        {
            int d = x % 10;
            x /= 10;
            rev = 10 * rev + d;
        }
        if (rev >= limit or rev < -limit)
            return 0;
        return rev;
    }
};