import java.util.Scanner;

// Write a program to print the multiplication table of a number N,
// entered by the user.

public class AQ_04 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}
