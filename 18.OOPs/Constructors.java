/*
 * Constructor is a special method which is invoked
 * automatically at the time of 'object creation'.
 * 
 * -Constructors have the same name as class or structure.
 * -Constructors don't have a return type.(Not even void)
 * -Constructors are only called once, at object creation.
 * -Memory allocation happens when constructor is called.
 */

public class Constructors {
    public static void main(String[] args) {
        // Student s1 = new Student("Shanto");
        Student s1 = new Student();
        // System.out.println(s1.name);
    }
}
class Student{
    String name;
    int roll;

    // Student(String name){
    Student(){
        // this.name = name;
        System.out.println("Constructor is called...");
    }
}

// Output: Constructor is called...
