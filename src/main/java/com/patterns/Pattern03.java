package com.patterns;

public class Pattern03 {
            // *****
            // ****
            // ***
            // **
            // *
    public static void main(String[] args){
        Pattern03 pattern03 = new Pattern03();
        pattern03.pattern03(4);

    }

    public void pattern03(int n){
        for (int row = 1; row<= n; row++){
            for (int col = 1; col<= n-row+1; col++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
