/*
 * 1. Single Level Inheritance: Base class --> Derived class
 * 2. Multi Level Inheritance: Base class --> Derived clas --> Derived class
 */


public class Inheritance_Types {
    
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);

        // Fish shark = new Fish();
        // shark.eat();
    }
}

class Mammal extends Animals{
    int legs;

}

class Dog extends Mammal{
    String breed;
}

// Base class
class Animals{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}


//Derived class
class Fish extends Animals{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}
