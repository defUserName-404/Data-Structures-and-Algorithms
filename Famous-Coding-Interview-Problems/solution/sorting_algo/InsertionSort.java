package solution.sorting_algo;

public class InsertionSort extends Sort {

	public InsertionSort(int[] array) {
		super(array);
	}

	@Override
	public void sort() {
		for (int i = 0; i < array.length; i++) {
			int x = array[i];
			int j = i;

			while (j > 0 && array[j - 1] > x) {
				array[j] = array[j - 1];
				j--;
			}

			array[j] = x;
		}
	}
}