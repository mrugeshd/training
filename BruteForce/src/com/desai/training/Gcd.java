package com.desai.training;

public class Gcd {

    static int findGCD ( int a, int b) {
        System.out.println(" A = " + a + " B = " + b);
        if (a == 0) return b;
        int temp = b % a;
        return findGCD( temp, a) ;
    }

    public static void main ( String args []) {
        int smallX = 15 ;
        int bigY = 1025;
        System.out.print("GCD is " + findGCD(smallX, bigY));
    }

}
