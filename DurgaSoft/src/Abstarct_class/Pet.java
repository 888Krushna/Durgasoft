package Abstarct_class;

abstract class Animal {

    public abstract void sound();  // Abstract method


    public void sleep() { // Regular method
        System.out.println("This animal is sleeping");
    }
}


class Dog extends Animal {// Subclass (inherited from Animal)

    public void sound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    // Providing implementation for abstract method
    public void sound() {
        System.out.println("The cat meows");
    }


}

public class Pet {
    public static void main(String[] args) {
        // Create objects of the subclasses
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Call the by abstact method
        dog.sound();
        cat.sound();

        // Call the regular method from the abstract class
        dog.sleep();
        cat.sleep();
    }
}
