import java.util.Scanner;

public class typeConversion {
    // type conversion happens when:
    // a. type compatiable
    // b. destination type > source type

    // byte -> short -> int -> float -> long -> double
    // Rule: Can't go back

    // Type conversion also called widening conversion , implicit conversion

    public static void main(String args[]){
        // int a = 25;
        // long b = a;
        // System.out.println(b);  //it is possible

        // long a = 35; //8 bytes
        // int b = a;   // 4 bytes -> lossy conversion
        // System.out.println(b); // not allowed 

        Scanner sc = new Scanner(System.in);

        float number = sc.nextInt(); // int -> float
        System.out.println(number);

    }
    
}

// Conclusion: Destination type Source type er caite boro hote hobe


