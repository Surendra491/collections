package com.arrays.dsa;

import java.util.Arrays;

public class Array01 {
        public static void main(String[] args){
            int[] intArray; //---------------------------------------------> O91)  }
            intArray = new int[3]; //--------------------------------------> O91)  }
            intArray[0] =1; //---------------------------------------------> O91)  }   O(n)
            intArray[1] =2; //---------------------------------------------> O91)  }
            intArray[2] =3; //---------------------------------------------> O91)  }

            System.out.println(Arrays.toString(intArray));
            /*for (int i =0; i < intArray.length; i++){
                System.out.println(intArray[i]);
            }*/

            // All together
            int[] intArr01 = {1,2,3}; //----------------------> O(1)
            String[] strArray = {"Allu Arjun", "Maheshbabu","Prabash","NTR"};
        }
}
