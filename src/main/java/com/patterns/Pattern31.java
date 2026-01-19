package com.patterns;

public class Pattern31 {
/*

            4 4 4 4 4 4 4
            4 3 3 3 3 3 4
            4 3 2 2 2 3 4
            4 3 2 1 2 3 4
            4 3 2 2 2 3 4
            4 3 3 3 3 3 4
            4 4 4 4 4 4 4
*/

    public static void main(String[] args){
        Pattern31 pattern31 = new Pattern31();
        pattern31.pattern31(4);
    }

    public void pattern31(int n) {
        int oN= n;
        n= 2*n;
        for (int row = 0; row <=n; row++) {

            for (int i = 0;  i<= n; i ++){

                int atEveryIndex =oN - Math.min(Math.min(row,i), Math.min(n-row,n-i));
                System.out.print(" "+atEveryIndex);
            }

            System.out.println();
        }
    }
}

