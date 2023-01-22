public class set_ithBit {
    
    public static int setIthBit(int n, int i){ //i-->position
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static void main(String args[]){
        System.out.println(setIthBit(10,2));
    }
}
