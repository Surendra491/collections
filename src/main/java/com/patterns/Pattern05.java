package com.patterns;

public class Pattern05 {
            // *
            // **
            // ***
            // ****
            // *****
            // ****
            // ***
            // **
            // *

    public static void main(String[] args){
        Pattern05 pattern05 = new Pattern05();
        pattern05.pattern05(5);
    }

    public void pattern05(int n){
        for (int row = 0; row < 2*n; row++){
            int Totalcol = row > n ? 2*n-row: row;
           for ( int col =0; col< Totalcol; col++){
                System.out.print(" *");
            }
            System.out.println(row);
        }
    }
}
