package com.problems;

public class CalculateSumOfProductsArray {

    public static void main(String[] args){

    }

    void SumOfProductArray(int[] array){
        int sumOfProducts = 0;
        int countOfProducts = 1;

        for (int i = 0; i < array.length; i++){
            sumOfProducts += array[i];
        }
    }
}
