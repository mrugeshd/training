package com.desai.training;

import com.desai.util.Helper;

import java.util.ArrayList;
import java.util.HashMap;

public class findDuplicates
{
    public static void main(String args[]) {
        int input[] = {1,2,3,4,3,4,3,5,100,500,200,100};
        int output[] = {};
        ArrayList duplicates = findDupes(input) ;
        Helper.printArray(duplicates);
    }

    private static ArrayList findDupes(int[] input) {
        ArrayList<Integer>output = new ArrayList<Integer>();
        HashMap <Integer, Integer> duplicateCount = new HashMap<Integer, Integer>();
        for (int i = 0 ; i < input .length ; i++) {
            if (duplicateCount.containsKey(input[i])) {
                duplicateCount.computeIfPresent(input[i], (key, val) -> val + 1);
            } else {
                duplicateCount.put(input[i],1);
            }
        }
        for (Integer num : duplicateCount.keySet()) {
            if (duplicateCount.get(num) > 1) {
                output.add(num);
            }
        }
        return output;

    }


}
