import java.util.Scanner;

public class stNnaturalNumberSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int i=1, sum =0;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
