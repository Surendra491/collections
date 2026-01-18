package com.patterns;

public class Pattern15 {
                 //          *
                 //         * *
                 //        *   *
                 //       *     *
                 //      *       *
                 //       *     *
                 //        *   *
                 //         * *
                 //          *

    public static void main(String[] args){
        Pattern15 pattern15 = new Pattern15();
        pattern15.pattern15(5);
    }

    public void pattern15(int n) {
        for (int row = 0; row < 2*n -1; row++) {

            int correntRow = row < n ? row: 2*n -row -2;

            for (int s = 0; s <n- correntRow -1; s++) {
                System.out.print(" ");
            }
            if (correntRow == 0) {
                    System.out.print("*");
            } else {
                System.out.print("*");
                for (int spaceI = 0; spaceI < 2*correntRow -1; spaceI++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

