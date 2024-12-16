# Sorting Algorithms

An implementation of the major sorting algorithms in Java.

## Bubble Sort

Best Case: O(n) (The list is already sorted).

Worst Case: O(n^2) (The list is in reverse order).

After one iteration:
- The smallest element is anywhere except for index `n - 1`.
- After the `i`th iteration, the `i`th largest element is in the correct position.

## Selection Sort

- Separate the array into a sorted part and an unsorted part.
- Put the first element of the array into the sorted part.
- Select the smallest element in the unsorted part of the list.
- _Swap_ the selected element with the first element in the unsorted part of the list.
- Extended the length of the sorted part of the list by one.
- Continue until the length of the unsorted part of the list is 1.

Best Case: O(n^2)

Worst Case: O(n^2)

## Insertion Sort

Best Case: O(n) (the list is already sorted).

Worst Case: O(n^2) (the list is in reverse order).