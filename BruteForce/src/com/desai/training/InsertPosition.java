package com.desai.training;

public class InsertPosition {

    public static void main(String args[]) {
        int data[] = {1,2,3,4,56,57,58,59,70,100,101,103,1004};
        int target = 1004;

        System.out.println("Index to insert target is : " + findInsertPos(data, target));
    }

    static int findInsertPos (int[] data, int target) {
        //sanity check for array..

        //use binary search.
        //instead of exact match, look for index with data[i] >= target < data[i+1]
        int left = 0;
        int right = data.length - 1;
        int mid = 0;

        while (left <= right) {
            mid = (left + right ) / 2;
            if (mid == 0 && data[mid] >= target) return mid;
            if (mid == data.length -1 && data[mid] <= target) return mid + 1;
            if (data[mid] <= target && target < data[mid+1] ) return mid+1;

            if (target < data[mid] ) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return -1;
    }
}
