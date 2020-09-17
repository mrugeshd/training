package com.desai.sorting;

import com.desai.util.Helper;

public class QuickSort {


    static int partition ( int arr[], int left, int right) {
        int pivot_index = right; //assume the right most element as a pivot element

        int i = left; // need to keep track of the pivot eventual position;
        // All elements lower than pivot will move to ith position of before i.

        int pivot = arr[pivot_index];

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                Helper.swap(arr, i, j);
                i++;
            }
            System.out.println("i = " + i + " j = " + j);
            Helper.printArray(arr);
        }

        Helper.swap(arr,i,pivot_index);

        return i;
    }

    static void sort (int[] data, int left, int right) {
        if ( left < right ) {
            int pivot = partition (data, left, right);
            System.out.println("Array after Partition, pivot position: " + pivot);
            Helper.printArray(data);

            sort(data, left, pivot -1) ;
            sort(data, pivot +1 , right);

        }

    }

    public static void main(String args[]) {
        int dataArray[] = {1,2,3,4,5,6,7};
        System.out.println("Array before sort");
        Helper.printArray(dataArray);
        sort(dataArray, 0, dataArray.length-1);
        System.out.println("Array after sort");
        Helper.printArray(dataArray);

    }


}
