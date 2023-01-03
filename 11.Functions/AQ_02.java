import java.util.Scanner;

//Write a method named isEven that accepts an int argument.
// The method should return true if the argument is even , or false otherwise.
// Also write a program to test your method

public class AQ_02 {
    
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Enter an integer: ");
        num = sc.nextInt();

        if(isEven(num)){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is oddd");
        }
    }
}
