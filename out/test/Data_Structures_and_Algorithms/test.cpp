#include <iostream>

#include "../CrackingTheCodingInterview/Chapter8:Recursion&DynamicProgramming/Fibonacci.hpp"

int main()
{
    for (int i = 0; i <= 50; i++)
        std::cout << fibonacci(i) << std::endl;

    return 0;
}