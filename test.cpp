#include "CrackingTheCodingInterview/ArraysAndStrings.hpp"

int main()
{
    Solution *solution;
    string s1 = "helloworld",
           s2 = "kkkkkkaauiaaa",
           s3 = "baba",
           s4 = "RacecaR",
		   s5 = "aabcccccaaa";

    cout << solution->compressedString(s1) << endl;
    cout << solution->compressedString(s2) << endl;
    cout << solution->compressedString(s3) << endl;
    cout << solution->compressedString(s4) << endl;
    cout << solution->compressedString(s5) << endl;

    return 0;
}