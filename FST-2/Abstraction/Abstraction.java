package Abstraction;

/**
 * Main class for abstraction demonstration.
 */
public class Abstraction {

    /**
     * Main method of the program.
     */
    public static void main(String[] args) {

        /**
         * Parent reference and child object.
         */
        AnimalAbstract animal = new DogAbstract();

        /**
         * Call implemented methods.
         */
        animal.sound();
        animal.eat();
    }
}