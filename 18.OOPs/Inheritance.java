/*
 * Inheritance is when properties & methods
 * of 'base' class are passed on to a 'derived' class
 */

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
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