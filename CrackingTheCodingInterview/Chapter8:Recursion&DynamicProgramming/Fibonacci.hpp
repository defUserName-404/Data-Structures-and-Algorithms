/*
    Memoization technique to save already calculated values in fibonacci
*/
long long fibonacci(int n)
{
    if (n == 0 || n == 1)
        return n;

    long long memo[n + 1] = {0};
    memo[0] = 0;
    memo[1] = 1;

    for (int i = 2; i < n; i++)
        memo[i] = memo[i - 1] + memo[i - 2];

    return memo[n - 1] + memo[n - 2];
}