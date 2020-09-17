package com.desai.bruteforce;

public class FindNum {

    public static void main(String[] args) {
        int number[] = {2,4,1,5,3,234,2,490,1};
        int number_index = find_number(number, 420);
        if (number_index >= 0)
            System.out.println("The number is found at index= " +  number_index );
        else
            System.out.println("The number not found" );

    }

    private static int find_number(int[] number, int number_to_find) {
        if (number == null || number.length == 0)
            return -1;
        //if we have a valid array, letslook or the number
        for (int i = 0 ; i< number.length; i ++) {
            if (number_to_find == number[i]) return i;
        }
        return -1;
    }
}
