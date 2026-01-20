package com.patterns;

public class Pattern25 {

/*

                 *****
                *   *
               *   *
              *   *
             *****
*/

    public static void main(String[] args){
        Pattern25 pattern25 = new Pattern25();
        pattern25.pattern25(5);
    }

    public void pattern25(int n) {
        for (int row = 0; row < n ; row++) {
            for (int i =0; i< n -row;i++){
                System.out.print(" ");
            }
            for (int col =0; col <n; col++){
                if (row == 0 || row ==n-1 || col ==0 || col == n-1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
    }
}

