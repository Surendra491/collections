package com.patterns;

public class Pattern02 {

    public static void main(String[] args){
        Pattern02 pattern02 = new Pattern02();
        pattern02.pattern02(5);
    }

    public void pattern02(int n){
        for (int row = 1; row <= n; row++){
            for (int col = 1; col <= n; col++){
                System.out.print(" *");
            }
            System.out.println();

        }
    }
}
