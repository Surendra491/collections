package com.patterns;

public class Pattern10 {

             //          *
             //         * *
             //        * * *
             //       * * * *
             //      * * * * *

    public static void main(String[] args){
        Pattern10 pattern10 = new Pattern10();
        pattern10.pattern10(5);
    }

    public void pattern10(int n){
        for (int row = 0; row  < n; row++){
            for (int s =0; s< n-row-1;s++){
                System.out.print(" ");
            }
            for (int col =0; col<=row; col++){
                System.out.print(" *");
            }
            System.out.println();
        }}
    }

