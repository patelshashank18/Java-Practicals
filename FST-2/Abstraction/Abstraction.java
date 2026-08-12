/*
 * Practical 17:
 * Demonstrates abstraction using an abstract class.
 */

/**
 * Main class for abstraction demonstration.
 */
package Abstraction;

public class Abstraction {

    public static void main(String[] args) {

        // Parent reference and child object
        AnimalAbstract animal = new DogAbstract();

        // Call implemented methods
        animal.sound();
        animal.eat();
    }
}