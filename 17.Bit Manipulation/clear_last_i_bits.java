public class clear_last_i_bits {
    
    public static int clearIBits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static void main(String args[]){
        System.out.println(clearIBits(15, 2));
    }
}

//n=1111, i=2
//ans: 1100 --> 2^(3) + 2^(2) = 12
