import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.sortingAlgorithms.Sort;

public class TestSort {
    @Test
    void testBubbleSort() {
        int[] a = {5, 1, 4, 2, 8};
        Sort.bubbleSort(a);
        int[] b = {1, 2, 4, 5, 8};
        assertArrayEquals(a, b);

        a = new int[] {5, 4, 3, 2, 1};
        Sort.bubbleSort(a);
        b = new int[] {1, 2, 3, 4, 5};
        assertArrayEquals(a, b);

        a = new int[] {7, 4, 1, 8, 3, 9};
        Sort.bubbleSort(a);
        b = new int[] {1, 3, 4, 7, 8, 9};
        assertArrayEquals(a, b);

        a = new int[] {30, 2, 7, 9, 2, 5, 25};
        Sort.bubbleSort(a);
        b = new int[] {2, 2, 5, 7, 9, 25, 30};
        assertArrayEquals(a, b);

        a = new int[] {2, 3, 5, 7, 8, 2, 1, 21, 43, 83};
        Sort.bubbleSort(a);
        b = new int[] {1, 2, 2, 3, 5, 7, 8, 21, 43, 83};
        assertArrayEquals(a, b);

        a = new int[] {5, 3, 2, 6, 7, 8, 43, 21, 83, 2, 1};
        Sort.bubbleSort(a);
        System.out.println(a);
    }

    @Test
    void testSelectionSort() {
        int[] a = {5, 1, 4, 2, 8};
        Sort.selectionSort(a);
        int[] b = {1, 2, 4, 5, 8};
        assertArrayEquals(a, b);

        a = new int[] {7, 4, 1, 8, 3, 9};
        Sort.selectionSort(a);
        b = new int[] {1, 3, 4, 7, 8, 9};
        assertArrayEquals(a, b);

        a = new int[] {8, 2, 3, 2, 4, 5};
        Sort.selectionSort(a);
        b = new int[] {2, 2, 3, 4, 5, 8};
        assertArrayEquals(a, b);

        a = new int[] {1, 2, 7, 8, 9, 7, 10, 3, 8};
        Sort.selectionSort(a);
        b = new int[] {1, 2, 3, 7, 7, 8, 8, 9, 10};
        assertArrayEquals(a, b);

        a = new int[] {30, 2, 7, 9, 2, 5, 25};
        Sort.selectionSort(a);
        b = new int[] {2, 2, 5, 7, 9, 25, 30};
        assertArrayEquals(a, b);

        a = new int[] {5, 3, 2, 6, 7, 8, 43, 21, 83, 2, 1};
        Sort.selectionSort(a);
        System.out.println(a);
    }

    @Test
    void testInsertionSort() {
        int[] a = {5, 1, 4, 2, 8};
        Sort.insertionSort(a);
        int[] b = {1, 2, 4, 5, 8};
        assertArrayEquals(a, b);

        a = new int[] {5, 3, 2, 6, 7, 8, 43, 21, 83, 2, 1};
        Sort.insertionSort(a);
        b = new int[] { 1, 2, 2, 3, 5, 6, 7, 8, 21, 43, 83 };
        assertArrayEquals(a, b);

        a = new int[] {5, 3, 7, 10, 9, 2, 3, 5, 1};
        Sort.insertionSort(a);
        b = new int[] {1, 2, 3, 3, 5, 5, 7, 9, 10};
        assertArrayEquals(a, b);

        a = new int[] {30, 2, 7, 9, 2, 5, 25};
        Sort.insertionSort(a);
        b = new int[] {2, 2, 5, 7, 9, 25, 30};
        assertArrayEquals(a, b);
    }

    @Test
    void testMergeSort() {
        int[] a = {5, 1, 4, 2, 8};
        Sort.mergeSort(a);
        int[] b = {1, 2, 4, 5, 8};
        assertArrayEquals(a, b);
    }
}
