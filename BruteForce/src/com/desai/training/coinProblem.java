package com.desai.training;

public class coinProblem {

    public static void main (String args[]) {
        int [] denom = {25,10,5,1};
        int amount = 11;
        System.out.println(countCoins(denom, denom.length, amount));

    }

    static int countCoins (int denom[], int length, int amount)  {

        if (amount  == 0 ) {
            System.out.println(denom[length - 1]);
            return 1;
        }

        if (amount < 0 || length <=0 ) return 0;

        if (length <= 0 && amount >= 1) return 0;

        return countCoins(denom, length - 1, amount) + countCoins(denom, length, amount - denom[length - 1]);

    }


}
