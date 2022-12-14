import java.lang.Thread.State;

public class BinarySearch {
    public static int binarySearch(int numbers[],int key){
        int start = 0, end = numbers.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            //comparisons
            if(numbers[mid] == key){ //found
                return mid;
            }
            if(numbers[mid]<key){ //right
                start = mid+1;
            }else{ //left
                end = mid -1;
            }
        }

        return -1;
    }


    public static void main(String args[]){
        int numbers[] = {2,3,4,6,7,1,35};
        int key = 6;

        System.out.println("Index for key is: "+binarySearch(numbers, key));
    }
}
