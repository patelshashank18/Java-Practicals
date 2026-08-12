/*
 * Practical 15:
 * Demonstrates runtime polymorphism.
 */

/**
 * Parent class for different engine types.
 */
public class Engine {

    // Method to be overridden by child classes
    void fuelType() {
        System.out.println("Engine Fuel Type");
    }
}