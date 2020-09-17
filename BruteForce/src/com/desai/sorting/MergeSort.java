package com.desai.sorting;

public class MergeSort {

    public static void mergeSort(int data[], int left_index, int right_index ) {
        if ( data == null ) return;
        if ( data.length == 0 ) return;

        int mid_index = 0;

        printArray(data);

        if (right_index > left_index)  {
            mid_index = (left_index + right_index) / 2; // calculate the mid point
   //         System.out.println("Left_index = " + left_index + " Mid_index = " + mid_index + " Right_index = " + right_index );


     //       System.out.println(" MergeSort left" );
            mergeSort(data, left_index, mid_index); // left half of the array
       //     System.out.println(" MergeSort right" );
            mergeSort(data, mid_index+1, right_index); // right half of the array
         //   System.out.println(" Merge" );
            merge(data, left_index, mid_index, right_index); // merge the sorted array
           // System.out.println(" Post Merge" );
            printArray(data);
        }
    }

    static void merge( int data[], int left_index, int mid_index, int right_index) {
        int left_array_size = mid_index - left_index + 1;
        int right_array_size = right_index - mid_index;


        //allocate temp arrays.
        int left_array[] = new int[left_array_size];
        int right_array[] = new int[right_array_size];

        //copy both the arrays
        for (int i = 0 ; i < left_array_size ; i ++) {
            left_array[i] = data[left_index + i];
        }
        for (int i = 0 ; i < right_array_size; i ++) {
            right_array [i] = data[i + mid_index + 1];
        }

        //Merge the elements, lowest first.
        int i = 0, j = 0, k = left_index;
        while (i < left_array_size && j < right_array_size) {


            if (left_array[i] < right_array[j]) {
                data[ k] = left_array [i];
                i++;

            } else {
                data[ k] = right_array [j];
                j++;

            }
            k++;

        }

        while (i < left_array_size) {
            data[ k] = left_array [i];
            i++; k++;
        }

        while (j < right_array_size) {
            data[ k] = right_array [j];
            j++; k++;
        }

    }

    static void printArray(int[] data) {
        for (int i = 0; i < data.length ; i++) {
            System.out.print(data[i]+",");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int dataArray[] = {8,300,-1,4,5,2,1,8,200,0};
        MergeSort.mergeSort(dataArray,0,dataArray.length-1);
    }

}
