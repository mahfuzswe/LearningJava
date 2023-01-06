import java.util.*;

public class creation {
    
    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found!");
        return false;
    }


    

    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n=matrix.length, m=matrix[0].length;  // m : total numbers of column

        Scanner sc = new Scanner(System.in);
        //input
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        search(matrix, 5);
    }
}
