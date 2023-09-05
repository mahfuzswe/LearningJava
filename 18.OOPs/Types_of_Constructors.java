/*
 * Types of Constructors:
 * -----------------------
 * 1. Non-parameterized
 * 2. Parameterized
 * 3. Copy Constructor
 */

public class Types_of_Constructors {
    public static void main(String[] args) {
        Student s1 = new Student(); // non-parameterized
        Student s2 = new Student("Shanto");
        System.out.println(s2.name);
        Student s3 = new Student(123);
        System.out.println(s3.roll);
    }
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("Consttuctor is called..");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}

// same name alag alag parameter --> Constructor overloading --> Polymorphism
