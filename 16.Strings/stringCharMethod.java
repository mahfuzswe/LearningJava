public class stringCharMethod {
    
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }



    public static void main(String args[]){
        String firstName = "Mahfuzur";
        String lastName = "Rahman";

        String fullName = firstName + " " + lastName; // easy to add them 
        // System.out.println(fullName);
        // System.out.println(fullName.charAt(0));

        printLetters(fullName);
    }
}

