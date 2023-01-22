public class power_of_2_orNot {
    
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }

    public static void main(String args[]){
        System.out.println(isPowerOfTwo(16));
    }
}


// output:
// n = 16 --> true
// n = 15 --> false
