#include <bits/stdc++.h>

using namespace std;

class Solution
{
  public:
    //! Problem 1: Determine if a string has all unique characters or not
    bool isUnique(const string &_string);
};

/*
? We will store character count in a boolean array
?  if one of characters exists multiple times, we return false
*/
bool Solution::isUnique(const string &_string)
{
    int n = _string.size();
    bitset<256> characterCount;

    for (const char &ch : _string)
    {
        if (characterCount[ch])
            return false;

        characterCount[ch] = true;
    }

    return true;
}