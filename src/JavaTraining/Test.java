package JavaTraining;

class Vehicle {             //Hierarchical inheritance

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {

    void ride() {
        System.out.println("Bike is riding");
    }
}

public class Test {

    public static void main(String[] args) {

        Car car = new Car();
        car.start();
        car.drive();

        Bike bike = new Bike();
        bike.start();
        bike.ride();
    }
}