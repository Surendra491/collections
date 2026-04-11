package com.problems;

public class TwoDArrayRotate90Degree {
    int [][] twoDArray = new int[3][3];
    int value =0;

    public void  assignValuesForArray (){
        for (int row = 0; row< twoDArray.length; row++){
            for (int col = 0; col< twoDArray[row].length; col++){
                value = value+1;
                twoDArray [row] [col] = value;
            }
        }
    }
    public void printArray(int [][] twoDArray ){
        for (int row = 0; row < twoDArray.length; row++){
            for (int col = 0; col<twoDArray[row].length; col++){
                System.out.print(twoDArray[row][col]+"|");

            }
            System.out.println();
            System.out.print("- - -");
            System.out.println();
        }
    }


    public static void main (String[] args){

        TwoDArrayRotate90Degree obj = new TwoDArrayRotate90Degree();

        obj.assignValuesForArray();
        obj.printArray(obj.twoDArray);
        obj.twoDArray90(obj.twoDArray);
        obj.printArray(obj.twoDArray);

    }

    void  twoDArray90(int [][] twoDArray){
        if (twoDArray.length == 0 || twoDArray.length != twoDArray[0].length){
            return;
        }
        int n = twoDArray.length;

        for (int row = 0; row < n/2; row++){
            int first = row;
            int last = n - 1 -row;
            for (int col = first; col < last; col++){
                int offset = col -first;
                int top = twoDArray [first][col];

                    //let -> top
                    twoDArray [first] [col] = twoDArray [last-offset] [first];

                    // bottom ->
                    twoDArray [last - offset] [first] = twoDArray [last] [last - offset];

                    //Right  -> bottom
                    twoDArray [last] [last - offset] = twoDArray [col] [last];

                    //top -> right
                    twoDArray [col] [last] = top;

            }
        }
    }

}
