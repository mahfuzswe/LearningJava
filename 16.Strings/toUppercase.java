//For a given String convert each the first letter
//of each word to uppercase

// Character.toUpperCase(ch); --> ch = 'a' --> ch = 'A'

public class toUppercase {
    
    public static String to_uppercase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
 
 // Time Complexity: O(n)

    public static void main(String args[]){
        String str = "hi, i am shanto";

        System.out.println(to_uppercase(str));

    }
}

