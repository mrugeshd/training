package com.desai.training;

public class StrInterleave {

    public static void main(String[] args) {
        String str1 = "Mrugesh";
        String str2 = "Desai";
        String interleave = "MruDegesaish";

        if(checkInterLeave( str1, str2, interleave))
            System.out.println("String are interwoven" );
        else
            System.out.println("Strings are not");
    }

    static boolean checkInterLeave (String str1, String str2, String cs) {
        if (str1.length() + str2.length() == cs.length()) {
            for ( int csi = 0, str1i = 0, str2i =0 ; csi < cs.length() ; csi++) {

                if(str1i < str1.length() && str1.charAt(str1i) == cs.charAt(csi)) {
                    str1i++;
                } else if (str2i < str2.length() && str2.charAt(str2i) == cs.charAt(csi)) {
                    str2i++;
                } else {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }

    }




}
