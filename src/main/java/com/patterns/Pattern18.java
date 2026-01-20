package com.patterns;

public class Pattern18 {

/*

             **********
             ****  ****
             ***    ***
             **      **
             *        *
             *        *
             **      **
             ***    ***
             ****  ****
             **********

*/

    public static void main(String[] args){
        Pattern18 pattern18 = new Pattern18();
        pattern18.pattern18(5);
    }

    public void pattern18(int n) {
        for (int row = 0; row < 2 * n ; row++) {

            int columns = row < n ? n -row: row - n +1;
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

