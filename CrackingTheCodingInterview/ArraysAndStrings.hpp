#include <bits/stdc++.h>

using namespace std;

class Solution
{
  public:
    //! Problem 1: Determine if a string has all unique characters or not
    bool isUnique(const string &_string);
    //! Problem 2: Determine if a string is a permutation of another string or not
    bool isPermutation(const string &s1, const string &s2);
    //! Problem 3: Replace all the spaces in the string with "%20"
    void urlify(string &_string);
    //! Problem 4: Determine if a given string is a permutation of a palindrome or not
    bool isPermutationOfPalindrome(const string &_string);
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

/*
? We will count the number of characters in the string
? The size of the url will be (current size + (number of spaces * 2))
? We will overrite every space in the string with "%20"
*/
void Solution::urlify(string &_string)
{
    int countSpaces = 0;

    for (const char &ch : _string)
        if (ch == ' ')
            countSpaces++;

    int actualLength = _string.size();
    int idx = actualLength + countSpaces * 2;
    _string.resize(idx);

    for (int i = actualLength - 1; i >= 0; i--)
    {
        if (_string[i] == ' ')
        {
            _string[idx - 1] = '0';
            _string[idx - 2] = '2';
            _string[idx - 3] = '%';
            idx -= 3;
        }
        else
        {
            _string[idx - 1] = _string[i];
            idx--;
        }
    }
}

/*
? We will count the number of characters of the string
? If the string is a permutation of a palindrome, it can have one odd character maximum
*/
bool Solution::isPermutationOfPalindrome(const string &_string)
{
    int characterCount[256] = {0};
    bool oddCharacterFound = false;

    for (const char &ch : _string)
        characterCount[ch]++;

    for (int i = 0; i < 256; i++)
    {
        if (characterCount[i] % 2)
        {
            if (oddCharacterFound)
                return false;
            else
                oddCharacterFound = true;
        }
    }

    return true;
}