// What will be the value of x & y in the following program:

public class AQ_04 {
    public static void main(String args[]){
        int a = 63, b = 36;
        boolean x = (a<b) ? true : false;
        int y = (a>b) ? a : b;
        System.out.print("x,y = "+ x +",");
        System.out.print(y);
    }
}

// Output: x,y = false,63