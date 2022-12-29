import javax.swing.text.html.StyleSheet;

public class ternaryOperator{
    public static void main(String args[]){
        int number = 5;

        //ternary operator
        String type = (number%2==0) ? "EVEN" : "ODD";
        System.out.println(type);
    }
}