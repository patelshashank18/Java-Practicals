/**
 * Practical 16
 * Program to demonstrate Compile-time and Runtime Polymorphism.
 */
package Polymorphism;

/**
 * Main class for demonstrating compile-time and runtime polymorphism.
 */
public class Polymorphism {

    /**
     * Main method to execute the polymorphism examples.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        /**
         * Compile-time Polymorphism
         *
         * Method overloading is demonstrated using the add() method.
         */
        System.out.println("Compile-time Polymorphism:");

        CalculatorPolymorphism c = new CalculatorPolymorphism();

        System.out.println("Addition of 2 integers: " + c.add(10, 20));

        System.out.println("Addition of 3 integers: " + c.add(10, 20, 30));

        System.out.println("Addition of 2 double values: " + c.add(10.5, 20.5));

        /**
         * Runtime Polymorphism
         *
         * Method overriding is demonstrated using the sound() method.
         */
        System.out.println("\nRuntime Polymorphism:");

        /**
         * Parent class reference and child class object.
         */
        AnimalPolymorphism a = new CatPolymorphism();

        /**
         * Calls the overridden sound() method of CatPolymorphism.
         */
        a.sound();
    }
}