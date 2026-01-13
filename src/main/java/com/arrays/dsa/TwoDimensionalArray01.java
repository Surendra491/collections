package com.arrays.dsa;

import java.util.Arrays;

public class TwoDimensionalArray01 {

    int arr[][] =null;

    public static void main(String[] arg){

        TwoDimensionalArray01 tda= new TwoDimensionalArray01(3,3);
        tda.insertValueInTheArray(0,0,22);
        //tda.insertValueInTheArray(0,0,32);
        System.out.println(Arrays.deepToString(tda.arr));

        System.out.println("=========================-Access Element in  2D Array-============================");
        tda.accessCell(5,5);// False case
        tda.accessCell(0,0);// False case

        System.out.println("=========================-Array Travels-============================");
        tda.traverse2DArray();
        System.out.println("=========================-2D Array search-============================");
        tda.searchingValueIn2DArray(22); // true case
        tda.searchingValueIn2DArray(222); // false case
        System.out.println("=========================-2D Array Delete-============================");
        tda.deleteElementIn2DArray(0,0);
        tda.traverse2DArray();



    }

    //Constructor
    public TwoDimensionalArray01(int numberOfRows, int NumberOfColumns){
        this.arr = new int[numberOfRows][NumberOfColumns]; //-----------> O(1)
        for (int row=0; row <arr.length; row++){            //-----------> O(n)
            for (int col = 0; col<arr[0].length; col++){ //-----------> O(n)
                arr[row][col] = Integer.MIN_VALUE;  //-----------> O(1)
            }
        }
    }

    //Inserting value in array

    public void insertValueInTheArray(int indexOfRow, int indexOfCol, int valueToBeInsert){

        try {
            if(arr[indexOfRow][indexOfCol] == Integer.MIN_VALUE){ //-----------> O(1)
                arr[indexOfRow][indexOfCol] = valueToBeInsert;     //-----------> O(1)
                System.out.println("The value is successfully inserted"); //-----------> O(1)
            }else {
                System.out.println("The cell is already occupied"); //-----------> O(1)
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index for 2D Array"); //-----------> O(1)
        }

    }

    //Inserting value in the Array
    public void accessCell(int rowIndex,int colIndex){
        System.out.println("\nAccessing Row#"+rowIndex+"Colum#"+ colIndex); //-----------> O(n)
        try{
            System.out.println("Cell value is: "+arr [rowIndex] [colIndex]); //-----------> O(n)
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index for 2D Array"); //-----------> O(1)
        }
    }

    //Traversal 2d Array
    public void traverse2DArray(){
        try{
            for (int row =0; row< arr.length; row ++){ //-----------> O(M)
                for (int col = 0; col <arr[0].length; col++){ //-----------> O(n)
                    System.out.println("Traversal: "+arr[row][col]); //-----------> O(1)
                }

            }        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index for 2D Array"); //-----------> O(1)
        }
    }

    // Search element in 2D Array
    public void searchingValueIn2DArray(int searchValue) {
        try {
            for (int row =0; row< arr.length; row ++){ //-----------> O(M)
                for (int col = 0; col <arr[0].length; col++){ //-----------> O(n)
                    if (arr[row] [col] == searchValue){  //-----------> O(1)
                        System.out.println("The value found at row: "+row + " column: "+ col); //-----------> O(1)
                        return;
                    }
                }
            }
            System.out.println("The give search value not found"); //-----------> O(1)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index for 2D Array"); //-----------> O(1)
        }
    }

    // Deleting Element in 2D Array
    public void deleteElementIn2DArray(int rowIndex,int colIndex){
        try {
            System.out.println("Successfully deleted value :"+arr[rowIndex] [colIndex]); //-----------> O(1)
            arr[rowIndex] [colIndex] = Integer.MIN_VALUE; //-----------> O(1)
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index for 2D Array"); //-----------> O(1)
        }
    }
}
