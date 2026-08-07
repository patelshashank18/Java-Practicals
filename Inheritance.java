// Practical 15
// Program to demonstrate all types of Inheritance and Polymorphism

// -------------------- Single Inheritance --------------------
class Vehicle {

    void start() {
        System.out.println("Vehicle Started");
    }
}

class Car extends Vehicle {

    void drive() {
        System.out.println("Car is Running");
    }
}

// -------------------- Multi-level Inheritance --------------------
class SportsCar extends Car {

    void turbo() {
        System.out.println("Sports Car Turbo Mode Activated");
    }
}

// -------------------- Hierarchical Inheritance --------------------
class Bike extends Vehicle {

    void ride() {
        System.out.println("Bike is Running");
    }
}

class Bus extends Vehicle {

    void transport() {
        System.out.println("Bus is Transporting Passengers");
    }
}

// -------------------- Hybrid Inheritance --------------------
// Java supports Hybrid Inheritance using Interface

interface Electric {

    void charge();
}

class ElectricCar extends Vehicle implements Electric {

    @Override
    public void charge() {
        System.out.println("Electric Car is Charging");
    }
}

// -------------------- Polymorphism --------------------
class Engine {

    void fuelType() {
        System.out.println("Engine Uses Fuel");
    }
}

class PetrolEngine extends Engine {

    @Override
    void fuelType() {
        System.out.println("Petrol Engine");
    }
}

class DieselEngine extends Engine {

    @Override
    void fuelType() {
        System.out.println("Diesel Engine");
    }
}

// -------------------- Main Class --------------------
public class Inheritance {

    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("===== Single Inheritance =====");
        Car car = new Car();
        car.start();
        car.drive();

        // Multi-level Inheritance
        System.out.println("\n===== Multi-level Inheritance =====");
        SportsCar sportsCar = new SportsCar();
        sportsCar.start();
        sportsCar.drive();
        sportsCar.turbo();

        // Hierarchical Inheritance
        System.out.println("\n===== Hierarchical Inheritance =====");
        Bike bike = new Bike();
        bike.start();
        bike.ride();

        Bus bus = new Bus();
        bus.start();
        bus.transport();

        // Hybrid Inheritance
        System.out.println("\n===== Hybrid Inheritance =====");
        ElectricCar electricCar = new ElectricCar();
        electricCar.start();
        electricCar.charge();

        // Polymorphism
        System.out.println("\n===== Polymorphism =====");
        Engine engine;

        engine = new PetrolEngine();
        engine.fuelType();

        engine = new DieselEngine();
        engine.fuelType();
    }
}