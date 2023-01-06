// import java.util.*; --> includes all packages (functions, classes, interfaces..etc)

import java.util.Arrays;  //--> have to import this package
import java.util.Collections;

//Arrays.sort(arr) -->Syntax for Ascending order sorting
//Arrays.sort(arr,starting_index,ending_index)  --> ending index = joto porjonto sort korbo toto + 1;

//Time Complexity: O(n log n)

public class InbuiltSort {
    //print Array Function
    public static void printArr(Integer arr[]){
        for(Integer i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String args[]){
        Integer arr[] = {5,4,1,3,2};    // reverseOrder function always works on object

        //Arrays.sort(arr);

        // Arrays.sort(arr,0,3);

        // Arrays.sort(arr,Collections.reverseOrder());

        Arrays.sort(arr,0,3,Collections.reverseOrder());

        printArr(arr);

    }
}


// for Descending order sorting we use Collections

//import java.util.Collections;
//Arrays.sort(arr,Collections.reverseOrder())

//Arrays.sort(arr,si,ei,Collections.reverseOrder())

// int --> premitive data type ; where reverseOrder function don't work

