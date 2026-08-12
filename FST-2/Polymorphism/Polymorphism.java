// Practical 16
// Program to demonstrate Compile-time and Runtime Polymorphism
package Polymorphism;


public class Polymorphism {

    public static void main(String[] args) {

        // Compile-time Polymorphism

        System.out.println("Compile-time Polymorphism:");

        CalculatorPolymorphism c = new CalculatorPolymorphism();

        System.out.println("Addition of 2 integers: " + c.add(10, 20));

        System.out.println("Addition of 3 integers: " + c.add(10, 20, 30));

        System.out.println("Addition of 2 double values: " + c.add(10.5, 20.5));

        // Runtime Polymorphism

        System.out.println("\nRuntime Polymorphism:");

        // Parent class reference and child class object
        AnimalPolymorphism a = new CatPolymorphism();

        // Calls Cat's overridden method
        a.sound();
    }
}