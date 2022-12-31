//Check a number is prime or not

import java.util.Scanner;

public class primeORnot_Optimize {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         if(n==2){
            System.out.println("2 is a prime number");
         }else{
            boolean isPrime = true;
         for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){   // n is a multiple of i (i is not equal to 1 or n) 
                isPrime = false;
            }
         }
         if(isPrime == true){
            System.out.println(n +" is a prime number");
         }else{
            System.out.println(n +" is not a prime number");
         }
        }
         
    }
}
