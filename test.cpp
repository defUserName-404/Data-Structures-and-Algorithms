#include "CrackingTheCodingInterview/ArraysAndStrings.hpp"

int main()
{
    Solution *solution;
    const string s1 = "Hhaha",
                 s2 = "hi",
                 s3 = "JYUIa",
                 s4 = "124dj*",
                 s5 = "1n&N21";

    cout << solution->isUnique(s1) << endl;
    cout << solution->isUnique(s2) << endl;
    cout << solution->isUnique(s3) << endl;
    cout << solution->isUnique(s4) << endl;
    cout << solution->isUnique(s5) << endl;

    return 0;
}