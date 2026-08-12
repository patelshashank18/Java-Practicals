// Practical 16
// Program to demonstrate Compile-time and Runtime Polymorphism

// ---------------- Compile-time Polymorphism ----------------
// Method Overloading

class Calculator {

    // Method with 2 integer parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 integer parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with 2 double parameters
    double add(double a, double b) {
        return a + b;
    }
}

// ---------------- Runtime Polymorphism ----------------
// Method Overriding

class Animal {

    // Parent class method
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

// Child class
class Cat extends Animal {

    // Override parent class method
    @Override
    void sound() {
        System.out.println("Cat says Meow.");
    }
}

// Main class
public class Polymorphism {

    public static void main(String[] args) {

        // Compile-time Polymorphism

        System.out.println("Compile-time Polymorphism:");

        Calculator c = new Calculator();

        System.out.println("Addition of 2 integers: " + c.add(10, 20));

        System.out.println("Addition of 3 integers: " + c.add(10, 20, 30));

        System.out.println("Addition of 2 double values: " + c.add(10.5, 20.5));

        // Runtime Polymorphism

        System.out.println("\nRuntime Polymorphism:");

        // Parent class reference and child class object
        Animal a = new Cat();

        // Calls Cat's overridden method
        a.sound();
    }
}