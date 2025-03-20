package sorting;

import java.util.Arrays;
// Partition Method:

// The i variable is initialized to s - 1 to correctly track the position where the next smaller element should be placed.

// The loop runs from s to e - 1 (excluding the pivot element).

// After the loop, the pivot element is placed in its correct position by swapping it with the element at i + 1.

// The method returns i + 1, which is the correct index of the pivot after partitioning.
public class QuickSort {
  static int partition(int[] a, int s, int e) {
    int pivot = a[e];
    int i = s - 1;
    for (int l = s; l < e; l++) {
      if (a[l] <= pivot) {
        i++;
        int temp = a[l];
        a[l] = a[i];
        a[i] = temp;
      }
    }
    int temp = a[i+1];
    a[i+1] = a[e];
    a[e] = temp;

    return i+1;
  }

  static void quickSort(int[] arr, int start, int end) {
    if (start >= end) {
      return;
    }
    int pIdx = partition(arr, start, end);
    quickSort(arr, start, pIdx - 1);
    quickSort(arr, pIdx + 1, end);

  }

  public static void main(String[] args) {
    int[] arr = { 3, 1, 2, 4, 1, 5, 6, 2, 4 };
    System.out.println("Before sorting");
    System.out.println(Arrays.toString(arr));
    quickSort(arr, 0, arr.length - 1);
    System.out.println("After sorting");
    System.out.println(Arrays.toString(arr));
  }

}
