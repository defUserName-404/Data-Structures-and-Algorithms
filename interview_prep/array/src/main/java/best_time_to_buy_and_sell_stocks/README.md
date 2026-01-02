[![Static Badge](https://img.shields.io/badge/LeetCode-121-purple)](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/)

### Problem Statement:

You are given an array `prices` where `prices[i]` is the price of a given stock on the <code>i<sup>th</sup></code> day.

You want to maximize your profit by choosing a **single day** to buy one stock and choosing a **different day in the
future** to sell that stock.

Return the *maximum profit you can achieve from this transaction*. If you cannot achieve any profit, return `0`.

### Examples

| Input                    | Output | Explanation                                                                                                                                                                   |
|--------------------------|--------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `prices = [7,1,5,3,6,4]` | `5`    | Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell. |
| `prices = [7,6,4,3,1]`   | `0`    |                                                                                                                                                                               |

### Constraints

- <code>1 <= prices.length <= 10<sup>5</sup></code>
- <code>0 <= prices[i] <= 10<sup>4</sup></code>

### Follow Up:

### Topics

![Static Badge](https://img.shields.io/badge/array-teal)
![Static Badge](https://img.shields.io/badge/dynamic_programming-teal)
