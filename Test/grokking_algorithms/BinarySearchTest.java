package grokking_algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private final BinarySearch<Integer> binarySearch = new BinarySearch<>();

    @Test
    void testSearchWithList() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(2, binarySearch.search(list, 3)); // Target in the middle
        assertEquals(0, binarySearch.search(list, 1)); // Target is the first element
        assertEquals(4, binarySearch.search(list, 5)); // Target is the last element
        assertEquals(-1, binarySearch.search(list, 6)); // Target not found
    }

    @Test
    void testSearchWithEmptyList() {
        List<Integer> emptyList = List.of();
        assertEquals(-1, binarySearch.search(emptyList, 3)); // Searching in an empty list
    }

    @Test
    void testSearchWithSingleElementList() {
        List<Integer> singleElementList = List.of(5);
        assertEquals(0, binarySearch.search(singleElementList, 5)); // Target is the only element
        assertEquals(-1, binarySearch.search(singleElementList, 3)); // Target not found
    }

    @Test
    void testSearchWithArray() {
        Integer[] array = {1, 2, 3, 4, 5};
        assertEquals(2, binarySearch.search(array, 3)); // Target in the middle
        assertEquals(0, binarySearch.search(array, 1)); // Target is the first element
        assertEquals(4, binarySearch.search(array, 5)); // Target is the last element
        assertEquals(-1, binarySearch.search(array, 6)); // Target not found
    }

    @Test
    void testSearchWithEmptyArray() {
        Integer[] emptyArray = {};
        assertEquals(-1, binarySearch.search(emptyArray, 3)); // Searching in an empty array
    }

    @Test
    void testSearchWithSingleElementArray() {
        Integer[] singleElementArray = {5};
        assertEquals(0, binarySearch.search(singleElementArray, 5)); // Target is the only element
        assertEquals(-1, binarySearch.search(singleElementArray, 3)); // Target not found
    }

    @Test
    void testSearchWithDuplicates() {
        List<Integer> listWithDuplicates = Arrays.asList(1, 2, 2, 3, 4, 5);
        assertEquals(1, binarySearch.search(listWithDuplicates, 2)); // Target with duplicates
    }
}