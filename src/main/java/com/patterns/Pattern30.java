package com.patterns;

public class Pattern30 {


     //                    1
     //                  2 1 2
     //                3 2 1 2 3
     //              4 3 2 1 2 3 4
     //            5 4 3 2 1 2 3 4 5

    public static void main(String[] args){
        Pattern30 pattern30 = new Pattern30();
        pattern30.pattern30(5);
    }

    public void pattern30(int n) {
        for (int row = 1; row <=n; row++) {

            for (int s = 0; s <n- row; s++) {
                System.out.print("  ");
            }
            for (int i = row;  i>=1 ; i --){
                System.out.print(" "+i);
            }
            for (int j = 2; j<=row; j++ ){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}

