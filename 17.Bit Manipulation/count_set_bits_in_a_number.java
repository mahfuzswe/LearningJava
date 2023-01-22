//Count Set Bits in a Number

public class count_set_bits_in_a_number {
    
    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){ //check out LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static void main(String args[]){
        System.out.println(countSetBits(16));
    }
}
