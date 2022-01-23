#include "Famous-Coding-Interview-Problems/MaxSumOfKElements.hpp"
#include <iostream>

int main()
{
    std::vector<int> num1, num2, num3, num4;
    num1 = {100, 200, 300, 400};
    num2 = {1, 4, 2, 10, 23, 3, 1, 0, 20};
    num3 = {2, 3};
    num4 = {1, 4, 2, 10, 2, 3, 1, 0, 20};

    std::cout << max_sum_of_k_elements(num1, 2) << std::endl;
    std::cout << max_sum_of_k_elements(num2, 4) << std::endl;
    std::cout << max_sum_of_k_elements(num3, 3) << std::endl;
    std::cout << max_sum_of_k_elements(num4, 4) << std::endl;

    return 0;
}