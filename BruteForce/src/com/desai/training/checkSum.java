package com.desai.training;

import com.desai.util.Helper;

public class checkSum {

    public static void main (String args[]) {

        int arr[] = {2, 21, 4, 5, 60, 3 };
        int sum = 6;
        int result[] = check_sum (arr, sum);
        Helper.printArray(arr);
        Helper.printArray(result);
    }

    private static int[] check_sum(int[] arr, int sum) {
        int result[] = {0,0};
        //check arr is empty
        // will the number be the

        for (int i = 0, index = -1 ; i < arr.length && index== -1 ; i ++) {

            index = Search.binarySearch(sum - arr[i], arr);
            if (index != -1 ) {
                result[0] = arr[i];
                result[1] = arr[index];

            }
        }

        return result;

    }

}
