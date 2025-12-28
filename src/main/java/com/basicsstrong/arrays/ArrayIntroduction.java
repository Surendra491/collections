package com.basicsstrong.arrays;

public class ArrayIntroduction {

    public static void main(String[] args){

        int a =12 ;

        /*
        *   Array is a collection of homogeneous (single type only) elements
        *   Array are indexed or positioning of array elements starts from zero
        *   When your creating an Array we must need to specify the size of array OR it will throw a compile time error
        *   We can create an array with the size of zero
        *
        *   As size it will take the character as well it will converts to integer
        * */

        int[] x = new int[1000];
        System.out.println(x.getClass().getName());

        int[] y = new int[0];
        int[] z = new int['A']; /* byte, short, char, int this data types we can give in array size*/

        int[] c = new int[-1]; /*this will create a Run  time error like Native Array size Exception*/

        int[] s = new int[0];
    }
}
