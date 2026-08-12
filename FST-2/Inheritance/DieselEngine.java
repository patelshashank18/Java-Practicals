/*
 * Practical 15:
 * Demonstrates Diesel Engine.
 */

/**
 * DieselEngine is a child class of Engine.
 */
public class DieselEngine extends Engine {

    // Override fuelType method
    @Override
    void fuelType() {
        System.out.println("Diesel Engine");
    }
}