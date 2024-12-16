package org.sortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    public static void bubbleSort(int[] a) {
        // Sorts the provided list of integers using BubbleSort
         for (int i = 0; i < a.length; i++) {
             boolean swapped = false;
             for (int j = 0; j < a.length - i - 1; j++) {
                 if (a[j] > a[j+1]) {
                     // Elements at indices j and j+1 are in the wrong order.
                     int tmp = a[j];
                     a[j] = a[j+1];
                     a[j+1] = tmp;
                     swapped = true;
                 }
             }
             // If there was no swapping in the iteration, the list is sorted.
             if (!swapped) {
                 return;
             }
         }

    }
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            // Go through the array to find the smallest element.
            for (int k = i + 1; k < a.length; k++) {
                if (a[k] < a[minIndex]) {
                    minIndex = k;
                }
            }
            // Swap the smallest element with the first element in the unsorted part of the array
            if (minIndex != i) {
                int tmp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = tmp;
            }
        }

    }
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int e = a[i];
            int k = i;
            while (k > 0 && e < a[k - 1]) {
                a[k] = a[k - 1];
                k--;
            }
            a[k] = e;
        }
    }

    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        // Create a new list with sufficient capacity to store all elements in both provided lists.
        List<Integer> l = new ArrayList<>(list1.size() + list2.size());

        // Pick the smaller element from each list.
        while(!list2.isEmpty() && !list1.isEmpty()) {
            if (list1.getFirst() < list2.getFirst()) {
                l.addLast(list1.removeFirst());
            } else {
                l.addLast(list2.removeFirst());
            }
        }

        // Merge what's left of the lists
        while (!list1.isEmpty()) {
            l.addLast(list1.removeFirst());
        }
        while (!list2.isEmpty()) {
            l.addLast(list2.removeFirst());
        }

        return l;
    }

    // Returns a sublist containing the elements at index `i` to index `j`, inclusive.
    public static List<Integer> getElements(List<Integer> l, int i, int j) {
        if (j < i) {
            throw new IllegalArgumentException("Provided upper limit is less than the lower limit.");
        }
        if (j > l.size() - 1) {
            throw new IllegalArgumentException("Provided upper limit is greater than the size of the provided list.");
        }

        ArrayList<Integer> n = new ArrayList<>(j - i + 1);
        for (int k = i; k <= j; k++) {
            n.add(l.get(k));
        }
        return n;
    }

    public static void mergeSort(int[] a) {
        List<Integer> l = new ArrayList<Integer>();
        // Create a list of elements so it's easier to deal with.
        for (int e : a) {
            l.add(e);
        }

        List<Integer> sorted = mergeSortRecursive(l);

        // Update the list passed as an argument in-place
        for (int i = 0; i < a.length; i++) {
            a[i] = sorted.get(i);
        }

    }

    private static List<Integer> mergeSortRecursive(List<Integer> l) {
        if (l.size() <= 1) {
            return l;
        }

        int mid = (l.size() - 1) / 2;
        List<Integer> list1 = getElements(l , 0, mid);
        List<Integer> list2 = getElements(l, mid + 1, l.size() - 1);
        list1 = mergeSortRecursive(list1);
        list2 = mergeSortRecursive(list2);
        return merge(list1, list2);
    }
}
