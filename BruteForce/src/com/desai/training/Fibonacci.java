package com.desai.training;

public class Fibonacci {
    public static void main(String args[]) {

        int n = 20;

        int[] lookup;
        lookup = new int[n+1];
        for (int i = 0 ; i < n+1; i ++) lookup[i] = -1;
        System.out.println(fibonacci(n, lookup));
        System.out.println();
        for (int i = 0; i < lookup.length; i++) {
            System.out.print(lookup[i] + ",");
        }

    }

    public static int fibonacci(int fib, int lookup[]) {

        if (lookup [fib] == -1) {

            if (fib <= 1) {
                lookup[fib] = fib;
            } else {
                lookup[fib] = fibonacci(fib - 1, lookup) + fibonacci(fib - 2, lookup);
            }
        }
        return lookup[fib];
    }
}
