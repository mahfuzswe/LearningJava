//For a given set of Strings, print the largest string
// we'll use lexicographic order  --> aaabcd < aaace

//"apple", "mango", "banana"

//str1.compareTo(str2) ; output: 0 --> string equal
//                     ; output: <0 (-ve)--> string str1 < str2
//                     ; output: >0 (+ve)--> string str1 > str2

//ComparetoignoreCase --> 'A' == 'a'

public class printLargestString{



    public static void main(String args[]){
        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
}


//Time complexity: O(x*n)  //x = maximum letter length

