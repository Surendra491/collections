package com.patterns;

public class Pattern28 {



     //           *
     //          * *
     //         * * *
     //        * * * *
     //       * * * * *
     //        * * * *
     //         * * *
     //          * *
     //           *
    public static void main(String[] args){
        Pattern28 pattern28= new Pattern28();
        pattern28.pattern28(5);
    }

    public void pattern28(int n){
        for (int row = 0; row <= 2*n; row++){
            int totalCol = row>n? 2*n-row:row;
            int noOfSpace = n - totalCol;
            for (int spa=0; spa<noOfSpace; spa ++){
                System.out.print(" ");
            }

            for (int col =0; col< totalCol ; col++){
                System.out.print(" *");

            }
            System.out.println();

        }


    }
}
