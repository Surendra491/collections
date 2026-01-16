package com.patterns;

public class Pattern12 {

               //       * * * * *
               //        * * * *
               //         * * *
               //          * *
               //           *
               //           *
               //          * *
               //         * * *
               //        * * * *
               //       * * * * *

    public static void main(String[] args){
        Pattern12 pattern12 = new Pattern12();
        pattern12.pattern12(5);
    }

    public void pattern12(int n){
        for (int row = 0; row  < 2*n; row++){
            int totalCol= row < n ? n-row: row- n +1;
            int noOfSpace = row < n ? row: 2* n - row -1;
            for (int s =0; s< noOfSpace;s++){
                System.out.print(" ");
            }
            for (int col =0; col< totalCol; col++){
                System.out.print("* ");
            }
            System.out.println();
        }}
    }

