// Parent class
class Animal {

    // Method of the parent class
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

// Child class inherits the Animal class
class Cat extends Animal {

    // Override the parent class method
    @Override
    void sound() {
        System.out.println("Cat says Meow.");
    }
}

// Main class
public class Polymorphism {

    public static void main(String[] args) {

        // Parent class reference and child class object
        // This demonstrates runtime polymorphism
        Animal a = new Cat();

        // Calls the overridden method of the Cat class
        a.sound();
    }
}