import java.util.Scanner;

import java.util.*;

public class inputOutput {
    

    public static void main(String args[]){
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");

        //Strings are IMMUTABLE ***

        Scanner sc = new Scanner(System.in);
        String name;

        // name = sc.next();  //take input a word only
        name = sc.nextLine(); // take multiple words as input
        System.out.println(name);

    }
}
