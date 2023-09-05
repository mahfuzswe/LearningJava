/*
 * Shallow copy & Deep copy
 * -------------------------
 * Shallow --> copy references , Changes reflects
 * Deep --> changes don't reflect, new array
 */

public class Copy_Constructors2 {
    public static void main(String[] args) {
        Student s1 = new Student(); 
        s1.name = "Shanto";
        s1.roll = 101;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); //copy
        s2.password = "xyz";
        s1.marks[2] = 100; // here change value won't reflect
        
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];
    // Address add;

    class Address{
        String city;
    }


    //Shallow Copy constructor
    // Student(Student s1){
        // marks = new int[3];
        // this.name = s1.name;
        // this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // deep copy constructor
        Student(Student s1){
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;

            for(int i=0; i<marks.length; i++){
                this.marks[i] = s1.marks[i];
            }
        }

    Student(){
        marks = new int[3];
        System.out.println("Consttuctor is called..");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}
