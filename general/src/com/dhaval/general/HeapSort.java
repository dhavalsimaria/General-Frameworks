/**
 * 
 */
package com.dhaval.general;

/**
 * @author a611021
 *
 */
public class HeapSort {

    /** Driver function*/
    public static void main(String args[]) {
        int arr[] = { 2, 5, 7, 9, 1, 8 };

        HeapSort hsObj = new HeapSort();
        hsObj.sort(arr);

        System.out.println("Sorted array: ");
        hsObj.display(arr);
    }

    /** Utility function to print array */
    public void display(int arr[]) {

        int n = arr.length;

        for (int i = 0; i <= n - 1; i++)
            System.out.print(arr[i] + " ");

    }

    public void sort(int arr[]) {

        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {

            System.out.println("CURRENT arr[0]: " + arr[0] + " arr[i]: " + arr[i]);
            // Move current root to end
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            System.out.println("RECENT arr[0]: " + arr[0] + " arr[i]: " + arr[i]);
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {

        int largest = i; /** Initialize largest as root node */
        int l = 2 * i + 1; /** Left node */
        int r = 2 * i + 2; /** Right node */

        System.out.println("Present largest: " + largest + ", l: " + l + ", r: " + r + "\n");

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[largest];
            arr[largest] = arr[i];
            arr[i] = swap;

            heapify(arr, n, largest);
        }
    }
}
