package com.patterns;

public class Pattern11 {

               //    * * * * *
               //     * * * *
               //      * * *
               //       * *
               //        *

    public static void main(String[] args){
        Pattern11 pattern11 = new Pattern11();
        pattern11.pattern11(5);
    }

    public void pattern11(int n){
        for (int row = 0; row  < n; row++){
            for (int s =0; s< row;s++){
                System.out.print(" ");
            }
            for (int col =0; col< n-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }}
    }

