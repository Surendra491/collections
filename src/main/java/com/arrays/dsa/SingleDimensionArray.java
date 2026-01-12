package com.arrays.dsa;

public class SingleDimensionArray {
    int[] arr = null;
    public static void main (String[] arg){

        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0,10);
        sda.insert(1,20);
        sda.insert(2,30);
        sda.insert(1,30);
        sda.insert(12,120);


        var firstElementArray = sda.arr[0]; //-------------> O(1)
        System.out.println(firstElementArray);
        var thirdElementArray = sda.arr[2]; //-------------> O(1)
        System.out.println(thirdElementArray);
        // Array index not there
        //var notExistLementArray = sda.arr[11]; //-------------> O(1)
        //System.out.println(notExistLementArray);

        System.out.println("=======================================================-Array Traversal-=============================");
        sda.traverseArray();
        System.out.println("=======================================================-Array Search-=============================");
        sda.searchInArray(30); //True case
        sda.searchInArray(99); //False case
        System.out.println("=======================================================-Delete Element in Array-=============================");
        sda.deleteValue(2);
        var notExistLementArray = sda.arr[2]; //-------------> O(1)
        System.out.println(notExistLementArray);

    }

    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i=0; i<arr.length; i++){
            arr[i] = Integer.MAX_VALUE;
        }
    }

    public void insert(int locationIndexOfArray, int valueToBeInserted) {
        try {
            if (arr[locationIndexOfArray] == Integer.MAX_VALUE) {
                arr[locationIndexOfArray] = valueToBeInserted;
                System.out.println("Successfully Inserted");
            } else {
                System.out.println("This cell already occupied");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array!");
        }
    }

    // Array Traversal

    public void traverseArray(){
        try{
            for (int i=0; i<arr.length; i++){ //-------------- O(n)
                System.out.print(arr[i]+ " "); //-------------- O(1)
            }
        }catch (Exception e){
            System.out.println("Array no longer exists!"); //-------------- O(1)
        }

    }

    // Search for an element in the given Array
    public void searchInArray(int valueToSearch){
        for (int i=0; i<arr.length; i++){ //----------> O(n)
            if(arr[i] == valueToSearch){ //----------> O(1)
                System.out.println("The value is found at the index of "+ i); //----------> O(1)
                return;
            }
        }
            System.out.println(valueToSearch+ " The given value is not found"); //----------> O(1)
    }

    // Deleting an Element in Array
    public void deleteValue(int valueToBeDeleteIndex) {
        try {
            arr[valueToBeDeleteIndex] = Integer.MIN_VALUE; //-------------> O(1)
            System.out.println("The value has been deleted successfully"); //-------------> O(1)

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array"); //-------------> O(1)
        }
    }
}
