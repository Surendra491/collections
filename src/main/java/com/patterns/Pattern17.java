package com.patterns;

public class Pattern17 {

            /*

           1
          212
         32123
        4321234
         32123
          212
           1

           */

    public static void main(String[] args){
        Pattern17 pattern17 = new Pattern17();
        pattern17.pattern17(4);
    }

    public void pattern17(int n) {
        for (int row = 1; row <= 2 * n -1; row++) {

            int c = row>n ? 2*n -row: row;

            for (int s = 0; s <n- c; s++) {
                System.out.print(" ");
            }
            for (int i = c;  i>=1 ; i --){
                System.out.print(i);
            }
            for (int j = 2; j<=c; j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

