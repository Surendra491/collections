package com.patterns;

public class Pattern14 {

                 //      *********
                 //       *     *
                 //        *   *
                 //         * *
                 //          *

    public static void main(String[] args){
        Pattern14 pattern14 = new Pattern14();
        pattern14.pattern14(5);
    }

    public void pattern14(int n) {
        for (int row = 0; row < n; row++) {
            for (int s = 0; s < row; s++) {
                System.out.print(" ");
            }
            if (row == 0) {
                for (int col = 0; col < 2 * n - 1; col++) {
                    System.out.print("*");
                }
            }
            else if (row == n-1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int space = 0; space <2 * (n - row - 1) - 1; space++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

