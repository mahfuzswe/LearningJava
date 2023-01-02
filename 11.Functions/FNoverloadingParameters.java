public class FNoverloadingParameters {
    
    //func to calc sum of 2 nums
    public static int sum(int a , int b){
        return a+b;
    }

    //func to calculate sum of 3 nums
    public static int sum(int a,int b, int c){
        return a+b+c;
    }


    public static void main(String args[]){
        System.out.println(sum(3,5));
        System.out.println(sum(4,5,6));
    }
}
