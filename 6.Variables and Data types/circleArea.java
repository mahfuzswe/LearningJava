import java.util.Scanner;

public class circleArea {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        float r = sc.nextFloat();
        float area = 3.14f * r * r; //f with 3.14 for float
        //generally in java any decimal value treat as double
        System.out.print("Area is: ");
        System.out.println(area);
    }
}
