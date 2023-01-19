
// The string should be compressed such that the consecutive duplicates 
// of characters are replaced with a single character and followed by the
// number of consecutive duplicates. However, if there is only one 
// consecutive duplicate of a character, we need not append 1 to it. 
// Example, for "aaabbccdee", the compressed string will be "a3b2c2de2". 

// "aaabbcccdd" --> "a3b2c3d2"
// "aaaabbbdd" --> "a4b3d2"
//"abc" --> "abc"   is single letter then leave it single otherwise give number


public class stringCompression {
    public static String compress(String str){
        String newStr = "";

        for(int i=0; i<str.length(); i++){
            Integer count = 1;
        while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;
        }
        newStr += str.charAt(i);
        if(count>1){
            newStr += count.toString();
        }
    }

    return newStr;
}

    public static void main(String args[]){
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}


//Time Complexity: O(n)

//use string builder to decrease time complexity
