# Array

Arrays hold values of the same type at contiguous memory locations.

<!-- TOC -->
* [Array](#array)
  * [Advantages](#advantages)
  * [Disadvantages](#disadvantages)
  * [Common Terms](#common-terms)
  * [Time Complexity](#time-complexity)
  * [Things to look out for during interview](#things-to-look-out-for-during-interview)
  * [Corner cases](#corner-cases)
  * [Techniques](#techniques)
    * [Sliding Window](#sliding-window)
      * [Common Questions Examples](#common-questions-examples)
    * [Two Pointers](#two-pointers)
      * [Common Questions Examples](#common-questions-examples-1)
    * [Traversing from the Right](#traversing-from-the-right)
      * [Common Questions Examples](#common-questions-examples-2)
    * [Sorting the Array](#sorting-the-array)
      * [Common Questions Examples](#common-questions-examples-3)
    * [Index as a Hash Key](#index-as-a-hash-key)
      * [Common Questions Examples](#common-questions-examples-4)
    * [Traversing the Array More than Once](#traversing-the-array-more-than-once)
<!-- TOC -->

## Advantages

- Store multiple elements of the same type with one single variable name
- Accessing elements is fast as long as you have the index, as opposed to linked lists where you have to traverse from
  the head.

## Disadvantages

- Fixed size, once declared, the size cannot be changed. If an insertion causes the total number of elements to exceed
  the size, a new array has to be allocated and the existing elements have to be copied over. The act of creating a new
  array and transferring elements over takes `O(n)` time.
- Inserting or deleting elements is slow as it requires shifting elements.

## Common Terms

- Subarray: A contiguous sequence of elements from an array.
- Subsequence: A sequence of elements from an array, not necessarily contiguous.

## Time Complexity

| Operation                 | Big-O       | Note                                                                                       |
|---------------------------|-------------|--------------------------------------------------------------------------------------------|
| Access                    | `O(1)`      |                                                                                            |
| Searching                 | `O(n)`      |                                                                                            |
| Searching in sorted array | `O(log(n))` | using binary search                                                                        |
| Insert                    | `O(n)`      | would require shifting all the subsequent elements to the right by one and that takes O(n) |
| Insert at the end         | `O(1)`      | no elements need to be shifted                                                             |
| Delete                    | `O(n)`      | would require shifting all the subsequent elements to the left by one and that takes O(n)  |
| Delete from the end       | `O(1)`      | no elements need to be shifted                                                             |

## Things to look out for during interview

- Clarify if there are duplicate values in the array. Would the presence of duplicates affect the solution? Does it make
  the questuion harder or harder?
- Be mindful about slicing or concatenating arrays in your code. Typically, slicing and concatenating arrays would take
  `O(n)` time. Use start and end indices to demarcate a subarray/range where possible.
- Clarify if the array is sorted. If it is, you can use binary search to find the target value.

## Corner cases

- Empty sequence
- Sequence with 1 or 2 elements
- Sequence with repeated elements
- Duplicated values in the sequence

## Techniques

> Note that because both arrays and strings are sequences (a string is an array of characters), most of the techniques
> here will apply to string problems.

### Sliding Window

In a sliding window, the two pointers usually move in the same direction, and they will never overtake each other. This
ensures that each value is only visited at most twice and the time complexity is still `O(n)`.
> Sliding window solution template:
> ```cpp
> int findSubstring(string s){
>     vector<int> map(128,0);
>     int counter; // check whether the substring is valid
>     int begin=0, end=0; //two pointers, one point to tail and one head
>     int d; //the length of substring
>
>     for() { /* initialize the hash map here */ }
>
>     while(end < s.size()){
>
>         if(map[s[end++]]-- ?){  /* modify counter here */ }
>
>         while(/* counter condition */){ 
>             /* update d here if finding minimum */
>             if(map[s[begin++]]++ ?){ /* modify counter here */ }
>         }
>
>         /* update d here if finding maximum */
>     }
>     return d;
> }
> ```

#### Common Questions Examples

1. [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
2. [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/)
3. [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/)
4. [Permutation in String](https://leetcode.com/problems/permutation-in-string/)
5. [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)
6. [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/)

### Two Pointers

Two pointers is a more general form of sliding window where the two pointers can cross each other and can be on
different ways.
When you are given two arrays to process, it is common to have one index per array(pointer) to traverse/compare both of
them, incrementing one of the pointers when relevant. This is the approach to merge two sorted arrays.

#### Common Questions Examples

1. [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)
2. [Two Sum](https://leetcode.com/problems/two-sum/)
3. [Sort Colors](https://leetcode.com/problems/sort-colors/)
4. [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/)

### Traversing from the Right

Sometimes you need to traverse from the right to the left.

#### Common Questions Examples

1. [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)
2. [Number of Visible People in a Queue](https://leetcode.com/problems/number-of-visible-people-in-a-queue/)

### Sorting the Array

Is the array sorted? or partially sorted? If it is, some form of binary search can be used. This also usually means the
interviewer is looking for a solution better than `O(n)`.

Can you sort the arrray? Sometimes sorting the array first may significally simplify the problem. Obviously this would
not work if the order of array elements need to be preserved.

#### Common Questions Examples

1. [Merge Intervals](https://leetcode.com/problems/merge-intervals/)
2. [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/)

### Index as a Hash Key

If you are given a sequence and the interviewer asks for `O(1)` space, it might be possible to use the array itself as a
hash table. For example, if the array only has values from 1 to N, where N is the length of the array, negate the value
at the index corresponding to the value.

#### Common Questions Examples

1. [First Missing Positive](https://leetcode.com/problems/first-missing-positive/)
2. [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)

### Traversing the Array More than Once

Traversing the array twice/thrice (as long as fewer than n times) is still `O(n)`. Sometimes
traversing the array more than once can help you solve the problem while keeping the time complexity to `O(n)`.