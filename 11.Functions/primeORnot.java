public class primeORnot {
    
    ///only of n>=2
    public static boolean isPrime(int n){
        boolean isPrime = true;
        
        // corner cases
        //1.
        //2.
        if(n==2){
            return true;
        }
        
        for(int i=2; i<n-1; i++){
            if(n%i == 0){ //completely dividing
               return false;
            }
        }
        return true;
    }


    public static void main(String args[]){
        System.out.println(isPrime(2));
    }
}
