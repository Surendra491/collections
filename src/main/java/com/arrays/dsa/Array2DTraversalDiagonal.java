package com.arrays.dsa;

//Given 2D array calculate the sum of diagonal elements.

public class Array2DTraversalDiagonal {
    public static void main(String[] args){
        Array2DTraversalDiagonal atd = new Array2DTraversalDiagonal();
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(atd.sumDiagonalElements(arr));
    }
    public int sumDiagonalElements(int[][] arr){
        int sum =0;
        for (int row=0; row<arr.length; row++){
            sum+= arr[row][row];
            }
        return sum;
    }
}
