package D_Methods;

import java.util.Arrays;

public class MergeSort{

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Before: " + Arrays.toString(arr));
        mergeSort(arr); // sort in-place
        System.out.println("After:  " + Arrays.toString(arr));
    }

    // Public entry: sorts the whole array
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        mergeSort(arr, 0, arr.length - 1);
    }

    // Recursively split [l..r], then merge
    private static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return; // base case: one element
        int m = l + (r - l) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    }

    // Merge two sorted halves: [l..m] and [m+1..r]
    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) left[i] = arr[l + i];
        for (int j = 0; j < n2; j++) right[j] = arr[m + 1 + j];

        // Merge back to arr[l..r]
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements (if any)
        while (i < n1) arr[k++] = left[i++];
        while (j < n2) arr[k++] = right[j++];
    }
}

