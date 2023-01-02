public class FNoverloadingData_types {
   
    //func to calc int sum
    public static int sum(int a, int b){
        return a+b;
    }

    //func to calc float sum
    public static float sum(float a, float b){
        return a+b;
    }


    public static void main(String args[]){
        System.out.println(sum(5,7));
        System.out.println(sum(12.5f,3.9f));
    }
}
