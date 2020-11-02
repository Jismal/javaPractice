package javaDemo;

import java.util.Arrays;

public class JavaArrays {
    //Arrays can hold a fixed number of items of String,Int etc
    public static void main(String[] args) {
        //defining array with a capacity to hold 10 int values
        int[] myIntArray;
        myIntArray = new int[2];
        myIntArray[0] = 1000;
        myIntArray[1] = 100;
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[1]);
        // System.out.println(  myIntArray[11]); will give array out of bound exception
        //The Best way.......
        String[] myStr = {"car", "ship", "bike"};
        System.out.println("Array length = " + myStr.length);
        //Out put: Array length = 3
        for (int i = 0; i < myStr.length; i++) {
            System.out.println(myStr[i]);
        }
        Arrays.sort(myIntArray);

     for (int i=0;i<myIntArray.length;i++){
         System.out.println(myIntArray[i]);
     }
    }
}
