// Abstract class
abstract class Animal {

    // Abstract method
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

// Child class
class Dog extends Animal {

    // Implement abstract method
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

// Main class
public class Abstraction {
    public static void main(String[] args) {

        // Create object of Dog class
        Dog d = new Dog();

        // Call methods
        d.sound();
        d.sleep();
    }
}