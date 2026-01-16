package com.patterns;

public class Pattern09 {

          //  *********
          //   *******
          //    *****
          //     ***
          //      *
    public static void main(String[] args){
        Pattern09 pattern09 = new Pattern09();
        pattern09.pattern09(5);
    }

    public void pattern09(int n){
        for (int row = 0; row <n; row++){
                for (int s = 0; s <row; s++) {
                        System.out.print(" ");
                }
                for (int col = 0; col < 2 * (n - row) -1; col++) {
                        System.out.print("*");
                }
                System.out.println();
            }
        }
    }

