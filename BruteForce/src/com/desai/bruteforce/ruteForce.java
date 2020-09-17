package com.desai.bruteforce;

class Max {


    public static void main(String[] args) {
        int number[] = {2,4,1,5,3,234,2,490,1};
        int maximum_index = maximum_index(number, number.length);
	    System.out.println("The maxinum number index= " +  maximum_index  + " with value in the array :" +number[maximum_index]);

    }

    public static int maximum_index( int input[], int length) {
        int max_val = Integer.MIN_VALUE;
        int max_index = 0;

        for ( int i = 0; i < length; i ++ ) {
            if ( max_val < input[i]) {
                max_val = input[i];
                max_index = i;
            }
        }
        return max_index;
    }
}
