import java.util.Scanner;

//Write a program to find the factorial of any number 
//entered by the user

public class AQ_03 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num; // to hold number
        int fact = 1; // to hold factorial

        System.out.print("Enter any positive integer: ");
        num = sc.nextInt();

        for(int i=1; i<=num; i++){
            fact *= i;
        }
        System.out.println("Factorial is: "+fact);
    }
}
