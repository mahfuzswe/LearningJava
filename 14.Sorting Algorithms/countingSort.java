// used when the range is small, very efficient

public class countingSort {
    
    //print array functinon
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //counting sort function
    public static void counting_sort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];   // coz we assume positive number in counting sort
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }


    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        counting_sort(arr);
        printArr(arr);
    }
}

//we should use counting sort when value is small

// we must use inbuilt sort in interview


