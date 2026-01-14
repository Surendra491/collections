package com.patterns;

public class Pattern01 {
    //*
    //* *
    //* * *
    //* * * *

    public static void main(String[] args){
        Pattern01 patter01 =new Pattern01();
        patter01.pattern01(4);

    }

    public void pattern01(int n){
            for (int row=1;row<=n;row ++){
                for (int col=1; col<=row; col++){
                    System.out.print(" *");
                }
                System.out.println();

            }
    }
}
