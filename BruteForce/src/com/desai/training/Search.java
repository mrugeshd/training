package com.desai.training;

import com.desai.sorting.MergeSort;
import com.desai.util.Helper;

public class Search {

    static int binarySearch (int target, int[] dataArray, int left, int right) {

        if (dataArray == null)
            return -1;
        if (dataArray.length == 0)
            return -1;

        int start = left, end = right;
        int mid = (end - start ) / 2;

        while ( end >= start) {
            System.out.println(" start = " + start + " mid = " + mid + " end = " + end + " s = " + target +
                    " arr[mid] = " + dataArray[mid]);
            if ( target == dataArray[mid]) return mid;
            else if ( target < dataArray[mid]) {
                end = mid -1; // left half
            }
            else start = mid + 1; //right half

            mid = (end + start ) / 2;
        }
        return -1;

    }

    static int binarySearch(int s, int arr[]) {
        return binarySearch(s,arr, 0, arr.length -1);
    }


    // Driver code to test the function
    public static void main(String args[]) {
        Helper helper = new Helper();
        int dataArray[] = {-100,1,2,33,335,915,994,2000};
        int arrSize = 10;
        int key = 00;

        System.out.println("Before Merge Sort");
        helper.printArray(dataArray);
        MergeSort.mergeSort(dataArray, 0, dataArray.length -1);
        System.out.println("After Merge Sort");
        helper.printArray(dataArray);


        int index = binarySearch(key, dataArray);
        if (index != -1)
            System.out.println("Your Key \"" + key + "\" is found at index \"" + index + "\"");
        else
            System.out.println("Your Key \"" + key + "\" not found in the array: ");

    }
}