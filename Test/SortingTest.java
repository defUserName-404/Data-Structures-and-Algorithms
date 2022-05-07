import solution.sorting_algo.InsertionSort;

import java.util.Arrays;

public class SortingTest {
	public static void main(String[] args) {
		int[] array = {4, 2, 2, 1, -2, 0, 1, 4, -6, 11, 21};

		InsertionSort insertionSort = new InsertionSort(array);
		insertionSort.sort();

		System.out.println(Arrays.toString(array));
	}
}