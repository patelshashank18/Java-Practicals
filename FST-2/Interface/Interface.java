/*
 * Practical: Interface
 * Demonstrates interface implementation.
 */

/**
 * Main class for Interface practical.
 */
package Interface;
public class Interface {

    public static void main(String[] args) {

        // Interface reference with Dog object
        AnimalInterface animal = new DogInterface();

        // Call implemented method
        animal.sound();
    }
}