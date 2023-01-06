public class insertionSort {
    //print Array Function
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //insertion sort function
    public static void insertion_sort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            
            //finding out the correct pos to insert
            while(prev >=0 && arr[prev] > curr){   // change condition here for descending order
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }



    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        insertion_sort(arr);
        printArr(arr);
    }
}

//Time Complexity: O(n^2)

