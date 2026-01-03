package com.basics.das;


    // Linear Time complexity O(n)
public class Linear {
    public static void main(String[] args){
        printNumbers(10);
    }

    public static void printNumbers(int n){
        for (int i=0; i<n; i++){
            System.out.println(i);
        }
    }
}
