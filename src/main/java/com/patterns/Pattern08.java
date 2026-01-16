package com.patterns;

public class Pattern08 {

          //      *
          //     ***
          //    *****
          //   *******
          //  *********

    public static void main(String[] args){
        Pattern08 pattern08 = new Pattern08();
        pattern08.pattern08(5);
    }

    public void pattern08(int n){
        for (int row = 0; row  < n; row++){
            for (int s =0; s< n-row-1;s++){
                System.out.print(" ");
            }
            for (int col =0; col< 2 * row +1; col++){
                System.out.print("*");
            }
            System.out.println();
        }}
    }

