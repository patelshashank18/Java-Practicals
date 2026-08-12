/*
 * Practical 15:
 * Demonstrates Petrol Engine.
 */

/**
 * PetrolEngine is a child class of Engine.
 */
public class PetrolEngine extends Engine {

    // Override fuelType method
    @Override
    void fuelType() {
        System.out.println("Petrol Engine");
    }
}