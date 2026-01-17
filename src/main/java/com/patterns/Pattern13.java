package com.patterns;

public class Pattern13 {

               //           *
               //          * *
               //         *   *
               //        *     *
               //       *********

    public static void main(String[] args){
        Pattern13 pattern13 = new Pattern13();
        pattern13.pattern13(5);
    }

    public void pattern13(int n) {
        for (int row = 0; row < n; row++) {
            for (int s = 0; s < n - row - 1; s++) {
                System.out.print(" ");
            }
            if (row == n - 1) {
                for (int col = 0; col < 2 * n - 1; col++) {
                    System.out.print("*");
                }
            }
            else if (row == 0) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int space = 0; space < 2 * row - 1; space++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

