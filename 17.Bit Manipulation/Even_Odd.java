import java.util.*;

public class Even_Odd{

    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            //even number
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String agrs[]){
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(14);
        oddOrEven(12);

    }
}
