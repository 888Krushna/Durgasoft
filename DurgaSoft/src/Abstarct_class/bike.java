package Abstarct_class;

abstract class Vehicle {

    public abstract void move();// Abstract method
}

class Car extends Vehicle {

    public void move() { //implementation of the abstract method
        System.out.println("The car moves on roads");
    }
}

class Boat extends Vehicle {

    public void move() {//implementation of the abstract method
        System.out.println("The boat moves on water");
    }
}

public class bike {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle boat = new Boat();

        car.move();
        boat.move();
    }
}
