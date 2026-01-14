package com.patterns;


        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
public class Pattern04 {
    public static void main(String[] args){
        Pattern04 pattern04 = new Pattern04();
        pattern04.pattern04(5);

    }

    public void pattern04(int n){
        for (int row = 1; row<= n; row++){
            for (int col = 1; col<= row; col++){
                System.out.print(" "+ col);
            }
            System.out.println();
        }
    }
}
