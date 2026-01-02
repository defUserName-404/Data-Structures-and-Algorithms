[![Static Badge](https://img.shields.io/badge/LeetCode-1-purple)](https://leetcode.com/problems/two-sum/description/)

### Problem Statement:

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
target.

- You may assume that each input would have exactly one solution, and you may not use the same element twice.

- You can return the answer in any order.

### Examples

| Input                            | Output  | Explanation                                           |
|----------------------------------|---------|-------------------------------------------------------|
| `nums = [2,7,11,15], target = 9` | `[0,1]` | Because `nums[0] + nums[1] == 9`, we return `[0, 1]`. |
| `nums = [3,3], target = 6`       | `[0,1]` |                                                       |
| `nums = [3,2,4], target = 6`     | `[1,2]` |                                                       |

### Constraints

- <code>2 <= nums.length <= 10<sup>4</sup></code>
- <code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code>
- <code>-10<sup>9</sup> <= target <= 10<sup>9</sup></code>
- Only one valid answer exists.

### Follow Up:

Can you come up with an algorithm that is less than <code>O(n<sup>2</sup>)</code> time complexity?

### Topics

![Static Badge](https://img.shields.io/badge/Array-teal)
![Static Badge](https://img.shields.io/badge/Sliding_Window-teal)
![Static Badge](https://img.shields.io/badge/Hash_Table-teal)
