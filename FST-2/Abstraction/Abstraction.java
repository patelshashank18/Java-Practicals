package Abstraction;

/**
 * Main class for abstraction demonstration.
 *
 * This program demonstrates abstraction
 * using an abstract class and child class.
 */
public class Abstraction {

    /**
     * Main method of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create a Dog object using AnimalAbstract reference.
        AnimalAbstract animal = new DogAbstract();

        /*
         * Call the methods implemented by
         * the child class.
         */
        animal.sound();
        animal.eat();
    }
}
