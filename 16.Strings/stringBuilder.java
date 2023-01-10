
//StringBuilder sb = new StringBuilder("nw");
// sb.toString() --> je kono object ke string e convert kore dei ; condition: object hote hobe
// int a = 10; a.toString() --> X not possible
// Integer s = 10; a.toString(); --> "10" possible 
// similarly, char ch = 'a' is not possible but Character ch = 'a' is possible

public class stringBuilder {

    public static void main(String args[]){

        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch<='z'; ch++){
            sb.append(ch);  //string er piche character add jorar jonno
        }
        //Time Complexity: O(26)

        System.out.println(sb);
    }
}


