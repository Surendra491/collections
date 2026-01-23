package com.patterns;

public class Pattern23 {

/*

       ****
       *  *
       *  *
       *  *
       ****

*/

    public static void main(String[] args){
        Pattern23 pattern20 = new Pattern23();
        pattern20.pattern20(5);
    }

    public void pattern20(int n) {
        for (int row = 0; row < n ; row++) {
            for (int col =0; col <n-1; col++){
                if (row == 0 || row ==n-1 || col ==0 || col == n-2) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
    }
}

