import code.life;


public class FactoriaL {
    public static int factoriaL(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f *= i;
        }
        return f; // Factorial of n
    }

    public static void main(String args[]){
        System.out.println(factoriaL(6));
    }
}
