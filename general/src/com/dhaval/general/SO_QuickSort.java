/**
 * 
 */
package com.dhaval.general;

/**
 * @author a611021
 *
 */
public class SO_QuickSort {

	public void quickSort(int[] a, int low, int high) {
        if (a == null || a.length == 0)
                return;

        if (low >= high)
                return;

        int pivotIndex = partition( a, low, high );
        quickSort(a, low, pivotIndex-1);
        quickSort(a, pivotIndex, high);
    }

    public int partition ( int[] a, int low, int high )
    {
        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = a[middle];

        while (low <= high) {
            while (a[low] < pivot) {
                    low++;
            }

            while (a[high] > pivot) {
                    high--;
            }

            if (low <= high) {
                    swap( a, low, high );
                    low++;
                    high--;
            }
        }

        return low;
    } 
}
