#include "CrackingTheCodingInterview/ArraysAndStrings.hpp"

int main()
{
    Solution *solution;
    const string s1 = "hello world",
                 s2 = "e hlolldwro",
                 s3 = "C++ is the best",
                 s4 = "c++ Is the best",
                 s5 = "insomnia",
                 s6 = "mniaison";

    cout << solution->isPermutation(s1, s2) << endl;
    cout << solution->isPermutation(s3, s4) << endl;
    cout << solution->isPermutation(s5, s6) << endl;

    return 0;
}