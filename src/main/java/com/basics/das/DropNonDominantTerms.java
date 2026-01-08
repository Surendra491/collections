package com.basics.das;

public class DropNonDominantTerms {


    public static void main(String[] args){
        printNumbers(10);
    }

    /*
     * For below method Time complexity
     *
     *  N * N = n2
     * the time complexity become O(n2)
     *
     * EX:  N * N * N = N3 O(n3) + O(n)
     *
     *  */

    public static void printNumbers(int n){
        for (int i=0; i<n; i++){
            for (int j = 0; j<n; j++){
                System.out.println(i+" "+j);
            }
        }
        for (int k =0; k<n; k++){
            System.out.println("K :"+k);
        }


    }
}
