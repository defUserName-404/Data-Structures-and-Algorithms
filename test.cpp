#include "CrackingTheCodingInterview/ArraysAndStrings.hpp"

int main()
{
    Solution *solution;
    string s1 = "hello world",
           s2 = "kkauiaa",
           s3 = "baba",
           s4 = "RacecaR";

    cout << solution->isPermutationOfPalindrome(s1) << endl;
    cout << solution->isPermutationOfPalindrome(s2) << endl;
    cout << solution->isPermutationOfPalindrome(s3) << endl;
    cout << solution->isPermutationOfPalindrome(s4) << endl;

    return 0;
}