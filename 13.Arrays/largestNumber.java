//find the largest number in a given array

import java.util.*;

public class largestNumber {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is: "+ smallest);

        return largest;
    }


    public static void main(String args[]){
        int numbers[] = {1,7,4,6,3,5};
        System.out.println("Largest value is: "+getLargest(numbers));

    }
}
