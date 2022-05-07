package solution.sorting_algo;

public abstract class Sort {

	protected final int[] array;

	protected Sort(int[] array) {
		this.array = array;
	}

	public abstract void sort();
}