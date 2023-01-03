import java.util.Scanner;

public class lifeRule {
    

    public static void life_rule(){
        Scanner sc = new Scanner(System.in);
        int RuleNo = sc.nextInt();
        
        switch(RuleNo){
            case 1: System.out.println("Never Quit");
                    break;
            case 2: System.out.println("Never Quit");
                    break;
            default:System.out.println("Never Quit");

        }
    }


    public static void main(String args[]){
        life_rule();
    }
}
