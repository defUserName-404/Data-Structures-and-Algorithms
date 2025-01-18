package grokking_algorithms;

import java.util.List;

public final class BinarySearch<T extends Comparable<T>> {

    /**
     * @param array  List of sorted elements
     * @param target element
     * @return index of the first found element, -1 if not found
     */
    public int search(List<T> array, T target) {
        int low = 0;
        int high = array.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            T midVal = array.get(mid);
            if (midVal.compareTo(target) < 0) {
                low = mid + 1;
            } else if (midVal.compareTo(target) > 0) {
                high = mid - 1;
            } else {
                result = mid;
                high = mid - 1;
            }
        }
        return result;
    }

    /**
     * @param array  Array of sorted elements
     * @param target element
     * @return index of the first found element, -1 if not found
     */
    public int search(T[] array, T target) {
        int low = 0;
        int high = array.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            T midVal = array[mid];
            if (midVal.compareTo(target) < 0) {
                low = mid + 1;
            } else if (midVal.compareTo(target) > 0) {
                high = mid - 1;
            } else {
                result = mid;
                high = mid - 1;
            }
        }
        return result;
    }

}
