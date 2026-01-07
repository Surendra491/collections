package com.basics.das;
/*
* Drop Constants
* */
public class DropConstant {

    public static void main(String[] args){
        printNumbers(10);
    }

        /*
        * For below method Time complexity
        * for the first loop O(N)
        * for the second loop O(N)
        *
        *  N + N = 2n
        * the time complexity become O(2n)
        *
        *  */

    public static void printNumbers(int n){
        for (int i=0; i<n; i++){
            System.out.println(i);
        }
        for (int j = 0; j<n; j++){
            System.out.println(j);
        }
    }

}
