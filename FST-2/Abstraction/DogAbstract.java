/*
 * DogAbstract provides implementation
 * of the abstract sound() method.
 */

/**
 * Represents a dog.
 */
package Abstraction;

public class DogAbstract extends AnimalAbstract {

    // Implement abstract method
    @Override
    void sound() {
        System.out.println("Dog says Bark.");
    }
}