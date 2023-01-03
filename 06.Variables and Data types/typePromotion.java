public class typePromotion {
    public static void main(String args[]) {
        
        // Rules:
        // 1. Java automatically promotes each byte, short or char operand 
        //    to int when evaluating an expression.
        // 2. If one operand is long, float or double the whole expression
        //    is promoted to long , float or double respectively.

    // -------CODE EXPRIMENT ----------- 
       
        // char a = 'a';
        // char b = 'b';
        // char c = 'c';
        // byte bt = (byte)(a+b+c);

        // System.out.println((int)(b));
        // System.out.println((int)(a));
        // System.out.println(a);
        // System.out.println(b-a);
        
        // System.out.println(bt);

        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30;
        // double ans = a+b+c+d;
        // System.out.println(ans);

        byte b = 5;
        byte a = (byte)(b * 2);
        System.out.println(a);

    }
}

// conclusion: sob caite boro je type setai conversion 
//             kore debe jeno kono data loss na hoy.


    
