public class BinarySearch {

	public static int search(int[] array, int target, int low, int high) {
		if (low > high)
			return -1;

		int mid = (low + high) / 2;
		int currentValue = array[mid];

		if (target < currentValue)
			return search(array, target, low, mid - 1);
		else if (target > currentValue)
			return search(array, target, mid + 1, high);
		else
			return mid;
	}
}