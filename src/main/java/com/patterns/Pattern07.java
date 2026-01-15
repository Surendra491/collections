package com.patterns;

public class Pattern07 {
                //  *****
                //  ****
                //  ***
                //  **
                //  *
    public static void main(String[] args){
        Pattern07 pattern07 = new Pattern07();
        pattern07.pattern07(5);
    }



    public void pattern07(int n){
        for (int row = 0; row < n; row++){
            for (int s =0; s<=row; s++){
                System.out.print(" ");
            }
            for (int col =0; col<n -row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
