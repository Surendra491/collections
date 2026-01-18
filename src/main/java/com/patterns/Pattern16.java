package com.patterns;

public class Pattern16 {


         //          1
         //        1   1
         //      1   2   1
         //     1   3   3   1
         //   1  4   6   4   1

    public static void main(String[] args){
        Pattern16 pattern16 = new Pattern16();
        pattern16.pattern16(5);
    }

    public void pattern16(int n) {
        for (int row = 0; row < n; row++) {

            int c =1;
            for (int s = 0; s <n- row; s++) {
                System.out.print(" ");
            }
           for (int i = 0; i <= row; i++ ){
               System.out.print(c+" ");
               c = c*(row - i)/(i +1);
           }

            System.out.println();
        }
    }
}

