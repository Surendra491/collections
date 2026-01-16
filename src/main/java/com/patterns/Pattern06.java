package com.patterns;

public class Pattern06 {

    //      *
    //     **
    //    ***
    //   ****
    //  *****


    public static void main(String[] args){
        Pattern06 pattern06 = new Pattern06();
        pattern06.pattern06(5);
    }



    public void pattern06(int n){
        for (int row = 1; row <= n; row++){
            for (int s =1; s<=n - row;s++){
                System.out.print(" ");
            }
            for (int col =1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
