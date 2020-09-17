package com.desai.training;

public class FindRotatedArray {

    public static void main(String args[]) {
        int dataArray[] = {7,8,9,0,1,2,3,4,5,6};

        int index = find(dataArray, 7);
        if (index != -1 ) {
            System.out.println(" The data element is at index: " + index);
        } else {
            System.out.println("Data element not found");
        }

    }

    private static int find(int[] dataArray, int target) {
        //find the place where we can split the array in two.
        int splitPoint = -1;
        for (int i = 0; i < dataArray.length - 1 ; i++) {
            if (dataArray[i] > dataArray [i+1]) {
                splitPoint = i;
                break;
            }
        }

        if (splitPoint == -1) {
            return Search.binarySearch(target, dataArray);
        }


        int returnIndex = Search.binarySearch(target,dataArray, 0, splitPoint);
        if (returnIndex == -1) {
            returnIndex = Search.binarySearch(target,dataArray, splitPoint+1, dataArray.length-1);
            return returnIndex;
        }
        // find in first array, using binary search
        // find in second array, using binary search
        return returnIndex;
    }


}
