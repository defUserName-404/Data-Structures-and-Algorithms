#include "CrackingTheCodingInterview/ArraysAndStrings.hpp"

int main()
{
    Solution *solution;
    string s1 = "hello world",
                 s2 = "e hlolldwro",
                 s3 = "C++ is the best",
                 s4 = "c++ Is the best",
                 s5 = "insomnia",
                 s6 = "mniaison";

    solution->urlify(s1);
    solution->urlify(s2);
    solution->urlify(s3);
    solution->urlify(s4);
    solution->urlify(s5);
    solution->urlify(s6);

    cout << s1 << endl
         << s2 << endl
         << s3 << endl
         << s4 << endl
         << s5 << endl
         << s6 << endl;

    return 0;
}