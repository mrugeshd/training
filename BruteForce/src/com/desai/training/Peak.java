package com.desai.training;

import com.desai.util.Helper;

public class Peak {

    public static void main ( String args[] ) {
        int input[] = {-1,12,3,14,-5,6,67,8,9};
        int result = closest(input, -4);
        System.out.println(" Closest Number =" + result);



    }


    static int closest (int input[], int target) {
        int currClosest = -1;
        int currDiff = Integer.MAX_VALUE;
        int diff = 0;
        for (int i = 0 ; i < input.length; i ++) {
            System.out.println(" CurrentDiff = " + currDiff + " Current Closest =  " + currClosest);
            diff = Math.abs(input[i] - target);
            if (diff < currDiff) {
                currDiff = diff;
                currClosest = input[i];
            }
        }
        return currClosest;
    }



}
