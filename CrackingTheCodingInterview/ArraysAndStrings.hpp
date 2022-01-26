#include <bits/stdc++.h>

using namespace std;

class Solution
{
  public:
    //! Problem 1: Determine if a string has all unique characters or not
    bool isUnique(const string &_string);
    //! Problem 2: Determine if a string is a permutation of another string or not
    bool isPermutation(const string &s1, const string &s2);
};

/*
? We will store character count in a boolean array
? if one of characters exists multiple times, we return false
*/
bool Solution::isUnique(const string &_string)
{
    bitset<256> characterCount;

    for (const char &ch : _string)
    {
        if (characterCount[ch])
            return false;

        characterCount[ch] = true;
    }

    return true;
}

/*
? We will count the characters of both string
? If the character counts of both strings are identical, the strings are permutations of each other
*/
bool Solution::isPermutation(const string &s1, const string &s2)
{
    int s1_len = s1.size();
    int s2_len = s2.size();

    if (s1_len != s2_len)
        return false;

    int characterCount[256] = {0};

    for (const auto &ch : s1)
        characterCount[ch]++;

    for (const auto &ch : s2)
    {
        characterCount[ch]--;

        if (characterCount[ch] < 0)
            return false;
    }

    return true;
}