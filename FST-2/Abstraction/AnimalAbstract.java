/*
 * Abstract parent class for abstraction.
 */

/**
 * Defines an abstract animal.
 */
package Abstraction;

public abstract class AnimalAbstract {

    // Abstract method
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal is eating.");
    }
}