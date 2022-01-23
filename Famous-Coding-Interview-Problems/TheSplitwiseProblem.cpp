/*
! Given the list of M transacations b/w N people,
! find out the minimum number of transactions required to settle it up
*/

#include <iostream>
#include <set>
#include <tuple>

const int N = 1e6;
int balance[N];

int minimum_transaction()
{
    int i, n, m, u, v, w, poor, x, rich, y;
    std::cin >> n >> m;
	
    for (i = 0; i < m; i++)
    {
        std::cin >> u >> v >> w;
        //u has to pay v an amount w
        balance[u] -= w;
        balance[v] += w;
    }

    std::multiset<std::tuple<int, int>> S;
    for (i = 0; i < n; i++)
        if (balance[i] != 0)
            S.insert(std::make_tuple(balance[i], i));

    int count = 0;
    while (!S.empty())
    {
        std::tie(poor, x) = *S.begin();
        S.erase(S.begin());
        std::tie(rich, y) = *S.rbegin();
        S.erase(prev(S.end()));
        int amount = std::min(-poor, rich);

        count++; //poor pays amount "amount" to rich
        printf("%d pays %d amount to %d\n", x, amount, y);
        poor += amount;
        rich -= amount;

        if (poor)
            S.insert(std::make_tuple(poor, x));
        if (rich)
            S.insert(std::make_tuple(rich, y));
    }

    return count;
}
