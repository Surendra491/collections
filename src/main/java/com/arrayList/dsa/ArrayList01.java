package com.arrayList.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList01 {

    public static void main(String [] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2); //-------------> time and space complexity: O(1)
        numbers.add(3);
        numbers.add(4);
        numbers.add(0,1);  //-------------> time complexity: O(N) but Space complexity: O(1)
        System.out.println(numbers);
        System.out.println(numbers.get(1)); // ------------> time and space complexity: O(1)




        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H"));
        stringList.remove(1);
        stringList.remove("H");
                System.out.println(stringList);
        }

}
