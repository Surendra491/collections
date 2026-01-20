package com.patterns;

public class Pattern19 {

/*

         *        *
         **      **
         ***    ***
         ****  ****
         **********
         ****  ****
         ***    ***
         **      **
         *        *

*/

    public static void main(String[] args){
        Pattern19 pattern19 = new Pattern19();
        pattern19.pattern19(5);
    }

    public void pattern19(int n) {
        for (int row = 0; row < 2 * n -1; row++) {

            int columns = row < n ? row +1: 2*n -row -1;
            for (int col =0; col <2*n; col++){
                if(col<columns || col>= 2*n -columns) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
}

