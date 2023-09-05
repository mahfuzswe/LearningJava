/*
 * OOP : Object Oriented Programming  --> uses of objects and classes
 *       Objects: entities in the real world
 *       Classes: group of these entities
 * 
 */

public class OOPS1 {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        // p1.setColor("Yellow");
        p1.color = "Yellow";
        System.out.println(p1.color);

    }
}

// public class always upore rakher try korte hobe notuba object create korte jhamela hote pare

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy+chem+math)/3;
    }
}


// memory --> 1. Stack
        //    2. Heap (where objects created) 
