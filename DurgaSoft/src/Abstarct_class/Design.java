package Abstarct_class;

// Abstract class
abstract class Shape {
    String name;


    // Constructor
    Shape(String name) { // Constructor
        this.name = name;
        System.out.println("Shape constructor called for: " + name);
    }


    abstract void draw();// Abstract method
}


class Circle extends Shape {
    Circle() {
        super("Circle"); // Calling the constructor of Shape
    }

    // Implementing the abstract method
    void draw() {
        System.out.println(name + " is being drawn.");
    }
}

// Main class to run the program
public class Design {
    public static void main(String[] args) {
        Circle myCircle = new Circle(); // Creating an object of Circle
        myCircle.draw(); // Calling the abstract method implementation
    }
}
