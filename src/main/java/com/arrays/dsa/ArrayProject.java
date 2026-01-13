package com.arrays.dsa;

import java.util.Scanner;

public class ArrayProject {

    public static void main(String[] arg){
        ArrayProject arrayProject =new ArrayProject();
        arrayProject.calculateAverageTemperature();
    }

    public void calculateAverageTemperature(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please inter number of days");
        int noDays = scanner.nextInt();
        float[] temperature = new float[noDays];
        float sum = 0;
        for (int i = 0; i<temperature.length; i++){
            System.out.println("Please inter high temperature of the days :" + (i+1));
            temperature[i] = scanner.nextFloat();
            sum  += temperature[i];
        }
        sum = sum / noDays;
        System.out.println("Average temperature: "+ sum);
        int count=0;
        for (int i =0; i<temperature.length; i++){
           if (temperature[i]< sum){
            count++;
        }
        }
        System.out.println(count+" days above average");
    }
}
