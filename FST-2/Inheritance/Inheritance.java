/*
 * Practical 15:
 * Program to demonstrate different types of inheritance
 * and runtime polymorphism.
 */

/**
 * Main class for Practical 15.
 */
public class Inheritance {

    public static void main(String[] args) {

        // Single Inheritance
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

        // Runtime Polymorphism
        System.out.println("\n===== Polymorphism =====");

        Engine engine;

        engine = new PetrolEngine();
        engine.fuelType();

        engine = new DieselEngine();
        engine.fuelType();
    }
}