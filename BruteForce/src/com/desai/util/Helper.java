package com.desai.util;

import java.util.ArrayList;

public class Helper {

    public static void printArray(int[] data) {
        for (int i = 0; i < data.length ; i++) {
            System.out.print(data[i]+",");
        }
        System.out.println();
    }

    public static void printArray(int[] data, int left, int right) {
        for (int i = left; i < right - 1 ; i++) {
            System.out.print(data[i]+",");
        }
        System.out.println();
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(ArrayList duplicates) {
        for (Object i : duplicates) System.out.println(i);
    }
}
