import java.util.Scanner;
// check a Java program to check if a number is a palindrome or not

public class AQ_03_palinedrome {
    public static boolean isPalindrome(int number){
        int palinedrome = number; // copied number into variable
        int reverse = 0;

        while(palinedrome != 0){
            int remainder = palinedrome % 10;
            reverse = reverse * 10 + remainder;
            palinedrome = palinedrome/10;
        }
        // if original and the reverse of number is equal means
        // number is palinedrome in Java
        if(number == reverse){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String args[]){
        System.out.print("Please Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int palinedrome = sc.nextInt();

        if(isPalindrome(palinedrome)){
            System.out.println(palinedrome+" is a palindrome number" );
        }else{
            System.out.println(palinedrome+" is not a palindrome number");
        }
    }
}
