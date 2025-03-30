package org.defusername.binary_search;


/*
Solution to the problem 35
 */
public class SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			final int currentMidNumber = nums[mid];
			if (currentMidNumber > target) {
				right = mid - 1;
			} else if (currentMidNumber < target) {
				left = mid + 1;
			} else {
				return mid;
			}
		}
		return left;
	}
}
