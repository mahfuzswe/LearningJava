import java.util.concurrent.Flow.Subscriber;

public class passingArrays {
    public static void update(int marks[], int nonChangabele){
        nonChangabele = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]){
        int marks[] = {97,98,99};
        int nonChangabele = 5;

        update(marks,nonChangabele);

        System.out.println(nonChangabele); // didn't update but arrys values has chenged becoz of call by reference

        //print out marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
