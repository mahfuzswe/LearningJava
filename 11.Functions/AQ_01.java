import java.util.Scanner;

// Write  a Java method to compute the average of three numbers

public class AQ_01 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter third number: ");
        double c = sc.nextDouble();

        double ans = (a+b+c)/3;
        System.out.println("average of three numbers: "+ans);
    }
}
