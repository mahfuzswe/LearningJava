public class update_ithBit {
    
    public static int setIthBit(int n, int i){ //i-->position
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        //approch-01  --> more simple
        // if(newBit == 0){
        //     return clearIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);
        // }


        //alternative approch -- same time complexity
        n = clearIthBit(n, i);
        int BitMask = newBit<<i;
        return n | BitMask;

    }

    public static void main(String args[]){
        System.out.println(updateIthBit(10, 2, 1));
    }
}
